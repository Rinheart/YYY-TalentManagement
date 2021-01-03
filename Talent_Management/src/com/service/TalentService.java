package com.service;
import com.dao.ITalentDAO;
import com.entity.Talent;
import com.entity.v_WorkExperience;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
/*
* Talent的服务
*
* */

public class TalentService implements ITalentService {
    private ITalentDAO talentDAO = null;

    public TalentService() {
        System.out.println("create UserService.");
    }

    public void setTalentDAO(ITalentDAO talentDAO) {
        this.talentDAO = talentDAO;
    }

    public Talent getFullTalent(Talent talent) {
        String talentId = talent.getTalentId();
        String hql = "from Talent as talent where TalentId='" + talentId + "'";
        List list = talentDAO.findByHql(hql);
        if(list.size()==1){
            return (Talent) list.get(0);
        }
        else if(list.isEmpty()){
            System.out.println("无此用户");
            return null;
        }
        else if(list.size()>1){
            System.out.println("注册出错，两个同名用户");
            return null;
        }
        else {
            return null;
        }
    }

    public boolean login(Talent talent) {
        Map request = (Map) ActionContext.getContext().get("request");

        String talentId = talent.getTalentId();
        String password = talent.getPassword();
        String hql = "from Talent as talent where TalentId='" + talentId + "' and password='" + password + "'";
        List list = talentDAO.findByHql(hql);
        if(list.isEmpty()){
            request.put("tip", "用户或密码不正确，请重新登录");
            return false;
        }
        request.put("tip", "登录成功！");
        return true;
    }

    public boolean register(Talent talent) {
        String talentId = talent.getTalentId();
        String hql = "from Talent as talent where TalentId='" + talentId + "'";
        List list = talentDAO.findByHql(hql);
        if (!list.isEmpty()){
            return false;
        }
        talent.setInformationReview(true);
        talentDAO.save(talent);
        return true;
    }

    public boolean update(Talent talent){
        System.out.println(talent);
        talentDAO.update(talent);
        return true;
    }


    //查看当前登录的用户的工作经历信息
    public v_WorkExperience MyWorkExperience(Talent talent) {
        String hql = "from v_WorkExperience where talentId='"+talent.getTalentId()+"'";
        List list = talentDAO.findByHql(hql);
        List<v_WorkExperience> work=new ArrayList<v_WorkExperience>();
        Date date = new Date();
        for (int i=0; i<list.size(); i++) {
            v_WorkExperience experience=(v_WorkExperience) list.get(i);
            if(experience.getEndTime()== null && experience.getStartTime().compareTo(date)<=0) {
                work.add(experience);
            }
        }
        if (work.size()>1) {
            System.out.println("你不讲工德，同时在两家企业工作！");
        }else if (work.size()==0) {
            System.out.println("hhh太惨了，你竟然没有工作！");
        }

        if(work.isEmpty()){
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("tip","查询当前登录的用户的工作经历信息有误");
            return null;
        }
        return work.get(0);
    }
    //HR查看本公司员工工作信息
    public List HRWorkExperience(String enterpriseId) {
        String hql = "from v_WorkExperience where enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_WorkExperience> relist=new ArrayList<v_WorkExperience>();
        Date date = new Date();
        for (int i=0; i<list.size(); i++) {
            v_WorkExperience experience = (v_WorkExperience) list.get(i);
            if (experience.getEndTime() == null && experience.getStartTime().compareTo(date) <= 0) {
                relist.add(experience);
            }
        }
        return relist;
    }
    //HR查看本公司过去的员工工作信息
    public List HRWorkedExperience(String enterpriseId) {
        String hql = "from v_WorkExperience where enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_WorkExperience> relist=new ArrayList<v_WorkExperience>();
        Date date = new Date();
        for (int i=0; i<list.size(); i++) {
            v_WorkExperience experience = (v_WorkExperience) list.get(i);
            if (experience.getEndTime() != null) {
                relist.add(experience);
            }
        }
        return relist;
    }
}

package com.service;
import com.dao.ITalentDAO;
import com.entity.*;
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
            request.put("tip","当前无工作");
            return null;
        }
        return work.get(0);
    }
    //HR查看本公司员工工作信息
    public List<v_WorkExperience> HRWorkExperience(String enterpriseId) {
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
    public List<v_WorkExperience> HRWorkedExperience(String enterpriseId) {
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
    //查看某人才的工作经历
    public List<v_WorkExperience> WorkExperience(String talentId) {
        String hql = "from v_WorkExperience where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_WorkExperience> relist=new ArrayList<v_WorkExperience>();
        for (int i=0; i<list.size(); i++) {
            v_WorkExperience experience = (v_WorkExperience) list.get(i);
            relist.add(experience);
        }
        return relist;
    }
    //HR查看已离职人才的过去工作经历
    public List<v_WorkExperience> WorkedExperience(String talentId,String enterpriseId) {
        String hql = "from v_WorkExperience where talentId='"+talentId+"' and enterpriseId='"+enterpriseId+"'";
        System.out.println(hql);
        List list = talentDAO.findByHql(hql);
        if (list.size()==0) return null;
        else {
            v_WorkExperience w=(v_WorkExperience)list.get(0);
            Date endTime=w.getEndTime();
            String hql_1 = "from v_WorkExperience where talentId='"+talentId+"'";
            List list_1 = talentDAO.findByHql(hql_1);
            List<v_WorkExperience> relist=new ArrayList<v_WorkExperience>();
            for (int i=0; i<list_1.size(); i++) {
                v_WorkExperience experience = (v_WorkExperience) list_1.get(i);
                if (experience.getStartTime().compareTo(endTime)<0 && experience.getEndTime().compareTo(endTime)<0) {
                    relist.add(experience);
                }
                relist.add(w);
            }
            return relist;
        }
    }
    //查看某人才的异常出勤记录
    public List<v_Attend> WorkAttend(String talentId) {
        String hql = "from v_Attend where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Attend> relist=new ArrayList<v_Attend>();
        for (int i=0; i<list.size(); i++) {
            v_Attend attend = (v_Attend) list.get(i);
            relist.add(attend);
        }
        return relist;
    }
    //HR查看某人才任职期间的异常出勤记录
    public List<v_Attend> WorkedAttend(String talentId,String enterpriseId) {
        String hql = "from v_Attend where talentId='"+talentId+"' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Attend> relist=new ArrayList<v_Attend>();
        for (int i=0; i<list.size(); i++) {
            v_Attend attend = (v_Attend) list.get(i);
            relist.add(attend);
        }
        return relist;
    }
    //查看某人才的违纪记录
    public List<v_Disciplinary> WorkDisciplinary(String talentId) {
        String hql = "from v_Disciplinary where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Disciplinary> relist=new ArrayList<v_Disciplinary>();
        for (int i=0; i<list.size(); i++) {
            v_Disciplinary disciplinary = (v_Disciplinary) list.get(i);
            relist.add(disciplinary);
        }
        return relist;
    }
    //HR查看某人才任职期间的违纪记录
    public List<v_Disciplinary> WorkedDisciplinary(String talentId,String enterpriseId) {
        String hql = "from v_Disciplinary where talentId='"+talentId+"' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Disciplinary> relist=new ArrayList<v_Disciplinary>();
        for (int i=0; i<list.size(); i++) {
            v_Disciplinary attend = (v_Disciplinary) list.get(i);
            relist.add(attend);
        }
        return relist;
    }
    //查看某人才的奖励记录
    public List<v_Reward> WorkReward(String talentId) {
        String hql = "from v_Reward where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Reward> relist=new ArrayList<v_Reward>();
        for (int i=0; i<list.size(); i++) {
            v_Reward reward = (v_Reward) list.get(i);
            relist.add(reward);
        }
        return relist;
    }
    //HR查看某人才任职期间的奖励记录
    public List<v_Reward> WorkedReward(String talentId,String enterpriseId) {
        String hql = "from v_Reward where talentId='"+talentId+"' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Reward> relist=new ArrayList<v_Reward>();
        for (int i=0; i<list.size(); i++) {
            v_Reward reward = (v_Reward) list.get(i);
            relist.add(reward);
        }
        return relist;
    }
    //查看某人才的重大事件
    public List<v_BigEvent> WorkBigEvent(String talentId) {
        String hql = "from v_Reward where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_BigEvent> relist=new ArrayList<v_BigEvent>();
        for (int i=0; i<list.size(); i++) {
            v_BigEvent bigEvent = (v_BigEvent) list.get(i);
            relist.add(bigEvent);
        }
        return relist;
    }
    //HR查看某人才任职期间的重大事件
    public List<v_BigEvent> WorkedBigEvent(String talentId,String enterpriseId) {
        String hql = "from v_BigEvent where talentId='"+talentId+"' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_BigEvent> relist=new ArrayList<v_BigEvent>();
        for (int i=0; i<list.size(); i++) {
            v_BigEvent bigEvent = (v_BigEvent) list.get(i);
            relist.add(bigEvent);
        }
        return relist;
    }



}

package com.service;
import com.dao.ITalentDAO;
import com.entity.Talent;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.beans.factory.annotation.Autowired;

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

    public boolean delete(Talent talent){
        /*不写delete*/
        return true;
    }

    //HR查看员工工作信息
    public List HRWorkExperience() {
        String hql = "from v_WorkExperience";
        return talentDAO.findByHql(hql);
    }
}

package com.service;
import com.dao.ITalentDAO;
import com.entity.Talent;

import java.util.List;
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
    public List login(Talent talent) {
        /*待问，直接访问ctx，写到三大对象中给前端访问吗？还有无访问方法
        * */
        /*ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");*/
        String talentId = talent.getTalentId();
        String password = talent.getPassword();
        String hql = "from Talent as talent where TalentId='" + talentId + "' and password='" + password + "'";

        List list = talentDAO.findByHql(hql);

//        if (list.isEmpty()){
//            request.put("tip", "密码不正确，请重新登录");
//            System.out.println("登录查找为空!");
//            return false;
//        }
//        else {
//            session.put("user", account);
//            request.put("tip", "登录成功！");
//            talent = (Talent) list.get(0);
//            request.put("talent", talent);
//            return true;
//        }
        return list;
    }
    public boolean update(Talent talent){
        /*待写入逻辑*/
        return true;
    }
    public boolean delete(Talent talent){
        /*待写入逻辑*/
        return true;
    }
    //查看当前登录的用户的工作经历信息
    public List MyWorkExperience(Talent talent) {
        String hql = "from v_WorkExperience where talentId='"+talent.getTalentId()+"'";
        return talentDAO.findByHql(hql);
    }
    //HR查看本公司员工工作信息
    public List HRWorkExperience(String enterpriseId) {
        String hql = "from v_WorkExperience where enterpriseId='"+enterpriseId+"'";
        return talentDAO.findByHql(hql);
    }
}

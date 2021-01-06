package com.service;
import com.dao.IApplyDAO;
import com.entity.*;
import com.opensymphony.xwork2.ActionContext;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
/*
* Talent的服务
*
* */

public class ApplyService implements IApplyService {
    private IApplyDAO applyDAO = null;

    public ApplyService() {
        System.out.println("create ApplyService.");
    }
    public void setApplyDAO(IApplyDAO applyDAO) {
        this.applyDAO = applyDAO;
    }



    public boolean update(Applicate applicate) {
        applyDAO.update(applicate);
        return true;
    }

    public boolean talentAdd(Applicate applicate,String talentId){
        applicate.setApplicateTime(new Timestamp(System.currentTimeMillis()));
        applicate.setTalentId(talentId);
        applicate.setApplicateResult(null);

        applyDAO.save(applicate);
        return true;
    }


    public int getCurrentExpId(String talentId) {
        String hql = "from v_WorkExperience where talentId='"+talentId+"'";
        List list = applyDAO.findByHql(hql);
        List<v_WorkExperience> work=new ArrayList<v_WorkExperience>();
        Date date = new Date();
        for (int i=0; i<list.size(); i++) {
            v_WorkExperience experience=(v_WorkExperience) list.get(i);
            if(experience.getEndTime()== null && experience.getStartTime().compareTo(date)<=0) {
                work.add(experience);
            }
        }
        /*当前无工作，请求到目标企业*/
        if(work.isEmpty()){
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("tip","当前无工作");
            return -1;
        }
        return work.get(0).getWorkExperienceId();
    }


    public List<Applicate> getEntApp(String enterpriseId) {
        String hql = "from Applicate where enterpriseId='"+enterpriseId+"'";
        /*List<Applicate> entApp=new ArrayList<Applicate>();
        *//*引用是否有误？*//*
        entApp = applyDAO.findByHql(hql);*/
        return applyDAO.findByHql(hql);
    }

    public List<Applicate> getNoResApp(String enterpriseId) {
        String hql = "from Applicate where enterpriseId='"+enterpriseId+"' and applicateResult=null";
        return applyDAO.findByHql(hql);
    }


    public List<Applicate> getTalApp(String talentId) {
        String hql = "from Applicate where talentId='"+talentId+"'";
        return applyDAO.findByHql(hql);
    }


    public Applicate getAppById(int applicateId) {
        String hql = "from Applicate where applicateId='"+applicateId+"'";
        List<Applicate> list = applyDAO.findByHql(hql);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }


    public boolean review(int applicateId, boolean applicateResult) {
        Applicate updateApp = getAppById(applicateId);
        if(updateApp == null){
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("tip","review的id有误，查找不到");
            return false;
        }
        updateApp.setApplicateResult(applicateResult);
        String talentId = (String) ActionContext.getContext().getSession().get("talentId");
        updateApp.setHrReview(talentId);
        updateApp.setReviewTime(new Timestamp(System.currentTimeMillis()));

        update(updateApp);

        /*改工作经验，待补充!!!!*/
        return true;
    }

    /*根据申请号和申请类型，修改工作经验,待补充！！！！*/
    public boolean changeExp(int applicateId, boolean applicateType){
        return false;
    }
}

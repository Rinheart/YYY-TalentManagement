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

    public boolean save(Applicate applicate) {
        applyDAO.save(applicate);
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

    /*获得企业所有申请*/
    public List<Applicate> getEntApp(String enterpriseId) {
        String hql = "from Applicate where enterpriseId='"+enterpriseId+"'";
        return applyDAO.findByHql(hql);
    }
    /*获得企业所有未批准申请*/
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

    /*获取人才当前最新申请*/
    public Applicate getCurrentApp(String talentId) {
        List<Applicate> applicateList = getTalApp(talentId);
        if(applicateList.isEmpty()){
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("tip", "用户通过id查看的申请列表为空，即您在系统中从未有过人事变动记录");
            return null;
        }
        Applicate applicate_new = applicateList.get(0);
        for (int i = 0; i < applicateList.size(); i++) {
            /*找到最大申请id(由于id自增)*/
            if(applicateList.get(i).getApplicateId()>applicate_new.getApplicateId());
            applicate_new = applicateList.get(i);
        }
        return applicate_new;
    }

    /*HR使用review来批准申请*/
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

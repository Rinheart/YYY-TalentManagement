package com.action;


import com.entity.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IApplyService;
import com.service.ITalentService;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.ServletContextAware;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
* 为申请就职离职的action
*
* */
public class ApplyAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    private Talent talent;
    private IApplyService applyService;
    List<Applicate> applicateList;
    Applicate applicate;

    public Talent getTalent() {
        return talent;
    }
    public void setTalent(Talent talent) {
        this.talent = talent;
    }
    public Applicate getApplicate() {
        return applicate;
    }
    public void setApplicate(Applicate applicate) {
        this.applicate = applicate;
    }
    public IApplyService getApplyService() {
        return applyService;
    }
    public void setApplyService(IApplyService applyService) {
        this.applyService = applyService;
    }
    public List<Applicate> getApplicateList() {
        return applicateList;
    }
    public void setApplicateList(List<Applicate> applicateList) {
        this.applicateList = applicateList;
    }

    private Map request,session,application;
    public void setRequest(Map<String, Object> request) {
        this.request=request;
    }
    public void setSession(Map<String, Object> session) {
        this.session=session;
    }
    public void setApplication(Map<String, Object> application) {
        this.application=application;
    }

    /*填申请*/
    /*如果已有申请未通过，不能填*/
    public String apply(){
        talent =(Talent) session.get("talent");

        if(talent.getIdentity() == 2){
            request.put("tip", "HR离职注销账号请向公司申报");
            return "false";
        }

        return "success";
    }

    /*查申请审核是否通过,查申请表!!!自己的，最新一个！*/
    public String result(){
        talent =(Talent) session.get("talent");
        /*从目前的工作记录中取最新公司*/
        if(talent.getIdentity() != 0) {
            v_WorkExperience nowExp = (v_WorkExperience) session.get("workExperience");
            ActionContext.getContext().getSession().put("myEntName", nowExp.getEnterpriseName());
        }

        applicateList = applyService.getTalApp(talent.getTalentId());
        if(applicateList.isEmpty()){
            request.put("tip", "用户通过id查看的申请列表为空，即您在系统中从未有过人事变动记录");
            return "error";
        }
        /*此时action中applicate为本人最新申请*/
        applicate = applicateList.get(0);
        for (int i = 0; i < applicateList.size(); i++) {
            /*找到最大申请id(由于id自增)*/
            if(applicateList.get(i).getApplicateId()>applicate.getApplicateId());
                applicate = applicateList.get(i);
        }
        return "success";
    }


    /*HR查本公司所有申请(就职离职)*/
    public String HRCheckAll(){
        talent =(Talent) session.get("talent");
        if(talent.getIdentity() == 2){
            v_WorkExperience nowExp =(v_WorkExperience) session.get("workExperience");
            applicateList = applyService.getEntApp(nowExp.getEnterpriseId());
            ActionContext.getContext().getSession().put("myEntName",nowExp.getEnterpriseName());
            return "success";
        }
        else{
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("tip","你不是HR,无权查看");
            return "noHR";
        }
    }
    /*HR查本公司未批申请*/
    public String HRCheck(){
        talent =(Talent) session.get("talent");
        if(talent.getIdentity() == 2){
            v_WorkExperience nowExp =(v_WorkExperience) session.get("workExperience");
            applicateList = applyService.getNoResApp(nowExp.getEnterpriseId());
            ActionContext.getContext().getSession().put("myEntName",nowExp.getEnterpriseName());
            return "success";
        }
        else{
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("tip","你不是HR,无权查看");
            return "noHR";
        }
    }

    /*HR审核操作,写审核表,用update*/
    public String HRReview(){
        boolean Result = Boolean.parseBoolean((String) request.get("Result"));
        int Id = Integer.parseInt((String) request.get("Id"));

        if(applyService.review(Id,Result)){
            /*改工作经历，待补充！！！！*/
            return "success";
        }
        return "error";

    }
}

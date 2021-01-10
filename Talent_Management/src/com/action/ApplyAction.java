package com.action;


import com.entity.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IApplyService;
import com.service.ITalentService;
//import javafx.application.Application;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.ServletContextAware;


import java.sql.Timestamp;
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

        Applicate c_applicate = applyService.getCurrentApp(talent.getTalentId());
        if(c_applicate == null){
            request.put("tip", "最近申请列表为空，本用户无人事变动信息，若你是企业成员则为数据库插入的成员");
        }
        else if (c_applicate.getApplicateResult() == null){
            request.put("tip", "您有人事变动申请还未通过，暂时不能再次申请，请联系本公司HR");
            return "false";
        }
        if(talent.getIdentity() == 2){
            request.put("tip", "HR离职注销账号请向公司申报");
            return "false";
        }

        session.put("workExperience",applyService.getCurrentExpById(talent.getTalentId()));
        v_WorkExperience nowExp =(v_WorkExperience) session.get("workExperience");
        if(nowExp != null)
            ActionContext.getContext().getSession().put("myEntName", nowExp.getEnterpriseName());


        /*如果当前无身份，即申请就职*/
        if(talent.getIdentity() == 0){
            request.put("ap_tip", "您当前未加入任何企业，可申请就职");

            return "in";
        }
        /*有身份即申请离职*/
        else {
            request.put("ap_tip", "您当前已就职，可申请离职");
            return "out";
        }
    }

    /*不同申请*/
    public String applyIn(){
        String talentId =(String) session.get("talentId");
        applicate.setTalentId(talentId);
        applicate.setApplicateType(true);
        applicate.setApplicateTime(new Timestamp(System.currentTimeMillis()));
        applyService.save(applicate);
        return "success";
    }
    public String applyOut(){
        Map param= ActionContext.getContext().getParameters();
        String[] value1 = (String[])param.get("talentId");

        v_WorkExperience nowExp =(v_WorkExperience) session.get("workExperience");

        Applicate newApp = new Applicate();
        newApp.setTalentId(value1[0]);
        newApp.setApplicateType(false);
        newApp.setEnterpriseId(nowExp.getEnterpriseId());
        newApp.setDepartmentId(Integer.parseInt(nowExp.getDepartmentId()));
        newApp.setApplicateTime(new Timestamp(System.currentTimeMillis()));

        applyService.save(newApp);
        return "success";
    }


    /*自己可以查申请审核是否通过,查申请表!!!自己的，最新一个！*/
    public String result(){
        talent =(Talent) session.get("talent");
        /*从目前的工作记录中取最新公司*/
        if(talent.getIdentity() != 0) {
            v_WorkExperience nowExp = (v_WorkExperience) session.get("workExperience");
            if(nowExp!=null)
                ActionContext.getContext().getSession().put("myEntName", nowExp.getEnterpriseName());
        }
        applicate = applyService.getCurrentApp(talent.getTalentId());
        if(applicate == null){
            return "error";
        }
        /*此时action中applicate为本人最新申请*/
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
            if(nowExp == null){
                request.put("tip","您的当前工作记录为空，不为任何公司的HR");
                return "noHR";
            }
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


        Map param= ActionContext.getContext().getParameters();
        String[] value1 = (String[])param.get("Result");
        String[] value2 = (String[])param.get("Id");

        boolean Result = Boolean.parseBoolean(value1[0]);
        int Id = Integer.parseInt(value2[0]);

        if(applyService.review(Id,Result)){
            /*改工作经历，已加在service层的review中*/
            return "success";
        }
        return "error";

    }
}

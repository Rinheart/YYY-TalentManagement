package com.action;


import com.entity.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IApplyService;
import com.service.ITalentService;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
* 为申请就职离职的action
*
* */
public class ApplyAction extends ActionSupport implements ServletContextAware, ServletRequestAware, ServletResponseAware {
    private Talent talent;
    private IApplyService applyService;
    private Applicate applicate;
    List<Applicate> applicateList;

    public Talent getTalent() {
        return talent;
    }
    public void setTalent(Talent talent) {
        this.talent = talent;
    }
    public IApplyService getApplyService() {
        return applyService;
    }
    public void setApplyService(IApplyService applyService) {
        this.applyService = applyService;
    }
    public Applicate getApplicate() {
        return applicate;
    }
    public void setApplicate(Applicate applicate) {
        this.applicate = applicate;
    }
    public List<Applicate> getApplicateList() {
        return applicateList;
    }
    public void setApplicateList(List<Applicate> applicateList) {
        this.applicateList = applicateList;
    }

    private ServletContext application;// Servlet上下文
    private HttpServletRequest request;// request对象
    private HttpServletResponse response;// response对象
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }
    public void setServletContext(ServletContext application) {
        this.application = application;
    }

    /*填申请*/
    public String apply(){
        talent =(Talent) request.getSession().getAttribute("talent");
        if(talent.getIdentity() == 2){
            request.setAttribute("tip", "HR离职注销账号请向公司申报");
            return "false";
        }

        return "success";
    }
    /*查申请审核是否通过,查申请表*/
    public String result(){
        return "success";
    }


    /*HR查本公司所有申请(就职离职)*/
    public String HRCheck(){
        talent =(Talent) request.getSession().getAttribute("talent");
        if(talent.getIdentity() == 2){
            v_WorkExperience nowExp =(v_WorkExperience) request.getSession().getAttribute("workExperience");
            applicateList = applyService.getEntApp(nowExp.getEnterpriseId());
            request.getSession().setAttribute("applicateList", applicateList);
            return "success";
        }
        else{
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("tip","你不是HR,无权查看");
            return "noHR";
        }
    }

    /*HR审核操作,update审核表*/
    public String HRReview(){
        return "success";
    }

}

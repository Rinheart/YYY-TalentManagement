package com.action;


import com.entity.*;
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

/*
* 为申请就职离职的action
*
* */
public class ApplyAction extends ActionSupport implements ServletContextAware, ServletRequestAware, ServletResponseAware {
    private Talent talent;
    private IApplyService applyService;

    private ServletContext application;// Servlet上下文
    private HttpServletRequest request;// request对象
    private HttpServletResponse response;// response对象

    public Talent getTalent() {
        return talent;
    }
    public void setTalent(Talent talent) {
        this.talent = talent;
    }
    public void setApplyService(IApplyService applyService) {
        this.applyService = applyService;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }
    public void setServletContext(ServletContext application) {
        this.application = application;
    }

    /*申请，填申请表*/
    public String apply(){
        return "success";
    }
    /*查申请审核是否通过*/
    public String result(){
        return "success";
    }
    /*HR查本公司所有申请(就职离职)*/
    public String HRCheck(){
        return "success";
    }
    /*HR审核操作*/
    public String HRReview(){
        return "success";
    }

}

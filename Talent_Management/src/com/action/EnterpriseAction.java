package com.action;

import com.entity.Department;
import com.entity.Enterprise;

import com.entity.Talent;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IEnterpriseService;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public class EnterpriseAction extends ActionSupport implements ServletContextAware, ServletRequestAware, ServletResponseAware {
    private Enterprise enterprise;
    private Department department;
    private Talent talent;

    private IEnterpriseService enterpriseService;

    private List<Department> departmentList;
    private List<Talent> HRList;

    private HttpServletRequest request;
    private ServletContext application;
    private HttpServletResponse response;

    public String login() {
        HttpSession session = request.getSession();
        if (enterpriseService.login(enterprise)) {
            //补全session中该企业用户的信息
            enterprise = enterpriseService.getFullEnterprise(enterprise);
            session.setAttribute("enterprise", enterprise);
            return "loginsuccess";
        }
        return "loginfail";
    }

    public String register() {
        if (enterpriseService.register(enterprise)) {
            return "registersuccess";
        }
        return "registerfail";
    }

//通过action转发到修改企业信息页面
    public String getUpdatePage() {
        HttpSession session = request.getSession();
        //从补全的session中获取enterprise的值
        enterprise = (Enterprise) session.getAttribute("enterprise");
        return "success";
    }

//更新企业信息
    public String update() {
        Enterprise oldEnterprise = enterpriseService.getFullEnterprise(enterprise);
        enterprise.setEstablishTime(oldEnterprise.getEstablishTime());
        //等等...

        if (enterpriseService.update(enterprise)) {
            return "updatesuccess";
        }
        return "updatefail";
    }

    //添加部门信息
    public String addDepartment() {
        if (enterpriseService.addDepartment(department)) {
        return "addsuccess";
    }
        return "addfail";
    }
    //转发到部门管理页面
    public String getDepartmentPage() {
        HttpSession session = request.getSession();
        //获取enterprise的值，用来显示公司名称等信息
        enterprise = (Enterprise) session.getAttribute("enterprise");
        departmentList = enterpriseService.getDepartmentList(enterprise);
        request.setAttribute("departmentList",departmentList);
        return "success";
    }
    //转发到增加部门信息页面
    public String addDepartmentPage() {
        HttpSession session = request.getSession();
        //获取enterprise的值，用来显示公司名称等信息
        enterprise = (Enterprise) session.getAttribute("enterprise");
        return "success";
    }
    //转发到管理HR信息页面
    public String manageHRPage(){
        HttpSession session = request.getSession();
        //获取enterprise的值，用来显示公司名称等信息
        enterprise = (Enterprise) session.getAttribute("enterprise");
        HRList = enterpriseService.getHRList(enterprise);
        request.setAttribute("HRList",HRList);
        return "success";
    }
    //修改HR信息
    public String alterHR(){
        if (enterpriseService.alterHR(talent)) {
            return "success";
        }
        return "fail";
    }

//以下皆为getter &setter & 接口实现
    public Talent getTalent() {
        return talent;
    }

    public void setTalent(Talent talent) {
        this.talent = talent;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public IEnterpriseService getEnterpriseService() {
        return enterpriseService;
    }

    public void setEnterpriseService(IEnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    public List<Talent> getHRList() {
        return HRList;
    }

    public void setHRList(List<Talent> HRList) {
        this.HRList = HRList;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public ServletContext getApplication() {
        return application;
    }

    public void setApplication(ServletContext application) {
        this.application = application;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    //实现接口ServletResponseAware
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }
    //实现接口ServletContextAware
    public void setServletContext(ServletContext application) {
        this.application = application;
    }
}

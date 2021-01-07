package com.action;

import com.entity.Department;
import com.entity.Enterprise;

import com.entity.Talent;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IEnterpriseService;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.ServletContextAware;

import java.util.List;
import java.util.Map;

public class EnterpriseAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    private Enterprise enterprise;
    private Department department;
    private Talent talent;

    private IEnterpriseService enterpriseService;

    private List<Department> departmentList;
    private List<Talent> HRList;

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

    public String login() {

        if (enterpriseService.login(enterprise)) {
            //补全session中该企业用户的信息
            enterprise = enterpriseService.getFullEnterprise(enterprise);
            session.put("enterprise", enterprise);
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

        //从补全的session中获取enterprise的值
        enterprise = (Enterprise) session.get("enterprise");
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

        //获取enterprise的值，用来显示公司名称等信息
        enterprise = (Enterprise) session.get("enterprise");
        departmentList = enterpriseService.getDepartmentList(enterprise);
        request.put("departmentList",departmentList);
        return "success";
    }
    //转发到增加部门信息页面
    public String addDepartmentPage() {

        //获取enterprise的值，用来显示公司名称等信息
        enterprise = (Enterprise) session.get("enterprise");
        return "success";
    }
    //转发到管理HR信息页面
    public String manageHRPage(){

        //获取enterprise的值，用来显示公司名称等信息
        enterprise = (Enterprise) session.get("enterprise");
        HRList = enterpriseService.getHRList(enterprise);
        request.put("HRList",HRList);
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

}

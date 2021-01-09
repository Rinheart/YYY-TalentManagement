package com.action;

import com.entity.Department;
import com.entity.Enterprise;

import com.entity.Talent;
import com.entity.v_Enterprise_Talent;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IEnterpriseService;
import com.service.ITalentService;
import com.service.TalentService;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;

public class EnterpriseAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    private Enterprise enterprise;
    private Department department;
    private Talent talent;
    private v_Enterprise_Talent v_enterprise_talent;
    //通过did（departmentid来获取要修改的值）
    private int did;
    private String tid;

    private IEnterpriseService enterpriseService;
    private ITalentService talentService;

    private List<Department> departmentList;
    private List<v_Enterprise_Talent> HRList;

    private Map request,session,application;

    public String login() {
        if (enterpriseService.login(enterprise)) {
            //补全session中该企业用户的信息
            enterprise = enterpriseService.getFullEnterpriseById(enterprise.getEnterpriseId());
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
        Enterprise oldEnterprise = enterpriseService.getFullEnterpriseById(enterprise.getEnterpriseId());
        enterprise.setEstablishTime(oldEnterprise.getEstablishTime());
        //等等...
        if (enterpriseService.update(enterprise)) {
            return "updatesuccess";
        }
        return "updatefail";
    }
    //转发到增加部门信息页面
    public String addDepartmentPage() {
        //获取enterprise的值，用来显示公司名称等信息
        enterprise = (Enterprise) session.get("enterprise");
        return "success";
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
    //转发到修改部门信息页面
    public String departmentUpdatePage() {
        department = enterpriseService.getDepartmentById(did).get(0);
        return "success";
    }
    //修改部门信息
    public String departmentUpdate() {
        if (enterpriseService.updateDepartment(department)) {
            return "success";
        }
        return "fail";
    }
    //删除部门信息
    public String departmentDelete(){
        department = enterpriseService.getDepartmentById(did).get(0);
        if (enterpriseService.deleteDepartment(department)){
        return "success";
        }
        return "fail";
    }

    //转发到管理HR信息页面
    public String manageHRPage(){
        //获取enterprise的值，用来显示公司名称等信息
        enterprise = (Enterprise) session.get("enterprise");
        HRList = enterpriseService.getHRList(enterprise);
        request.put("HRList",HRList);
        return "success";
    }

    public String alterHRPage(){
        talent = enterpriseService.getHRById(tid).get(0);
       // request.put("talent",talent);
        return "success";
    }
    //修改HR信息
    public String alterHR(){
        Talent ot = enterpriseService.getHRById(talent.getTalentId()).get(0);
        talent.setPassword(ot.getPassword());
        talent.setName(ot.getName());
        if (enterpriseService.alterHR(talent)) {
            return "success";
        }
        return "fail";
    }

    //清空session并退出登录
    public String deleteSession(){
       ActionContext.getContext().getSession().clear();
       session.clear();
        return "success";
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

    public List<v_Enterprise_Talent> getHRList() {
        return HRList;
    }

    public void setHRList(List<v_Enterprise_Talent> HRList) {
        this.HRList = HRList;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public Map getRequest() {
        return request;
    }

    public void setRequest(Map request) {
        this.request = request;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public Map getApplication() {
        return application;
    }

    public void setApplication(Map application) {
        this.application = application;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public v_Enterprise_Talent getV_enterprise_talent() {
        return v_enterprise_talent;
    }

    public void setV_enterprise_talent(v_Enterprise_Talent v_enterprise_talent) {
        this.v_enterprise_talent = v_enterprise_talent;
    }

    public ITalentService getTalentService() {
        return talentService;
    }

    public void setTalentService(ITalentService talentService) {
        this.talentService = talentService;
    }
}

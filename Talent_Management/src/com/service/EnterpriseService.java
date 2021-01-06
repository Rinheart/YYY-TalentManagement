package com.service;

import com.dao.IEnterpriseDAO;
import com.entity.Department;
import com.entity.Enterprise;
import com.entity.Talent;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;
import java.util.Map;

public class EnterpriseService implements IEnterpriseService{
    private IEnterpriseDAO enterpriseDAO = null;
    public EnterpriseService() {
        System.out.println("create EnterpriseService.");
    }
    public void setEnterpriseDAO(IEnterpriseDAO enterpriseDAO) {
        this.enterpriseDAO = enterpriseDAO;
    }
    //实现企业登录功能
    public boolean login(Enterprise enterprise) {
        Map request = (Map) ActionContext.getContext().get("request");
        String enterpriseId = enterprise.getEnterpriseId();
        String password = enterprise.getPassword();
        String hql = "from Enterprise as enterprise where EnterpriseId='"
                + enterpriseId + "' and password='" + password + "'";
        List list = enterpriseDAO.findByHql(hql);
        if (list.isEmpty()){
            request.put("tip", "密码不正确，请重新登录");
            return false;
        }
        request.put("tip", "登录成功！");
        return true;
    }
    //实现企业注册功能
    public boolean register(Enterprise enterprise) {
        Map request = (Map) ActionContext.getContext().get("request");
        String enterpriseId = enterprise.getEnterpriseId();
        String hql = "from Enterprise as enterprise where EnterpriseId='" + enterpriseId + "'";
        List list = enterpriseDAO.findByHql(hql);
        if (!list.isEmpty()){
            request.put("tip","注册失败，出现重名用户");
            return false;
        }
        enterprise.setInformationReview(true);
        enterpriseDAO.save(enterprise);
        request.put("tip","恭喜您注册成功！");
        return true;
    }
    //更新企业信息
    public boolean update(Enterprise enterprise){
        enterpriseDAO.update(enterprise);
        return true;
    }
    //补全session
    public Enterprise getFullEnterprise(Enterprise enterprise) {
        String enterpriseId = enterprise.getEnterpriseId();
        String hql = "from Enterprise as enterprise where EnterpriseId='"
                + enterpriseId + "'";
        List list = enterpriseDAO.findByHql(hql);
        if(list.size()==1){
            return (Enterprise) list.get(0);
        }
        else if(list.isEmpty()){
            System.out.println("无此用户");
            return null;
        }
        else if(list.size()>1){
            System.out.println("注册出错，两个同名用户");
            return null;
        }
        else {
            return null;
        }
    }
    //实现添加部门信息的功能
    public boolean addDepartment(Department department) {
        Map request = (Map) ActionContext.getContext().get("request");
        int departmentId = department.getDepartmentId();
        String hql = "from Department as department where DepartmentId='" + departmentId + "'";
        List list = enterpriseDAO.findByHql(hql);
        if (!list.isEmpty()){
            //request.put("tip","添加失败，出现ID相同的部门");
            return false;
        }
        enterpriseDAO.saveDepartment(department);
        request.put("tip","添加部门信息成功！");
        return true;
    }
    //获取企业所有部门信息
    public List<Department> getDepartmentList(Enterprise enterprise) {
        String enterpriseId = enterprise.getEnterpriseId();
        String hql = "from Department as department where EnterpriseId='" + enterpriseId + "'";
        List<Department> list = enterpriseDAO.findByHql(hql);
        return list;
    }
    //获取企业所有HR信息
    public List<Talent> getHRList(Enterprise enterprise) {
        String enterpriseId = enterprise.getEnterpriseId();
        String hql = "from Talent as talent where EnterpriseId='"
                + enterpriseId + "' and (Identity='"
                + 2 + "'or'"+ 4 +"'";
        List<Talent> list = enterpriseDAO.findByHql(hql);
        return list;
    }
    //修改HR信息功能（待实现逻辑）
    public boolean alterHR(Talent talent) {
        return false;
    }
}

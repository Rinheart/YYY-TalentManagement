package com.service;

import com.dao.IEnterpriseDAO;
import com.entity.*;
import com.opensymphony.xwork2.ActionContext;

import java.sql.Timestamp;
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
    public Enterprise getFullEnterpriseById(String enterpriseId) {
        //String enterpriseId = enterprise.getEnterpriseId();
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
            request.put("tip","添加失败，出现ID相同的部门");
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

    //修改部门信息
    public Boolean updateDepartment(Department department) {
        enterpriseDAO.updateDepartment(department);
        return true;
    }
    //获取企业所有HR信息
    public List<v_Enterprise_Talent> getHRList(Enterprise enterprise) {
        String enterpriseId = enterprise.getEnterpriseId();
//        String hql = "from v_Enterprise_Talent as enterprise_talent where (Identity='" + 2 +"' or Identity = '" + 4 +"') and EnterpriseId='" + enterpriseId + "'";
        String hql = "From v_Enterprise_Talent as enterprise_talent where EnterpriseId='" + enterpriseId + "'";
        List<v_Enterprise_Talent> list = enterpriseDAO.findByHql(hql);
        return list;
    }
    //获取企业非HR员工信息
    public List<v_Enterprise_Talent> getTalentList(Enterprise enterprise) {
        String enterpriseId = enterprise.getEnterpriseId();
//        String hql = "from v_Enterprise_Talent as enterprise_talent where (Identity='" + 2 +"' or Identity = '" + 4 +"') and EnterpriseId='" + enterpriseId + "'";
        String hql = "From v_Enterprise_Talent as enterprise_talent where EnterpriseId='" + enterpriseId + "' and Identity ='1'";
        List<v_Enterprise_Talent> list = enterpriseDAO.findByHql(hql);
        return list;
    }

    //修改hr信息
    public boolean alterHR(Talent talent) {
        enterpriseDAO.updateHR(talent);
        return true;
    }
    public List<Department> getDepartmentById(int departmentId) {
        String hql = "from Department as department where DepartmentId='" + departmentId + "'";
        List<Department> list = enterpriseDAO.findByHql(hql);
        return list;
    }
    //删除部门
    public boolean deleteDepartment(Department department){
        enterpriseDAO.deleteDepartment(department.getDepartmentId());
        return true;
    }
    //通过id获得HR
    public List<Talent> getHRById(String id) {
        String hql = "from Talent as talent where TalentId ='" + id + "'";
        List<Talent> list = enterpriseDAO.findByHql(hql);
        return list;
    }

    @Override
    public List<Talent> getTalentById(String id) {
        return null;
    }
    //增加经验
}

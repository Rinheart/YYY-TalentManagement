package com.service;

import com.entity.Department;
import com.entity.Enterprise;
import com.entity.Talent;
import com.entity.v_Enterprise_Talent;

import java.util.List;

public interface IEnterpriseService {

    boolean login(Enterprise enterprise);

    boolean register(Enterprise enterprise);

    boolean update(Enterprise enterprise);

    Enterprise getFullEnterpriseById(String enterpriseId);
    //增加部门信息
    boolean addDepartment(Department department);
    //得到公司所有部门信息
    List<Department> getDepartmentList(Enterprise enterprise);
    //修改部门信息
    Boolean updateDepartment(Department department);
    //获得公司所有HR信息
    List<v_Enterprise_Talent> getHRList(Enterprise enterprise);
    //获得公司非HR员工信息
    List<v_Enterprise_Talent> getTalentList(Enterprise enterprise);
    //修改HR信息
    boolean alterHR(Talent talent);
    //通过ID获取到部门信息
    List<Department> getDepartmentById(int departmentId);
    boolean deleteDepartment(Department department);
    List<Talent> getHRById(String id);
    List<Talent> getTalentById(String id);
}

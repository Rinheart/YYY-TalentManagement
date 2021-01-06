package com.service;

import com.entity.Department;
import com.entity.Enterprise;
import com.entity.Talent;

import java.util.List;

public interface IEnterpriseService {

    boolean login(Enterprise enterprise);

    boolean register(Enterprise enterprise);

    boolean update(Enterprise enterprise);

    Enterprise getFullEnterprise(Enterprise enterprise);
    //增加部门信息
    boolean addDepartment(Department department);
    //得到公司所有部门信息
    List<Department> getDepartmentList(Enterprise enterprise);
    //获得公司所有HR信息
    List<Talent> getHRList(Enterprise enterprise);
    //修改HR信息
    boolean alterHR(Talent talent);
}

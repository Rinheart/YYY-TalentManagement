package com.dao;

import com.entity.Department;
import com.entity.Enterprise;
import com.entity.Talent;
import com.entity.v_Enterprise_Talent;

import java.util.List;

public interface IEnterpriseDAO {
    //添加企业信息
    void save(Enterprise transientInstance);
    List findByHql(String hql);//
    // 修改企业信息
    void update(Enterprise transientInstance);
    //添加部门信息
    void saveDepartment(Department transientInstance);
    // 修改部门信息
    void updateDepartment(Department transientInstance);
    //存储HR信息
    void updateHR(Talent transientInstance);
    void deleteDepartment(int departmentid);
}

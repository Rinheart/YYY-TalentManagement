package com.dao;

import com.entity.Enterprise;

import java.util.List;

public interface IEnterpriseDAO {
    void save(Enterprise transientInstance);
    List findByHql(String hql);
}

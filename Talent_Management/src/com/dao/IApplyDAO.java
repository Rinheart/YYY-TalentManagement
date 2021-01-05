package com.dao;

import com.entity.Applicate;

import java.util.List;

public interface IApplyDAO {
    void save(Applicate transientInstance);
    List findByHql(String hql);
    void update(Applicate transientInstance);
}

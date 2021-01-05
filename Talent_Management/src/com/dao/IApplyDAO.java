package com.dao;

import com.entity.Talent;

import java.util.List;

public interface IApplyDAO {
    void save(Talent transientInstance);
    List findByHql(String hql);
    void update(Talent transientInstance);
}

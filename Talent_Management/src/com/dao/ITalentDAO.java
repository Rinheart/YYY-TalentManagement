package com.dao;

import com.entity.Talent;

import java.util.List;

public interface ITalentDAO {
    void save(Talent transientInstance);
    List findByHql(String hql);
}

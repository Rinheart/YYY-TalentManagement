package com.dao;

import com.entity.Applicate;
import com.entity.Talent;
import com.entity.WorkExperience;

import java.util.List;

public interface IApplyDAO {
    void save(Applicate transientInstance);
    List findByHql(String hql);
    void update(Applicate transientInstance);

    void updateExp(WorkExperience transientInstance);
    void saveExp(WorkExperience transientInstance);
    void updateTalent(Talent transientInstance);
}

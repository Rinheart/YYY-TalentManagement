package com.dao;

import com.entity.*;

import java.util.List;

public interface ITalentDAO {
    void save(Talent transientInstance);
    List findByHql(String hql);
    void update(Talent transientInstance);
    public boolean saveAttend(Attend attend);
    public boolean saveDisciplinary(Disciplinary disciplinary);
    public boolean saveReward(Reward reward);
    public boolean saveBigEvent(BigEvent bigEvent);
    public boolean saveAchievement(Achievement achievement);
    public boolean saveEvaluate(Evaluate evaluate);
}

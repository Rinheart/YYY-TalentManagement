package com.service;

import com.entity.Talent;
import com.entity.v_WorkExperience;

import java.util.List;


public interface ITalentService {
    boolean register(Talent talent);
    boolean login(Talent talent);

    Talent getFullTalent(Talent talent);

    boolean update(Talent talent);
    boolean delete(Talent talent);
    public v_WorkExperience MyWorkExperience(Talent talent);
    public List HRWorkExperience(String enterpriseId);
    public List HRWorkedExperience(String enterpriseId);
}

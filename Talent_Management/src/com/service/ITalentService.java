package com.service;

import com.entity.Talent;
import com.entity.v_WorkExperience;

import java.util.List;


public interface ITalentService {
    boolean register(Talent talent);
    boolean login(Talent talent);

    Talent getFullTalent(Talent talent);

    boolean update(Talent talent);
    public v_WorkExperience MyWorkExperience(Talent talent);
    public List<v_WorkExperience> HRWorkExperience(String enterpriseId);
    public List<v_WorkExperience> HRWorkedExperience(String enterpriseId);
    public List<v_WorkExperience> WorkExperience(String talentId);
    public List<v_WorkExperience> WorkedExperience(String talentId,String enterpriseId);
}

package com.service;

import com.entity.*;

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
    public List<v_Attend> WorkAttend(String talentId);
    public List<v_Attend> WorkedAttend(String talentId,String enterpriseId);
    public List<v_Disciplinary> WorkDisciplinary(String talentId);
    public List<v_Disciplinary> WorkedDisciplinary(String talentId,String enterpriseId);
    public List<v_Reward> WorkReward(String talentId);
    public List<v_Reward> WorkedReward(String talentId,String enterpriseId);
    public List<v_BigEvent> WorkBigEvent(String talentId);
    public List<v_BigEvent> WorkedBigEvent(String talentId,String enterpriseId);
}

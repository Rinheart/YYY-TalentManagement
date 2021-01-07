package com.service;

import com.entity.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public interface ITalentService {
    boolean register(Talent talent);
    boolean login(Talent talent);

    Talent getFullTalent(Talent talent);

    boolean update(Talent talent);
    //public v_WorkExperience MyWorkExperience(Talent talent);
    public v_WorkExperience MyWorkExperience(String talentId);
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
    public List<v_Achievement> WorkAchievement(String talentId);
    public List<v_Achievement> WorkedAchievement(String talentId,String enterpriseId);
    public List<v_Evaluate> WorkEvaluate(String talentId);
    public List<v_Evaluate> WorkedEvaluate(String talentId,String enterpriseId);
    public boolean AddAttend(String talentId, int event, String HR, Date date);
    public boolean AddDisciplinary(String talentId,String content,String HR,Date date);
    public boolean AddReward(String talentId,String rewordName,String rewordResult,String prize,String HR,Date date);
    public boolean AddBigEvent(String talentId,String content,String HR,Date date);
    public boolean AddAchievement(String talentId,String content,Date startTime,Date endTime,int achievementScore,String achievementComment,String HR);
    public boolean AddEvaluate(String talentId,String HR,Integer totalScore,Integer abilityScore,String abilityComment,Integer attitudeScore,String attitudeComment);
}

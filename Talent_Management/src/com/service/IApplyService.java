package com.service;

import com.entity.*;

import java.util.List;


public interface IApplyService {

    boolean update(Applicate applicate);
    boolean save(Applicate applicate);
    boolean talentAdd(Applicate applicate,String talentId);
    public int getCurrentExpId(String talentId);

    v_WorkExperience getCurrentExpById(String talentId);

    List<Applicate> getEntApp(String enterpriseId);
    List<Applicate> getNoResApp(String enterpriseId);
    List<Applicate> getTalApp(String talentId);
    Applicate getAppById(int applicateId);

    Applicate getCurrentApp(String talentId);

    boolean review(int applicateId,boolean applicateResult);

    boolean changeExp(Applicate nowApp);
    Talent getFullTalentById(String talentId);
}

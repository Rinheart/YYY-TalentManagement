package com.service;

import com.entity.Talent;

import java.util.List;


public interface ITalentService {
    boolean register(Talent talent);
    boolean login(Talent talent);

    Talent getFullTalent(Talent talent);

    boolean update(Talent talent);
    boolean delete(Talent talent);
    List HRWorkExperience();
}

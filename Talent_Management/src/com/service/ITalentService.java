package com.service;

import com.entity.Talent;

import java.util.List;


public interface ITalentService {
    public boolean register(Talent talent);
    public List login(Talent talent);
    public boolean update(Talent talent);
    public boolean delete(Talent talent);
}

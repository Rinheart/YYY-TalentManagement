package com.service;

import com.entity.Talent;


public interface IUserService {
    public boolean register(Talent talent);
    public boolean login(Talent talent);
}

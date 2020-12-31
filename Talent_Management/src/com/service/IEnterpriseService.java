package com.service;

import com.entity.Enterprise;
import com.entity.Talent;

public interface IEnterpriseService {
    public boolean login(Enterprise enterprise);
    public boolean register(Enterprise enterprise);
    public boolean update(Enterprise enterprise);
    public boolean delete(Enterprise enterprise);
}

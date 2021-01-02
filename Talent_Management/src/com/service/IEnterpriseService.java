package com.service;

import com.entity.Enterprise;

public interface IEnterpriseService {
    public boolean login(Enterprise enterprise);
    public boolean register(Enterprise enterprise);
    public boolean update(Enterprise enterprise);
}

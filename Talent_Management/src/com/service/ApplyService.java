package com.service;
import com.dao.IApplyDAO;
import com.dao.ITalentDAO;
import com.entity.*;
import com.opensymphony.xwork2.ActionContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
/*
* Talent的服务
*
* */

public class ApplyService implements IApplyService {
    private IApplyDAO applyDAO = null;

    public ApplyService() {
        System.out.println("create ApplyService.");
    }

    public void setApplyDAO(IApplyDAO applyDAO) {
        this.applyDAO = applyDAO;
    }

    @Override
    public boolean update(Talent talent) {
        return false;
    }
}

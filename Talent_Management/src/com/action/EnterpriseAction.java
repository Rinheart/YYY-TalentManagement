package com.action;

import com.entity.Enterprise;
import com.service.IEnterpriseService;
import com.opensymphony.xwork2.ModelDriven;

public class EnterpriseAction {
    private Enterprise enterprise;
    private IEnterpriseService enterpriseService;

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public IEnterpriseService getEnterpriseService() {
        return enterpriseService;
    }

    public void setEnterpriseService(IEnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    public String login() {
        if (enterpriseService.login(enterprise)) {
            return "loginsuccess";
        }
        return "loginfail";
    }

    public String register() {
        if (enterpriseService.register(enterprise)) {
            return "registersuccess";
        }
        return "registerfail";
    }
    public String update() {
        if (enterpriseService.update(enterprise)) {
            return "updatesuccess";
        }
        return "updatefail";
    }

    public String delete() {
        if (enterpriseService.delete(enterprise)) {
            return "deletesuccess";
        }
        return "deletefail";
    }
}

package com.action;

import com.entity.Talent;
import com.service.ITalentService;
/*
* UserAction为人才进行的系列操作
*
* */
public class TalentAction {
    private Talent talent;
    private ITalentService userService;

    public Talent getTalent() {
        return talent;
    }

    public void setTalent(Talent talent) {
        this.talent = talent;
    }

    public ITalentService getUserService() {
        return userService;
    }

    public void setUserService(ITalentService userService) {
        this.userService = userService;
    }



    public String login() {
        if (userService.login(talent)) {
            return "loginsuccess";
        }
        return "loginfail";
    }

    public String register() {
        if (userService.register(talent)) {
            return "registersuccess";
        }
        return "registerfail";
    }

    public String update() {
        if (userService.update(talent)) {
            return "updatesuccess";
        }
        return "updatefail";
    }

    public String delete() {
        if (userService.delete(talent)) {
            return "deletesuccess";
        }
        return "deletefail";
    }

    public String info() {
        return "";
    }

}

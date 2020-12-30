package com.action;

import com.entity.Talent;
import com.service.IUserService;

public class UserAction {
    private Talent talent;
    private IUserService userService;

    public Talent getTalent() {
        return talent;
    }

    public void setTalent(Talent talent) {
        this.talent = talent;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
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

}

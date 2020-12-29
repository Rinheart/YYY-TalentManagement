package com.action;

import com.entity.Talent;
import com.service.IUserService;

/*public class UserAction {
    private Customer loginUser;
    private IUserService userService = null;

    public Customer getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Customer loginUser) {
        this.loginUser = loginUser;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String execute() {
        userService.register(loginUser);
        return "success";
    }


}*/
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
        UserService userServ = new UserService();
        if (userServ.register(loginUser)) {
            return "registersuccess";
        }
        return "registerfail";
    }

    public String update() {
        UserService userServ = new UserService();
        if (userServ.update(loginUser)) {
            return "updatesuccess";
        }
        return "updatefail";
    }

    public String delete() {
        UserService userServ = new UserService();
        if (userServ.delete(loginUser)) {
            return "deletesuccess";
        }
        return "deletefail";
    }

}

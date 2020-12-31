package com.action;

import com.entity.Talent;
import com.service.ITalentService;
/*
* UserAction为人才进行的系列操作
*
* */
public class TalentAction {
    private Talent talent;
    private ITalentService talentService;

    public Talent getTalent() {
        return talent;
    }

    public void setTalent(Talent talent) {
        this.talent = talent;
    }

    public ITalentService getTalentService() {
        return talentService;
    }

    public void setTalentService(ITalentService talentService) {
        this.talentService = talentService;
    }

    public String login() {
        if(talentService.login(talent).size()!=0) {
            talent=(Talent) talentService.login(talent).get(0);
            System.out.println("aow:"+talent.getIdentity());
            if (talent.getIdentity()==0 || talent.getIdentity()==1) {
                System.out.println("0/1");
                return "loginTalent";
            }else if (talent.getIdentity()==2){
                System.out.println("2");
                return "loginHR";
            }else if (talent.getIdentity()==3){
                System.out.println("3");
                return "loginHead";
            }else {
                System.out.println(">3");
                return "loginFail";
            }
        }else {
            System.out.println("Fail!!!");
            return "loginFail";
        }
    }

    public String register() {
        if (talentService.register(talent)) {
            return "registersuccess";
        }
        return "registerfail";
    }

    public String update() {
        if (talentService.update(talent)) {
            return "updatesuccess";
        }
        return "updatefail";
    }

    public String delete() {
        if (talentService.delete(talent)) {
            return "deletesuccess";
        }
        return "deletefail";
    }

    public String info() {
        return "";
    }

}

package com.action;

import com.entity.Talent;
import com.entity.v_WorkExperience;
import com.service.ITalentService;

import java.util.ArrayList;
import java.util.List;

/*
* UserAction为人才进行的系列操作
*
* */
public class TalentAction {
    private Talent talent;
    private ITalentService talentService;
    List<v_WorkExperience> HRworkExperiences=new ArrayList<v_WorkExperience>();

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

    public List<v_WorkExperience> getHRworkExperiences() {
        return HRworkExperiences;
    }

    public String login() {
        if(talentService.login(talent).size()!=0) {
            talent=(Talent) talentService.login(talent).get(0);
            if (talent.getIdentity()==0 || talent.getIdentity()==1) {
                return "loginTalent";
            }else if (talent.getIdentity()==2){
                return "loginHR";
            }else if (talent.getIdentity()==3){
                return "loginHead";
            }else {
                return "loginFail";
            }
        }else {
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
    //HR查看员工工作信息
    public String HRWorkExperience() {
        List list=talentService.HRWorkExperience();
        for (int i=0; i<list.size(); i++) {
            HRworkExperiences.add((v_WorkExperience)list.get(i));
        }
        return "success";
    }
}

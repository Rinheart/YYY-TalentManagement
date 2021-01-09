package com.action;

import com.entity.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.ITalentService;
import javafx.application.Application;
import org.apache.struts2.interceptor.*;
import org.springframework.context.ApplicationContext;
import org.apache.struts2.util.ServletContextAware;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 * UserAction为人才进行的系列操作
 *
 * */
public class TalentAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    private Talent talent;
    private v_WorkExperience workExperience;
    private ITalentService talentService;
    private List<v_WorkExperience> HRworkExperiences = new ArrayList<v_WorkExperience>();
    private List<v_WorkExperience> HRworkedExperiences = new ArrayList<v_WorkExperience>();
    private List<v_WorkExperience> workExperiences = new ArrayList<v_WorkExperience>();
    private List<v_Attend> attend = new ArrayList<v_Attend>();
    private List<v_Disciplinary> disciplinary = new ArrayList<v_Disciplinary>();
    private List<v_Reward> reward = new ArrayList<v_Reward>();
    private List<v_BigEvent> bigEvent = new ArrayList<v_BigEvent>();
    private String p_talentId,p_enterpriseId,p_content,p_rewordName,p_rewordResult,p_prize,
            p_achievementScore, p_achievementComment,p_totalScore,p_abilityScore, p_abilityComment,
            p_attitudeScore,p_attitudeComment;
    private List<v_Achievement> achievement=new ArrayList<v_Achievement>();
    private List<v_Evaluate> evaluate=new ArrayList<v_Evaluate>();
    private v_Attend newAttend;
    private Date p_date,p_startTime,p_endTime;

    public Talent getTalent() {
        return talent;
    }
    public void setTalent(Talent talent) {
        this.talent = talent;
    }
    public v_WorkExperience getWorkExperience() {
        return workExperience;
    }
    public void setWorkExperience(v_WorkExperience workExperience) {
        this.workExperience = workExperience;
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
    public void setHRworkExperiences(List<v_WorkExperience> HRworkExperiences) {
        this.HRworkExperiences = HRworkExperiences;
    }
    public List<v_WorkExperience> getHRworkedExperiences() {
        return HRworkedExperiences;
    }
    public List<v_WorkExperience> getWorkExperiences() {
        return workExperiences;
    }
    public List<v_Attend> getAttend() {
        return attend;
    }
    public List<v_Disciplinary> getDisciplinary() {
        return disciplinary;
    }
    public List<v_Reward> getReward() {
        return reward;
    }
    public List<v_BigEvent> getBigEvent() {
        return bigEvent;
    }
    public String getP_talentId() {
        return p_talentId;
    }
    public void setP_talentId(String p_talentId) {
        this.p_talentId = p_talentId;
    }
    public String getP_enterpriseId() {
        return p_enterpriseId;
    }
    public void setP_enterpriseId(String p_enterpriseId) {
        this.p_enterpriseId = p_enterpriseId;
    }
    public List<v_Achievement> getAchievement() {
        return achievement;
    }
    public List<v_Evaluate> getEvaluate() {
        return evaluate;
    }
    public v_Attend getNewAttend() {
        return newAttend;
    }
    public void setNewAttend(v_Attend newAttend) {
        this.newAttend = newAttend;
    }
    public Date getP_date() {
        return p_date;
    }
    public void setP_date(Date p_date) {
        this.p_date = p_date;
    }
    public String getP_content() {
        return p_content;
    }
    public void setP_content(String p_content) {
        this.p_content = p_content;
    }
    public String getP_rewordName() {
        return p_rewordName;
    }
    public void setP_rewordName(String p_rewordName) {
        this.p_rewordName = p_rewordName;
    }
    public String getP_rewordResult() {
        return p_rewordResult;
    }
    public void setP_rewordResult(String p_rewordResult) {
        this.p_rewordResult = p_rewordResult;
    }
    public String getP_prize() {
        return p_prize;
    }
    public void setP_prize(String p_prize) {
        this.p_prize = p_prize;
    }
    public String getP_achievementScore() {
        return p_achievementScore;
    }
    public void setP_achievementScore(String p_achievementScore) {
        this.p_achievementScore = p_achievementScore;
    }
    public String getP_achievementComment() {
        return p_achievementComment;
    }
    public void setP_achievementComment(String p_achievementComment) {
        this.p_achievementComment = p_achievementComment;
    }
    public Date getP_startTime() {
        return p_startTime;
    }
    public void setP_startTime(Date p_startTime) {
        this.p_startTime = p_startTime;
    }
    public Date getP_endTime() {
        return p_endTime;
    }
    public void setP_endTime(Date p_endTime) {
        this.p_endTime = p_endTime;
    }
    public String getP_totalScore() {
        return p_totalScore;
    }
    public void setP_totalScore(String p_totalScore) {
        this.p_totalScore = p_totalScore;
    }
    public String getP_abilityScore() {
        return p_abilityScore;
    }
    public void setP_abilityScore(String p_abilityScore) {
        this.p_abilityScore = p_abilityScore;
    }
    public String getP_abilityComment() {
        return p_abilityComment;
    }
    public void setP_abilityComment(String p_abilityComment) {
        this.p_abilityComment = p_abilityComment;
    }
    public String getP_attitudeScore() {
        return p_attitudeScore;
    }
    public void setP_attitudeScore(String p_attitudeScore) {
        this.p_attitudeScore = p_attitudeScore;
    }
    public String getP_attitudeComment() {
        return p_attitudeComment;
    }
    public void setP_attitudeComment(String p_attitudeComment) {
        this.p_attitudeComment = p_attitudeComment;
    }

    private Map request,session,application;
    public void setRequest(Map<String, Object> request) {
        this.request=request;
    }
    public void setSession(Map<String, Object> session) {
        this.session=session;
    }
    public void setApplication(Map<String, Object> application) {
        this.application=application;
    }

    /*通用方法*/
    public String login() {
        if (talentService.login(talent)) {
            talent = talentService.getFullTalent(talent);
            //把登录的用户加到session中以便让系统知道这是谁
            session.put("talent", talent);
            session.put("talentId",talent.getTalentId());
            //登录时查询工作经历，获取当前工作信息
            workExperience=talentService.MyWorkExperience(talent.getTalentId());
            session.put("workExperience",workExperience);
            //不同身份返回不同Strng，转到不同页面
            if (talent.getIdentity() == 0 || talent.getIdentity() == 1) {
                return "loginTalent";
            } else if (talent.getIdentity() == 2) {
                return "loginHR";
            } else {
                return "loginFail";
            }
        } else {
            return "loginFail";
        }
    }

    public String exit(){
        ActionContext.getContext().getSession().clear();
        return "exit";
    }

    public String loginPage(){
        talent = (Talent) session.get("talent");
        workExperience = (v_WorkExperience) session.get("workExperience");
        if(talent.getIdentity() == 2){
            return "H";
        }
        else{
            return "T";
        }

    }


    public String register() {
        talent.setIdentity(0);
        talent.setInformationReview(true);
        if (talentService.register(talent)) {
            return "registersuccess";
        }
        return "registerfail";
    }

    public String getUpdatePage() {
        String tmp_talentId = (String) session.get("talentId");
        talent = talentService.getFullTalentById(tmp_talentId);
        return "success";
    }

    public String update() {
        /*前端传入不能为修改后的用户名
         * 以下set的值全是默认不改的
         * */
        Talent oldTalent = talentService.getFullTalent(talent);
        talent.setName(oldTalent.getName());
        talent.setSex(oldTalent.getSex());
        talent.setIdNumber(oldTalent.getIdNumber());
        talent.setBirthday(oldTalent.getBirthday());
        talent.setInformationReview(oldTalent.isInformationReview());
        talent.setIdentity(oldTalent.getIdentity());
        if (talentService.update(talent)) {
            ActionContext.getContext().getSession().clear();
            return "updatesuccess";
        }
        return "updatefail";
    }


    public String MyWorkExp() {
        talent =(Talent) session.get("talent");
        workExperiences = talentService.WorkExperience(talent.getTalentId());
        session.put("workExperience", workExperience);
        return "success";
    }


    /*HR方法*/
    /*
     * 可以使用Service中的public List WorkExperience(String talentId)方法查看工作经历
     * public List<v_Attend> WorkAttend(String talentId)查看异常出勤
     * public List<v_Disciplinary> WorkDisciplinary(String talentId)查看违纪记录
     * public List<v_Reward> WorkReward(String talentId)查看奖励记录
     * public List<v_BigEvent> WorkBigEvent(String talentId)查看重大事件*/


    //HR查看员工工作信息
    public String HRWorkExperience() {
        String tmp_talentId = (String) session.get("talentId");
        workExperience = talentService.MyWorkExperience(tmp_talentId);
        if (workExperience != null) {
            HRworkExperiences = talentService.HRWorkExperience(workExperience.getEnterpriseId());
        }
        return "success";
    }

    //HR查看已离职员工工作信息
    public String HRWorkExperience1() {
        String tmp_talentId = (String) session.get("talentId");
        workExperience = talentService.MyWorkExperience(tmp_talentId);
        if (workExperience != null) {
            HRworkedExperiences = talentService.HRWorkedExperience(workExperience.getEnterpriseId());
        }
        return "success";
    }

    //查看某员工既往工作经历
    public String HRWorkedExperience() {
        workExperiences = talentService.WorkExperience(p_talentId);
        //session.put("workExperience", workExperience);
        return "success";
    }

    //HR查看已离职员工既往工作经历
    public String HRWorkedExperiences() {
        workExperiences = talentService.WorkedExperience(p_talentId, p_enterpriseId);
        return "success";
    }

    //HR查看某员工的工作表现
    public String HRWorkPerformance() {
        attend = talentService.WorkAttend(p_talentId);
        disciplinary = talentService.WorkDisciplinary(p_talentId);
        reward = talentService.WorkReward(p_talentId);
        bigEvent = talentService.WorkBigEvent(p_talentId);
        return "success";
    }

    //HR查看已离职某员工在职期间工作表现
    public String HRWorkedPerformance() {
        attend = talentService.WorkedAttend(p_talentId, p_enterpriseId);
        disciplinary = talentService.WorkedDisciplinary(p_talentId, p_enterpriseId);
        reward = talentService.WorkedReward(p_talentId, p_enterpriseId);
        bigEvent = talentService.WorkedBigEvent(p_talentId, p_enterpriseId);
        return "success";
    }

    //HR查看某员工的工作评价
    public String HRWorkEvaluate() {
        //绩效
        achievement=talentService.WorkAchievement(p_talentId);
        //主观评价
        evaluate=talentService.WorkEvaluate(p_talentId);
        return "success";
    }

    //HR查看已离职某员工在职期间工作评价
    public String HRWorkedEvaluate() {
        //绩效
        achievement=talentService.WorkedAchievement(p_talentId,p_enterpriseId);
        //主观评价
        evaluate=talentService.WorkedEvaluate(p_talentId,p_enterpriseId);
        return "success";
    }

    //添加异常出勤记录
    public String AddAttend() {
        String talent_id=(String) session.get("talentId");
        if (talentService.AddAttend(p_talentId,newAttend.getEvent(),talent_id,p_date))
            return "success";
        else
            return "fail";
    }

    //添加违纪事件记录
    public String AddDisciplinary() {
        String talent_id=(String) session.get("talentId");
        if (talentService.AddDisciplinary(p_talentId,p_content,talent_id,p_date))
            return "success";
        else
            return "fail";
    }

    //添加奖励事件记录
    public String AddReward() {
        String talent_id=(String) session.get("talentId");
        if (talentService.AddReward(p_talentId,p_rewordName,p_rewordResult,p_prize,talent_id,p_date))
            return "success";
        else
            return "fail";
    }

    //添加重大事件记录
    public String AddBigEvent() {
        String talent_id=(String) session.get("talentId");
        if (talentService.AddBigEvent(p_talentId,p_content,talent_id,p_date))
            return "success";
        else
            return "fail";
    }

    //添加绩效评价记录
    public String AddAchievement() {
        String talent_id=(String) session.get("talentId");
        if (talentService.AddAchievement(p_talentId,p_content,p_startTime,p_endTime,
                Integer.parseInt(p_achievementScore), p_achievementComment,talent_id))
            return "success";
        else
            return "fail";
    }

    //添加主观评价记录
    public String AddEvaluate() {
        String talent_id=(String) session.get("talentId");
        if (talentService.AddEvaluate(p_talentId,talent_id,Integer.parseInt(p_totalScore),
                Integer.parseInt(p_abilityScore), p_abilityComment,Integer.parseInt(p_attitudeScore),
                p_attitudeComment))
            return "success";
        else
            return "fail";
    }

}

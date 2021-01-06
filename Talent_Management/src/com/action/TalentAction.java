package com.action;

import com.entity.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.ITalentService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 * UserAction为人才进行的系列操作
 *
 * */
public class TalentAction extends ActionSupport implements ServletContextAware, ServletRequestAware, ServletResponseAware {
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

    private ServletContext application;// Servlet上下文
    private HttpServletRequest request;// request对象
    private HttpServletResponse response;// response对象

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

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    public void setServletContext(ServletContext application) {
        this.application = application;
    }

    /*通用方法*/
    public String login() {
        HttpSession session = request.getSession();
        if (talentService.login(talent)) {
            talent = talentService.getFullTalent(talent);
            //把登录的用户加到session中以便让系统知道这是谁
            session.setAttribute("talent", talent);
            session.setAttribute("talentId",talent.getTalentId());
            //登录时查询工作经历，获取当前工作信息
            workExperience=talentService.MyWorkExperience(talent);
            session.setAttribute("workExperience",workExperience);
            //不同身份返回不同Strng，转到不同页面
            if (talent.getIdentity() == 0 || talent.getIdentity() == 1) {
                return "loginTalent";
            } else if (talent.getIdentity() == 2) {
                return "loginHR";
            } else if (talent.getIdentity() == 3) {
                return "loginHead";
            } else {
                return "loginFail";
            }
        } else {
            return "loginFail";
        }

    }

    public String register() {
        if (talentService.register(talent)) {
            return "registersuccess";
        }
        return "registerfail";
    }

    public String getUpdatePage() {
        HttpSession session = request.getSession();
        talent = (Talent) session.getAttribute("talent");
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
            return "updatesuccess";
        }
        return "updatefail";
    }


    public String MyWorkExp() {
        talent =(Talent) request.getSession().getAttribute("talent");
        workExperiences = talentService.WorkExperience(talent.getTalentId());
        request.getSession().setAttribute("workExperience", workExperience);
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
        HttpSession session = request.getSession();
        workExperience = (v_WorkExperience) session.getAttribute("workExperience");
        if (workExperience != null) {
            HRworkExperiences = talentService.HRWorkExperience(workExperience.getEnterpriseId());
            HRworkedExperiences = talentService.HRWorkedExperience(workExperience.getEnterpriseId());
        }
        return "success";
    }

    //查看某员工既往工作经历
    public String HRWorkedExperience() {
        String talentId = request.getParameter("talentId");
        workExperiences = talentService.WorkExperience(talentId);
        request.getSession().setAttribute("workExperience", workExperience);
        return "success";
    }

    //HR查看已离职员工既往工作经历
    public String HRWorkedExperiences() {
        String talentId = request.getParameter("talentId");
        String enterpriseId = request.getParameter("enterpriseId");
        workExperiences = talentService.WorkedExperience(talentId, enterpriseId);
        return "success";
    }

    //HR查看某员工的工作表现
    public String HRWorkPerformance() {
        String talentId = request.getParameter("talentId");
        attend = talentService.WorkAttend(talentId);
        disciplinary = talentService.WorkDisciplinary(talentId);
        reward = talentService.WorkReward(talentId);
        bigEvent = talentService.WorkBigEvent(talentId);
        return "success";
    }

    //HR查看已离职某员工在职期间工作表现
    public String HRWorkedPerformance() {
        HttpSession session = request.getSession();
        workExperience = (v_WorkExperience) session.getAttribute("workExperience");
        String talentId = request.getParameter("talentId");
        attend = talentService.WorkedAttend(talentId, workExperience.getEnterpriseId());
        disciplinary = talentService.WorkedDisciplinary(talentId, workExperience.getEnterpriseId());
        reward = talentService.WorkedReward(talentId, workExperience.getEnterpriseId());
        bigEvent = talentService.WorkedBigEvent(talentId, workExperience.getEnterpriseId());
        return "success";
    }
}

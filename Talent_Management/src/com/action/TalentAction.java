package com.action;

import com.entity.Talent;
import com.entity.v_WorkExperience;
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
    List<v_WorkExperience> HRworkExperiences=new ArrayList<v_WorkExperience>();
    List<v_WorkExperience> HRworkedExperiences=new ArrayList<v_WorkExperience>();

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

    public void setServletRequest(HttpServletRequest request) {

        this.request=request;
    }
    public void setServletResponse(HttpServletResponse response) {

        this.response=response;
    }
    public void setServletContext(ServletContext application) {
        this.application=application;
    }

    public String login() {
        HttpSession session=request.getSession();
        if(talentService.login(talent)){
            talent=talentService.getFullTalent(talent);
            //把登录的用户加到session中以便让系统知道这是谁
            session.setAttribute("talent",talent);
            //Map tmp = (Map)ActionContext.getContext().getValueStack();
            //登录时查询工作经历，获取当前工作信息
            workExperience=talentService.MyWorkExperience(talent);
            session.setAttribute("workExperience",workExperience);
            //不同身份返回不同Strng，转到不同页面
            if (talent.getIdentity()==0 || talent.getIdentity()==1) {
                return "loginTalent";
            }else if (talent.getIdentity()==2){
                return "loginHR";
            }else if (talent.getIdentity()==3){
                return "loginHead";
            }else {
                return "loginFail";
            }
        }
        else {
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

    /*public String delete() {
        if (talentService.delete(talent)) {
            return "deletesuccess";
        }
        return "deletefail";
    }*/

    /*待补充员工查看自己工作信息*/
    public String info() {
        return "";
    }


    //HR查看员工工作信息
    public String HRWorkExperience() {
        HttpSession session=request.getSession();
        talent=(Talent) session.getAttribute("talent");
        workExperience=(v_WorkExperience) session.getAttribute("workExperience");
        if (workExperience!=null) {
            HRworkExperiences=talentService.HRWorkExperience(workExperience.getEnterpriseId());
            HRworkedExperiences=talentService.HRWorkedExperience(workExperience.getEnterpriseId());
        }
        return "success";
    }

}

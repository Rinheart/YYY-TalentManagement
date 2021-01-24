package com.service;
import com.dao.ITalentDAO;
import com.entity.*;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
/*
* Talent的服务
*
* */

public class TalentService implements ITalentService {
    private ITalentDAO talentDAO = null;

    public TalentService() {
        System.out.println("create UserService.");
    }

    public void setTalentDAO(ITalentDAO talentDAO) {
        this.talentDAO = talentDAO;
    }

    public Talent getFullTalent(Talent talent) {
        String talentId = talent.getTalentId();
        String hql = "from Talent as talent where TalentId='" + talentId + "'";
        List list = talentDAO.findByHql(hql);
        if(list.size()==1){
            return (Talent) list.get(0);
        }
        else if(list.isEmpty()){
            System.out.println("无此用户");
            return null;
        }
        else if(list.size()>1){
            System.out.println("注册出错，两个同名用户");
            return null;
        }
        else {
            return null;
        }
    }

    public Talent getFullTalentById(String talentId) {
        String hql = "from Talent as talent where TalentId='" + talentId + "'";
        List list = talentDAO.findByHql(hql);
        if(list.size()==1){
            return (Talent) list.get(0);
        }
        else if(list.isEmpty()){
            System.out.println("无此用户");
            return null;
        }
        else if(list.size()>1){
            System.out.println("注册出错，两个同名用户");
            return null;
        }
        else {
            return null;
        }
    }

    public boolean login(Talent talent) {
        Map request = (Map) ActionContext.getContext().get("request");
        String talentId = talent.getTalentId();
        String password = talent.getPassword();
        String hql = "from Talent as talent where TalentId='" + talentId + "' and password='" + password + "'";
        List list = talentDAO.findByHql(hql);
        if(list.isEmpty()){
            request.put("tip", "用户或密码不正确，请重新登录");
            return false;
        }
        request.put("tip", "登录成功！");
        return true;
    }

    public boolean register(Talent talent) {
        System.out.println(talent);
        talentDAO.save(talent);
        return true;
    }

    public boolean update(Talent talent){
        System.out.println(talent);
        talentDAO.update(talent);
        return true;
    }

    //查看登录用户 现在的工作经历信息
    public v_WorkExperience MyWorkExperience(String talentId) {
        String hql = "from v_WorkExperience where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_WorkExperience> work=new ArrayList<v_WorkExperience>();
        Date date = new Date();
        for (int i=0; i<list.size(); i++) {
            v_WorkExperience experience=(v_WorkExperience) list.get(i);
            if(experience.getEndTime()== null && experience.getStartTime().compareTo(date)<=0) {
                work.add(experience);
            }
        }
        if (work.size()>1) {
            System.out.println("你不讲工德，同时在两家企业工作！");
        }else if (work.size()==0) {
            System.out.println("hhh太惨了，你竟然没有工作！");
        }
        if(work.isEmpty()){
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("tip","当前无工作");
            return null;
        }
        return work.get(0);
    }
    //HR查看本公司员工工作信息
    public List<v_WorkExperience> HRWorkExperience(String enterpriseId) {
        //查找本公司的所有工作经历记录
        String hql = "from v_WorkExperience where enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_WorkExperience> relist=new ArrayList<v_WorkExperience>();
        Date date = new Date();
        for (int i=0; i<list.size(); i++) {
            v_WorkExperience experience = (v_WorkExperience) list.get(i);
            //只选择当前就职的工作经历记录，筛选条件为工作经历记录中结束时间为空或当前时间在开始时间与结束时间之间
            if (experience.getEndTime() == null ||
                    (experience.getStartTime().compareTo(date) <= 0 &&
                            experience.getEndTime().compareTo(date) > 0)) {
                relist.add(experience);
            }
        }
        return relist;
    }
    //HR查看本公司过去的员工工作信息
    public List<v_WorkExperience> HRWorkedExperience(String enterpriseId) {
        //查找本公司的所有工作经历记录
        String hql = "from v_WorkExperience where enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_WorkExperience> relist=new ArrayList<v_WorkExperience>();
        Date date = new Date();
        for (int i=0; i<list.size(); i++) {
            v_WorkExperience experience = (v_WorkExperience) list.get(i);
            //只选择已离职的工作经历记录，筛选条件为工作经历记录中结束时间不为空且当前时间结束时间之后
            if (experience.getEndTime() != null &&
                    experience.getEndTime().compareTo(date) < 0) {
                relist.add(experience);
            }
        }
        return relist;
    }
    //查看某人才的工作经历
    public List<v_WorkExperience> WorkExperience(String talentId) {
        String hql = "from v_WorkExperience where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_WorkExperience> relist=new ArrayList<v_WorkExperience>();
        for (int i=0; i<list.size(); i++) {
            v_WorkExperience experience = (v_WorkExperience) list.get(i);
            relist.add(experience);
        }
        return relist;
    }
    //HR查看已离职人才的过去工作经历
    public List<v_WorkExperience> WorkedExperience(String talentId,String enterpriseId) {
        //查找人才在本公司的工作经历记录
        String hql = "from v_WorkExperience where talentId='"+talentId+
                "' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        if (list.size()==0) return null;
        else {
            v_WorkExperience w=(v_WorkExperience)list.get(0);
            Date endTime=w.getEndTime();
            //查找人才所有工作经历记录
            String hql_1 = "from v_WorkExperience where talentId='"+talentId+"'";
            List list_1 = talentDAO.findByHql(hql_1);
            List<v_WorkExperience> relist=new ArrayList<v_WorkExperience>();
            for (int i=0; i<list_1.size(); i++) {
                v_WorkExperience experience = (v_WorkExperience) list_1.get(i);
                //只选择在本公司离职日期之前的工作记录
                if (experience.getEndTime()!=null && experience.getEndTime().compareTo(endTime)<=0) {
                    relist.add(experience);
                }
            }
            return relist;
        }
    }
    //查看某人才的异常出勤记录
    public List<v_Attend> WorkAttend(String talentId) {
        String hql = "from v_Attend where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Attend> relist=new ArrayList<v_Attend>();
        for (int i=0; i<list.size(); i++) {
            v_Attend attend = (v_Attend) list.get(i);
            relist.add(attend);
        }
        return relist;
    }
    //HR查看某人才任职期间的异常出勤记录
    public List<v_Attend> WorkedAttend(String talentId,String enterpriseId) {
        String hql = "from v_Attend where talentId='"+talentId+"' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Attend> relist=new ArrayList<v_Attend>();
        for (int i=0; i<list.size(); i++) {
            v_Attend attend = (v_Attend) list.get(i);
            relist.add(attend);
        }
        return relist;
    }
    //查看某人才的违纪记录
    public List<v_Disciplinary> WorkDisciplinary(String talentId) {
        String hql = "from v_Disciplinary where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Disciplinary> relist=new ArrayList<v_Disciplinary>();
        for (int i=0; i<list.size(); i++) {
            v_Disciplinary disciplinary = (v_Disciplinary) list.get(i);
            relist.add(disciplinary);
        }
        return relist;
    }
    //HR查看某人才任职期间的违纪记录
    public List<v_Disciplinary> WorkedDisciplinary(String talentId,String enterpriseId) {
        String hql = "from v_Disciplinary where talentId='"+talentId+
                "' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Disciplinary> relist=new ArrayList<v_Disciplinary>();
        for (int i=0; i<list.size(); i++) {
            v_Disciplinary attend = (v_Disciplinary) list.get(i);
            relist.add(attend);
        }
        return relist;
    }
    //查看某人才的奖励记录
    public List<v_Reward> WorkReward(String talentId) {
        String hql = "from v_Reward where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Reward> relist=new ArrayList<v_Reward>();
        for (int i=0; i<list.size(); i++) {
            v_Reward reward = (v_Reward) list.get(i);
            relist.add(reward);
        }
        return relist;
    }
    //HR查看某人才任职期间的奖励记录
    public List<v_Reward> WorkedReward(String talentId,String enterpriseId) {
        String hql = "from v_Reward where talentId='"+talentId+"' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Reward> relist=new ArrayList<v_Reward>();
        for (int i=0; i<list.size(); i++) {
            v_Reward reward = (v_Reward) list.get(i);
            relist.add(reward);
        }
        return relist;
    }
    //查看某人才的重大事件
    public List<v_BigEvent> WorkBigEvent(String talentId) {
        String hql = "from v_BigEvent where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_BigEvent> relist=new ArrayList<v_BigEvent>();
        for (int i=0; i<list.size(); i++) {
            v_BigEvent bigEvent = (v_BigEvent) list.get(i);
            relist.add(bigEvent);
        }
        return relist;
    }
    //HR查看某人才任职期间的重大事件
    public List<v_BigEvent> WorkedBigEvent(String talentId,String enterpriseId) {
        String hql = "from v_BigEvent where talentId='"+talentId+"' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_BigEvent> relist=new ArrayList<v_BigEvent>();
        for (int i=0; i<list.size(); i++) {
            v_BigEvent bigEvent = (v_BigEvent) list.get(i);
            relist.add(bigEvent);
        }
        return relist;
    }
    //查看某人才的绩效评价
    public List<v_Achievement> WorkAchievement(String talentId) {
        String hql = "from v_Achievement where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Achievement> relist=new ArrayList<v_Achievement>();
        for (int i=0; i<list.size(); i++) {
            v_Achievement achievement = (v_Achievement) list.get(i);
            relist.add(achievement);
        }
        return relist;
    }
    //HR查看某人才任职期间的绩效评价
    public List<v_Achievement> WorkedAchievement(String talentId,String enterpriseId) {
        String hql = "from v_Achievement where talentId='"+talentId+
                "' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Achievement> relist=new ArrayList<v_Achievement>();
        for (int i=0; i<list.size(); i++) {
            v_Achievement achievement = (v_Achievement) list.get(i);
            relist.add(achievement);
        }
        return relist;
    }
    //查看某人才的主观评价
    public List<v_Evaluate> WorkEvaluate(String talentId) {
        String hql = "from v_Evaluate where talentId='"+talentId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Evaluate> relist=new ArrayList<v_Evaluate>();
        for (int i=0; i<list.size(); i++) {
            v_Evaluate evaluate = (v_Evaluate) list.get(i);
            relist.add(evaluate);
        }
        return relist;
    }
    //HR查看某人才任职期间的主观评价
    public List<v_Evaluate> WorkedEvaluate(String talentId,String enterpriseId) {
        String hql = "from v_Evaluate where talentId='"+talentId+
                "' and enterpriseId='"+enterpriseId+"'";
        List list = talentDAO.findByHql(hql);
        List<v_Evaluate> relist=new ArrayList<v_Evaluate>();
        for (int i=0; i<list.size(); i++) {
            v_Evaluate evaluate = (v_Evaluate) list.get(i);
            relist.add(evaluate);
        }
        return relist;
    }
    //HR添加异常出勤记录
    public boolean AddAttend(String talentId,int event,String HR,Date date) {
        //设置要添加的记录信息
        Attend attend=new Attend();
        v_WorkExperience workExperience=MyWorkExperience(talentId);
        Date recordTime=new Date();
        attend.setWorkExperienceId(workExperience.getWorkExperienceId());
        attend.setEvent(event);
        attend.setDate(date);
        attend.setRecorder(HR);
        attend.setRecordTime(recordTime);
        //添加记录
        if(talentDAO.saveAttend(attend)) {
            return true;
        }else {
            return false;
        }
    }
    //HR添加违纪事件记录
    public boolean AddDisciplinary(String talentId,String content,String HR,Date date) {
        //设置要添加的记录信息
        Disciplinary disciplinary=new Disciplinary();
        v_WorkExperience workExperience=MyWorkExperience(talentId);
        Date recordTime=new Date();
        disciplinary.setWorkExperienceId(workExperience.getWorkExperienceId());
        disciplinary.setContent(content);
        disciplinary.setDate(date);
        disciplinary.setRecorder(HR);
        disciplinary.setRecordTime(recordTime);
        //添加记录
        if(talentDAO.saveDisciplinary(disciplinary)) {
            return true;
        }else {
            return false;
        }
    }
    //HR添加违纪事件记录
    public boolean AddReward(String talentId,String rewordName,String rewordResult,String prize,
                             String HR,Date date) {
        //设置要添加的记录信息
        Reward reward=new Reward();
        v_WorkExperience workExperience=MyWorkExperience(talentId);
        Date recordTime=new Date();
        reward.setWorkExperienceId(workExperience.getWorkExperienceId());
        reward.setRewardName(rewordName);
        reward.setRewardResult(rewordResult);
        reward.setPrize(prize);
        reward.setDate(date);
        reward.setRecorder(HR);
        reward.setRecordTime(recordTime);
        //添加记录
        if(talentDAO.saveReward(reward)) {
            return true;
        }else {
            return false;
        }
    }
    //HR添加重大事件记录
    public boolean AddBigEvent(String talentId,String content,String HR,Date date) {
        //设置要添加的记录信息
        BigEvent bigEvent=new BigEvent();
        v_WorkExperience workExperience=MyWorkExperience(talentId);
        Date recordTime=new Date();
        bigEvent.setWorkExperienceId(workExperience.getWorkExperienceId());
        bigEvent.setContent(content);
        bigEvent.setDate(date);
        bigEvent.setRecorder(HR);
        bigEvent.setRecordTime(recordTime);
        //添加记录
        if(talentDAO.saveBigEvent(bigEvent)) {
            return true;
        }else {
            return false;
        }
    }
    //HR添加绩效评价记录
    public boolean AddAchievement(String talentId,String content,Date startTime,Date endTime,
                    int achievementScore,String achievementComment,String HR) {
        //设置要添加的记录信息
        Achievement achievement=new Achievement();
        v_WorkExperience workExperience=MyWorkExperience(talentId);
        Date recordTime=new Date();
        Timestamp ts = new Timestamp(recordTime.getTime());
        achievement.setWorkExperienceId(workExperience.getWorkExperienceId());
        achievement.setContent(content);
        achievement.setStartTime(startTime);
        achievement.setEndTime(endTime);
        achievement.setAchievementScore(achievementScore);
        achievement.setAchievementComment(achievementComment);
        achievement.setRecorder(HR);
        achievement.setRecordTime(ts);
        //添加记录
        if(talentDAO.saveAchievement(achievement)) {
            return true;
        }else {
            return false;
        }
    }
    //HR添加主观评价记录
    public boolean AddEvaluate(String talentId,String HR,Integer totalScore,Integer abilityScore,
                    String abilityComment,Integer attitudeScore,String attitudeComment) {
        //设置要添加的记录信息
        Evaluate evaluate=new Evaluate();
        v_WorkExperience workExperience=MyWorkExperience(talentId);
        Date time=new Date();
        evaluate.setWorkExperienceId(workExperience.getWorkExperienceId());
        evaluate.setValuator(HR);
        evaluate.setTotalScore(totalScore);
        evaluate.setAbilityScore(abilityScore);
        evaluate.setAbilityComment(abilityComment);
        evaluate.setAttitudeScore(attitudeScore);
        evaluate.setAbilityComment(attitudeComment);
        evaluate.setTime(time);
        //添加记录
        if(talentDAO.saveEvaluate(evaluate)) {
            return true;
        }else {
            return false;
        }
    }
}

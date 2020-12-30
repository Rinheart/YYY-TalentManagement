package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Interview {
    private int interviewId;
    private int resumeId;
    private String hrInterviewer;
    private String headInterviewer;
    private Date interviewTime;
    private String interviewAdd;
    private Integer hrScore;
    private Integer headScore;
    private String hrComment;
    private String headComment;
    private Boolean interviewResult;

    @Id
    @Column(name = "InterviewID")
    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    @Basic
    @Column(name = "ResumeID")
    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    @Basic
    @Column(name = "HRInterviewer")
    public String getHrInterviewer() {
        return hrInterviewer;
    }

    public void setHrInterviewer(String hrInterviewer) {
        this.hrInterviewer = hrInterviewer;
    }

    @Basic
    @Column(name = "HeadInterviewer")
    public String getHeadInterviewer() {
        return headInterviewer;
    }

    public void setHeadInterviewer(String headInterviewer) {
        this.headInterviewer = headInterviewer;
    }

    @Basic
    @Column(name = "InterviewTime")
    public Date getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(Date interviewTime) {
        this.interviewTime = interviewTime;
    }

    @Basic
    @Column(name = "InterviewAdd")
    public String getInterviewAdd() {
        return interviewAdd;
    }

    public void setInterviewAdd(String interviewAdd) {
        this.interviewAdd = interviewAdd;
    }

    @Basic
    @Column(name = "HRScore")
    public Integer getHrScore() {
        return hrScore;
    }

    public void setHrScore(Integer hrScore) {
        this.hrScore = hrScore;
    }

    @Basic
    @Column(name = "HeadScore")
    public Integer getHeadScore() {
        return headScore;
    }

    public void setHeadScore(Integer headScore) {
        this.headScore = headScore;
    }

    @Basic
    @Column(name = "HRComment")
    public String getHrComment() {
        return hrComment;
    }

    public void setHrComment(String hrComment) {
        this.hrComment = hrComment;
    }

    @Basic
    @Column(name = "HeadComment")
    public String getHeadComment() {
        return headComment;
    }

    public void setHeadComment(String headComment) {
        this.headComment = headComment;
    }

    @Basic
    @Column(name = "InterviewResult")
    public Boolean getInterviewResult() {
        return interviewResult;
    }

    public void setInterviewResult(Boolean interviewResult) {
        this.interviewResult = interviewResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interview interview = (Interview) o;
        return interviewId == interview.interviewId &&
                resumeId == interview.resumeId &&
                Objects.equals(hrInterviewer, interview.hrInterviewer) &&
                Objects.equals(headInterviewer, interview.headInterviewer) &&
                Objects.equals(interviewTime, interview.interviewTime) &&
                Objects.equals(interviewAdd, interview.interviewAdd) &&
                Objects.equals(hrScore, interview.hrScore) &&
                Objects.equals(headScore, interview.headScore) &&
                Objects.equals(hrComment, interview.hrComment) &&
                Objects.equals(headComment, interview.headComment) &&
                Objects.equals(interviewResult, interview.interviewResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interviewId, resumeId, hrInterviewer, headInterviewer, interviewTime, interviewAdd, hrScore, headScore, hrComment, headComment, interviewResult);
    }
}

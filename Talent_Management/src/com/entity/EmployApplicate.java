package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employ_applicate", schema = "talent_management", catalog = "")
public class EmployApplicate {
    private int employApplicateId;
    private Integer interviewId;
    private Integer workExperienceId;
    private String applicateTime;
    private Boolean applicateResult;
    private String hrReviewer;
    private String reviewTime;

    @Id
    @Column(name = "EmployApplicateID")
    public int getEmployApplicateId() {
        return employApplicateId;
    }

    public void setEmployApplicateId(int employApplicateId) {
        this.employApplicateId = employApplicateId;
    }

    @Basic
    @Column(name = "InterviewID")
    public Integer getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }

    @Basic
    @Column(name = "WorkExperienceID")
    public Integer getWorkExperienceId() {
        return workExperienceId;
    }

    public void setWorkExperienceId(Integer workExperienceId) {
        this.workExperienceId = workExperienceId;
    }

    @Basic
    @Column(name = "ApplicateTime")
    public String getApplicateTime() {
        return applicateTime;
    }

    public void setApplicateTime(String applicateTime) {
        this.applicateTime = applicateTime;
    }

    @Basic
    @Column(name = "ApplicateResult")
    public Boolean getApplicateResult() {
        return applicateResult;
    }

    public void setApplicateResult(Boolean applicateResult) {
        this.applicateResult = applicateResult;
    }

    @Basic
    @Column(name = "HRReviewer")
    public String getHrReviewer() {
        return hrReviewer;
    }

    public void setHrReviewer(String hrReviewer) {
        this.hrReviewer = hrReviewer;
    }

    @Basic
    @Column(name = "ReviewTime")
    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployApplicate that = (EmployApplicate) o;
        return employApplicateId == that.employApplicateId &&
                Objects.equals(interviewId, that.interviewId) &&
                Objects.equals(workExperienceId, that.workExperienceId) &&
                Objects.equals(applicateTime, that.applicateTime) &&
                Objects.equals(applicateResult, that.applicateResult) &&
                Objects.equals(hrReviewer, that.hrReviewer) &&
                Objects.equals(reviewTime, that.reviewTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employApplicateId, interviewId, workExperienceId, applicateTime, applicateResult, hrReviewer, reviewTime);
    }
}

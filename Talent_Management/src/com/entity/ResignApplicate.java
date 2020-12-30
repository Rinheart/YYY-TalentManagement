package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "resign_applicate", schema = "talent_management", catalog = "")
public class ResignApplicate {
    private int resignApplicateId;
    private int workExperienceId;
    private String applicateTime;
    private Boolean applicateResult;
    private String hrReviewer;
    private String revieweTime;

    @Id
    @Column(name = "ResignApplicateID")
    public int getResignApplicateId() {
        return resignApplicateId;
    }

    public void setResignApplicateId(int resignApplicateId) {
        this.resignApplicateId = resignApplicateId;
    }

    @Basic
    @Column(name = "WorkExperienceID")
    public int getWorkExperienceId() {
        return workExperienceId;
    }

    public void setWorkExperienceId(int workExperienceId) {
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
    @Column(name = "RevieweTime")
    public String getRevieweTime() {
        return revieweTime;
    }

    public void setRevieweTime(String revieweTime) {
        this.revieweTime = revieweTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResignApplicate that = (ResignApplicate) o;
        return resignApplicateId == that.resignApplicateId &&
                workExperienceId == that.workExperienceId &&
                Objects.equals(applicateTime, that.applicateTime) &&
                Objects.equals(applicateResult, that.applicateResult) &&
                Objects.equals(hrReviewer, that.hrReviewer) &&
                Objects.equals(revieweTime, that.revieweTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resignApplicateId, workExperienceId, applicateTime, applicateResult, hrReviewer, revieweTime);
    }
}

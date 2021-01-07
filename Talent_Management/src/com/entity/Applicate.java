package com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Applicate{
    private int applicateId;
    private String talentId;
    private Boolean applicateType;
    private String enterpriseId;
    private Integer departmentId;
    private Timestamp applicateTime;
    private Boolean applicateResult;
    private String hrReview;
    private Timestamp reviewTime;

    @Id
    @Column(name = "ApplicateID")
    public int getApplicateId() {
        return applicateId;
    }

    public void setApplicateId(int applicateId) {
        this.applicateId = applicateId;
    }

    @Basic
    @Column(name = "TalentID")
    public String getTalentId() {
        return talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    @Basic
    @Column(name = "ApplicateType")
    public Boolean getApplicateType() {
        return applicateType;
    }

    public void setApplicateType(Boolean applicateType) {
        this.applicateType = applicateType;
    }

    @Basic
    @Column(name = "EnterpriseID")
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    @Basic
    @Column(name = "DepartmentID")
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "ApplicateTime")
    public Timestamp getApplicateTime() {
        return applicateTime;
    }

    public void setApplicateTime(Timestamp applicateTime) {
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
    @Column(name = "HRReview")
    public String getHrReview() {
        return hrReview;
    }

    public void setHrReview(String hrReview) {
        this.hrReview = hrReview;
    }

    @Basic
    @Column(name = "ReviewTime")
    public Timestamp getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Timestamp reviewTime) {
        this.reviewTime = reviewTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applicate applicate = (Applicate) o;
        return applicateId == applicate.applicateId &&
                Objects.equals(talentId, applicate.talentId) &&
                Objects.equals(applicateType, applicate.applicateType) &&
                Objects.equals(enterpriseId, applicate.enterpriseId) &&
                Objects.equals(departmentId, applicate.departmentId) &&
                Objects.equals(applicateTime, applicate.applicateTime) &&
                Objects.equals(applicateResult, applicate.applicateResult) &&
                Objects.equals(hrReview, applicate.hrReview) &&
                Objects.equals(reviewTime, applicate.reviewTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicateId, talentId, applicateType, enterpriseId, departmentId, applicateTime, applicateResult, hrReview, reviewTime);
    }
}

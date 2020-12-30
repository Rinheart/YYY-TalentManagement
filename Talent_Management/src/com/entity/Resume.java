package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Resume {
    private int resumeId;
    private String talentId;
    private String enterpriseId;
    private int departmentId;
    private String hrReviewer;
    private String headReviewer;
    private Boolean examineResult;
    private Boolean attendView;
    private byte[] content;

    @Id
    @Column(name = "ResumeID")
    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
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
    @Column(name = "EnterpriseID")
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    @Basic
    @Column(name = "DepartmentID")
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
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
    @Column(name = "HeadReviewer")
    public String getHeadReviewer() {
        return headReviewer;
    }

    public void setHeadReviewer(String headReviewer) {
        this.headReviewer = headReviewer;
    }

    @Basic
    @Column(name = "ExamineResult")
    public Boolean getExamineResult() {
        return examineResult;
    }

    public void setExamineResult(Boolean examineResult) {
        this.examineResult = examineResult;
    }

    @Basic
    @Column(name = "AttendView")
    public Boolean getAttendView() {
        return attendView;
    }

    public void setAttendView(Boolean attendView) {
        this.attendView = attendView;
    }

    @Basic
    @Column(name = "Content")
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return resumeId == resume.resumeId &&
                departmentId == resume.departmentId &&
                Objects.equals(talentId, resume.talentId) &&
                Objects.equals(enterpriseId, resume.enterpriseId) &&
                Objects.equals(hrReviewer, resume.hrReviewer) &&
                Objects.equals(headReviewer, resume.headReviewer) &&
                Objects.equals(examineResult, resume.examineResult) &&
                Objects.equals(attendView, resume.attendView) &&
                Arrays.equals(content, resume.content);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(resumeId, talentId, enterpriseId, departmentId, hrReviewer, headReviewer, examineResult, attendView);
        result = 31 * result + Arrays.hashCode(content);
        return result;
    }
}

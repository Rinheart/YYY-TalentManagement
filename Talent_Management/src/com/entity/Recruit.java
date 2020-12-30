package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Recruit {
    private int recruitId;
    private String enterpriseId;
    private int departmentId;
    private String jobTitle;
    private Integer demandNum;
    private Date startDate;
    private Double salary;
    private String treatment;
    private String jobContent;
    private String time;

    @Id
    @Column(name = "RecruitID")
    public int getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(int recruitId) {
        this.recruitId = recruitId;
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
    @Column(name = "JobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Basic
    @Column(name = "DemandNum")
    public Integer getDemandNum() {
        return demandNum;
    }

    public void setDemandNum(Integer demandNum) {
        this.demandNum = demandNum;
    }

    @Basic
    @Column(name = "StartDate")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "Salary")
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "Treatment")
    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @Basic
    @Column(name = "JobContent")
    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    @Basic
    @Column(name = "Time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recruit recruit = (Recruit) o;
        return recruitId == recruit.recruitId &&
                departmentId == recruit.departmentId &&
                Objects.equals(enterpriseId, recruit.enterpriseId) &&
                Objects.equals(jobTitle, recruit.jobTitle) &&
                Objects.equals(demandNum, recruit.demandNum) &&
                Objects.equals(startDate, recruit.startDate) &&
                Objects.equals(salary, recruit.salary) &&
                Objects.equals(treatment, recruit.treatment) &&
                Objects.equals(jobContent, recruit.jobContent) &&
                Objects.equals(time, recruit.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recruitId, enterpriseId, departmentId, jobTitle, demandNum, startDate, salary, treatment, jobContent, time);
    }
}

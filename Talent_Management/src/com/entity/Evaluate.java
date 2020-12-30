package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Evaluate {
    private int evaluateId;
    private int workExperienceId;
    private String valuator;
    private Integer totalScore;
    private Integer abilityScore;
    private String abilityComment;
    private Integer attitudeScore;
    private String attitudeComment;
    private String time;

    @Id
    @Column(name = "EvaluateID")
    public int getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(int evaluateId) {
        this.evaluateId = evaluateId;
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
    @Column(name = "Valuator")
    public String getValuator() {
        return valuator;
    }

    public void setValuator(String valuator) {
        this.valuator = valuator;
    }

    @Basic
    @Column(name = "TotalScore")
    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    @Basic
    @Column(name = "AbilityScore")
    public Integer getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(Integer abilityScore) {
        this.abilityScore = abilityScore;
    }

    @Basic
    @Column(name = "AbilityComment")
    public String getAbilityComment() {
        return abilityComment;
    }

    public void setAbilityComment(String abilityComment) {
        this.abilityComment = abilityComment;
    }

    @Basic
    @Column(name = "AttitudeScore")
    public Integer getAttitudeScore() {
        return attitudeScore;
    }

    public void setAttitudeScore(Integer attitudeScore) {
        this.attitudeScore = attitudeScore;
    }

    @Basic
    @Column(name = "AttitudeComment")
    public String getAttitudeComment() {
        return attitudeComment;
    }

    public void setAttitudeComment(String attitudeComment) {
        this.attitudeComment = attitudeComment;
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
        Evaluate evaluate = (Evaluate) o;
        return evaluateId == evaluate.evaluateId &&
                workExperienceId == evaluate.workExperienceId &&
                Objects.equals(valuator, evaluate.valuator) &&
                Objects.equals(totalScore, evaluate.totalScore) &&
                Objects.equals(abilityScore, evaluate.abilityScore) &&
                Objects.equals(abilityComment, evaluate.abilityComment) &&
                Objects.equals(attitudeScore, evaluate.attitudeScore) &&
                Objects.equals(attitudeComment, evaluate.attitudeComment) &&
                Objects.equals(time, evaluate.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluateId, workExperienceId, valuator, totalScore, abilityScore, abilityComment, attitudeScore, attitudeComment, time);
    }
}

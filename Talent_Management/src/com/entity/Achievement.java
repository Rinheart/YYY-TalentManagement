package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
public class Achievement {
    private int achievementId;
    private int workExperienceId;
    private String content;
    private Date startTime;
    private Date endTime;
    private Integer achievementScore;
    private String achievementComment;
    private String recorder;
    private Timestamp recordTime;

    @Id
    @Column(name = "AchievementID")
    public int getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(int achievementId) {
        this.achievementId = achievementId;
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
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "StartTime")
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "EndTime")
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "AchievementScore")
    public Integer getAchievementScore() {
        return achievementScore;
    }

    public void setAchievementScore(Integer achievementScore) {
        this.achievementScore = achievementScore;
    }

    @Basic
    @Column(name = "AchievementComment")
    public String getAchievementComment() {
        return achievementComment;
    }

    public void setAchievementComment(String achievementComment) {
        this.achievementComment = achievementComment;
    }

    @Basic
    @Column(name = "Recorder")
    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    @Basic
    @Column(name = "RecordTime")
    public Timestamp getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Achievement that = (Achievement) o;
        return achievementId == that.achievementId &&
                workExperienceId == that.workExperienceId &&
                Objects.equals(content, that.content) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(achievementScore, that.achievementScore) &&
                Objects.equals(achievementComment, that.achievementComment) &&
                Objects.equals(recorder, that.recorder) &&
                Objects.equals(recordTime, that.recordTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(achievementId, workExperienceId, content, startTime, endTime, achievementScore, achievementComment, recorder, recordTime);
    }
}

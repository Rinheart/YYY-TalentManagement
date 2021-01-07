package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Reward {
    private int rewardId;
    private int workExperienceId;
    private String rewardName;
    private String rewardResult;
    private String prize;
    private Date date;
    private String recorder;
    private Date recordTime;

    @Id
    @Column(name = "RewardID")
    public int getRewardId() {
        return rewardId;
    }

    public void setRewardId(int rewardId) {
        this.rewardId = rewardId;
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
    @Column(name = "RewardName")
    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }


    @Basic
    @Column(name = "RewardResult")
    public String getRewardResult() {
        return rewardResult;
    }

    public void setRewardResult(String rewardResult) {
        this.rewardResult = rewardResult;
    }


    @Basic
    @Column(name = "Prize")
    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reward reward = (Reward) o;
        return rewardId == reward.rewardId &&
                workExperienceId == reward.workExperienceId &&
                Objects.equals(rewardName, reward.rewardName) &&
                Objects.equals(rewardResult, reward.rewardResult) &&
                Objects.equals(prize, reward.prize) &&
                Objects.equals(date, reward.date) &&
                Objects.equals(recorder, reward.recorder) &&
                Objects.equals(recordTime, reward.recordTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewardId, workExperienceId, rewardName, rewardResult, prize, date, recorder, recordTime);
    }
}

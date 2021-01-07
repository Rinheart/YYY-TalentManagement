package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Attend {
    private int attendId;
    private int workExperienceId;
    private Integer event;
    private Date date;
    private String recorder;
    private Date recordTime;

    @Id
    @Column(name = "AttendID")
    public int getAttendId() {
        return attendId;
    }

    public void setAttendId(int attendId) {
        this.attendId = attendId;
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
    @Column(name = "Event")
    public Integer getEvent() {
        return event;
    }

    public void setEvent(Integer event) {
        this.event = event;
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
        Attend attend = (Attend) o;
        return attendId == attend.attendId &&
                workExperienceId == attend.workExperienceId &&
                Objects.equals(event, attend.event) &&
                Objects.equals(date, attend.date) &&
                Objects.equals(recorder, attend.recorder) &&
                Objects.equals(recordTime, attend.recordTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attendId, workExperienceId, event, date, recorder, recordTime);
    }
}

package com.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "big_event", schema = "talent_management", catalog = "")
public class BigEvent {
    private int bigEventId;
    private int workExperienceId;
    private String content;
    private Date date;
    private String recorder;
    private Date recordTime;

    @Id
    @Column(name = "BigEventID")
    public int getBigEventId() {
        return bigEventId;
    }

    public void setBigEventId(int bigEventId) {
        this.bigEventId = bigEventId;
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
        BigEvent bigEvent = (BigEvent) o;
        return bigEventId == bigEvent.bigEventId &&
                workExperienceId == bigEvent.workExperienceId &&
                Objects.equals(content, bigEvent.content) &&
                Objects.equals(date, bigEvent.date) &&
                Objects.equals(recorder, bigEvent.recorder) &&
                Objects.equals(recordTime, bigEvent.recordTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bigEventId, workExperienceId, content, date, recorder, recordTime);
    }
}

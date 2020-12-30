package com.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "talent_udit", schema = "talent_management", catalog = "")
public class TalentUdit {
    private int talentUditId;
    private String talentId;
    private byte[] auditFile1;
    private byte[] auditFile2;
    private byte[] auditFile3;
    private String auditer;

    @Id
    @Column(name = "TalentUditID")
    public int getTalentUditId() {
        return talentUditId;
    }

    public void setTalentUditId(int talentUditId) {
        this.talentUditId = talentUditId;
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
    @Column(name = "AuditFile1")
    public byte[] getAuditFile1() {
        return auditFile1;
    }

    public void setAuditFile1(byte[] auditFile1) {
        this.auditFile1 = auditFile1;
    }

    @Basic
    @Column(name = "AuditFile2")
    public byte[] getAuditFile2() {
        return auditFile2;
    }

    public void setAuditFile2(byte[] auditFile2) {
        this.auditFile2 = auditFile2;
    }

    @Basic
    @Column(name = "AuditFile3")
    public byte[] getAuditFile3() {
        return auditFile3;
    }

    public void setAuditFile3(byte[] auditFile3) {
        this.auditFile3 = auditFile3;
    }

    @Basic
    @Column(name = "Auditer")
    public String getAuditer() {
        return auditer;
    }

    public void setAuditer(String auditer) {
        this.auditer = auditer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TalentUdit that = (TalentUdit) o;
        return talentUditId == that.talentUditId &&
                Objects.equals(talentId, that.talentId) &&
                Arrays.equals(auditFile1, that.auditFile1) &&
                Arrays.equals(auditFile2, that.auditFile2) &&
                Arrays.equals(auditFile3, that.auditFile3) &&
                Objects.equals(auditer, that.auditer);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(talentUditId, talentId, auditer);
        result = 31 * result + Arrays.hashCode(auditFile1);
        result = 31 * result + Arrays.hashCode(auditFile2);
        result = 31 * result + Arrays.hashCode(auditFile3);
        return result;
    }
}

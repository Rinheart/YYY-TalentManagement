package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Talent {
    private String talentId;
    private String password;
    private String name;
    private Boolean sex;
    private String idNumber;
    private Date birthday;
    private String phoneNumber;
    private String address;
    private String education;
    private String personalProfile;
    private boolean informationReview;
    private Integer identity;

    @Id
    @Column(name = "TalentID")
    public String getTalentId() {
        return talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Sex")
    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "IDNumber")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Basic
    @Column(name = "Birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "PhoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "PersonalProfile")
    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile;
    }

    @Basic
    @Column(name = "InformationReview")
    public boolean isInformationReview() {
        return informationReview;
    }

    public void setInformationReview(boolean informationReview) {
        this.informationReview = informationReview;
    }

    @Basic
    @Column(name = "Identity")
    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Talent talent = (Talent) o;
        return informationReview == talent.informationReview &&
                Objects.equals(talentId, talent.talentId) &&
                Objects.equals(password, talent.password) &&
                Objects.equals(name, talent.name) &&
                Objects.equals(sex, talent.sex) &&
                Objects.equals(idNumber, talent.idNumber) &&
                Objects.equals(birthday, talent.birthday) &&
                Objects.equals(phoneNumber, talent.phoneNumber) &&
                Objects.equals(address, talent.address) &&
                Objects.equals(education, talent.education) &&
                Objects.equals(personalProfile, talent.personalProfile) &&
                Objects.equals(identity, talent.identity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(talentId, password, name, sex, idNumber, birthday, phoneNumber, address, education, personalProfile, informationReview, identity);
    }
}

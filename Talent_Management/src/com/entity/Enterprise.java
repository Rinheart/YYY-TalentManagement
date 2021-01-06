package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Enterprise {
    private String enterpriseId;
    private String password;
    private String enterpriseName;
    private Date establishTime;
    private String address;
    private String businessScope;
    private String enterpriseType;
    private String annualTurnover;
    private Integer staffNumber;
    private String founder;
    private String ceo;
    private String resignNumber;
    private String registrar;
    private String registeredCapital;
    private String websiteAddress;
    private boolean informationReview;

    @Id
    @Column(name = "EnterpriseID")
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
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
    @Column(name = "EnterpriseName")
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    @Basic
    @Column(name = "EstablishTime")
    public Date getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(Date establishTime) {
        this.establishTime = establishTime;
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
    @Column(name = "BusinessScope")
    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    @Basic
    @Column(name = "EnterpriseType")
    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    @Basic
    @Column(name = "AnnualTurnover")
    public String getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(String annualTurnover) {
        this.annualTurnover = annualTurnover;
    }

    @Basic
    @Column(name = "StaffNumber")
    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    @Basic
    @Column(name = "Founder")
    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    @Basic
    @Column(name = "CEO")
    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    @Basic
    @Column(name = "ResignNumber")
    public String getResignNumber() {
        return resignNumber;
    }

    public void setResignNumber(String resignNumber) {
        this.resignNumber = resignNumber;
    }

    @Basic
    @Column(name = "Registrar")
    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    @Basic
    @Column(name = "RegisteredCapital")
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    @Basic
    @Column(name = "WebsiteAddress")
    public String getWebsiteAddress() {
        return websiteAddress;
    }

    public void setWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
    }

    @Basic
    @Column(name = "InformationReview")
    public boolean isInformationReview() {
        return informationReview;
    }

    public void setInformationReview(boolean informationReview) {
        this.informationReview = informationReview;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enterprise that = (Enterprise) o;
        return informationReview == that.informationReview &&
                Objects.equals(enterpriseId, that.enterpriseId) &&
                Objects.equals(password, that.password) &&
                Objects.equals(enterpriseName, that.enterpriseName) &&
                Objects.equals(establishTime, that.establishTime) &&
                Objects.equals(address, that.address) &&
                Objects.equals(businessScope, that.businessScope) &&
                Objects.equals(enterpriseType, that.enterpriseType) &&
                Objects.equals(annualTurnover, that.annualTurnover) &&
                Objects.equals(staffNumber, that.staffNumber) &&
                Objects.equals(founder, that.founder) &&
                Objects.equals(ceo, that.ceo) &&
                Objects.equals(resignNumber, that.resignNumber) &&
                Objects.equals(registrar, that.registrar) &&
                Objects.equals(registeredCapital, that.registeredCapital) &&
                Objects.equals(websiteAddress, that.websiteAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseId, password, enterpriseName, establishTime, address, businessScope, enterpriseType, annualTurnover, staffNumber, founder, ceo, resignNumber, registrar, registeredCapital, websiteAddress, informationReview);
    }
}

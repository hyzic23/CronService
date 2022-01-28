package com.imode.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDetail {

    @JsonProperty("acct_no")
    private String acctNo;

    @JsonProperty("class_type")
    private String classType;

    @JsonProperty("MobileNo")
    private String mobileNo;

    @JsonProperty("RimNo")
    private int rimNo;

    @JsonProperty("AccountType")
    private String accountType;

    @JsonProperty("EmailAddress")
    private String emailAddress;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("Title1")
    private String title1;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Bvn")
    private String bvn;

    @JsonProperty("ClassCode")
    private int classCode;

    //Getters and Setters

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getRimNo() {
        return rimNo;
    }

    public void setRimNo(int rimNo) {
        this.rimNo = rimNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }



}

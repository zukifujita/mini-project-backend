package com.project.miniprojectbackend.core;

import javax.persistence.*;

@Entity
public class PackageIn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private Integer waybillNum;
    private String recipients;
    private Integer phoneNum;
    private String weight;
    private String status;
    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getWaybillNum() {
        return waybillNum;
    }

    public void setWaybillNum(Integer waybillNum) {
        this.waybillNum = waybillNum;
    }

    public String getRecipient() {
        return recipients;
    }

    public void setRecipient(String recipients) {
        this.recipients = recipients;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

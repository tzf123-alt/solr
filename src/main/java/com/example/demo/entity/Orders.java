package com.example.demo.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

public class Orders {
    @Id
    @Field
    private Integer odrId;
    @Id
    @Field
    private String odrCustomerNo;
    @Field
    private String odrAddr;

    public void setOdrId(Integer odrId) {
        this.odrId = odrId;
    }

    public void setOdrCustomerNo(String odrCustomerNo) {
        this.odrCustomerNo = odrCustomerNo;
    }

    public void setOdrAddr(String odrAddr) {
        this.odrAddr = odrAddr;
    }

    public Integer getOdrId() {
        return odrId;
    }

    public String getOdrCustomerNo() {
        return odrCustomerNo;
    }

    public String getOdrAddr() {
        return odrAddr;
    }
}

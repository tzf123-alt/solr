package com.example.demo.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class User implements Serializable {
    @Id
    @Field
    private Integer usrId;
    @Field
    private String usrName;
    @Field
    private String usrPassword;

    public Integer getUsrId() {
        return usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }
}

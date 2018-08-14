package com.hand.dto;

import java.io.Serializable;

public class Admin implements Serializable{  //数据封装类

    private static final long serialVersionUID = 1L;

    private int id;
    private String username;
    private String userpwd;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserpwd() {
        return userpwd;
    }
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }


}

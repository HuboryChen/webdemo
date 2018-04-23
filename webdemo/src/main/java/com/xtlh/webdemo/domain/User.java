package com.xtlh.webdemo.domain;

/**
 * @作者 陈坤
 * @创建日期 2018/4/20
 * @功能描述 用户实体类
 */

public class User {
    private Long id;
    private String username;
    private String password;
    private String type;
    private String satus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSatus() {
        return satus;
    }

    public void setSatus(String satus) {
        this.satus = satus;
    }
}

package com.dlx.bean;

public class Person {
    /*
    用户类
     */
    private String username;
    private String password;
    private String idNum;
    private String tel;

    public Person() {
    }

    public Person(String username, String password, String idNum, String tel) {
        this.username = username;
        this.password = password;
        this.idNum = idNum;
        this.tel = tel;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return idNum
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * 设置
     * @param idNum
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * 获取
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return "Person{username = " + username + ", password = " + password + ", idNum = " + idNum + ", tel = " + tel + "}";
    }
}

package com.galaxy.bean;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String pwd;
    private Dept bir;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", dept='" + bir + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Dept getBir() {
        return bir;
    }

    public void setBir(Dept dept) {
        this.bir = dept;
    }
}

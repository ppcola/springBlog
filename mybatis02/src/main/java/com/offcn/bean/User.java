package com.offcn.bean;

public class User {
    private Integer uid;
    private String uname;
    private Integer age;
    private String phone;


    public User(Integer uid, String uname, Integer age, String phone) {
        this.uid = uid;
        this.uname = uname;
        this.age = age;
        this.phone = phone;
    }

    public User() {

    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}

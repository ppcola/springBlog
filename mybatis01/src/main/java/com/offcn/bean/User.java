package com.offcn.bean;

public class User {
    private int uid;
    private String uname;
    private int age;
    private String phone;

    public User(int uid, String uname, int age, String phone) {
        this.uid = uid;
        this.uname = uname;
        this.age = age;
        this.phone = phone;
    }

    public User() {

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

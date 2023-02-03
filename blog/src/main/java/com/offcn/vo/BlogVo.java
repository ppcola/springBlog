package com.offcn.vo;

import com.offcn.bean.Blog;
import com.offcn.bean.Btype;
import com.offcn.bean.Evaluate;
import com.offcn.bean.User;

import java.io.Serializable;
import java.util.List;

public class BlogVo extends Blog implements Serializable {
    private Btype btype;
    private User user;
    private List<Evaluate> evaluateList;

    public List<Evaluate> getEvaluateList() {
        return evaluateList;
    }

    public void setEvaluateList(List<Evaluate> evaluateList) {
        this.evaluateList = evaluateList;
    }

    public Btype getBtype() {
        return btype;
    }

    public void setBtype(Btype btype) {
        this.btype = btype;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

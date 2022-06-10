package com.offcn.mapper;

import com.offcn.bean.User;

import java.util.List;

public interface UserMapper {
    public List<User> queryAll();

    public User queryByUid(int uid);

    public int insertUser(User user);

    public int update(User user);

    List<User> queryLike(String uname);

    void queryLike();
}

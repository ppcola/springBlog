package com.offcn.service;

import com.offcn.bean.User;
import com.offcn.vo.UserVo;

import java.util.List;

public interface UserService {
    User login(String uname,String upass);
    List<User> queryAll();
    List<User> queryByCondition(String uname);
    UserVo queryByUid(int uid);
    int deleteUser(int uid);
}

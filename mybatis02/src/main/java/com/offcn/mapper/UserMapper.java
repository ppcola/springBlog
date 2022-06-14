package com.offcn.mapper;

import com.offcn.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> queryAll();

    public User queryByUid(int uid);

    public int insertUser(User user);

    public int update(User user);

    List<User> queryLike(String uname);

    void queryLike();

    List<User> queryByCondition(@Param("uname") String uname,@Param("phone") String phone);

    //批量删除
    int delMany(int[]uids);

    //批量查询
    List<User> queryByUids(List<Integer>  uids);
}

package com.offcn.service.impl;

import com.offcn.bean.User;
import com.offcn.bean.UserExample;
import com.offcn.mapper.UserMapper;
import com.offcn.service.UserService;
import com.offcn.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String uname, String upass) {
        UserExample example = new UserExample();
        //设置查询方法
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUnameEqualTo(uname);//按用户名等值查询
        criteria.andUpassEqualTo(upass);//按密码等值查询
        List<User> userList = userMapper.selectByExample(example);
        //判断查询结果
        if (userList != null && userList.size()>0){
            return userList.get(0);
        }
        return null;

    }

    @Override
    public List<User> queryAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public List<User> queryByCondition(String uname) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUnameLike("%"+uname+"%");
        return userMapper.selectByExample(example);
    }

    @Override
    public UserVo queryByUid(int uid) {
        return userMapper.queryByUid(uid);
    }

    @Override
    public int deleteUser(int uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }
}

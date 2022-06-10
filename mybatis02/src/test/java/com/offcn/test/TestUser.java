package com.offcn.test;

import com.offcn.bean.User;
import com.offcn.mapper.UserMapper;
import com.offcn.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestUser {

    @Test
    public void queryAll() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory= builder.build(is);

        SqlSession sqlSession = factory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.queryAll();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
        is.close();
    }

    @Test
    public void queryByUid() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryByUid(2);

        System.out.println(user);

        sqlSession.close();
        is.close();
    }

/*    @Test
    public void insertUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);

        //事务需要提交。

        SqlSession sqlSession = factory.openSession(true); //自动提交事务。
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User("王正",21,"19732564");

        int flag = mapper.insertUser(user);
       *//* sqlSession.commit();  //手动提交事务*//*
        System.out.println(flag);

        sqlSession.close();
        is.close();


    }*/

    @Test
    public void updateTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(2,"杨美丽",21,"1860332554");

        int row = mapper.update(user);

        sqlSession.commit();

        sqlSession.close();

        System.out.println(row);
    }
    @Test
    public void queryLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.queryLike("丽");

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

}

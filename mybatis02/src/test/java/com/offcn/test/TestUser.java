package com.offcn.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.offcn.bean.Book;
import com.offcn.bean.User;
import com.offcn.mapper.BookMapper;
import com.offcn.mapper.UserMapper;
import com.offcn.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        //?????????????????????

        SqlSession sqlSession = factory.openSession(true); //?????????????????????
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User("??????",21,"19732564");

        int flag = mapper.insertUser(user);
       *//* sqlSession.commit();  //??????????????????*//*
        System.out.println(flag);

        sqlSession.close();
        is.close();


    }*/

    @Test
    public void updateTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(2,"?????????",21,"1860332554");

        int row = mapper.update(user);

        sqlSession.commit();

        sqlSession.close();

        System.out.println(row);
    }
    @Test
    public void queryLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.queryLike("???");

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test

    public void queryByCondition(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.queryByCondition("", "");

        for (User user : userList) {
            System.out.println(user);
        }

        MybatisUtils.close(sqlSession);
    }

    @Test
    public void delMany(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int[] uids={3,5,6};
        int row = mapper.delMany(uids);
        sqlSession.commit();
        System.out.println(row);
        MybatisUtils.close(sqlSession);
    }

    @Test

    public void queryByUids(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> uid = new ArrayList<Integer>();
        uid.add(1);
        uid.add(2);
        List<User> userList = mapper.queryByUids(uid);

        for (User user : userList) {
            System.out.println(user);
        }

        MybatisUtils.close(sqlSession);
    }

    @Test

    public void queryByPage(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //?????????1??????10??????????????????????????????count
        PageHelper.startPage(1, 2);
        List<User> list = mapper.queryAll();
//???PageInfo?????????????????????
        PageInfo page = new PageInfo(list);

        List list1 = page.getList();
        for (Object o : list1) {
            System.out.println(o);
        }

        MybatisUtils.close(sqlSession);
    }


    //=========================bookTest

    @Test

    public void bookQueryAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Book> books = mapper.queryAll();

        for (Book book : books) {
            System.out.println(book);
        }
    }
@Test
    public void insertTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Map<String,Object> map=new HashMap<String, Object>();
        map.put("title","mybatis??????");
        map.put("price",45.3);
        map.put("bauthor","??????");
        map.put("bdesc","?????????????????????");


        int row = mapper.insert(map);
        sqlSession.commit();
        System.out.println(row);

        MybatisUtils.close(sqlSession);
    }

    @Test
    public void delete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        int row = mapper.delete(3);
        sqlSession.commit();
        System.out.println(row);
        MybatisUtils.close(sqlSession);
    }

    @Test
    public void selectByNameAndAuthor(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Book> books = mapper.queryByAuthorAndTitle("?????????", "JAVA????????????");

        for (Book book : books) {
            System.out.println(book);
        }

        MybatisUtils.close(sqlSession);
    }

}

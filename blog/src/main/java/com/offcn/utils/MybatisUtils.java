package com.offcn.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    //封装获取sqlSession对象
    public static SqlSession getSqlSession(){
        //1.加载核心配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.创建SqlSessionFactoryBuilder构造器
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3.创建SqlSessionFactory工厂
        SqlSessionFactory factory = builder.build(is);
        //4.SqlSession对象
        SqlSession sqlSession = factory.openSession();
        return sqlSession;
    }
    //释放资源
    public static void close(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.close();
        }
    }


}

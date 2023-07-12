package com.huihui.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:MyBatisIntroductionTest$
 * Package:com.huihui.mybatis.test$
 * Description:
 *
 * @Author:Huihui
 * @Create:2023/5/15$ - 13:59$
 * @Version:
 */
public class MyBatisIntroduction {
    //    public static void main(String[] args) {
//        //获取sqlSessionFactoryBuilder对象
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSession sqlSession = null;
//        try {
//            //获取SqlSessionFactory对象
//            InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
//            SqlSessionFactory build = sqlSessionFactoryBuilder.build(inputStream);
//            sqlSession = build.openSession();
//            sqlSession.insert("insertcar");
//            sqlSession.commit();
//        } catch (IOException e) {
//            if (sqlSession != null) {
//                sqlSession.rollback();
//            }
//            e.printStackTrace();
//        }finally {
//            if (sqlSession != null) {
//                sqlSession.close();
//            }
//        }
//    }
    public int carMapper() {
        //获取sqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSession sqlSession = null;
        int insertcar = 0;
        try {
            //获取SqlSessionFactory对象
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = sqlSessionFactoryBuilder.build(inputStream);
            sqlSession = build.openSession();
            insertcar = sqlSession.insert("insertcar");
            sqlSession.commit();
        } catch (IOException e) {
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return insertcar;
    }
}

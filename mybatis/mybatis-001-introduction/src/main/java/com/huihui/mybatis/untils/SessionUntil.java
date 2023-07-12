package com.huihui.mybatis.untils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * ClassName:SessionUntil$
 * Package:com.huihui.mybatis.untils$
 * Description:
 *
 * @Author:Huihui
 * @Create:2023/5/23$ - 22:28$
 * @Version:
 */
public class SessionUntil {
    private static SqlSessionFactory sqlSessionFactory=null;
    private SessionUntil() {}
    static {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlssion(){
        return sqlSessionFactory.openSession();
    }
}

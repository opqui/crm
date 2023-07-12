package com.huihui.mybatis.test;
import com.huihui.mybatis.untils.SessionUntil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
/**
 * ClassName:CarMapperTest$
 * Package:com.huihui.mybatis.test$
 * Description:
 *
 * @Author:Huihui
 * @Create:2023/5/15$ - 15:09$
 * @Version:
 */
public class MyBatisIntroductionTest {
    @Test
    public void carMapperTest(){
        MyBatisIntroduction myBatisIntroduction = new MyBatisIntroduction();
        int i = myBatisIntroduction.carMapper();
        Assert.assertEquals(1,i);
    }
    @Test
    public void getSsionTest(){
        SqlSession sqlssion = SessionUntil.getSqlssion();
        int count = sqlssion.insert("insertcar");
        System.out.println(count);
        sqlssion.commit();
        sqlssion.close();
    }
}

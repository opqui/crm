package com.huihui.mybatis.untils;

import com.huihui.mybatis.pojo.Car;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * ClassName:CarMapperTest$
 * Package:com.huihui.mybatis.untils$
 * Description:
 *
 * @Author:Huihui
 * @Create:2023/5/24$ - 15:50$
 * @Version:
 */
public class CarMapperTest {
    @Test
    public void testmapper() {
       /* SqlSession sqlssion = SessionUntil.getSqlssion();
        Map<String, Object> map = new HashMap<>();
        map.put("k1", "1006");
        map.put("k2", "宝马");
        map.put("k3", "30.0");
        map.put("k4", "2023-08-08");
        map.put("k5", "燃油车");
        int count = sqlssion.insert("insertcar", map);
        System.out.println(count);
        sqlssion.commit();
        sqlssion.close();*/
        ArrayList<String> objects = new ArrayList<>();
        objects.add("ffff");
        objects.add("yy");
        objects.add("gg");
        objects.add("gg");
        objects.forEach((a)->System.out.println(a));
    }


    @Test
    public void testCarMapper() {
        SqlSession sqlssion = SessionUntil.getSqlssion();
        Car car = new Car(null, "1006", "宾利", 100.0, "2026-08-08", "新能源");
        int count = sqlssion.insert("fff", car);
        sqlssion.commit();
        sqlssion.close();
        Assert.assertEquals(1, count);
    }

    @Test
    public void testDelete(){
        SqlSession sqlssion = SessionUntil.getSqlssion();
        int count = sqlssion.delete("fiji", 10);
        sqlssion.commit();
        sqlssion.close();
        Assert.assertEquals(1,count);
    }

    @Test
    public void testUpdate(){
        Car car = new Car(4L, "1009", "劳斯莱斯", 100.0, "2020-08-08", "燃油车");
        SqlSession sqlssion = SessionUntil.getSqlssion();
        sqlssion.update("fojfo",car);
        sqlssion.commit();
        sqlssion.close();
    }

    @Test
    public void testSelect(){
        SqlSession sqlssion = SessionUntil.getSqlssion();
        Car car = sqlssion.selectOne("fofo", 4);
        System.out.println(car);
        sqlssion.close();
    }

}

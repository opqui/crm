package org.apache;

import java.io.FileReader;
import com.sun.Servlet;
import java.util.Properties;
import java.util.Scanner;

/**
 * ClassName:Tomcat$
 * Package:org.apache$
 * Description:S
 *
 * @Author:Huihui
 * @Create:2023/2/22$ - 11:16$
 * @Version:
 */
public class Tomcat {
    public static void main(String[] args) throws Exception{
        //首先要启动tomcat服务器
        System.out.println("Tomcat 服务器启动成功...");
        System.out.print("请输入访问地址：");
        //获取用户的访问地址
        Scanner scanner=new Scanner(System.in);
        String path =scanner.nextLine();

        //创建文件读取对象,注意下面的fileName一定要放绝对位置。
        FileReader fileReader = new FileReader("D:\\Working\\Coding\\Java\\JavaWeb\\com\\src\\web.properties");
        //创建properties对象
        Properties properties = new Properties();
        //调用properties的方法来加载文件对象。
        properties.load(fileReader);
        //关闭文件读取对象，否则占用资源
        fileReader.close();
        String s=properties.getProperty("/bbb");//通过key获取value
        System.out.println(s);
        //通过反射机制创建对象
        Class aClass = Class.forName(s);
        //创建object对象
        Object o = aClass.newInstance();
        //无论是什么类型的对象都实现了Servlet接口，因此可以向上转型，这样以便于以后调用方法。
        Servlet servlet = (Servlet) o;
        //调用接口的方法
        servlet.server();
    }
}

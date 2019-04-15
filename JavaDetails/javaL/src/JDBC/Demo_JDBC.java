package JDBC;

import java.sql.*;
import java.util.Properties;


/**
 * Created by songyang on 2019/4/8.
 *
 * @throws SQLException
 *
 */
public class Demo_JDBC {

    public static void main (String[] args) throws SQLException, ClassNotFoundException {

//        try {
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //JDBC - 类似于JKDBModel 提供一组接口，以供开发对象化操作数据库
        Class.forName("com.mysql.jdbc.Driver");//直接用反射加载 - 避免强依赖于jar

        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","12345678");

//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06?useUnicode=true&characterEncoding=utf8","root","12345678");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06?useUnicode=true&characterEncoding=utf8",info);
        //还可以模拟URL方式
//        Statement stmt = connection.createStatement();

        String sql = "SELECT * FROM users";
        //防止sql注入
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet set = preparedStatement.executeQuery("SELECT * FROM users ");
        while(set.next()){
            System.out.println(set.getObject(1));
            System.out.println(set.getObject(2));
            System.out.println(set.getObject(3));
            System.out.println(set.getObject(4));
        }

        set.close();
        preparedStatement.close();
        connection.close();

        //JDBC常用的接口
        //Java.sql.DriverManager

        //getConnection() - 装载数据库 - Properties - 直接从配置文件读取属性 - 生成

        //JUnit - 测试接口 -

        //Properties - 配置项

        //statement - 执行sql - 要么成功，要么异常 - PrepareStatement取代了

        //ResultSet - 结果集 - 将结果集封装到javaBean - private + setget + 无参构造

        //释放资源

        //注意这些地方的tryCatch

        //使用JDBC进行增删改查，自己封装DBUtils

        //SQL注入问题 - 单引号引发的一系列事故

        //解决问题 - PrepareStatement


        //XML - 配置文件 - 各种框架都要用

        //Dom4j - XML解析神器
        //XPATH - 用于查询 - selectSingleNode() selectNodes()

        //TomCat - bin可执行文件，conf配置文件，lib运行时使用的jar包，logs日志，webapps存放应用目录


        //HTTP请求，相关内容














    }

}

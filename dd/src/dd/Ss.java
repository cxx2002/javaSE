package dd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class Ss {
    public static void main(String[] args) throws Exception {
        //1. 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");//固定写法
        //2. 用户信息和url
        //useUnicode=true&characterEncoding=utf8&&useSSL=true
        String url="jdbc:mysql://localhost:3306/book_admin?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8";
        String name = "root";
        String password = "123456";
 
        //3. 连接成功，返回数据库对象  connection代表数据库
        Connection connection= DriverManager.getConnection(url,name,password);
        //4. 执行SQL的对象 statement 执行SQL的对象
        Statement statement = connection.createStatement();
        //5. 执行SQL的对象 去执行SQL   可能存在结果，查看返回结果
        String sql="SELECT * FROM book";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //Statement statement = connection.createStatement();
        //返回的结果集,结果集中封装了我们全部查询的结果
        //ResultSet resultSet = statement.executeQuery(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet.getRow());
        while(resultSet.next()){
            System.out.println("id="+resultSet.getInt("book_id"));
            System.out.println("name="+resultSet.getString("book_name"));
            System.out.println("writer="+resultSet.getObject("book_writer"));
            System.out.println("publish="+resultSet.getObject("book_publish"));
            System.out.println("status="+resultSet.getObject("book_status"));
        }
        //6. 释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}

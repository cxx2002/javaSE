package dd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class Ss {
    public static void main(String[] args) throws Exception {
        //1. ��������
        Class.forName("com.mysql.cj.jdbc.Driver");//�̶�д��
        //2. �û���Ϣ��url
        //useUnicode=true&characterEncoding=utf8&&useSSL=true
        String url="jdbc:mysql://localhost:3306/book_admin?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8";
        String name = "root";
        String password = "123456";
 
        //3. ���ӳɹ����������ݿ����  connection�������ݿ�
        Connection connection= DriverManager.getConnection(url,name,password);
        //4. ִ��SQL�Ķ��� statement ִ��SQL�Ķ���
        Statement statement = connection.createStatement();
        //5. ִ��SQL�Ķ��� ȥִ��SQL   ���ܴ��ڽ�����鿴���ؽ��
        String sql="SELECT * FROM book";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //Statement statement = connection.createStatement();
        //���صĽ����,������з�װ������ȫ����ѯ�Ľ��
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
        //6. �ͷ�����
        resultSet.close();
        statement.close();
        connection.close();
    }
}

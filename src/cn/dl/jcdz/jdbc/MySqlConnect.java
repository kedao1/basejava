package cn.dl.jcdz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnect {
	public static void main(String[] args) throws Exception {
		String URL="jdbc:mysql://127.0.0.1:3306/test";
        String USER="root";
        String PASSWORD="root";
        
        //1.加载mysql驱动程序
        Class.forName("com.mysql.jdbc.Driver");
       
        //2.建立数据库链接
        Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
        
        //3.连接操作数据库，实现增删改查
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from user");
        //4.处理数据库的返回结果
        while(rs.next()){
            System.out.println(rs.getString("user_name")+" "
                          +rs.getString("user_password"));
        }
        
        //关闭资源
        rs.close();
        st.close();
        conn.close();
	}
}

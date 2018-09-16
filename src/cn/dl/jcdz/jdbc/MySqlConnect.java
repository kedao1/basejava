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
        
        //1.����mysql��������
        Class.forName("com.mysql.jdbc.Driver");
       
        //2.�������ݿ�����
        Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
        
        //3.���Ӳ������ݿ⣬ʵ����ɾ�Ĳ�
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from user");
        //4.�������ݿ�ķ��ؽ��
        while(rs.next()){
            System.out.println(rs.getString("user_name")+" "
                          +rs.getString("user_password"));
        }
        
        //�ر���Դ
        rs.close();
        st.close();
        conn.close();
	}
}

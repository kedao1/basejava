package cn.dl.jcdz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.PrimitiveIterator;

public class KeyInsert {
    public static Connection con() {
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String name = "root";
        String passwd = "root";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, name, passwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public static int insertData(Key key) {
        int i = 0;
        //1.链接获取到
        Connection connection = con();
        //2,sql语句
        String sql = "insert into key_words_result(title,url) vaules(?,?)";
        //3,陈述
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            //4,准备数据
            preparedStatement.setString(1, key.getTitle());
            preparedStatement.setString(2, key.getUrl());

            i = preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public static int deleteData(Key key) {
        int i = 0;
        //1。建立链接
        Connection connection = con();
        //2.SQL语句
        String sql = "delete from key_words_result where url=?";
        //3.陈述
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, key.getUrl());

            //i数值，是sql语句执行所影响行数。
            i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return i;
    }

    public static int update(Key key) {
        int i = 0;
        //1.链接
        Connection connection = con();
        //2.sql
        String sql = "UPDATE key_words_result SET title=?,url=? WHERE url=?;";
        //3.陈述
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,key.getTitle());
            preparedStatement.setString(2,key.getUrl());
            preparedStatement.setString(3,"https://www.jinse.com/news/blockchain/215442.html");

            i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return i;
    }
}

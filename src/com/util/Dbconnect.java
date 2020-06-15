package com.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName
 * Description TODO
 * Author zgy
 * Date 2020/5/31 12:31
 * Version 1.8
 **/

public class Dbconnect {
    static String url = "jdbc:mysql://120.53.21.123:3306/zgy?serverTimezone=GMT&useSSL=false";
    static String username = "mosu";
    static String password = "123456";

    public Dbconnect(){

    }
//    public Dbconnect(String url, String database, String username, String password){
//        this.url = "jdbc:mysql://" + url + "/" + database;
//        this.username = username;
//        this.password = password;
//    }

    public static ComboPooledDataSource ds;
    static {
        try {
            ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl(url);
            ds.setUser(username);
            ds.setPassword(password);

            ds.setInitialPoolSize(5);
            ds.setMaxPoolSize(10);

        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection con){
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

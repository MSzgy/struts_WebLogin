package com.dao;

import com.domain.User;
import com.util.Dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName
 * Description TODO
 * Author zgy
 * Date 2020/5/31 21:11
 * Version 1.8
 **/

public class Userdao {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet res = null;

    public User finduser(User user) throws SQLException {
        try{
            connection = Dbconnect.getConnection();
            String sql = "SELECT username from test where username=? and password=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            res = statement.executeQuery();
            boolean flag = res.next();
            return flag ? user: null;
        }
        finally {
            close();
        }
    }

    public void adduser(User user) throws SQLException {
        try{
            connection = Dbconnect.getConnection();
            String sql = "insert into test (username, password) values (?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.execute();
        }
        finally {
            close();
        }
    }

    public void close() throws SQLException {
        if(res != null){
            res.close();
        }
        if(statement != null){
            statement.close();
        }
        if(connection != null){
            connection.close();
        }
    }
}

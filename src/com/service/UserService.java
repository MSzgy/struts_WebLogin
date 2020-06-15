package com.service;

import com.dao.Userdao;
import com.domain.User;

import javax.jws.soap.SOAPBinding;
import java.sql.SQLException;

/**
 * ClassName
 * Description TODO
 * Author zgy
 * Date 2020/5/31 20:20
 * Version 1.8
 **/

public class UserService {

    public boolean findUser(User user) throws SQLException {
        Userdao userdao = new Userdao();
        User temp = userdao.finduser(user);
        return temp != null;
    }

    public void addUser(User user) throws SQLException {
        Userdao userdao = new Userdao();
        userdao.adduser(user);
    }
}

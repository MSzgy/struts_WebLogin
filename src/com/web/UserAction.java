package com.web;

import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName
 * Description TODO
 * Author zgy
 * Date 2020/5/31 20:08
 * Version 1.8
 **/

public class UserAction extends ActionSupport implements ModelDriven<User> {
    User u = new User();

    public String login() throws Exception {
        System.out.println("run");
        UserService userService = new UserService();
        boolean success = userService.findUser(u);
        System.out.println(u.getUsername());
        if(success){
            ActionContext actionContext = ActionContext.getContext();
            Map session = actionContext.getSession();
            session.put("User", u);
            return "success";
        }
        else{
            return "fail";
        }
    }

    public String register() throws SQLException {
        UserService userService = new UserService();
        boolean isexist = userService.findUser(u);
        System.out.println("register");
        if(isexist){
//            ActionContext actionContext = ActionContext.getContext();
//            Map session = actionContext.getSession();
//            session.put("status", "reapply");
            return "fail";
        }
        else{
            userService.addUser(u);
            return "success";
        }
    }

    public String execute(){
        ServletActionContext.getRequest().setAttribute("username", "zgy");
        ServletActionContext.getRequest().setAttribute("password", "123");

//        ActionContext.getContext().put("username", "zgy");
//        ActionContext.getContext().put("password", "123");

//        Map request = (Map)ActionContext.getContext().get("request");
//        request.put("username", "zgy");
//        request.put("password", "123");
        System.out.println("default");
        return "redirect";
    }
    @Override
    public User getModel() {
        return u;
    }
}

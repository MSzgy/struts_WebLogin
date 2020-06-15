package com.web;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ClassName
 * Description TODO
 * Author zgy
 * Date 2020/6/1 16:21
 * Version 1.8
 **/

public class TestAction extends ActionSupport {

    public String execute(){
        System.out.println("test");
        return null;
    }
}

package com.intercept;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * ClassName
 * Description TODO
 * Author zgy
 * Date 2020/6/7 1:31
 * Version 1.8
 **/

public class MyIntercept extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        //自动放行
        Object user = ActionContext.getContext().getSession().get("User");
        if(user != null){
            return actionInvocation.invoke();
        }
        else {
            System.out.println(11);
            return "tologin";
        }
    }
}

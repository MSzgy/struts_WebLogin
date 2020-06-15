package com.intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * ClassName
 * Description TODO
 * Author zgy
 * Date 2020/6/7 1:32
 * Version 1.8
 **/

public class MyIntercept2 implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        //自动放行
        return actionInvocation.invoke();
    }
}

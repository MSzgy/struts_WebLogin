package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "EncodingFilter")
public class EncodingFilter implements Filter {
    protected String encoding = null;
    protected FilterConfig filterConfig = null;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

//        if(req.getCharacterEncoding() != null){
//            //得倒指定的编码
//            String encode = selectEncoding(req);
//            if(encode == null){
//                //设置request的编码
                req.setCharacterEncoding("UTF-8");
                resp.setCharacterEncoding("UTF-8");
//            }
//        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
//        this.filterConfig = config;
//        this.encoding = config.getInitParameter("encoding");
//        System.out.println(this.encoding);
    }

//    protected String selectEncoding(ServletRequest servletRequest){
//        return encoding;
//    }

}

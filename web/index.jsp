<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="com.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: 墨素
  Date: 2020/4/17
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  各种商品的展示
  <br><hr>

  ${request.contextPath}
  <c:choose>
    <c:when test="${empty session}">
      <a href="${pageContext.request.contextPath}/login.jsp">登陆</a>
      <a href="${pageContext.request.contextPath}/register.jsp">注册</a>
    </c:when>
  </c:choose>
  </br>
  <s:if test="#session.User==null">
  </s:if>
  <s:else>
    当前登陆用户:<s:property value="#session.User.username"/>
  </s:else>

    <%--Object user = request.getSession().getAttribute("session");--%>
    <%--if(user == null){--%>
     <%--%>--%>
  <%--<a href="<%=request.getContextPath()%>/login.jsp">登陆</a> <a href="<%=request.getContextPath()%>/register.jsp">注册</a>--%>
  <%--<%--%>
  <%--}else {--%>
      <%--out.println("当前登陆用户" + ((User)(user)).getUsername());--%>
  <%--}--%>
  <%--%>--%>
<%--${pageContext.request.contextPath}--%>
  </body>
</html>

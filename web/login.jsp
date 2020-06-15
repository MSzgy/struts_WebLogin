<%--
  Created by IntelliJ IDEA.
  User: 墨素
  Date: 2020/4/17
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>
<%--<%--%>
    <%--if(request.getAttribute("msg") != null){--%>
        <%--out.println(request.getAttribute("msg") + "<br>");--%>
    <%--}--%>
<%--%>--%>
<form action="LoginAction.action" method="post">
    用户<input type="text" name="username"><br>
    密码<input type="password" name="password">
    <input type="submit" name="提交">
</form>
</body>
</html>

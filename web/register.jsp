<%--
  Created by IntelliJ IDEA.
  User: 墨素
  Date: 2020/4/17
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>--%>
    <%--<script type="text/javascript">--%>
        <%--$(function () {--%>
            <%--$("input[name='username']").blur(verifyname);--%>
        <%--});--%>
        <%--function verifyname() {--%>
            <%--$.ajax({--%>
                <%--url: encodeURI("${pageContext.request.contextPath}/verifyname"),--%>
                <%--type:"post",--%>
                <%--data:{--%>
                    <%--"username":$("input[name='username']").val()--%>
                <%--},--%>
                <%--dataType:"json",--%>
                <%--success:function (msg) {--%>
                    <%--// alert(msg.issuccess);--%>

                    <%--if(msg.issuccess){--%>
                        <%--$("#msg").html("<font color='green'>用户名可以用</font>");--%>
                    <%--}--%>
                    <%--else{--%>
                        <%--$("#msg").html("<font color='red'>用户名重复</font>");--%>
                    <%--}--%>
                <%--}--%>
            <%--})--%>
        <%--}--%>
    <%--</script>--%>
</head>
<body>
<%--<%--%>
    <%--if(request.getAttribute("msg") != null){--%>
        <%--out.println(request.getAttribute("msg") + "<br>");--%>
    <%--}--%>
<%--%>--%>

<%--<s:if test="#session.status==null">--%>
<%--</s:if>--%>
<%--<s:else>--%>
    <%--注册失败:${session.status}--%>
<%--</s:else>--%>

<form action="RegisterAction.action" method="post">
    用户<input type="text" name="username"><br/>
    密码<input type="password" name="password"><br>
    年龄<input type="text" name="age"><br>
    男<input type="radio" name="sex" value="male" checked="checked"> 女<input type="radio" name="sex" value="female">
    <input type="submit" name="注册">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: LY
  Date: 2020/4/8
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>通过转发到该页面</h1>

<h1>aaaaa</h1>
<a href="modelAndView">modelAndView---String</a>
<hr>
<a href="modelAndView2">modelAndView2---POJO</a>
<hr>
<a href="modelMap">modelMap---POJO</a>
<hr>
<h1>login1--用名称来匹配</h1>
<form action="loginGetSession" method="post">
    用户姓名：<input name="name"><br/>
    <input type="submit" value="登录"><br/>
</form>

</body>
</html>

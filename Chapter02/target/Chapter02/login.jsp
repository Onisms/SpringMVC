<%--
  Created by IntelliJ IDEA.
  User: LY
  Date: 2020/4/1
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>login1--用名称来匹配</h1>
<form action="login" method="post">
    用户姓名：<input name="name"><br/>
    用户密码：<input name="pwd"><br/>
    <input type="submit" value="登录"><br/>
</form>
<br/>
<br/>
<h1>login2</h1>
<form action="login2 --封装对象来匹配" method="post">
    用户姓名：<input name="name"><br/>
    用户密码：<input name="pwd"><br/>
    <input type="submit" value="登录"><br/>
</form>
</body>
</html>

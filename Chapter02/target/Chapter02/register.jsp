<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h1>register--用名称来匹配</h1>
<form action="register" method="post">
    用户姓名：<input name="name"><br/>
    用户密码：<input name="pwd"><br/>
    <input type="submit" value="登录"><br/>
<br/>
<br/>
</form>


</form><h1>register--级联属性</h1>
<form action="register2" method="post">
    用户姓名：<input name="name"><br/>
    用户密码：<input name="pwd"><br/>
    用户部门：
    <select name="dept.name">
        <option value="研发部">研发部</option>
        <option value="开发部">开发部</option>
        <option value="销售部">销售部</option>
    </select>
    <input type="submit" value="登录"><br/>
</form>


<h1>register2--用实体类的属性来匹配</h1>
<form action="register2" method="post">
用户姓名：<input name="name"><br/>
用户密码：<input name="pwd"><br/>
<input type="submit" value="登录"><br/>
</body>

</html>

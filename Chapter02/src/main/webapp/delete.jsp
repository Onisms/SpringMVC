<%--
  Created by IntelliJ IDEA.
  User: LY
  Date: 2020/4/7
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

<h1>注册</h1>
<form action="loginGetSession" method="post">
    用户姓名：<input name="name"/><br>
    用户密码：<input name="pwd"/><br>
    <input type="submit" value="登录">

</form>



<h1>绑定数组-----批量删除用户</h1>
    <form action="deleteBatch" method="post">
        <table>
            <thead>
            <tr>
                <tr>选择</tr>
                <tr>姓名</tr>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="checkbox" name="ids" value="11"></td>
                <td>张三</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="ids" value="13"></td>
                <td>李四</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="ids" value="14"></td>
                <td>王五</td>
            </tr>
            </tbody>
        </table><br>
        <input type="submit" value="删除">
    </form>

<h1>绑定集合-----批量修改用户</h1>
    <form action="updateBatch" method="post">
        <table>
            <thead>
            <tr>
                <tr>选择</tr>
                <tr>姓名</tr>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="checkbox" name="userList[0].id" value="11"></td>
                <td><input type="text" name="userList[0].name" value="张三"></td>
            </tr>
            <tr>
                <td><input type="checkbox" name="userList[1].id" value="22"></td>
                <td><input type="text" name="userList[1].name" value="李四"></td>
            </tr>
            <tr>
                <td><input type="checkbox" name="userList[2].id" value="33"></td>
                <td><input type="text" name="userList[2].name" value="王五"></td>
            </tr>

            </tbody>
        </table>
        <br>
        <input type="submit" value="批量更新">
    </form>
</body>
</html>

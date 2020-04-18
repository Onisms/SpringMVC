<%--
  Created by IntelliJ IDEA.
  User: LY
  Date: 2020/4/11
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<h1>文件上传--SpringMVC方式2</h1>
    <form action="moreUploadFile" method="post" enctype="multipart/form-data">
        文件：<input type="file" name="uploads"/>
        文件：<input type="file" name="uploads"/>
        文件：<input type="file" name="uploads"/>
        文件：<input type="file" name="uploads"/>
        <input type="submit" value="上传文件"/>
    </form>

<h1>文件上传--SpringMVC方式2</h1>
    <form action="uploadFile2" method="post" enctype="multipart/form-data">
        文件：<input type="file" name="upload"/>
        <input type="submit" value="上传文件"/>
    </form>

<h1>文件上传--SpringMVC方式</h1>
    <form action="uploadFile" method="post" enctype="multipart/form-data">
        文件：<input type="file" name="aaa"/>
        <input type="submit" value="上传文件"/>
    </form>

<h1>文件上传--传统方式</h1>
    <form action="uploadFileOld" method="post" enctype="multipart/form-data">
        文件：<input type="file" name="aaa"/>
        <input type="submit" value="上传文件"/>
    </form>
</body>
</html>

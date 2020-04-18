<%--
  Created by IntelliJ IDEA.
  User: LY
  Date: 2020/4/8
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
<h1>获取数据---String</h1>
<h3>map</h3>
${stu1}<br>
${stu2}<br>
${stu3}<br><br>
<hr>

<h3>List</h3>
<c:forEach items="${stuList}" var="stu">
    ${stu}<br>
</c:forEach>


</body>
</html>

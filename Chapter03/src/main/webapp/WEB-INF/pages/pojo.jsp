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
<h1>获取数据------POJO</h1>
<h3>map</h3>
${stu1.name}<br>
${stu2.name}<br>
${stu3.name}<br><br>
<hr>

<h3>List</h3>
<c:forEach items="${stuList}" var="stu">
    ${stu.id}<br>${stu.name}<br>
</c:forEach>


</body>
</html>

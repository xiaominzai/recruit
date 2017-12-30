<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈逸民
  Date: 2017/12/31
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>论坛登录</title>
</head>
<body>
<c:if test="${!empty error}">
    <font color="red"><c:out value="${error}"/></font>
</c:if>
<form action="<c:url value="/loginCheck.html" />" method="post">
    <label for="">用户名</label>
    <input type="text" name="userName">
    <br>
    <label for="">密码</label>
    <input type="text" name="password">
    <br>
    <input type="submit" value="登录" />
    <input type="reset" value="重置">
    <img src="${pageContext.request.contextPath}img/aaa.png" alt="">
</form>>

</form>
</body>
</html>

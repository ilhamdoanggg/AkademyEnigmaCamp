<%--
  Created by IntelliJ IDEA.
  User: ilham
  Date: 02/10/19
  Time: 11.36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1><c:out value=""/> </h1>

<c:forEach items="${requestScope.student}" var="student">
    <h1><c:out value="${student.name}"/></h1>
</c:forEach>

</body>
</html>

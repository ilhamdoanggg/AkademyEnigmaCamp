<%--
  Created by IntelliJ IDEA.
  User: ilham
  Date: 04/10/19
  Time: 15.44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html >
<head>
    <title>Hasil</title>
</head>
<body>
<h1>  Saya request Student</h1>

<form action="student-submit" method="post">
    <label>id</label>
    <input type="text" name="id"  >
    <label>Nama</label>
    <input type="text" name="name" >
    <input type="submit" value="submit">
</form>

<c:forEach items="${kirim}" var="st12">
    <h1><c:out value="${st12.id}" /></h1>
    <h1><c:out value="${st12.name}" /></h1>
</c:forEach>

<%--    <form action="student-submit" method="post">--%>
<%--        <input type="text" name="id">--%>
<%--        <input type="text" name="name">--%>
<%--        <input type="submit">--%>
<%--    </form>--%>
<%--<h1>INI STUDENT</h1>--%>

<%--    <h4>${kirim.id}</h4>--%>
<%--    <h4>${kirim.name}</h4>--%>
</body>
</html>
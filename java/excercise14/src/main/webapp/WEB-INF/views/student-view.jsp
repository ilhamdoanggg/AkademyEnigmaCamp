<%--
  Created by IntelliJ IDEA.
  User: ilham
  Date: 07/10/19
  Time: 10.44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Ini Student ${message}</h1>
<h1>Id : ${x.id}</h1>
<h1>Name : ${x.name}</h1>
<h1>Name : ${x.birthPlace}</h1>
<h1>Name : ${x.birthDate}</h1>
<h1>Name : ${x.gender}</h1>

<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Birth Date</th>
        <th>BIrth Place</th>
        <th>gendet</th>
    </tr>
    </thead>

    <tbody>
        <:c:forEach items="${studentlist}" var="student">
            <tr>
                <td><c:out value="${student.id}"></c:out></td>
                <td><c:out value="${student.name}"></c:out></td>
                <td><c:out value="${student.birthDate}"></c:out></td>
                <td><c:out value="${student.birthPlace}"></c:out></td>
                <td><c:out value="${student.gender}"></c:out></td>
            </tr>
        </:c:forEach>
    </tbody>

</table>

</body>
</html>

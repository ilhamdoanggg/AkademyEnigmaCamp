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
    <title>Artist Table</title>
</head>
<body>
<%--
<h1>Ini Artist ${message}</h1>
<h1>Id : ${zx.id}</h1>
<h1>Name : ${zx.name}</h1>
<h1>Name : ${zx.debut}</h1>
<h1>Name : ${zx.artistFrom}</h1>--%>
<a href="add-artist"
   class="button1">Add</a>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Date Dabut</th>
        <th>From</th>
        <th>action</th>
    </tr>
    </thead>

    <tbody>
        <c:forEach items="${artistList}" var="artist">
            <tr>
                <td><c:out value="${artist.id}"></c:out></td>
                <td><c:out value="${artist.name}"></c:out></td>
                <td><c:out value="${artist.debut}"></c:out></td>
                <td><c:out value="${artist.artistFrom}"></c:out></td>
                <td><a href="/artist/${artist.id}">detail</a></td>
            </tr>
        </c:forEach>
    </tbody>

</table>

</body>
</html>

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
<a href="add-song"
   class="button1">Add</a>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name Song</th>
        <th>Date Realise</th>
        <th>Artist</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${songlist}" var="song">
            <tr>
                <td><c:out value="${song.id}"></c:out></td>
                <td><c:out value="${song.songName}"></c:out></td>
                <td><c:out value="${song.release}"></c:out></td>
                <td><c:out value="${song.idArtist.name}"></c:out></td>
                <td><a href="/edit-song?id=${song.id}">detail</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: ilham
  Date: 07/10/19
  Time: 10.45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>song</title>
</head>
<body>
<h1>Ini Song Form</h1>

<fmt:form modelAttribute="song"
          action="add-song" method="post">
    <h2>Isi Form</h2>

    Id : <fmt:input path="id" />
    Name : <fmt:input path="songName" />
    Date Rilis:<fmt:input type="date" path="release"/>

    Artist:<fmt:select path="idArtist">
    <c:forEach items="${artis}" var="artist">
        <fmt:option value="${artist.id}">${artist.name}</fmt:option>
    </c:forEach>
</fmt:select>
        <input type="submit">
</fmt:form>

</body>
</html>

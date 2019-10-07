<%--
  Created by IntelliJ IDEA.
  User: ilham
  Date: 07/10/19
  Time: 10.45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ini Student Form</h1>

<fmt:form modelAttribute="artist"
          action="add-artist" method="post">
    <h2>Isi Form</h2>
    Id : <fmt:input path="id" text="${artist.id}" />
    Name : <fmt:input path="name" text="${artist.name}"/>
    Date Debut:<fmt:input path="debut" text="${artist.debut}"/>
    From :<fmt:input path="artistFrom" text="${artist.artistFrom}"/>
        <input type="submit">
</fmt:form>

</body>
</html>

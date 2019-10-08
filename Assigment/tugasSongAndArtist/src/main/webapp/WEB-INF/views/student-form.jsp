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

<fmt:form modelAttribute="student" action="student" method="post">
    <h2>Isi Form</h2>
    Id : <fmt:input path="id"/>
    Name : <fmt:input path="name"/>
    Date : <fmt:input path="birthDate"/>
    Place :<fmt:input path="birthPlace"/>
    Gender:<fmt:input path="gender"/>
        <input type="submit">
</fmt:form>

</body>
</html>

<%@ page contentType="text/html;chartset=UTF-8" language="java"%>
<html>
<head>
    <title>Enigma Camp</title>
</head>
<body>
<h1>Hasil Robot</h1>
<%
    String contrasol = (String) request.getAttribute("contrasol");
%>
<h1>Hasilnya <%= contrasol %> </h1>
</body>
</html>
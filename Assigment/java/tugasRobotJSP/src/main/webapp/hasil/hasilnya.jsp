<%@ page contentType="text/html;chartset=UTF-8" language="java"%>
<html>
<head>
<title>Enigma Camp</title>
</head>
<body>
<h1>Your robot move to</h1>
<%
    String hasil = (String) request.getAttribute("hasil");
%>
<h1>Hasilnya <%= hasil %> </h1>
</body>
</html>
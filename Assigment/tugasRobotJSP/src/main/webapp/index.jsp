<%@ page contentType="text/html;chartset=UTF-8" language="java"%>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
<title>Enigma Camp</title>
</head>
<body>

<h1>Input Robot Control</h1>
<form action="robot.doang" method="post">

    <h3>Input Cordinate X</h3>
    <input type="text" name="cordx">
    <br/>

    <h3>Input Cordinate Y</h3>
    <input type="text" name="cordy">

    <h3>Input Firsh Direction</h3>
    <input type="text" name="direction" placeholder="NORTH, EAST, SOUT, WEST">

<%--    <h3>Input Fuel</h3>--%>
<%--    <input type="text" name="fuel">--%>

    <h3>Input Command</h3>
    <input type="text" name="command">

    <input type="submit"/>

</form>


<a href="hello.doang?name=Ilham">Hai</a>
<a href="apakabar.doang?angka1=7&&angka2=8">Apa Kabar</a>
</body>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</html>

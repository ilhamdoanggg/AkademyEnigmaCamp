<%@ page contentType="text/html;chartset=UTF-8" language="java"%>
<html>
<head>
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

<%--

<h1>Aing Maung</h1>
<form action="apakabar.doang" method="post">
    <h3>angka1</h3>
    <input type="text" name="angka1">
    <br/>
    <h3>angka2</h3>
    <input type="text" name="angka2">
    <input type="submit"/>
    </form>
--%>

<a href="hello.doang?name=Ilham">Hai</a>
<a href="apakabar.doang?angka1=7&&angka2=8">Apa Kabar</a>
</body>
</html>
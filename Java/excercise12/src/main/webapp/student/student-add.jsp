<%--
  Created by IntelliJ IDEA.
  User: ilham
  Date: 02/10/19
  Time: 01.47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<form action="studentinput.doang" method="post">
    <label for="id">Id</label>
    <input type="text" id="id" name="id" placeholder="id.."><br>

    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="name.."><br>

    <label for="birth_place">birth place</label>
    <input type="text" id="birth_place" name="birth_place" placeholder="birth_place.."><br>

    <label for="birth_date">birth Date</label>
    <input type="date" id="birth_date" name="birth_date" placeholder="birth_date.."><br>

    <label for="gender">Gender</label>
    <select id="gender" name="gender">
        <option value="M"> MALE</option>
        <option value="F">FEMALE</option>
    </select><br>

    <label for="room">Room</label>
    <input type="text" id="room" name="room" placeholder="Room.."><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>

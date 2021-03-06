<%@ page import="java.util.List" %>
<%@ page import="com.enigma.model.Student" %>
<%--
  Created by IntelliJ IDEA.
  User: ilham
  Date: 01/10/19
  Time: 21.55
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
    <%--Styel shiitttt--%>
<%--
    <style type="text/css">
        <%@include file="/css/bootstrap.css" %>
        <%@include file="/css/bootstrap-grid.css" %>
    </style>--%>
    <style>

        h1{
            font-size: 30px;
            color: #fff;
            text-transform: uppercase;
            font-weight: 300;
            text-align: center;
            margin-bottom: 15px;
        }
        table{
            width:100%;
            table-layout: fixed;
        }
        .tbl-header{
            background-color: rgba(255,255,255,0.3);
        }
        .tbl-content{
            height:300px;
            overflow-x:auto;
            margin-top: 0px;
            border: 1px solid rgba(255,255,255,0.3);
        }
        th{
            padding: 20px 15px;
            text-align: left;
            font-weight: 500;
            font-size: 12px;
            color: #fff;
            text-transform: uppercase;
        }
        td{
            padding: 15px;
            text-align: left;
            vertical-align:middle;
            font-weight: 300;
            font-size: 12px;
            color: #fff;
            border-bottom: solid 1px rgba(255,255,255,0.1);
        }


        /* demo styles */

        body{
            background: -webkit-linear-gradient(left, #25c481, #25b7c4);
            font-family: 'Roboto', sans-serif;
        }
        section{
            margin: 50px;
        }


        /* follow me template */
        .made-with-love {
            margin-top: 40px;
            padding: 10px;
            clear: left;
            text-align: center;
            font-size: 10px;
            font-family: arial;
            color: #fff;
        }
        .made-with-love i {
            font-style: normal;
            color: #F50057;
            font-size: 14px;
            position: relative;
            top: 2px;
        }
        .made-with-love a {
            color: #fff;
            text-decoration: none;
        }
        .made-with-love a:hover {
            text-decoration: underline;
        }


        /* for custom scrollbar for webkit browser*/

        ::-webkit-scrollbar {
            width: 10px;
        }
        ::-webkit-scrollbar-track {
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
        }
        ::-webkit-scrollbar-thumb {
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
        }

        .bouncy{
             animation:bouncy 5s infinite linear;
             position:relative;
        }
        @keyframes bouncy {
         0%{top:0em}
         40%{top:0em}
         43%{top:-0.9em}
         46%{top:0em}
         48%{top:-0.4em}
         50%{top:0em}
         100%{top:0em;}
        }


    </style>

</head>
<body>
<h1>Ini Data Siswa</h1>
<section>
    <a href="studentinput.doang"
       class="button1 bouncy">Add</a>
    <div class="tbl-header">
        <table cellpadding="0" cellspacing="0" border="0">
            <thead>
            <tr>
                <th>No</th>
                <th>Name</th>
                <th>Tanggal Lahir</th>
                <th>Tempat Lahir</th>
                <th>Gender</th>
                <th>Room</th>
                <th>Action</th>
            </tr>
            </thead>
        </table>
    </div>

    <%--data table--%>
    <div class="tbl-content">
        <table cellpadding="0" cellspacing="0" border="0">
            <tbody>
            <%
                List<Student> students = (List<Student>) request.getAttribute("hasil");
                for (Student student:students) {
            %>
            <tr>
                <td><%= student.getId()%></td>
                <td><%= student.getName()%></td>
                <td><%= student.getBirthDate()%></td>
                <td><%= student.getBirthPlace()%></td>
                <td><%= student.getGender()%></td>
                <td>
                    <a href="studentdetail.doang?id=<%= student.getId() %>"
                       class="button1 bouncy">Detail</a>
                </td>
            </tr>
            <%}%>
            </tbody>
        </table>
    </div>

</section>
<%--footer--%>
<div class="made-with-love">
    <h3> Made with
        <i>♥</i> by
        <a target="_blank" href="https://github.com/ilhamdoanggg">Ilhamdoanggg</a></h3>
</div>

</body>
<%--
<script src="${pageContext.request.contextPath}/js/bootstrap.bundle.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>--%>
<script>
    $(window).on("load resize ", function() {
        var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();
        $('.tbl-header').css({'padding-right':scrollWidth});
    }).resize();
</script>
</html>

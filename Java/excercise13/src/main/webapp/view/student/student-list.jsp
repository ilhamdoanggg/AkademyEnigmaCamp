<%--
  Created by IntelliJ IDEA.
  User: ilham
  Date: 04/10/19
  Time: 15.44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html >
<head>
    <title>Hasil</title>
    <style>



        *,
        *:before,
        *:after {
        @include box-sizing(border-box);
        }

        html, body {
            background: #f1f1f1;
            font-family: 'Merriweather', sans-serif;
            padding: 1em;
        }

        h1 {
            text-align: center;
            color: #a8a8a8;
        @include text-shadow(1px 1px 0 rgba(white, 1));
        }

        form {
            max-width: 600px;
            text-align: center;
            margin: 20px auto;

        input, textarea {
            border:0; outline:0;
            padding: 1em;
        @include border-radius(8px);
            display: block;
            width: 100%;
            margin-top: 1em;
            font-family: 'Merriweather', sans-serif;
        @include box-shadow(0 1px 1px rgba(black, 0.1));
            resize: none;

        &:focus {
         @include box-shadow(0 0px 2px rgba($red, 1)!important);
         }
        }

        #input-submit {
            color: white;
            background: $red;
            cursor: pointer;

        &:hover {
         @include box-shadow(0 1px 1px 1px rgba(#aaa, 0.6));
         }
        }

        textarea {
            height: 126px;
        }
        }


        .half {
            float: left;
            width: 48%;
            margin-bottom: 1em;
        }

        .right { width: 50%; }

        .left {
            margin-right: 2%;
        }


        @media (max-width: 480px) {
            .half {
                width: 100%;
                float: none;
                margin-bottom: 0;
            }
        }


        /* Clearfix */
        .cf:before,
        .cf:after {
            content: " "; /* 1 */
            display: table; /* 2 */
        }

        .cf:after {
            clear: both;
        }

    </style>
</head>
<body>
<h1>  Saya request Student</h1>

<form action="student-submit" method="post" id="contact" class="cf">
    <label>id</label>
    <input type="text" name="id" id="input-name" placeholder="Id"  >
    <label>Nama</label>
    <input type="text" name="name" id="input-name" placeholder="Name" >

    <input type="submit" value="submit" id="input-submit">
</form>

<c:forEach items="${kirim}" var="st12">
    <h1>ID :<c:out value="${st12.id}" /></h1>
    <h1>Name :<c:out value="${st12.name}" /></h1>
</c:forEach>

<%--    <form action="student-submit" method="post">--%>
<%--        <input type="text" name="id">--%>
<%--        <input type="text" name="name">--%>
<%--        <input type="submit">--%>
<%--    </form>--%>
<%--<h1>INI STUDENT</h1>--%>

<%--    <h4>${kirim.id}</h4>--%>
<%--    <h4>${kirim.name}</h4>--%>
</body>
</html>
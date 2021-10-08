
<%--
  Created by IntelliJ IDEA.
  User: avinashkumar
  Date: 29/09/21
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
The Student ${student.firstName} ${student.lastName} is confirmed !!
<br><br>
Country: ${student.country}
<br><br>
Fauvorite Language: ${student.favouriteLanguage}
<br><br>
Operating Systems:
<ul>
    <c:forEach var="temp" items="${student.os}">
        <li> ${temp} </li>
    </c:forEach>
</ul>


</body>
</html>

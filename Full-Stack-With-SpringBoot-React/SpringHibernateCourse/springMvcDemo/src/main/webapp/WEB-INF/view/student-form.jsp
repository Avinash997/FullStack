<%--
  Created by IntelliJ IDEA.
  User: avinashkumar
  Date: 29/09/21
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    last name: <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">
<%--        <form:option value="Brazil" label="Brazil"/>--%>
<%--        <form:option value="France" label="France"/>--%>
<%--        <form:option value="India" label="India"/>--%>
        <form:options items="${student.countryOptions}"/>

    </form:select>
    <br><br>
    Favourite Language:
    Java <form:radiobutton path="favouriteLanguage" value="Java"/>
    C# <form:radiobutton path="favouriteLanguage" value="C#"/>
    Python <form:radiobutton path="favouriteLanguage" value="Python"/>
    PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
    <br><br>

    Operating Systems:
    Mac <form:checkbox path="os" value="Mac"/>
    Windows <form:checkbox path="os" value="Windows"/>
    Linux <form:checkbox path="os" value="Linux"/>

    <br><br>
    <input type ="submit" value="submit" />
    <br><br>
</form:form>

</body>
</html>

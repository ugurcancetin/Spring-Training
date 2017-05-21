<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Confirmation Page</title>
</head>
<body>
<h1>Confirmation List</h1>
<h3>Student First Name  : ${student.firstName}</h3>
<h3>Student Last Name   : ${student.lastName}</h3>
<h3>Country 			: ${student.country} </h3>
<h3>Favorite Language   : ${student.favLang} </h3>
<h3>Operating System    :  </h3>
<ul>
	<c:forEach var="temp" items="${student.os}">
		<li>${temp}</li>
	</c:forEach>
</ul>
</body>
</html>
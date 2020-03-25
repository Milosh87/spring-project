<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
	This is users.jsp
	<br/>
	${action}
	<table>
	<c:forEach items="${list}" var="user">
    	<tr>
    	<td>${user.username} </td>
    	<td>${user.password} </td>
    	<td>${user.firstname} </td>
    	<td>${user.lastname} </td>
    	 </tr>
</c:forEach>
</table>
</body>
</html>
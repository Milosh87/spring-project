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

<jsp:include page="../menu.jsp"></jsp:include>
	This is users.jsp
	<br/>
	${action}
	<table>
	<tr>
		<th>Username</th>
    	<th>Password </th>
    	<th>First name </th>
    	<th>Last name</th>
    	<th>User page</th>
	</tr>
	<c:forEach items="${list}" var="user">
		<c:url value="/user/userId" var="userId">
		<c:param name="id" value="${user.id}"></c:param>
		</c:url>
    	<tr>
    	<td>${user.username} </td>
    	<td>${user.password} </td>
    	<td>${user.firstname} </td>
    	<td>${user.lastname} </td>
    	<td><a href="${userId}">"${user.username}"</a> </td>
    	 </tr>
</c:forEach>
</table>
</body>
</html>
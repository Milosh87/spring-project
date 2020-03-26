<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User by id</title>
</head>
<body>
<jsp:include page="../menu.jsp"></jsp:include>
<table>
	<tr>
		<th>Username</th>
    	<th>Password </th>
    	<th>First name </th>
    	<th>Last name</th>
	</tr>
    	<tr>
    	<td>${userid.username} </td>
    	<td>${userid.password} </td>
    	<td>${userid.firstname} </td>
    	<td>${userid.lastname} </td>
    </tr>
    </table>
</body>
</html>
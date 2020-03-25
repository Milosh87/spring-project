<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<c:url value="/user/addModel" var="add"></c:url>
<c:url value="/user/users" var = "all"></c:url>

<a href="${add}">add</a>
<a href="${all}">all</a>
</body>
</html>
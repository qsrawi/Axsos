<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Name : <c:out value="${name}"></c:out></h1>
<h1>item name : <c:out value="${itemName}"></c:out></h1>
<h1>price: <c:out value="${price}"></c:out></h1>
<h1>description: <c:out value="${description}"></c:out></h1>
<h1>vendor : <c:out value="${vendor}"></c:out></h1>
</body>
</html>
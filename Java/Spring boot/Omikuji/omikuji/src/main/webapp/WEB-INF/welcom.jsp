<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Here's your Omikuji</h1>
<p>In <c:out value="${myNumber}"></c:out> years , 
you will live in <c:out value="${city}"></c:out> with <c:out value="${person}"></c:out> as your roommate,
<c:out value="${hoppy}"></c:out> for a living the next teim you see <c:out value="${living}"></c:out> ,
 you will have good luck .Also,<c:out value="${desc}"></c:out>
 </p>
 <a href="/Omikuji">Go Back</a>
</body>
</html>
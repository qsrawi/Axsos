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
<h1>Title is : <c:out value="${book.title}"></c:out></h1>
<h2>Language is : <c:out value="${book.language}"></c:out></h2>
<h2>Number of pages are : <c:out value="${book.numberOfPages}"></c:out></h2>
<h2>Descriptionn is : <c:out value="${book.description}"></c:out></h2>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Edit</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style>

</style>
</head>
<body>
	<h1><c:out value="${thisBook.title }"/></h1>
	<c:if test = "${thisBook.user.userName == thisUser.userName}"></c:if>
	<c:choose>
	    <c:when test="${thisBook.user.userName == thisUser.userName}">
			<p> 
				<h3 style="color:red">You</h3>
				read 
				<c:out value="${thisBook.title }"/>
				by
				<c:out value="${thisBook.author }"/>
			</p>
	        <br />
	    </c:when>    
	    <c:otherwise>
			<p>
				<c:out value="${ thisBook.user.userName}"/> 
				read 
				<c:out value="${thisBook.title }"/>
				by
				<c:out value="${thisBook.author }"/>
			
			</p>
	        <br />
	    </c:otherwise>
	</c:choose>
	
	<div></div>
	<p><c:out value="${thisBook.myThoughts }"/></p>
	<div></div>
	<c:if test="${thisBook.user.userName == thisUser.userName}">
		<a href="/books/${thisBook.id}/edit">Edit</a>
	</c:if>
</body>
</html>
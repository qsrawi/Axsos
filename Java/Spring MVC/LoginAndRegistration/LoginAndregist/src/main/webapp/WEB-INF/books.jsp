<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>books page</title>
 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <style>
 .container{
 display:flex;
 justify-content:space-between;
 }</style>
</head>
<body>
	<div class="container">
			<div>
				<h1>Welcome <c:out value="${thisUser.userName}"/></h1>
				<h1>All Books</h1>
			</div>
			<div>
			<a href="/logout">Logout</a>
			<a href="/books/new">Add a Book</a>
			</div>
		</div>
	<table class="table">
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author Name</th>
            <th>Posted By</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
    <tr>
    <td><c:out value="${book.id}" ></c:out></td>
    <td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
    <td><c:out value="${book.author}"></c:out></td>
    <td><c:out value="${book.user.userName}"></c:out></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
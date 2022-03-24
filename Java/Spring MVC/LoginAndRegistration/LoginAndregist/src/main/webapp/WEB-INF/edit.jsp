<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Edit Book</h1>
<a href="books">Go Back</a>
<form:form action="/books/${book.id}/edit" method="post" modelAttribute="book">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="title" >Title :</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>

    <p>
        <form:label path="author">Author :</form:label>
        <form:errors path="author"/>
        <form:input path="author"/>
    </p>
    <p>
        <form:label path="myThoughts">My Thoughts :</form:label>
        <form:errors path="myThoughts"/>
        <form:input  path="myThoughts"/>
    </p>
    
    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form>
</body>
</html>
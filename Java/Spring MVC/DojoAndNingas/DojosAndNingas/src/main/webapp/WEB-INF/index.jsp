<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
	form,h1{
	margin-left:520px}
</style>
</head>
<body>
<h1>Save Travels</h1>


<h1>Add an dojo:</h1>

<form:form action="/dojos/new" method="post" modelAttribute="dojo" >
    <p>
        <form:label path="name">name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>


    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form>   
   </body>
</html>
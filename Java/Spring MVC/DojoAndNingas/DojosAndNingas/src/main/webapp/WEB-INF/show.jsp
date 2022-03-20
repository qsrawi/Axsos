<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Page</title>
<style>
	form,h1{
	margin-left:520px}
</style>
</head>
<body>
<h1><c:out value="${dojo.name}"></c:out>Location Ninjas</h1>
<table  class="table">
 <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
       <c:forEach var="ninja" items="${dojo.ninjas}">
    <tr>
        <td><c:out value="${ninja.firstName}"></c:out></td>
        <td><c:out value="${ninja.lastName }"></c:out></td>
        <td><c:out value="${ninja.age }"></c:out></td>
    </tr>
    </c:forEach>
    </tbody>
</table>

  
   </body>
</html>
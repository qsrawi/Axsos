<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Show Project Details</title>
</head>
<body>
<h1>Project Details</h1>
<div class="container mt-5">
<a href="/dashborad" style="position: relative; left: 1000px">back to Projects</a> 
	<div class="row">
		<div class="card col-6 offset-3 border border-2 border-dark p-3">
		  <div class="card-header">
		    <span> <c:out value="${project.title}"> </c:out> </span>
		  </div>
		  <div class="card-body" >
		    <h5 class="card-title">	<c:out value="${project.description}"> </c:out> </h5>
		    <p class="card-text"> <c:out value="${project.dueDate}"></c:out></p>
		    <c:if test="${isJoined ==true}">
		    <a href="/projects/<c:out value="${project.id}/tasks"></c:out>" class="btn btn-info mt-2 float-start">See Tasks!</a>
		    </c:if>
		     <c:if test="${project.manager.firstName == thisUser.firstName}">
		     <form action="/delete/<c:out value="${project.id}"></c:out>" method="post" >
			    <input type="hidden" name="_method" value="delete">
			    <input type="submit" value="Delete" class="btn btn-danger mt-2 float-end">
			</form>
		  
		     </c:if>
		</div>
	   </div>
	 </div>
	</div>
</body>
</html>
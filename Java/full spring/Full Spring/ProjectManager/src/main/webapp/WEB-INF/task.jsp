<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Project Tasks</title>
</head>
<body>
<div style="display: flex; justify-content: space-between; padding: 20px">
<h1>Project: <c:out value="${project.title}"> </c:out></h1>
<h5>Project lead: <c:out value="${project.manager.firstName}"> </c:out></h5>
<a href="/dashborad">back to Projects</a>
</div>
	<div class="container mt-4 ">
	      <div class="row">
	        <div class="col-6 offset-3 border border-1 border-dark p-3 ">
				<form:form action="/projects/${project.id}/tasks" method="post" modelAttribute="task">
				
				<div class="form-group">
				<label>Add a Task ticket for this team:</label>
				<form:textarea path="ticket" class="form-control" row="3" />
				<form:errors path="ticket" class="text-danger" />
				</div>
				<input type="submit" value="Submit" class="btn btn-primary mt-2 float-end"  />
				</form:form>
				</div>
			</div>
		</div>
		<ul>
		<c:forEach var="task" items="${tasks}">
		<li>
		<h2>Added by
		<c:out value="${task.user.firstName}"/>
		at <c:out value="${task.createdAt}"/></h2>
		<h4><c:out value="${task.ticket}"/></h4>
		</li>
		</c:forEach>
		</ul>
</body>
</html>
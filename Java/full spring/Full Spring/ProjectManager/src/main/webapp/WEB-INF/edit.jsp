<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Edit Project</title>
</head>

<body>
<div style="display: flex; justify-content: space-between; padding: 20px">
<h1>Edit Project</h1>
<a href="/dashborad">back to Projects</a>
</div>
	<div class="container mt-4 ">
	      <div class="row">
	        <div class="col-6 offset-3 border border-1 border-dark p-3 ">
				<form:form action="/projects/edit/${project.id}" method="post" modelAttribute="project">
				<input type="hidden" name="_method" value="put">
				<div class="form-group">
				<label>Project Title</label>
				<form:input path="title" class="form-control" />
				<form:errors path="title" class="text-danger" />
				</div>
				<div class="form-group">
				<label>Project Description</label>
				<form:textarea path="description" class="form-control" row="3" />
				<form:errors path="description" class="text-danger" />
				</div>
				<div class="form-group">
				<label>Due Date</label>
				<form:input path="dueDate" class="form-control" type="Date" />
				<form:errors path="dueDate" class="text-danger" />
				</div>
				<input type="submit" value="Submit" class="btn btn-primary mt-2 float-end"  />
				</form:form>
				</div>
			</div>
		</div>
</body>
</html>
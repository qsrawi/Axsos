<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<nav style="display: flex; justify-content: space-between "
      class="navbar navbar-expand-lg navbar-light bg-light">
      <h1>Welcome, <c:out value="${thisUser.firstName }"></c:out></h1>
      <div>
        <button style="margin-right: 20px" class="btn btn-outline-primary my-4" type="submit">
          <a href="/projects/new" style="color: rgb(180, 165, 165)">Add Project</a>
        </button>
        <button class="btn btn-outline-danger my-2 my-sm-0" type="submit">
          <a href="/logout" logout style="color: rgb(185, 155, 155)">Logout</a>
        </button>
      </div>
    </nav>

<div class="container mt-5">
	<div class="row">
        <div class="col-6 offset-3 p-3">
			<h1>All Projects</h1>
		</div>
	</div>
      <div class="row">
        <div class="col-6 offset-3 border border-2 border-dark p-3">
          <table class="table table-striped">
            <thead>
              <tr>
                <th scope="col">Project</th>
                <th scope="col">Team Lead</th>
                <th scope="col">Due Date</th>
                <th scope="col">Actions</th>
              </tr>
            </thead>
            
            <tbody>
            	<c:forEach var="project" items="${notJoined}">
            	
				      
              <tr>
                <td><a href="/projects/<c:out value="${project.id}"></c:out> "><c:out value="${project.title}"></c:out></a></td>
                <td><c:out value="${project.manager.firstName}"></c:out></td>
                <td><c:out value="${project.dueDate}"> </c:out></td>
                <td><a href="/join/${project.id}">Join Team</a></td>
                </tr>
                
                </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
    </div>
    
    <div class="container mt-5">
	<div class="row">
        <div class="col-6 offset-3 p-3">
			<h1>My Projects</h1>
		</div>
	</div>
      <div class="row">
        <div class="col-6 offset-3 border border-2 border-dark p-3">
          <table class="table table-striped">
            <thead>
              <tr>
                <th scope="col">Project</th>
                <th scope="col">Lead</th>
                <th scope="col">Due Date</th>
                <th scope="col">Actions</th>
              </tr>
            </thead>
            <tbody>
            	<c:forEach var="project" items="${areJoined}">
            	
              <tr>
                <td><a href="/projects/<c:out value="${project.id}"></c:out> "><c:out value="${project.title}"></c:out></a></td>
                <td><c:out value="${project.manager.firstName}"></c:out></td>
                <td><c:out value="${project.dueDate}"> </c:out></td>
                <c:choose>
				    <c:when test="${project.manager.firstName == thisUser.firstName}">
				       <td> <a href="/projects/edit/${project.id }" >Edit</a></td>
				      
				    </c:when>    
				    <c:otherwise>
				        <td> <a href="/leave/${project.id}" >Leave team</a></td> 
				        
				    </c:otherwise>
				</c:choose>
                </tr>
                </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
    </div>
</body>
</html>
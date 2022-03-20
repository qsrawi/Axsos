<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<body>
 <div class="container mt-5">
      <div class="row">
        <div class="col-6 offset-3 border border-2 border-dark p-3">
          <table class="table table-striped">
            <thead>
              <tr>
                <th scope="col">Name</th>
                <th scope="col">Creator</th>
                <th scope="col">Version</th>
                <th scope="col">Action</th>
              </tr>
            </thead>
            <tbody>
            <c:forEach var="lang" items="${languages}">
            	<tr>
                <td> <c:out value="${lang.name}"> </c:out> </td>
                <td> <c:out value="${lang.creator}"> </c:out> </td>
                <td> <c:out value="${lang.version}"> </c:out> </td>
                <td> <a href="languages/${lang.id}/edit">edit</a></td>
                <td><form action="/languages/${lang.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
 </td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
       <div class="row">
       <form:form action="/languages" method="post" modelAttribute="language" >
       
    <p>
        <form:label path="name">Language name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator:</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="version">Version:</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
    </p>
   
    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form>
    
       
       </div>
    </div>
</body>
</html>
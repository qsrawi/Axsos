<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Category</title>
<style>
.h1{
margin:50px 300px;}
</style>
</head>
<body>
<div class="container">
<div  class="row h1">
<h1 class="col-6" ><c:out value="${product.name}"/></h1></div>

<div class="row align-items-center">
<h3>Categories</h3>
<ul class="col-4">
<c:forEach var="cat" items="${addedCategories}">
<li>
<c:out value="${cat.name}"/>
</li>
</c:forEach>
</ul>
<form:form action="/product/${product.id}" method="post" modelAttribute="category" class="col-4" >
<form:label path="id" >Add category</form:label>
	<form:errors path="id"/>
	<form:select path="id">
	  <c:forEach var="cat" items="${notIncluded}">
	  <form:option value="${cat.id}"><c:out value="${cat.name}"></c:out></form:option>
	  </c:forEach>
	</form:select>
	<input type="submit" value="Add" class="btn btn-primary"/>
	</form:form> 
</div>

</div>


    
        
  
    
</body>
</html>
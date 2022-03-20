<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Book</h1>
<a href="/expense">Go Back</a>
<form:form action="/expense/${expense.id}" method="post" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Expense Name :</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>

    <p>
        <form:label path="vendor">Vendor :</form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount :</form:label>
        <form:errors path="amount"/>     
        <form:input type="number" path="amount"/>
    </p>    
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form>
</body>
</html>
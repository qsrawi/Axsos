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
<table  class="table">
 <thead>
    <tr>
        <th>Expense</th>
        <th>Vendor</th>
        <th>Amount</th>
        <th>Action(Edit)</th>
        <th>Action(Delete)</th>
    </tr>
    </thead>
    <tbody>
       <c:forEach var="expense" items="${expenses}">
    <tr>
        <td><c:out value="${expense.name}"></c:out></td>
        <td><c:out value="${expense.vendor }"></c:out></td>
        <td><c:out value="${expense.amount }"></c:out></td>
        <td><a href="/expense/${expense.id}/edit">Edit</a></td>
        <td><form action="/expense/${expense.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form></td>
    </tr>
    </c:forEach>
    </tbody>
</table>

<h1>Add an expense:</h1>

<form:form action="/expense" method="post" modelAttribute="expense" >
    <p>
        <form:label path="name">Expense name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="vendor">Vendor:</form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount:</form:label>
        <form:errors path="amount"/>
        <form:input path="amount"/>
    </p>
    <p>
        <form:label path="description">Description:</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>

    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form>   
   </body>
</html>
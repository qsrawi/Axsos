<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link rel="stylesheet" type="text/css" href="/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1 class="h1">Send an Omikuji</h1>
<form action="/show", method="post">
	<p>Pick any number for 5 to 25 </p>
	<select name="myNumber">
	 <% for(int i = 5; i < 26; i++) { %>
        <option value= <%= i %>> <%= i %> </option>
    <% } %>
	</select>
	<p>Enter the name of any city</p>
	<input type="text" name="city">
	<p>Enter the name of real person</p>
	<input type="text" name="person">
	<p>Enter a professional endeavor or hobby </p>
	<input type="text" name="hoppy">
	<p>Enter any type of living thing </p>
	<input type="text" name="living">
	<p>Say something nice to anyone </p>
	<textarea name="desc"></textarea>
	<button type="submit" class="btn btn-primary">Send</button>
</form>
</body>
</html>
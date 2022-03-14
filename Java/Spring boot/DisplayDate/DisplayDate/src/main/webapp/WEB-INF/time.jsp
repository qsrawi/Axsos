<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time Template</title>
<script type="text/javascript" src="js/js.js"></script>
<style>
p{
	margin:15% 38%;
	font-size:24pt;
	color:green;
}
</style>
</head>
<body>
<c:set var="now" value="<%=new java.util.Date()%>" />
<p><fmt:formatDate type="time"  value="${now}" /></p>

</body>
</html>
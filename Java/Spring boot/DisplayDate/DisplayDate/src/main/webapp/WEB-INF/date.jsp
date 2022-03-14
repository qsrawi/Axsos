<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/js.js"></script>
<style>
p{
	margin:15% 38%;
	font-size:24pt;
	color:blue;
}
</style>
</head>
<body>
<c:set var="now" value="<%=new java.util.Date()%>" />
<p><fmt:formatDate pattern="EEEEEEEE,dd-MMMMM-yyyy" value="${now}" /></p>

</body>
</html>
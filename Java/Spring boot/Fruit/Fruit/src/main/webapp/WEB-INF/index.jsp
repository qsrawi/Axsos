<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruits</title>
</head>
<body>
<table>
<c:forEach var="fruit" items="${allFruits}">
<tr>
<td><c:out value="${fruit.getName()}"> </c:out></td>
<td><c:out value="${fruit.getPrice()}"> </c:out></td>

    </c:forEach>
</tr>
</table>
</body>
</html>
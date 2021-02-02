<%-- <%@ page contentType="text/html;charset=UTF-8" language="java" %> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    
    <title>All Flights</title>
</head>
<body>
    <h1>All Flights</h1>
    <table border="1">
		
		<tr>
			<th>sourcePlace</th>
			<th>destinationPlace</th>

		</tr>
		<c:forEach var="p" items="${flightList}">
			<tr>
				<td>${p.sourcePlace}</td>
				<td>${p.destinationPlace}</td>
				<td><button>Confirm</button>
			</tr>
		</c:forEach>
</table>

</body>
</html>
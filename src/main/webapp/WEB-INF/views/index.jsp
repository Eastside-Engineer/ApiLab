<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consume API Lab</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>List of Tech Inventors</h1>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Name</th>
					<th>Invented</th>
					<th>Year</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tech" items="${ tiny }">
					<tr>
						<td>${ tech.name }</td>
						<td>${ tech.invented }</td>
						<td>${ tech.year }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<form action="/wholelist">
			<button class="button">More info</button>
		</form>
	</div>


</body>
</html>
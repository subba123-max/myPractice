<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
	crossorigin="anonymous"></script>
<title>Insert Book</title>
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<c:if test="${not empty successmsg }">
		<div class="alert alert-warning text-center " role="alert">
			${successmsg }</div>
		<c:remove var="successmsg" scope="request" />
	</c:if>
	<c:if test="${not empty errormsg }">
		<div class="alert alert-danger text-center" role="alert">
			${errormsg }</div>
		<c:remove var="errormsg" scope="request" />
	</c:if>
	<form action="insertbook" method="post" enctype="multipart/form-data">
		<table align="center">
			<tr>
				<td>Book Title</td>
				<td><input type="text" name="name" /></td>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td>Image</td>
				<td><input type="file" name="image" /></td>
			</tr>
			<tr>
				<td>Description</td>

				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Insert" class="btn btn-success" />
				</td>
				<td><a href="book.jsp" class="btn btn-primary">Back</a></td>
			</tr>
		</table>
	</form>
</body>
</html>
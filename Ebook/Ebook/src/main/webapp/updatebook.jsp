<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>update Book</title>
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<form action="updatebookdetails" method="post">

		<table align="center">
			<h5 class=" text-center text-success">${updatemsg}</h5>
			<h5 class=" text-center text-danger">${errormsg}</h5>


			<tr>
				<td>Book Id</td>
				<td>${book.id }</td>
				<td><input type="hidden" name="id" value="${book.id }" /></td>
			<tr>
			<tr>
				<td>Book Title</td>
				<td><input type="text" name="name" value="${book.name }"
					readonly /></td>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price" value="${book.price }" />
				</td>
			</tr>
			<tr>
				<td>Image</td>
				<td><input type="file" name="image" value="${book.image}"readonly / >
				</td>
			</tr>
			<tr>
				<td>Description</td>

				<td><textarea rows="4" cols="25" name="description">${book.description}</textarea>
				</td>
			</tr>
			<tr>
			<tr>
				<td></td>
				<td><input type="submit" value="update" class="btn btn-success" />
				</td>
				<td><a href="book.jsp" class="btn btn-primary">Back</a></td>
			</tr>
		</table>
	</form>
</body>
</html>
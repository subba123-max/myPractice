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
<!-- Google Fonts -->
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900'
	rel='stylesheet' type='text/css'>
<link href="${pageContext.request.contextPath}/resources/css/Main.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<title>Ebook</title>
</head>
<body>
	<form method="post" action="register">
		<div class="container">
			<div class="top">
				<h1 id="title" class="hidden">
					<span id="logo">Book World </span>
				</h1>
			</div>
			<div class="login-box animated fadeInUp">
				<div class="box-header">
					<h2>Register</h2>
				</div>
				<h5 class="text-success text-center">${msg}</h3>
					<table align="center">
						<tr>
							<td><label class="text-primary fw-bold text-left">Fullname</label>
							</td>
							<td><input type="text" name="fullname" placeHolder="" /></td>
						</tr>
						<tr>
							<td><label class="text-primary fw-bold">email</label></td>
							<td><input type="text" name="email" placeHolder="" /></td>
						</tr>
						<tr>
							<td><label class="text-primary fw-bold">Phone</label></td>
							<td><input type="text" name="phone" placeHolder="" /></td>
						</tr>
						<tr>
							<td><label class="text-primary fw-bold">Gender</label></td>
							<td><input type="radio" name="gender" value="Male" />Male <input
								type="radio" name="gender" value="Female" />Female</td>
						</tr>
						<tr>
							<td><label class="text-primary fw-bold">Date-Of-Birth</label>
							</td>
							<td><input type="text" name="dob" placeHolder="" /></td>
						</tr>
						<tr>
							<td><label class="text-primary fw-bold">UserName</label></td>
							<td><input type="text" name="username" placeHolder="" /></td>
						</tr>
						<tr>
							<td><label class="text-primary fw-bold">password</label></td>
							<td><input type="text" name="password" placeHolder="" /></td>
						</tr>
					</table>
					<input type="submit" value="register" class="btn btn-success" />
					<h6>
						Already have account?<a href="login.jsp" class="text-primary">Login
							here..</a>
					</h6>
			</div>
		</div>
	</form>
</body>
</html>
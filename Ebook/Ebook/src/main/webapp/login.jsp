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
	<form class="login-form" method="post" action="login">
		<div class="container">
			<div class="top">
				<h1 id="title" class="hidden">
					<span id="logo">Book World </span>
				</h1>
			</div>
			<div class="login-box animated fadeInUp">
				<div class="box-header">
					<h2>Log In</h2>
				</div>
				<c:if test="${not empty msg }">
					<div class="alert alert-success" role="alert">${msg}</div>
					<c:remove var="msg" scope="session" />
				</c:if>
				<c:if test="${not empty errorMsg }">
					<div class="alert alert-danger" role="alert">${errorMsg}</div>
					<c:remove var="errorMsg" scope="session" />
				</c:if>
				<%-- <h5 class="text-center text-success">${msg}</h5>

			<h5 class="text-center text-primary  alert-danger" >${errorMsg}</h5>
			 --%>
				<table align="center">
					<tr>
						<td><label class="text-primary fw-bold text-uppercase">UserName</label>
						</td>
						<td><input type="text" name="username" /></td>
					</tr>
					<tr>
						<td><label class="text-primary fw-bold">Password</label></td>
						<td><input type="password" name="password" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="login"
							class="btn btn-success" /></td>
					</tr>
				</table>
				<a href="#"><p class="small">Forgot your password?</p></a> <span
					class="text-secondary">New User?<a href="Register.jsp"
					class="text-primary">Register</a></span>
			</div>
		</div>
	</form>
</body>


</html>







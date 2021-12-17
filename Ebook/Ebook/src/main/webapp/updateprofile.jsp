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

	<form method="post" action="updateprofile">
		<div class="container">
			<div class="top">
				<h1 id="title" class="hidden">
					<span id="logo">Book World </span>
				</h1>
			</div>
			<div class="login-box animated fadeInUp">
				<div class="box-header">
					<h2>Update Profile</h2>
				</div>
				<table>
					<h4 class="text-center text-success">${UpdateMsg }</h4>
					<h4 class="text-center text-danger">${errorMsg }</h4>
					<tr>
						<td><label class="text-primary fw-bold">UserID</label></td>
						<td>${userdata.userid}</td>
						<input type="hidden" name="userid" value="${userdata.userid}" />
						<td></td>
					</tr>
					<tr>
						<td><label class="text-primary fw-bold">Fullname</label></td>
						<td><input type="text" name="fullname"
							value="${userdata.fullname}" /></td>
					</tr>
					<tr>
						<td><label class="text-primary fw-bold">email</label></td>
						<td><input type="text" name="email" value="${userdata.email}" />
						</td>
					</tr>
					<tr>
						<td><label class="text-primary fw-bold">Phone</label></td>
						<td><input type="text" name="phone" value="${userdata.phone}" />
						</td>
					</tr>
					<tr>
						<td><label class="text-primary fw-bold">Gender</label></td>
						<td><input type="text" name="gender"
							value="${userdata.gender}" readonly /></td>
					</tr>
					<tr>
						<td><label class="text-primary fw-bold">Date-Of-Birth</label>
						</td>
						<td><input type="text" name="dob" value="${userdata.dob}"
							readonly /></td>
					</tr>
					<tr>
						<td><label class="text-primary fw-bold">UserName</label></td>
						<td><input type="text" name="username"
							value="${userdata.username}" /></td>
					</tr>
					<tr>
						<td><label class="text-primary fw-bold">password</label></td>
						<td><input type="password" name="password"
							value="${userdata.password} " readonly /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="update"
							class="btn btn-success" /></td>
					</tr>
				</table>

			</div>
		</div>

	</form>

</body>
</html>
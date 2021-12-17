<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.java.DTO.UsersDTO"%>
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
<link
	href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/fontawesome.css'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="icon"
	href="${pageContext.request.contextPath}/resources/images/c.png"
	type="image/png" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>
	<%
	UsersDTO user = (UsersDTO) session.getAttribute("userData");
	%>
	<nav class="navbar navbar-expand-lg navbar-light "
		style="background-color: #e3f2fd;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Book <i class="fa fa-book"
				aria-hidden="true"></i> World
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02"
				aria-controls="navbarTogglerDemo02" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#"></a></li>
					<li class="nav-item"><a class="nav-link" href="#"></a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#"
						tabindex="-1" aria-disabled="true"></a></li>
				</ul>


				<div class=" container justify-content-end  d-flex">
					<div>

						<a href="editprofile" class="nav-link" title="Edit Profile"><i
							class="fa fa-user" aria-hidden="true"></i> ${userdata.fullname}</a>
					</div>
					<div>
						<a class="nav-link  " href="logout"><i
							class="fa fa-sign-out fa-1x" aria-hidden="true"></i> Logout</a>
					</div>
					<%
					if (user.getUsername().equals("admin")) {
					%>
					<div>
						<a class="nav-link  " href="insertbook.jsp"><i
							class="fa fa-product-hunt" aria-hidden="true"></i> Add Product</a>
					</div>
					<%
					} else {
					%>

					<div>
						<%-- <form action="showcart" method="post">
             	<input type="hidden" value="<%=user.getUserid()%>" name="userid"/>
             	<input type="submit" class="nav-link" value="My cart" /><i class="fa fa-cart-plus" aria-hidden="true"></i>
             	</form> --%>
						<a class="nav-link  " href="showcart?userid=<%=user.getUserid()%>"><i
							class="fa fa-cart-plus" aria-hidden="true"></i> My Cart</a>
					</div>
					<%
					}
					%>
				</div>
			</div>
		</div>
	</nav>
</body>
</html>
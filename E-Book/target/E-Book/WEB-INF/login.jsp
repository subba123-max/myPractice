<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
        <link href="${pageContext.request.contextPath }/src/main/webapp/WEB-INF/resources/css/Main.css" rel="stylesheet">
    
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<%-- <link href="<c:url value="/resources/css/Main.css" />">
 --%>
<title>E-book</title>
<style type="text/css">

body {
	background: url("./resources/images/photo_bg.jpg" ) no-repeat center center fixed;
	background-size: cover;
	font-size: 16px;
	font-family: 'Lato', sans-serif;
	font-weight: 300;
	margin: 0;
	color: #666;
}

/* Typography */
h1#title {
	font-family: 'Roboto Slab', serif;
	font-weight: 300;
	font-size: 3.2em;
	color: white;
	text-shadow: 0 0 10px rgba(0,0,0,0.8);
	margin: 0 auto;
	max-width: 300px;
	text-align: center;
	position: relative;
	top: 0px;
}

h1#title span span {
	font-weight: 400;
}

h2 {
	text-transform: uppercase;
	color: white;
	font-weight: 400;
	letter-spacing: 1px;
	font-size: 1.4em;
	line-height: 2.8em;
}

a {
	text-decoration: none;
	color: #666;
}

a:hover {
	color: #aeaeae;
}

p.small {
	font-size: 0.8em;
	margin: 20px 0 0;
}


/* Layout */
.container {
	margin: 0;
}

.top {
	margin: 0;
	padding: 0;
	width: 100%;
	background: -moz-linear-gradient(top,  rgba(0,0,0,0.6) 0%, rgba(0,0,0,0) 100%); /* FF3.6-15 */
	background: -webkit-linear-gradient(top,  rgba(0,0,0,0.6) 0%,rgba(0,0,0,0) 100%); /* Chrome10-25,Safari5.1-6 */
	background: linear-gradient(to bottom,  rgba(0,0,0,0.6) 0%,rgba(0,0,0,0) 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#99000000', endColorstr='#00000000',GradientType=0 ); /* IE6-9 */
}

.login-box {
	background-color: white;
	max-width: 340px;
	margin: 0 auto;
	position: relative;
	top: 10px;
	padding-bottom: 30px;
	border-radius: 5px;
	box-shadow: 0 5px 50px rgba(0,0,0,0.4);
	text-align: center;
}

.login-box .box-header {
	background-color: #665851;
	margin-top: 0;
	border-radius: 5px 5px 0 0;
}

.login-box label {
	font-weight: 700;
	font-size: .8em;
	color: #888;
	letter-spacing: 1px;
	text-transform: uppercase;
	line-height: 2em;
}

.login-box input {
	margin-bottom: 20px;
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 2px;
	font-size: .9em;
	color: #888;
}

.login-box input:focus {
	outline: none;
	border-color: #665851;
	transition: 0.5s;
	color: #665851;
}

.login-box button {
	margin-top: 0px;
	border: 0;
	border-radius: 2px;
	color: white;
	padding: 10px;
	text-transform: uppercase;
	font-weight: 400;
	font-size: 0.7em;
	letter-spacing: 1px;
	background-color: #665851;
	cursor:pointer;
	outline: none;
}

.login-box button:hover {
	opacity: 0.7;
	transition: 0.5s;
}

.login-box button:hover {
	opacity: 0.7;
	transition: 0.5s;
}

.selected {
	color: #665851!important;
	transition: 0.5s;
}

/* Animation Delay */
#logo {
  -webkit-animation-duration: 1s;
  -webkit-animation-delay: 2s;
}

.login-box {
  -webkit-animation-duration: 1s;
  -webkit-animation-delay: 1s;
}

/* books page css*/

.cardimg{
	width: 100% !important;
	height:100% !important;
}


</style>
</head>
<body>
      <form class="login-form" method="post" action="login">
    <div class="container">
		<div class="top">
			<h1 id="title" class="hidden"><span id="logo">Book World </span></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Log In</h2>
			</div>
			<c:if test="${not empty msg }">
			<div class="alert alert-success" role="alert">${msg}</div>
			<c:remove var="msg" scope="request"/>
			</c:if>
			<c:if test="${not empty errorMsg }">
			<div class="alert alert-danger" role="alert">${errorMsg}</div>
			<c:remove var="errorMsg" scope="session"/>
			</c:if>
			<%-- <h5 class="text-center text-success">${msg}</h5>

			<h5 class="text-center text-primary  alert-danger" >${errorMsg}</h5>
			 --%>
			<table align="center">
			<tr>
			<td>
			<label class="text-primary fw-bold text-uppercase">UserName</label>
			</td>
			<td>
			
			<input  type="text" name="username" />
			</td>
			</tr>
			<tr>
			<td>
			<label class="text-primary fw-bold">Password</label>
			</td>
			<td>
			<input type="password" name="password" />
			</td>
			</tr>
			<tr>
			<td></td>
			<td>
			<input type="submit" value="login" class="btn btn-success"/>
			</td>
			</tr>
			</table>
			<a href="#"><p class="small">Forgot your password?</p></a>
			<span class="text-secondary">New User?<a href="register" class="text-primary">Register</a></span>
		</div>
	</div>
	</form>
    </body>
    
    
</html>







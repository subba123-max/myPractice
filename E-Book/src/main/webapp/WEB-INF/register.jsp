<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
	  <link href="./resources/css/Main.css" rel="stylesheet" type="text/css">
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-Book</title>
</head>
<style type="text/css">
.pb{
padding-bottom: 20px !important;
}
.ml{
    margin-left: 20px !important;
}

</style>
<body>

<div align="center">
<form:form action="save" modelAttribute="user" method="post">
 <div class="container">
		<div class="top">
			<h1 id="title" class="hidden"><span id="logo">Book World </span></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Register</h2>
			</div>
<table class="ml">
<tr>
<td class="pb fw-bold ">FullName</td>
<td><form:input path="fullname"/></td>

</tr>
<tr>
<td class="pb fw-bold ">Email</td>
<td><form:input path="email"/></td>
</tr>	
<tr>
<tr>
<td class=" pb fw-bold ">Phone</td>
<td><form:input path="phone"/></td>
</tr>	
<tr>
<td class=" pb fw-bold ">Dob</td>
<td><form:input path="dob"/></td>
</tr>
<tr>
<td class=" pb fw-bold ">Gender</td>
<td><form:radiobutton path = "gender" value = "Male" />Male</td>
<td> <form:radiobutton path = "gender" value = "FeMale" />FeMale</td>
</tr>
<tr>
<td class=" pb fw-bold ">UserName</td>
<td><form:input path="username" /></td>
</tr>

<tr>
<td class=" pb fw-bold ">password</td>
<td><form:input type="password" path="password" /></td>
</tr>
</table>
<input type="submit" value="register " class="btn btn-success">
<h5 class=" text-primary" >Already have Account? <a href="/E-Book/" class="text-danger text-decoration-none">Login here...</a></h5>

</div>
</div>
</form:form> 
</body>
</html>
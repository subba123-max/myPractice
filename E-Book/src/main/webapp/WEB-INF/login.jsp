<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
               <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
               
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
             
  <link href="./resources/css/Main.css" rel="stylesheet" type="text/css">
<title>E-book</title>
<style type="text/css">
.pb{
 padding-bottom: 40px !important
 }

</style>

</head>
<body>
 <div align="center">
<form action="login"  method="post">
 <div class="container">
		<div class="top">
			<h1 id="title" class="hidden"><span id="logo">Book World </span></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Login</h2>
			</div>
<table>
<tr>
<td class="p-4 pb text-primary fw-bold " >Username</td>
<td><input type="text" name="username" placeholder="Username" /> </td>

</tr>
<tr>
<td class="p-4 pb text-primary fw-bold " >Password</td>
<td><input type="password" name="password" placeholder="Password"/></td>
</tr>	

</table>
<input type="submit" value="login " class="btn btn-success">
<a href="#"><p class="small">Forgot your password?</p></a>
			<span class="text-secondary">New User?<a href="register" class="text-primary">Register</a></span>
</div>
</div>
</form> 

    </body>
    
    
</html>







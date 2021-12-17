<%@page import="com.java.DTO.UsersDTO"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.java.DTO.ProductDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
	crossorigin="anonymous"></script>
<link
	href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/fontawesome.css'
	rel='stylesheet' type='text/css'>
<%-- 	<link href="${pageContext.request.contextPath}/resources/css/Main.css" rel="stylesheet">
 --%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://unpkg.com/feather-icons"></script>
</head>
<body style="background-color: #f0fcf8">
	<%
	UsersDTO user = (UsersDTO) session.getAttribute("userData");
	%>
	<jsp:include page="navbar.jsp"></jsp:include>
	<c:if test="${not empty deletemsg }">
		<div class="alert alert-danger text-center " role="alert">
			${deletemsg }</div>
		<c:remove var="deletemsg" scope="request" />
	</c:if>
	<c:if test="${not empty cartmsg }">
		<div class="alert alert-primary text-center " role="alert">
			${cartmsg }</div>
		<c:remove var="cartmsg" scope="request" />
	</c:if>

	<div class="container-fluid " style="margin-top: 10px">
		<div class="row w-100 p-0 w-0">
			<%
			ArrayList<ProductDTO> obj = (ArrayList<ProductDTO>) session.getAttribute("books");

			if (obj != null) {

				for (ProductDTO book : obj) {
			%>

			<div class=" col-md-4 col-sm-6 col-xs-12">

				<div class="card card-ho" style="width: 18rem; margin: 40px 20px">
					<img
						src="${pageContext.request.contextPath}/resources/images/<%=book.getImage() %>"
						class="card-img-top" style="height: 330px" alt="image"
						width="auto" />

					<div class="card-body ">
						<h5 class="card-title"><%=book.getName()%></h5>
						<p class="card-text"><%=book.getDescription()%></p>
						<h5 class="card-title"><%=book.getPrice()%>
							Rs/-
						</h5>
						<%
						if (user.getUsername().equals("admin")) {
						%>

						<%--  <form action="editbookdetails" method="post" >
		        
		    <input type="hidden" value="<%=book.getId()%>" name="id"/>
		    <input type="submit" value="updatebookdetails"  class="btn btn-success" />
		    </form> --%>
						<a href="editbookdetails?id=<%=book.getId()%>"
							class="btn btn-success">updatebookdetails</a> <a
							href="removebook?id=<%=book.getId()%>" class="btn btn-danger">Remove</a>
						<%-- <form action="removebook" method="get"> 
		        
		    <input type="hidden" value="<%=book.getId()%>"name="id" />
		    <input type="submit" value="Remove"  class="btn btn-danger"/>
		    </form>  --%>

						<%
						} else {
						%>
						<form action="addtoCart" method="post">

							<input type="hidden" value="<%=book.getId()%>" name="bookid" />
							<input type="hidden" value="<%=user.getUserid()%>" name="userid" />
							<input type="submit" value="AddToCart" class="btn btn-primary" />
						</form>
						<%-- 		    <a href="cart?bid=<%=book.getId()%>&&uid=<%=user.getUserid() %>" class="btn btn-success">AddToCart</a>
 --%>
						<%
						}
						%>
					</div>
				</div>
			</div>



			<%
			}
			}
			%>
		</div>
	</div>
</body>
</html>
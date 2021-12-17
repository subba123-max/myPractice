<%@page import="com.java.DTO.CartDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.DTO.UsersDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<c:if test="${not empty deletemsg }">
		<div class="alert alert-warning text-center " role="alert">${deletemsg}</div>
		<c:remove var="deletemsg" scope="request" />
	</c:if>
	<div calss="container">
		<div class="row">
			<%
			UsersDTO user = (UsersDTO) session.getAttribute("userData");
			%>
			<div class="col-md-6 col-sm-6 col-xs-12"
				style="margin: 30px 40px; box-shadow: 0px 0px 5px rgb(0 0 0/ 40%); width: 40%">
				<table class="table">
					<thead>
						<tr class="text-uppercase">
							<th scope="col">item</th>
							<th scope="col">Name</th>
							<th scope="col">price</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<%
					ArrayList<CartDTO> items = (ArrayList<CartDTO>) session.getAttribute("items");
					double totalPrice = 0;
					if (items != null) {

						for (CartDTO item : items) {
							totalPrice += item.getTotalprice();
					%>
					<tbody>
						<tr>
							<th scope="row"><%=item.getId()%></th>
							<td><%=item.getBookName()%></td>
							<td><%=item.getPrice()%></td>
							<td><a
								href="deleteitem?id=<%=item.getId()%>&&userid=<%=user.getUserid()%>"
								class="text-danger "><i class="fa fa-trash"
									aria-hidden="true"></i></a></td>
						</tr>
					</tbody>
					<tr>


					</tr>
					<%
					}
					%>
					<td>TotalPrice</td>
					<td></td>
					<td></td>
					<td><%=totalPrice%></td>
					<%
					}
					%>

				</table>
			</div>
			<div class="col-md-6 col-sm-6 col-xs-12"
				style="margin: 30px 40px; box-shadow: 0px 0px 5px rgb(0 0 0/ 40%); width: 40%">
				<form action="checkout" method="post">
					<div class="container">
						<div class="row">
							<div class="col-md-4 col-sm-12 col-xs-12">
								<div class="mb-3 mt-3">
									<input type="text" class="form-control" name="door"
										placeholder="Door NO.">
								</div>
							</div>
							<div class="col-md-4 col-sm-12 col-xs-12">
								<div class="mb-3 mt-3">
									<input type="text" class="form-control" name="street"
										placeholder="street">
								</div>
							</div>
							<div class="col-md-4 col-sm-12 col-xs-12">
								<div class="mb-3 mt-3">
									<input type="text" class="form-control" name="area"
										placeholder="area">
								</div>
							</div>
							<div class="col-md-4 col-sm-12 col-xs-12">
								<div class="mb-3 mt-3">
									<input type="text" class="form-control" name="district"
										placeholder="District">
								</div>
							</div>
							<div class="col-md-4 col-sm-12 col-xs-12">
								<div class="mb-3 mt-3">
									<input type="text" class="form-control" name="state"
										placeholder="state">
								</div>
							</div>
							<div class="col-md-4 col-sm-12 col-xs-12">
								<div class="mb-3 mt-3">
									<input type="text" class="form-control" name="zip"
										placeholder="zip">
								</div>
							</div>
							<div class="col-md-12 col-sm-12 col-xs-12" align="center">
								<div class="mb-3 mt-3">
									<div>
										<label>Payment mode</label>
									</div>
									<select name="payment" class="mt-2">
										<option value="phonepay">----select----</option>
										<option value="cod">COD</option>
										<option value="phonepay">Phonepay</option>
										<option value="creditcard">CreditCard</option>
										<option value="debitcard">DebitCard</option>

									</select>
								</div>
							</div>
							<div class="col-md-6 col-sm-12 col-xs-12">
								<div class="mb-3 mt-3">
									<input type="submit"
										class="nav-link btn btn-warning text-danger" value="Check Out" />
								</div>
							</div>
							<div class="col-md-6 col-sm-12 col-xs-12">
								<div class="mb-3 mt-3">
									<a class="nav-link btn btn-success text-white" href="book.jsp">Continue
										Shopping</a>
								</div>
							</div>
						</div>
					</div>
				</form>

			</div>
		</div>

	</div>


</body>
</html>
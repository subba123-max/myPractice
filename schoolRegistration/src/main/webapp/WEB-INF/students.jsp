<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.java.model.*" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="border:2px solid black;">
<thead style="background-color: yellow;">
<th>ID</th>
<th>FullName</th>
<th>LastName</th>
<th>Age</th>
<th>City</th>
<th>Actions</th>

</thead>
<% List<Student> list=(List<Student>)session.getAttribute("studentinfo");
if(list != null){
	for(Student stu:list){
%>

<tbody>
<tr  style="background-color:silver;color: white;" >
<td><%=stu.getId() %></td>
<td><%=stu.getFname()%></td>
<td><%=stu.getLname() %></td>
<td><%=stu.getAge() %></td>
<td><%=stu.getCity() %></td>
<td style="background-color:orange;"><a href="edit?id=<%=stu.getId()%>" style="color: white">Update</a></td>
<td style="background-color:orange;"><a href="delete?id=<%=stu.getId()%>" style="color: white;">Delete</a></td>
</tr>
</tbody>

<%} }%>
</table>

<c:if test="${not empty studentinfo }">
<c:forEach items="${studentinfo}" var="student">
<tr>
<td><c:out value="${student.fname }"/> </td>
</tr>
</c:forEach>
</c:if>
</body>
</html>
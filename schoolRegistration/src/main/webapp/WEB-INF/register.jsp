<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{

color: red;
}
</style>
</head>
<body>

<div align="center">
<form:form action="save" modelAttribute="student" method="post">
<table>
<tr>
<td>fname:</td>
<td><form:input path="fname"/></td>
<td><form:errors path="fname" cssClass="error"/></td>
</tr>
<tr>
<td>lname:</td>
<td><form:input path="lname"/></td>
<td><form:errors path="lname" cssClass="error"/></td>

</tr>
	
<tr>
<td>age:</td>
<td><form:input path="age"/></td>
<td><form:errors path="age" cssClass="error"/></td>
</tr>
<tr>
<td>city:</td>
<td><form:input path="city" /></td>
<td><form:errors path="city" cssClass="error"/></td>

</tr>

</table>
<input type="submit" value="register here">
</form:form>
</div>
</body>
</html>
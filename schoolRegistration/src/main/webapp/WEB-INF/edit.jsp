<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<form:form method="post" action="update" modelAttribute="stu" >
<table>
<tr>
<td><form:hidden path="id" /></td>
</tr>
<tr>
<td>fname:</td>
<td><form:input path="fname" /></td>
</tr>
<tr>
<td>lname:</td>
<td><form:input path="lname"/></td>
</tr>
	
<tr>
<td>age:</td>
<td><form:input path="age"/></td>
</tr>
<tr>
<td>city:</td>
<td><form:input path="city" /></td>
</tr>
</table>
<input type="submit" value="update">
</form:form>
</div>
</body>
</html>
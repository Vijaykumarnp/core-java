<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to our Application</h1>
<h2>the Laptop name is ${name}</h2>
<a href="listofLaptops">List Of Laptops</a>
<table border="5" >
<tr>
<th>companyName</th>
<th>ModelNo</th>
<th>color</th>
<th>Generation</th>
<th>Ram</th>
</tr>
<ref:forEach items="${laptops}" var = "laptop">
<tr>
<td>${laptop.getCompanyName()}</td>
<td>${laptop.getModelNo()}</td>
<td>${laptop.getColor()}</td>
<td>${laptop.getGeneration()}</td>
<td>${laptop.getRam()}</td>
</tr>
</ref:forEach>
</table>
</tr>


</body>
</html>
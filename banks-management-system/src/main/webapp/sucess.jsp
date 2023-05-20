<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
body {
	background-image: url("https://c0.wallpaperflare.com/preview/309/325/276/bank-banking-banknotes-blur.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
	
	
	}
     
</style>

</head>
<body>
<h1 style="color: pink">welcome to our Application</h1>
<h2 style="color:yellow; ">thank you for creating account in our bank ${name}</h2>


<form action="search" method="get">
<input type="text" name = "coustomerName"   placeholder="EnterCustomerName">
<button>SEARCH</button>
<br>

</form>

<a href="listofCustomers"  style="color:aqua; ">List Of customers</a>
<table border="5" style="color:buttonface; " >
<tr>
<th>Id</th>
<th>CustomerName</th>
<th>PhoneNo</th>
<th>AdharNo</th>
<th>Adress</th>

<th>ACTION</th>
<th>ACTION-1</th>
</tr>
<ref:forEach items="${customers}" var = "customer">
<tr>
<td>${customer.getId()}</td>
<td>${customer.getCustomerName()}</td>
<td>${customer.getPhoneNo()}</td>
<td>${customer.getAdharNO()}</td>
<td>${customer.getAdress()}</td>

<td><a href="update/${customer.getId()}">Update</a></td>
<td><a href="delete/${ customer.getId()}">Delete</a></td>
</tr>
</ref:forEach>
</table>


</body>
</html>
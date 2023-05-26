<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{


background-image: url("https://i.rtings.com/assets/pages/6S2WXjTl/best-laptop-medium.jpg");
background-size: 100%;
background-repeat: no-repeat;
}

div{
padding-left: 440px;

}
</style>

</head>

<body>
<h1 style="color: white;">welcome to our Application</h1>



<form action="search" method="get">
<input type="text" name = "companyName"   placeholder="searchByCompanyName">
<button>SEARCH</button>
<br>

</form>
<div>
<a   href="sucess.jsp" style="color: red;">Add Laptops</a>
</div>

<form action="listofLaptops" method="get" style="color: bule;">
<table border="5" style="background-color: yellow;" >
<tr>
<th>Id</th>
<th>companyName</th>
<th>ModelNo</th>
<th>color</th>
<th>Generation</th>
<th>Ram</th>
<th>ACTION</th>
<th>ACTION-1</th>
</tr>
<ref:forEach items="${laptops}" var = "laptop">
<tr>
<td>${laptop.getId()}</td>
<td>${laptop.getCompanyName()}</td>
<td>${laptop.getModelNo()}</td>
<td>${laptop.getColor()}</td>
<td>${laptop.getGeneration()}</td>
<td>${laptop.getRam()}</td>
<td><a href="update/${laptop.getId()}">Update</a></td>
<td><a href="delete/${ laptop.getId()}">Delete</a>
</tr>
</ref:forEach>
</table>
</form>

</body>
</html>
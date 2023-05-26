<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="navbar" method="post">
<nav>  
<ul>  
<li>  
<a href="index.jsp"> Home </a>  
</li>  
<li>  
<a href="sucess.jsp"> Register </a>  
</li>  
<li>  
<a href="update.jsp"> view </a>  
</li>  
  
</ul>  
</nav> 
</form> 
</body>
</html>


<form action="registerLaptop" method="post"  >

<label for="cName" >Company Name :</label><br>
 <input type="text"  name="companyName"  size=100px><br>
<label>Model Number :</label><br>
 <input type="text" name="modelNo" size=100px><br>
<label>Color :</label><br>
 <input type="text" name="color" size=100px><br>
 <label>Generation :</label><br>
 <input type="text" name="generation" size=100px><br>
 <label>Ram :</label><br>
 <input type="text" name="ram" size=100px><br>
 <label>Email :</label><br>
 <input type="email" name="email" size=100px><br>


<input type="submit" name= "SUBMIT" style="color: green;">
<input type="reset" name="RESET" style="color: black;">
</form>

<body>
<h1>welcome to our Application</h1>
<h2>the Laptop name is ${name}</h2>
<a href="listofLaptops">List Of Laptops</a>

<form action="search" method="get">
<input type="text" name = "companyName"   placeholder="searchByCompanyName">
<button>SEARCH</button>
<br>

</form>


<table border="5"  >
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
<td><a href="delete/${ laptop.getId()}">Delete</a></td>
</tr>
</ref:forEach>
</table>


</body>
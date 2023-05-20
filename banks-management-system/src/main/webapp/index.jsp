<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
  

body {
    
	background-image: url("https://wallpapercave.com/wp/wp4316545.jpg");
	text-align: center;
}

</style>

</head>
<body >
<marquee style="color: blue; text-shadow: maroon;">Please Fill The Below Fields To Create Bank Account</marquee>
<form action="createAccount" method="post">

 Customer Name :<input type="text"  name="customerName"  size=50px><br>

 Phone Number :<input type="text" name="phoneNo" size=50px><br>

AdharNo :<input type="text" name="adharNO" size=50px><br>

Adress :<input type="text" name="adress" size=50px><br>


<input type="submit" name= "SUBMIT" style="color: green;">
<input type="reset" name="RESET" style="color: black;">
</form>


</body>
</html>

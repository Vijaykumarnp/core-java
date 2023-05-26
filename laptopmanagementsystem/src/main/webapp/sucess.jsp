<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>







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

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/update"  method="post" >
<label  >Id :</label><br>
 <input type="text"  name="id" value="${laptop.getId()}" size=100px ><br>
<label  >Company Name :</label><br>
 <input type="text" value="${laptop.getCompanyName() }"  name="companyName"  size=100px><br>
<label>Model Number :</label><br>
 <input type="text" value = "${laptop.getModelNo() }" name="modelNo" size=100px><br>
<label>Color :</label><br>
 <input type="text" value="${laptop.getColor() }" name="color" size=100px><br>
 <label>Generation :</label><br>
 <input type="text" value= "${laptop.getGeneration() }" name="generation" size=100px><br>
 <label>Ram :</label><br>
 <input type="text" value= "${laptop.getRam() }"name="ram" size=100px><br>
 <label>Email :</label><br>
 <input type="email" value= "${laptop.getEmail() }" name="email" size=100px><br>


<button type="submit" name= "UPDATE" style="color: green;">UPDATE </button>

</form>

</body>
</html>
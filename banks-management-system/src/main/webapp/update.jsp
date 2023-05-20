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
 <input type="text"  name="id" value="${customer.getId()}" size=100px ><br>
<label  >Customer Name :</label><br>
 <input type="text" value="${customer.getCustomerName() }"  name="companyName"  size=100px><br>
<label>Phone Number :</label><br>
 <input type="text" value = "${customer.getPhoneNo() }" name="modelNo" size=100px><br>
<label>Adhar Number :</label><br>
 <input type="text" value="${customer.getAdharNO() }" name="color" size=100px><br>
 <label>Adress :</label><br>
 <input type="text" value= "${customer.getAdrees() }" name="generation" size=100px><br>
 
<button type="submit" name= "UPDATE" style="color: green;">UPDATE </button>

</form>
</body>
</html>
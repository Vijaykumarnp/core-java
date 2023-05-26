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
<h1>from ${messagingTo}</h1>
<a href="listofchats">list of chats</a> 
<tr>
<th>messageFrom</th>
<th>Message</th>
</tr>

<ref:forEach items="${chats}" var = "chat">
<tr>
<td>${chat.getMessageTo()}</td>
<td>${chat.getMessage()}</td>
</tr>


</ref:forEach>


</body>
</html>
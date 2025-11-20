<%@page import="com.pack1.ProductBean"%>
<%@page import="com.pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>



<%

CustomerBean cb=(CustomerBean)session.getAttribute("customer");


out.println(" Welcome Mr/Mrs "+cb.getCufname()+ " <br><br>");

%>

<a href="view2">view Product</a><br><br>
<a href="Logout"> Logout</a><br><br>
</h2></center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<center>
<%

 String data=(String)request.getAttribute("msg");
response.sendError(403, data);
%>
<%=data %> <br><br>
<a href="Addproduct.html">add product </a>
<a href="view1"> view product</a><br><br>
<a href="logout"> logout</a>
</center>
</body>
</html>
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
<h1>
<%


CustomerBean c_bean=(CustomerBean)session.getAttribute("c_bean");
String data=(String)request.getAttribute("msg");

out.println(" HELLO MR/MRS "+c_bean.getCufname()+" <br><br>");
out.println(data+" registered"+"<br><br>");

%>

<form action="registration" method="post">


		username<input type="text"name="a_name"><br>
		password<input type="password" name="p_word"><br>
		<br>
		<input type="submit" value="Login">
		<br>
		
		<a href="CustomerRegistration.html"> New Registration</a>
		</form>
</h1>
</center>
<




</body>
</html>
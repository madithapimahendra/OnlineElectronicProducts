<%@page import="com.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<STYLE>
body
{
   background-image: url(./oep\ baackground\ pic.jpg);
    color: white;   
}
a{

background: blue;
color: white;
font-family: sans-serif;
border: 2px solid white;
border-radius: 10px;
padding: 3px 8px 3px 8px ;
font-size: 15px;

}
.log
{
padding: 3px 8px 3px 8px ;

}
p{

font-size: 15px;
}
a:hover{

color: red;
background: black;

}

</STYLE>
<body>
<center>


<h1>


<%

AdminBean abean=(AdminBean)session.getAttribute("abean");

String data=(String)request.getAttribute("msg");
out.println(" Hello "+abean.getAfname()+ "<p><br>"+data+"</p> <br>");



%>
<a href="Addproduct.html">AddPproduct</a><br>
<a href="view1"> ViewProduct</a><br><br>
<a href="logout"class="log">Logout</a><br><br></h1>
</center>
</body>
</html>
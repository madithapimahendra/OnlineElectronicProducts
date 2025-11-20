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

}
.add{

margin-top: 20vh;
font-family:cursive; 
border:  3 scrollbar white;
font-size: 20px;
color: white;


}
a{
 color:blue;
 font-size: 20px;
 font-family:sans-serif;
  text-decoration: underline;
  background-color: black;
  padding: 3px 15px 3px 15px;
  border-radius: 8px;
  
  

}
a:hover {
	
	border: 2px solid  white;
	
}
.log{

background:red;
color: black;
padding:15px, 4px ,2px, 15px;
border-radius: 8px;
font-style: oblique;
border: 3px solid white;

}
.log:hover{
border: 3px solid black;
color: black;
}

</STYLE>
<body>
<center>

<DIV class="add">
<div>

<%

AdminBean abean=(AdminBean)session.getAttribute("abean");
String data =(String)request.getAttribute("msg");
out.println(" <h2> welcome "+abean.getAfname()+" ...</h2>");
out.println("<p>"+data+"</p>");

%>
<p> ---- Click on belowe your Option ----</p>
<h3>


<a href="Addproduct.html">AddProduct </a><br>
<a href="view1"> ViewProduct</a><br><br>
<br>
<a href="Logout"  class="log" style="padding: 3px 6px 3px 6px"> Logout</a>

</h3>
</DIV>
</center>




</body>
</html>
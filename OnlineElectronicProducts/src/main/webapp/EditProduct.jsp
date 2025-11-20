<%@page import="com.pack1.ProductBean"%>
<%@page import="com.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

body {
	background-image: url(./oep\ baackground\ pic.jpg);
	position: fixed;
	display: flex;
	justify-content: center;
	color:white;
	font-family: sans-serif;
}
h3{

color: white;
}
h2{

color: black;
font-family:cursive;

border: 2px solid skyblue;
padding: 10px;
}
.e{
margin-left: 85vh;
}
p{

color:white;
font-family: sans-serif;

}
input {
	border: 2px solid black;
	border-radius: 10px;
	padding: 10px 2px 10px 2px;
}
.sub{
padding: 2px 20px 2px 20px ;
border: 2px solid red;
background: black;
color: white;

}

</style>
<body>
<center>
<div class="e" >
<div >
<%

	AdminBean ab=(AdminBean)session.getAttribute("abean");
	ProductBean pb=(ProductBean)request.getAttribute("pbean");
	out.println("<h3>Hello MR/MRS</h3>  <h2> "+ab.getAfname()+"</h2> <br><p>---  Below are available details to edit  ---</p> <br>");
%>
   	<form action="update" method="post">
 
 	ProductPrice :	<input type="text" name="pprice" value="<%=pb.getPprice()%>"><br><br>
 	productQuantity :	<input type="text" name="pqty" value="<%=pb.getPqty() %>"><br><br>
 	<input  type="hidden" name=pcode value="<%=pb.getPcode()%>">
 	<input type="submit" name=" Update Product" class="sub">
 
	</form>
	</div>
	</div>
	
	</center>
	</body>
	</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="com.pack1.AdminBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.1/css/all.min.css">
</head>
<style>
body{
background-image: url(./oep\ baackground\ pic.jpg);

}
a{
text-decoration:none ;
font-size: 25px;
color: lightblack;
font-family: sans-serif;
background: lightblue;
border-radius: 10px;
padding: 5px 15px 2px 15px;





}
.a>a:hover {
color: red;
	
}
h1{

color: red;

  font-family: sans-serif;
  font-weight: 400;
  font-style: normal;



}
.avp{
display: flex;
justify-content: center;


}
h3{

  font-family: "Caveat", cursive;
  font-optical-sizing: auto;
  font-weight: <weight>;
  font-style: normal;
  color: red;
    font-size: 30px;
  

}
.avp1{
margin-top: 12vh;

border: 3px solid rgb(0, 0, 0) ;

		background-size: 10%;
		background-color: rgb(248, 248, 248);
		
		padding-top: 25px;
		padding-bottom: 40px;
		padding-left: 40px;
		padding-right: 40px;
		border-radius: 15px
}
.logout
{ 
background: silver;
color:black;
font-size: 20px;


}
</style>
<body>
<center>

<div  class="avp">

<div class="avp1">
<%

AdminBean abean=(AdminBean)session.getAttribute("abean");
out.println("<br><br><h3>Welcome  Mr. "+abean.getAfname()+"</h3> ");
%>
<p> Click  on your belowe Options ...</p><br>
<div class="a">
<a href="Addproduct.html">Add Product</a><br><br><br>
<a href="view1"> View Product</a><br><br><br><br>
<a href="Logout" class="logout"> Logout</a></div>
</div>
</div>
</center>

</body>
</html>
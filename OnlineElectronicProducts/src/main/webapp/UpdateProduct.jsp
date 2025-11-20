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
body{
background-image: url(./oep\ baackground\ pic.jpg);

}
a{
font-size: 20px;
color: black;
font-family: sans-serif;
background: lightblue;
border-radius: 10px;
padding: 5px 15px 2px 15px;
border: 2px  solid black;





}
a:hover {
color: red;
	
}
h1{

color: white;

  font-family: cursive;
  font-weight: 400;
  font-style: normal;



}

.avp1{
margin-top: 6vh;
		
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
p{
font-family: inherit;
font-size: 15px
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

<h1>
<div class="avp1">

<%

		AdminBean abean=(AdminBean)session.getAttribute("abean");
		String data=(String)request.getAttribute("msg");

		out.println(" Hello MR/MRS "+abean.getAfname()+" ");
		out.println(" <p>Your "+data+" successfully</p>");
%>
		<a href="Addproduct.html">AddProduct</a><br>
		<a href="view1"> ViewProduct</a><br><br>
		<a href="logout " class="sub" > Logout</a><br>
		</div>
</h1>



</center>
</body>
</html>
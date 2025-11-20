<%@page import="java.util.Iterator"%>
<%@page import="com.pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
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

body {
	background-image: url(./oep\ baackground\ pic.jpg);
	opacity: inherit;
	background-repeat: round;
}
H2
{

color: white;
font-family: cursive;
box-shadow: 3px 3px 9px black;



}
h4{
color: black;
background-color: skyblue;
border: 2px solid white;
border-radius: 15px;
padding: 20px 3px 3px 20px;
font-family:sans-serif;
font-size: 20px
}
a{

color:white;
background: black;
padding: 4px 15px 4px 15px ;
border: 2px solid white;
border-radius: 20px;
font-family: sans-serif;
font-size: 15px;
}
a:hover {
	color: red;

}
p{

color: white;
}
.log{


color: white;
border: 2px solid red; 
}

</STYLE>
<body>
<center>
<h1>
 <%

 	AdminBean abean=(AdminBean)session.getAttribute("abean");

	ArrayList<ProductBean>	al=(ArrayList<ProductBean>)session.getAttribute("Productslist");


	out.println(" <H2>MR/MR. "+abean.getAfname()+ "</H2> <P>---- below are your product details ----</P><br><br>");

	if(al.size()==0)
	{
	out.println("product are not availble");

	}
	else
	{
		
	Iterator<ProductBean> i=al.iterator();


while(i.hasNext())
{


	ProductBean pb=i.next();
	out.println(" <h4> Code : "+pb.getPcode()+"<br> <br>Name : "+pb.getPname()+" <br><br> Company : "+pb.getPcompany()+" <br><br> Price : "+pb.getPprice()+"<br> <br>Quantity : "+pb.getPqty()+"<br><br>  "
			+"<a href='edit?pcode="+pb.getPcode()+"'>Edit</a>"+" "
			+"<a href='delete?pcode="+pb.getPcode()+"'>Delete</a>"+"</h4><br>");
	
}



}



%>
<a href="Logout" class="log">Logout</a><br>
</h1>
</center>

</body>
</html>
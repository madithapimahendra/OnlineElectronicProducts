<%@page import="java.util.Iterator"%>
<%@page import="com.pack1.CustomerBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pack1.ProductBean"%>
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
 CustomerBean c_Bean=(CustomerBean)session.getAttribute("c_bean");
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ViewCustomerProduct");

if(al.size()==0)
{

	out.println(" Dear Customer Products are not available !!!");
	
}
else
{

 Iterator<ProductBean>	i=al.iterator();
 while(i.hasNext())
 {
	 ProductBean pb=i.next();
	 out.println(pb.getPcode()+" "+pb.getPname()+" "+pb.getPcompany()+" "+pb.getPprice()+" "+pb.getPqty()+"   "+
	 "<a href='buy?pcode="+pb.getPcode()+"'>BUY</a>"+"  "+"<br><br>");
	 
	 
 }
	


}


%>
<a href="Logout"> Logout</a>





</h1>
</center>

</body>
</html>
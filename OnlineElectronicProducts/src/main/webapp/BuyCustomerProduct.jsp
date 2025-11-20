
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
<h1>

<%

ProductBean pb=(ProductBean)request.getAttribute("pcode2");
%>
<form action="buyproduct" method="post">

	Product Code <input  name="pcode11" value="<%=pb.getPcode()%>"  ><br><br>
	Product Name <input type="text" name="pname1" value="<%=pb.getPname()%>"><br><br>
	Product Company <input type="text" name="pcompany1" value="<%=pb.getPcompany()%>"><br><br>
	Product Price <input type="number" name="pprice1" value="<%=pb.getPprice()%>"><br><br>
	Available Quantities<input type="number" name="pqty" value="<%=pb.getPqty()%>"><br><br>
	Product REF<input type="number" name="pref" ><br><br>
	<input type="submit" value=" Buy NOW ">



</form>

</h1>

</center>
</body>
</html>
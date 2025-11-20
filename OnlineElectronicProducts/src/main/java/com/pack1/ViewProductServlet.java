package com.pack1;



import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/view1")
public class ViewProductServlet  extends HttpServlet{
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException 
	{
	HttpSession session=req.getSession();
	
	if(session ==null) {
		
		req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		
	}
	else {
		 
		
	ArrayList<ProductBean>	al=new  ArrayList<ProductBean>();
	al=new viewProductDAO().viewdata();
	session.setAttribute("Productslist", al);
	req.getRequestDispatcher("viewproduct.jsp").forward(req, res);
	}
		
	}

}

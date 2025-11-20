package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/aps")

public class AddProductServlet  extends HttpServlet{
	protected void doPost(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException {
		
	try 
	{
		
		HttpSession session=req.getSession(false);
		
		if(session==null) {
			
			
			req.getRequestDispatcher("AddLogin.html").forward(req, res);
			
		}
		else 
		{
			
			ProductBean pb=new ProductBean();
			pb.setPcode(req.getParameter("pcode"));
			pb.setPname(req.getParameter("pname"));
			pb.setPcompany(req.getParameter("pcompany"));
			pb.setPprice(req.getParameter("pprice"));
			pb.setPqty(req.getParameter("pqty"));
			
			
			int rowcount=new AddProductDAO().addproduct(pb);
	if(rowcount==0) {
		throw new RuntimeException(" product data not add");
	}
	else {
		
		req.setAttribute("msg"," product data added successfully");
		req.getRequestDispatcher("Addproduct.jsp").forward(req, res);
		
	}
			
		}
	}
	catch(Exception e) {
		req.setAttribute("msg"," Duplicate Products id not allowed");
		req.getRequestDispatcher("Error.jsp").forward(req, res);
		
		
	}
	}

}

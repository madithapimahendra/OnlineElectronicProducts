 package com.pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/buy")
public class BuyCustomerProductServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		
		HttpSession session=req.getSession();
		if(session==null) 
		{
			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
		}
		else 
		{
		String pcode1=req.getParameter("pcode");
		
	ArrayList<ProductBean> al1= new viewProductDAO().viewdata();
	ProductBean pb= null;
	Iterator<ProductBean> i=al1.iterator();
	while(i.hasNext()) 
		
		{
		pb=i.next();
		if(pb.getPcode().equals(pcode1)) {
			break;
		}
		}
	    
	        req.setAttribute("pcode2", pb);
	        req.getRequestDispatcher("BuyCustomerProduct.jsp").forward(req, res);
			
		}
		
	}

}

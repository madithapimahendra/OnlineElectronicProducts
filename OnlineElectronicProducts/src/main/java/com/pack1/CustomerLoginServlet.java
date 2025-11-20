package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/registration")
public class CustomerLoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
	{
	
	
		CustomerBean c_bean=new CustomerLoginDAO().checkeligible(req.getParameter("U_name"),req.getParameter("U_word"));
	
		
			
			if(c_bean==null) {
				req.setAttribute("msg", "INVALID CREDINTIALS");
				 req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
				 
	                                                     			 
			}
			else 
			{
				System.out.println(".."+c_bean.getCufname());
				HttpSession session=req.getSession();
				session.setAttribute("customer", c_bean);
				req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
			}
			
			
		}
		
	}
	
	
	



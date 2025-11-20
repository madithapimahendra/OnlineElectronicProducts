package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/newuser")
public class CustomerRegistrationServlet  extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
		{
	
		HttpSession session=req.getSession();
		if(session==null)
		{
			
			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
			
		}
		
		else {
			
			CustomerBean c_bean=new CustomerBean();
			
			c_bean.setCuname(req.getParameter("uname"));
			c_bean.setCupword(req.getParameter("upword"));
			c_bean.setCufname(req.getParameter("ufname"));
			c_bean.setCulname(req.getParameter("ulname"));
			c_bean.setCuadd(req.getParameter("uadd"));
			c_bean.setCumail(req.getParameter("umail"));
			c_bean.setCuphno(req.getParameter("uphno"));
			
			
			int rowcount=new CustomerRegisterDAO().newregister(c_bean);
			if(rowcount==0) 
			{
				throw  new RuntimeException(" YOUR DATA NOT REGISTERED !!! !!!!");
			}
			
			else 
			{
				HttpSession session1=req.getSession();
				 session1.setAttribute("c_bean",c_bean);
				req.setAttribute("msg", "your data successfully ");
				req.getRequestDispatcher("CustomerRegister.jsp").forward(req, res);
		   
			}
			
			
			
		}		
		
		}

}

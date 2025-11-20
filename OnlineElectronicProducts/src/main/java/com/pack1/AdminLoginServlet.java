package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/alog")


public class AdminLoginServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException
	{
		

		AdminBean	a_bean=new AdminLoginDAO().check(req.getParameter("a_name"), req.getParameter("p_word"));
		
	if(a_bean==null)
	{
		req.setAttribute("msg", "invalid login ");
		req.getRequestDispatcher("AdminLogin.html").forward(req, res);
	}
	else 
	{
		HttpSession session=req.getSession();
		session.setAttribute("abean", a_bean);
		req.getRequestDispatcher("Adminhome.jsp").forward(req, res);
		
	}
		
	}
	
}



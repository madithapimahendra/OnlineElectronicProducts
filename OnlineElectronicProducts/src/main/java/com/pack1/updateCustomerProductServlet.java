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
@WebServlet("/buyproduct")
public class updateCustomerProductServlet  extends HttpServlet
{

	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
	{
    
	 HttpSession	session =req.getSession(false);
		int rowcount=0;
	 if(session==null) 
	 {
		 req.getRequestDispatcher("CustmerLogin.html").forward(req, res);
	 }
	 else 
	 {
		 
		 String pcode11=req.getParameter("pcode11");
		 ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ViewCustomerProduct");
		 ProductBean pb=null;
		 Iterator<ProductBean> i=al.iterator();
		 System.out.println(pcode11);
		 
		 
		 while(i.hasNext()) 
		 {
			 pb=i.next();
			 if(pb.getPcode().equals(pcode11)) 
			 {
				 break;
			 }
			 else 
			 {
				 int ref =Integer.parseInt(req.getParameter("pref"));
		
				System.out.println(pcode11);
			int pqty=Integer.parseInt(req.getParameter("pqty"));
			
			int total=pqty-ref;
		
			System.out.println("quantity :" +pqty);
			System.out.println(" ref :"+ref);
			System.out.println(" total :"+total);
			pb.setPqty(""+total+"");
			pb.setPcode(pcode11);
			rowcount =  new UpdateCustomerProductDAO().updatecustomerProduct(pb);
	
			if(rowcount==0) 
			{
				throw new RuntimeException("products not availbele");
			
			}
			
			else 
			{
			System.out.println(" rowcount : "+rowcount);
				
	           int price=Integer.parseInt(req.getParameter("pprice1"));
	           System.out.println(price);
	           int totalprice=price*ref;
	           
	           System.out.println(totalprice);
	          
	           
	
				req.setAttribute("TOTALPRICE", totalprice);
				req.setAttribute("msg"," Hello  mr/mrs");
				req.getRequestDispatcher("order.jsp").forward(req, res);
			}
			
			 }
		 }
		 
	 }
		
	}

}

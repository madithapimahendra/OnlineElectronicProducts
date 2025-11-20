package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BuyCustomerProductDAO {
     ArrayList<ProductBean> al1= new ArrayList<ProductBean>();
     ProductBean	pb1=new ProductBean(); 
	public ArrayList<ProductBean> Buycproduct() 
	{

	try
	{
		
		Connection con=DBConnect.connect();
		PreparedStatement pstm=con.prepareStatement("select * from product where pcode=?");
		
		pstm.setString(1, pb1.getPcode());
		ResultSet rs=pstm.executeQuery();
		while(rs.next()) 
		{
			
		pb1.setPcode(rs.getString(1));
		pb1.setPname(rs.getString(2));
		pb1.setPcompany(rs.getString(3));
		pb1.setPprice(rs.getString(4));
		pb1.setPqty(rs.getString(5));
		al1.add(pb1);
		
			
		}
		
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
		
		
		return al1;
	}

	

	
}

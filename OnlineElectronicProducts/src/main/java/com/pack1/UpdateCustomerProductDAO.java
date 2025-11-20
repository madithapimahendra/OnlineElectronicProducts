package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class UpdateCustomerProductDAO 
{

	
	public int updatecustomerProduct(ProductBean pb) 
	{
	int rowcount=0;

		try 
		{
		Connection con=DBConnect.connect();
		PreparedStatement pstm=con.prepareStatement("update product set pqty=? where pcode=?");
	    pstm.setString(1, pb.getPqty());
	    pstm.setString(2, pb.getPcode());
	     rowcount=pstm.executeUpdate();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return rowcount;
	}
	
}

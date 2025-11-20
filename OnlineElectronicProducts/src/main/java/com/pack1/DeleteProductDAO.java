package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteProductDAO {
	public int delete(String pcode)
	
	{
		int rowcount=0;
		try
		{
			
	Connection	con=DBConnect.connect();
	
	PreparedStatement pstm=con.prepareStatement("delete from product where pcode=?");
	pstm.setString(1, pcode);
	rowcount=pstm.executeUpdate();
	
	
		}
		
catch(Exception e)
		{
	e.printStackTrace();		
		

	}
		return rowcount;
	
}

}

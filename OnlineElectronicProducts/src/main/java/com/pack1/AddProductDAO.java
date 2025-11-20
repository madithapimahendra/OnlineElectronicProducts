package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO {

	public int addproduct(ProductBean pb) throws Exception
	{
int rowcount=0;
		
		try 
		{
		Connection	con=DBConnect.connect();
		PreparedStatement pstm=con.prepareStatement("insert into product values(?,?,?,?,?)");
		pstm.setString(1,pb.getPcode() );
		pstm.setString(2,pb.getPname() );
		pstm.setString(3,pb.getPcompany() );
		pstm.setString(4,pb.getPprice() );
		pstm.setString(5,pb.getPqty() );
		
		
		rowcount=pstm.executeUpdate();
		
		
		}
		catch(Exception e) {
			//e.printStackTrace();
			throw e;
		}
		
		return rowcount;
	}
	
}

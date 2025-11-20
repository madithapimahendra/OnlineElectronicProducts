package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerRegisterDAO {
	
	public int newregister(CustomerBean cb) {
		int rowcount=0;
		try 
		{
			Connection con=DBConnect.connect();
			PreparedStatement pstm=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			
			pstm.setString(1, cb.getCuname());
			pstm.setString(2, cb.getCupword());
			pstm.setString(3, cb.getCufname());
			pstm.setString(4, cb.getCulname());
			pstm.setString(5, cb.getCuadd());
			pstm.setString(6, cb.getCumail());
			pstm.setString(7, cb.getCuphno());
			rowcount=pstm.executeUpdate();
			
		}
		
		
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	return rowcount;	
	}
}

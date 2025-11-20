package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO {

	public AdminBean check(String username,String password) 
	{
		AdminBean a_bean=new AdminBean();
		try {
			Connection con=DBConnect.connect();
			PreparedStatement pstm=con.prepareStatement("select*from admin where uname=? and pword=?");
			pstm.setString(1, username);
			pstm.setString(2, password);
		ResultSet	rs=pstm.executeQuery();
if(rs.next()) 
{
	a_bean.setAname(rs.getString(1));	
	a_bean.setApwd(rs.getString(2));	
	a_bean.setAfname(rs.getString(3));	
	a_bean.setAlname(rs.getString(4));	
	a_bean.setAdd(rs.getString(5));	
	a_bean.setAmid(rs.getString(6));	
	a_bean.setAphno(rs.getString(7));	
}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return a_bean;
	}
	
}

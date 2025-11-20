package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerLoginDAO {
	 public CustomerBean checkeligible(String c_username,String c_password) 
	 {
		 CustomerBean c_bean= new CustomerBean();
	
		 try {
			 Connection con=DBConnect.connect();
			 PreparedStatement pstm=con.prepareStatement("select * from customer where uname=? AND pword=?");
			 
			 pstm.setString(1, c_username);
			 pstm.setString(2, c_password);
			 
			 ResultSet rs=pstm.executeQuery();
			 if(rs.next()) {
				
					
			 c_bean.setCuname(rs.getString(1));
			 c_bean.setCupword(rs.getString(2));
			 c_bean.setCufname(rs.getString(3));
			 c_bean.setCulname(rs.getString(4));
			 c_bean.setCuadd(rs.getString(5));
			 c_bean.setCumail(rs.getString(6));
			 c_bean.setCuphno(rs.getString(7));
			 
		
			 }
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
	 
	 return c_bean;
	 }
}

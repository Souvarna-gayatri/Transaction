package com.wipro.dao;
import java.sql.*;

import java.util.*;
import com.wipro.bean.*;
import com.wipro.dbutil.Accdbutil;

public class Accountdao {
	public List<Accountbean> getAccounts()
	{
		
		List<Accountbean> ac=new ArrayList<Accountbean>();
		try
		{
			String sql="select* from accounts_trans";
			Connection con=Accdbutil.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Accountbean bean=new Accountbean();
				bean.setAccountid(rs.getInt("ACCID"));
				bean.setAccountname(rs.getString("ACCNAME"));
				bean.setAccountbal(rs.getInt("ACCBAL"));
				ac.add(bean);
				
			}
			
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}return ac;
	}
 
	

}

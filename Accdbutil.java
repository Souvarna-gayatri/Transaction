package com.wipro.dbutil;
import java.sql.*;

public class Accdbutil {
	public static  Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","william","tiger");
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}
	

}

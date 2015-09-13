package com.wipro.databasesrc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public final class ConnectionDB {
static Connection con = null;
public static Connection getCon()
{	
		if(con == null)
		{
			try {
				//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//con=DriverManager.getConnection("jdbc:odbc:evsdsn","scott","tiger");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@Oyster-23:1521:orcl","scott","tiger");
				System.out.println("Connected");
				}
			catch(Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}
		}
		return con;
		
}

}

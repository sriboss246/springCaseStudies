package com.wipro.databasesrc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class User_Check_DAO {
	
	private Connection con;
	public User_Check_DAO()
	{
		con = ConnectionDB.getCon();
	}
	public int loginCheck(com.wipro.entitybean.classes.Login_Bean_Class ulog) {
		try {
			
			String usertype = ulog.getUsertype();
			String username = ulog.getUsername();
			String password = ulog.getPassword();
			Statement st = con.createStatement();
			ResultSet rs = null;
			//System.out.println(username);
			if(usertype.equals("U"))
			{rs = st.executeQuery("select UserID from UserDetails where UserID = '" + username + "' and Password='"+ password +"'" );
			         if(rs.next()){return 1;} 
			         else {  return 0; }
			                      }
			else{
			rs = st.executeQuery("select UserType from LoginCredentials where UserID = '" + username + "' and Password='"+ password +"'");	
			}
			if(rs.next())
				{ 
				   String ch= rs.getString(1);
					if(ch.equals("A")){ return 2; }
					else return 3;
					
				}
			else return 0;
			}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		return 0;
	}
	
	
}

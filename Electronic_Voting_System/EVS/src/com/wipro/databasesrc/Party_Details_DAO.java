package com.wipro.databasesrc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Party_Details_DAO {
	private Connection con;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public Party_Details_DAO()
	{
		con = ConnectionDB.getCon();
	}
	
	public ResultSet display() {
		try {
			//st= con.createStatement();
			System.out.println("Display Begin");
			String tablename = "PartyDetails";
			pst = con.prepareStatement("select * from "+ tablename);
			rs = pst.executeQuery();
			return rs;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("DB extraction successful");
		return rs;
	}	
	
	public int addPartyCheck(com.wipro.entitybean.classes.Party_Details_Bean_Class ulog) {
		try {
			
			String pname = ulog.getPname();
			String pleader = ulog.getPleader();
			String psymbol = ulog.getPsymbol();
			
			
			PreparedStatement pst = con.prepareStatement("insert into PartyDetails values(?,?,?)");
			ResultSet rs = null;
			
			pst.setString(1, pname);
			pst.setString(2, pleader);
			pst.setString(3, psymbol);
						
			int i = pst.executeUpdate();
			if(i>0)
			{
				System.out.println("Records inserted successfully");
				return 1;
			}
				else return 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return 0;		
	}
}

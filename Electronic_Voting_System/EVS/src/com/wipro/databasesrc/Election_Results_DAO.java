package com.wipro.databasesrc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Election_Results_DAO {
	private Connection con;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public Election_Results_DAO()
	{
		con = ConnectionDB.getCon();
	}
	
	public ResultSet displayResultsByDate(String eldate) {
		try {
			st= con.createStatement();
			System.out.println("Display Begin");
			String tablename = "ElectionResults";
			pst = con.prepareStatement("select * from "+ tablename + "where eldate = " + eldate );
			rs = pst.executeQuery();
			return rs;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("DB extraction successful");
		return rs;
	}	
}

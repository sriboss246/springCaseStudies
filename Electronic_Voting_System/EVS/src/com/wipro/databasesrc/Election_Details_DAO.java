package com.wipro.databasesrc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Election_Details_DAO {
		
	private Connection con;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public Election_Details_DAO()
	{
		con = ConnectionDB.getCon();
	}
	
	public ResultSet display() {
		try {
			st= con.createStatement();
			System.out.println("Display Begin");
			String tablename = "ElectionDetails";
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
	
	public int addElectionCheck(com.wipro.entitybean.classes.Election_Details_Bean_Class ulog) {
		try {
			
			String elname = ulog.getElname();
			String eldate = ulog.getEldate();
			String vtime = ulog.getVtime();
			String eldist = ulog.getEldist();
			String elcons = ulog.getElcons();
			
			 pst = con.prepareStatement("insert into ElectionDetails values(?,?,?,?,?)");
			 rs = null;
			
			pst.setString(1, elname);
			pst.setString(2, eldate);
			pst.setString(3, vtime);
			pst.setString(4, eldist);
			pst.setString(5, elcons);
			
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
	

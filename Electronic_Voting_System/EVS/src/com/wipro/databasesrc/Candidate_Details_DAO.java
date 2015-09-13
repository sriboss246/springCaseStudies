package com.wipro.databasesrc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Candidate_Details_DAO {
	private Connection con;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public Candidate_Details_DAO()
	{
		con = ConnectionDB.getCon();
	}
	
	public ResultSet display() {
		try {
			//st= con.createStatement();
			System.out.println("Display Begin");
			String tablename = "CandidateDetails";
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
	
	public int addCandidateCheck(com.wipro.entitybean.classes.Candidate_Details_Bean_Class ulog) {
		try {
			
			String cname = ulog.getCname();
			String dob = ulog.getDob();
			String elname = ulog.getElname();
			String pname = ulog.getPname();
			String eldist = ulog.getEldist();
			String elcons = ulog.getElcons();
			String address = ulog.getAddress();
			String phone = ulog.getPhone();
			String emailid = ulog.getEmailid();
			
			
			PreparedStatement pst = con.prepareStatement("insert into CandidateDetails values(CID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?)");
			ResultSet rs = null;
			
			pst.setString(1, cname);
			pst.setString(2, dob);
			pst.setString(3, elname);
			pst.setString(4, pname);
			pst.setString(5, eldist);
			pst.setString(6, elcons);
			pst.setString(7, address);
			pst.setString(8, phone);
			pst.setString(9, emailid);
			
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

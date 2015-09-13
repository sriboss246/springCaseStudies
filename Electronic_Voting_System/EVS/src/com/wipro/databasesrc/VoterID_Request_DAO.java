package com.wipro.databasesrc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class VoterID_Request_DAO {
	
	
	private Connection con;
	private Statement st;
	private PreparedStatement pst;
	ResultSet rs;
	
	
	public VoterID_Request_DAO()
	{
		con = ConnectionDB.getCon();
	}
	
	public ResultSet display() {
		try {
			//st= con.createStatement();
			System.out.println("Display Begin");
			String tablename = "voteridrequestdetails";
			pst = con.prepareStatement("select * from voteridrequestdetails where reqstatus = 'waiting'");
			rs = pst.executeQuery();
			return rs;
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("erroe in dao");
		}
		System.out.println("DB extraction successful");
		return rs;
	}	
	
	public ResultSet displayForwardedReq() {
		try {
			//st= con.createStatement();
			System.out.println("Display Begin");
			String tablename = "voteridrequestdetails";
			pst = con.prepareStatement("select * from voteridrequestdetails where reqstatus = 'forwarded'");
			rs = pst.executeQuery();
			return rs;
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("erroe in dao");
		}
		System.out.println("DB extraction successful");
		return rs;
	}	
	
	public ResultSet displayGeneratedVoterID(String str) {
		try {
			//st= con.createStatement();
			System.out.println("Display Begin");
			String tablename = "userdetails";
			pst = con.prepareStatement("select voterid from "+tablename+ " where userid = " + str);
			rs = pst.executeQuery();
			return rs;
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("erroe in dao");
		}
		System.out.println("DB extraction successful");
		return rs;
	}	
	
	
	
	public int forward(String str) {
		try {
			//st= con.createStatement();
			
			System.out.println("Display Begin");
			String tablename = "voteridrequestdetails";
			pst = con.prepareStatement("update "+tablename+" set reqstatus='forwarded' where userid=?");
			pst.setString(1,str); 
			pst.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("DB extraction successful");
		return 0;
	}	
	
	
	public int generateVoterID(String str) {
		try {
			//st= con.createStatement();
			
			System.out.println("Display Begin");
			String tablename = "voteridrequestdetails";
			pst = con.prepareStatement("update "+tablename+" set reqstatus='Approved' where userid=?");
			pst.setString(1,str); 
			pst.executeUpdate();
			
			tablename = "userdetails";
			pst = con.prepareStatement("update "+tablename+" set voterid =  VOTERID_SEQ.NEXTVAL where userid=?");
			pst.setString(1,str); 
			pst.executeUpdate();
			return 1;
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("DB extraction successful");
		return 0;
	}	
	
	public int voterRequest(String username) {
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = null;
			System.out.println(username);
			rs = st.executeQuery("select VoterID from UserDetails where UserID = '" + username +"'" );
			         
			        
			rs.next();
			         if(rs.getString(1)!=null){     return 0;   }
			         else {   
			        	 
			        	 st.executeUpdate("insert into voteridrequestdetails values('"+username+"','waiting')");
			        	 return 1;
			         }
			                     
		}
								
					catch(Exception e)
		{
			System.out.println(e);
			
		}
		return 2;
	}

}

package com.wipro.databasesrc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User_Details_DAO {
	
	
	private Connection con;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public User_Details_DAO()
	{
		con = ConnectionDB.getCon();
	}
	public int addUserDetails(com.wipro.entitybean.classes.User_Details_bean_class x)
	{
	try {
		
		String fname = x.getFname();
		String lname = x.getLname();
		String password = x.getPassword();
		String dob = x.getDob();
		String gender = x.getGender();
		String address = x.getAddress();
		String cons = x.getCons();
		String phone = x.getPhone();
		String district= x.getDistrict();
		
		PreparedStatement pst = con.prepareStatement("insert into userDetails values(USERID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?)");
		ResultSet rs = null;
		
		pst.setString(1, null);
		pst.setString(2, password);
		pst.setString(3, fname);
		pst.setString(4, lname);
		pst.setString(5, dob);
		pst.setString(6, gender);
		pst.setString(7, address);
		pst.setString(8, phone);
		pst.setString(9, cons);
		pst.setString(10, district);
		
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

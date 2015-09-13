<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.wipro.databasesrc.Candidate_Details_DAO" %><html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import = "java.util.*, java.sql.*" %>

<BODY><b><FONT face="Times New Roman" color="black">



<% ResultSet rs = (ResultSet) request.getAttribute("displayCandidate"); %>
<br>
<br>
<br>
<br>
<br>
<center>
<TABLE border="3.0" cellpadding="4" width="75%"  >
<tr>
<b>

<th bgcolor="#9ACD32"> Candidate ID  </th>
<th bgcolor="#A0AA00"> Candidate Name </th>
<th bgcolor="#9ACD32"> DOB </th>
<th bgcolor="#A0AA00"> Election Name </th>
<th bgcolor="#A0AA00"> Party Name </th>
<th bgcolor="#A0AA00"> District </th>
<th bgcolor="#A0AA00"> Constituency </th>
<th bgcolor="#A0AA00"> Address </th>
<th bgcolor="#A0AA00"> Contact Number </th>
<th bgcolor="#A0AA00"> Email ID </th>
</b>
</tr>
<%	

 
      while(rs.next()) {%>
	<tr> <td><%= rs.getInt(1) %> </td>
		<td><%= rs.getString(2) %> </td>
		<td><%= rs.getString(3) %> </td>
		<td><%= rs.getString(4) %> </td>
		<td><%= rs.getString(5) %> </td>
		<td><%= rs.getString(6) %> </td>
		<td><%= rs.getString(7) %> </td>
		<td><%= rs.getString(8) %> </td>
		<td><%= rs.getString(9) %> </td>
		<td><%= rs.getString(10) %> </td>
		</tr>
	<%}%>
</table>

</font></b>
</body>
</html>
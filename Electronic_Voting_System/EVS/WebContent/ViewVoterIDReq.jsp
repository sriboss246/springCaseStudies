<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import = "java.util.*, java.sql.*" %>
<script type = "text/javascript">
function fnNoOfReq()
{
	//documnet.frmViewVoterIDReq.visible = false;
	var ctrval = document.frmViewVoterIDReq.countReq.value;
	var tf = confirm("There are " + ctrval  + "Pending Requests for VoterID " );  
	if(tf == true)
	{
		document.all("requestvisible").style.visibility = "visible";
	
	}
	

		
}
</script>
<body onLoad = "fnNoOfReq();">
<% ResultSet rs = (ResultSet) request.getAttribute("displayVoterIDReq"); %>
<div id="requestvisible" style="visibility:hidden">
<br>
<br>
<br>
<br>
<br>
<form name=frmViewVoterIDReq action="AdminForwardsVoterID" method="post">
<TABLE border="3.0" cellpadding="4" width="75%"  >
<tr>
<b>

<th bgcolor="#9ACD32"> UserID  </th>
<th bgcolor="#A0AA00"> Status </th>


</b>
</tr>


<%	
  int i=0;
 
      while(rs.next()) {%>
	<tr> <td><%= rs.getString(1) %> </td>
		<td><%= rs.getString(2) %> </td>
        <td><input type="hidden" name="hid<%=i++%>"  value="<%=rs.getString(1)%>">
		
	</td>
		
		</tr>
	<%}%>

<input type="hidden" value="<%=i%>" name="countReq">

</table>

<input type="submit" value="Forward To Electoral Officer">
</form>
</div>
</body>
</html>
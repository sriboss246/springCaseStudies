<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import = "java.util.*" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body >
<%out.println(new Date()); %>

<br>
<br>
<br>

<form name=frmViewVoterIDReq action="AdminForwardsVoterID" method="post">
<TABLE  align = "center" cellpadding="4" width="75%"  >
<tr>
<td><b>User ID : <b></td>
<td><input type = "text" name = "txtUserID" ></td>
</tr>

<tr>
<td><b>Election Date : <b></td>
<td><input type = "text" name = "txtEldate" ></td>
</tr>


<tr>
<td><b>Election Name : <b></td>
<td>
<select name = "selElname" >
<option value = "MP" >MP</option>
<option value = "MLA" >MLA</option>

</td>
</tr>

<tr>
<td><b>District :  <b></td>
<td>
<select name = "selEldist" >
<option value = "Khurda" >Khurda</option>
<option value = "Cuttack" >Cuttack</option>
<option value = "Cuttack" >Puri</option>

</td>
</tr>

<tr>
<td><b>Constituency :  <b></td>

<td>
<select name = "selEldist" >
<option value = "Bhubaneswar" >Bhubaneswar</option>
<option value = "Rourkela" >Rourkela</option>
<option value = "Balasore" >Balasore</option>

</td>
</tr>

<tr>
<td><b>Party Name : <b></td>
<td>
<select name = "selPname" >
<option value = "BJP" >Biju Janata Party</option>
<option value = "Congress" >Congress</option>
<option value = "BSP" >Bahujan Samaj Party</option>

</td>
</tr>

<tr>
<td><b>Party Leader : <b></td>
<td>
<select name = "selPleader" >
<option value = "Advani" >L.K.Advani</option>
<option value = "Sonia" >Sonia Gandhi</option>
<option value = "Mayawati" >Mayawati</option>

</td>
</tr>

<tr>
<td><b>Party Symbol : <b></td>
<td>
<select name = "selPsymbol" >
<option value = "Lotus" >Lotus</option>
<option value = "Palm" >Palm</option>
<option value = "Elephant" >Elephant</option>

</td>
</tr>

<tr>
<td>&nbsp&nbsp&nbsp</td>
<td>&nbsp&nbsp&nbsp</td>
</tr>

<tr>
<td>&nbsp&nbsp&nbsp</td>

<td><input type = "submit" name = "btnSubmit" value = "Vote" ></td>
</tr>

</TABLE>
</form>
</div>
</body>
</body>
</html>
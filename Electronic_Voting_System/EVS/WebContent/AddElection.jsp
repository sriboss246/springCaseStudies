<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ulb1" class="com.wipro.entitybean.classes.Election_Details_Bean_Class"></jsp:useBean>
<jsp:setProperty name="ulb1" property="*"/>

<% request.setAttribute("ElectionDetailsIntoServlet",ulb1); %>
<jsp:forward page="elect_details"></jsp:forward>
</body>

</html>
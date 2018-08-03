<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String uname=request.getParameter("uname");
int count=Integer.parseInt(uname);
/*
String pwd=request.getParameter("pwd");
if(uname.equals("kce") && pwd.equals("java"))
	response.sendRedirect("https://www.hackerrank.com/");
	//out.println("welcome");
else
	//out.println("invalid user");
	response.sendRedirect("login.html");*/
	
%>

<form>
<% for (int i=0;i<count;i++) {%>
<input type="text" name="box"/>
<%} %>
</form>
</body>
</html>





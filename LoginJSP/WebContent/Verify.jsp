<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="login.dao.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname=request.getParameter("uname");
String pwd=request.getParameter("pwd");

DBOperation dboperation=new DBOperation();
String result=dboperation.retrive(uname, pwd);

if(result.equals("success"))
{%>
<jsp:forward page="WelcomeJSP.jsp">
<jsp:param value="<%=pwd %>" name="count"/>
</jsp:forward>
<%	
} 
else
{ %>
<h1> Invalid user </h1>
<%} %>
</body>
</html>







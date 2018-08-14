<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="login.dao.*" %>
        <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> <% out.println("welcome page"); %> </h1>
<% 
DBOperation dboperation=new DBOperation();
List result=dboperation.display(request.getParameter("uname"));
%>
<font size="28">
<table border="1">
<tr>
<td> Name: </td>
<td> <%=result.get(0) %></td>
</tr>
<tr>
<td> CGPA: </td>
<td> <%=result.get(1) %></td>
</tr>
</table>
 </font>
</body>
</html>











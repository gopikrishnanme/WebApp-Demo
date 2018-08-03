<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int ary[]=new int[5];
String name[]={"raj","gokul","karthi","mohan","sathish"};
int node[]={23,43,22,54,65};
%>

<table width="100%">
<%for(int i=0;i<ary.length;i++) {%>
<tr>
<td><label id="sno" ><%=name[i] %></label></td>
<td><label id="rollno" ><%=name[i] %></label></td>
<td><label id="name" ><%=node[i] %></label></td>
<td><label id="node" ><%=name[i] %></label></td>
<td><label id="in" ><%=12.24 %></label></td>
<td><label id="out" ><%=name[i] %></label></td>
</tr>
<%} %>
</table>
</body>
</html>
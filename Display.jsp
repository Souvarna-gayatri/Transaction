<%@page import="java.util.Iterator"%>
<%@page import="com.wipro.bean.Accountbean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type = "text/css" href = "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class = "container">
<a href="Accservlet"  class = "btn btn-primary">Fund transfer</a>
<table class = "table table-bordered table-striped">

<% 
List<Accountbean> list=(List<Accountbean>)request.getAttribute("data");
if(list!=null)
{
%>
<tr><th>AccId</th><th>AccName</th><th>AccBal</th></tr>
<% 
Iterator<Accountbean> itr = list.iterator();
while(itr.hasNext())
{
	Accountbean bean = itr.next();

%>
<tr><td><%=bean.getAccountid() %></td><td><%=bean.getAccountname() %></td><td><%=bean.getAccountbal() %></td></tr>
<h4>balance after debiting:<%=bean.getAccountbal() %></h4>
<%}
}
%>


</table>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.ResultSet" %>
    <%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>search_registrations</title>
</head>
<body>
<h2>search_registrations</h2>
<table border="1" style="width:100px">
<tr>
<th>name</th>
<th>city</th>
<th>email</th>
<th>mobile No</th>
<th>Delete</th>
<th>update</th>
</tr>
<tr>
<%
try {
	ResultSet res = (ResultSet)request.getAttribute("list");
	while(res.next()) {
	%>
	<tr>
		
		<td><%=res.getString(1)%></td>
		<td><%=res.getString(2)%></td>
		<td><%=res.getString(3)%></td>
		<td><%=res.getString(4)%></td>		
		<td><a href="delete?emailId=<%=res.getString(3)%>">Delete</a></td>
		<td><a href="update?emailId=<%=res.getString(3)%>&mobile=<%=res.getString(4)%>">update</a></td>
</tr>
<%	}
} catch (Exception e) {
	e.printStackTrace();
}
%>

</table>

</body>
</html>
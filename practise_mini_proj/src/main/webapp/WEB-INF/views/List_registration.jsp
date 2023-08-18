<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@include file="menu.jsp" %>
    <%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List registrations</title>
</head>
<body>
<h2>List All registrations</h2>
  <table border="1">
     <tr>
     <th>Name</th>
     <th>city</th>
     <th>Email</th>
     <th>mobile</th>
     <th>Delete</th>
     <th>Update</th>
     </tr>
    <%  ResultSet res = (ResultSet)request.getAttribute("list");
       while(res.next()){ %>
       <tr>
       <td><% out.println(res.getString(1));%> </td>
       <td><% out.println(res.getString(2));%> </td>
       <td><% out.println(res.getString(3));%> </td>
       <td><% out.println(res.getString(4));%> </td>
       <td> <a href="delete?email=<% out.println(res.getString(3));%> ">Delete</a></td>
		<td><a href="update?emailId= <%=res.getString(3)%>&mobile=<%=res.getString(4)%>">update</a></td>

       </tr>
     <%}%>
     <tr>
       
  </table>
</body>
</html>
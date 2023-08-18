<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register here</title>
</head>
<body>
<h2>registration| create</h2>
<form action="register" method="post">
<table>
<tr> 
<td>name:</td>
<td><input type="text" name="name"/></td>
</tr>
<tr>
<td>city:</td>
<td><input type="text" name="city"/></td>
 </tr>
 <tr>
 <td>Email:</td>
 <td><input type="email" name="email"/></td>
 </tr>
 <tr>
 <td>Mobile No:</td>
 <td><input type="text" name="mobile"/> </td>
 </tr>
 <tr>
 <td><input type="submit" value="save"/></td>
 </tr>
</table>
</form>
<%
if(request.getAttribute("record")!=null)
out.println(request.getAttribute("record"));
%>

</body>
</html>
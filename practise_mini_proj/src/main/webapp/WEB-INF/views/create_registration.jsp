<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create Registration</title>
</head>
<body>
<form action="create" method="post">
    <pre>
    Name:<input type="text" name="name"/>
    city:<input type="text" name="city"/>
    Email:<input type="email" name="email"/>
    mobile:<input type="text" name="mobile"/>
    <input type="submit" value="submit"/>
    </pre>
   </form>
   <%if(request.getAttribute("record")!=null){
	   out.println(request.getAttribute("record"));
   } %>
   
</body>
</html>
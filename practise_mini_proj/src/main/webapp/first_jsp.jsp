<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Here</title>
</head>
<body>
          <h2>Login Here...</h2>
    <form action="Login" method="post">
    userName:<input type="email" name="name"/><br><br>
    password:<input type="password" name="password"/><br>
    <input type="submit" value="login">
    </form>
    <%
   if(request.getAttribute("msg")!= null){
	   out.println(request.getAttribute("msg"));
   } %>
   <%
   if(request.getAttribute("logout")!= null){
	   out.println(request.getAttribute("logout"));
   } %>
   <%
   if(request.getAttribute("again")!= null){
	   out.println(request.getAttribute("again"));
   } %>
    
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
   <form action="loginController" method="post">
   <h2>Login here......</h2>
   email:<input type="email" name="email"/>
   password:<input type="password" name="password"/><br>
   <input type="submit" value="login"/>
   </form>
   <%
   if(request.getAttribute("error")!= null){
	   out.println(request.getAttribute("error"));
   }
   
   if(request.getAttribute("logout")!= null){
	   out.println(request.getAttribute("logout"));
   }
    
   %>
</body>
</html>
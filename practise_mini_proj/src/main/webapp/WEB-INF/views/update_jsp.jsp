<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update Here...</title>
</head>
<body>
<form action="update" method="post">
      email:<input type="email" name="email" value="<%=request.getAttribute("email")%>"/><br>
      mobile:<input type="text" name="mobile"/><br>
      <input type="submit" value="update"/>
      </form>
</body>
</html>
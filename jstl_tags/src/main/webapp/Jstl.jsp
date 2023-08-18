<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <c:out value="100"></c:out></body> <%--prints --%>
       
       <c:set var="val" value="100"></c:set> <%-- variable--%>
       <c:out value="${val}"></c:out>
      
       <c:if test="${val>100 }">  <!-- if condition -->
       <p>Hello</p>
        </c:if>
        
			<c:forEach var="j" begin="1" end="10">  <!-- forEach condition... printing 1 to 10 values -->
			      <p>${j }</p>
			</c:forEach>       
</html>
<%@page import="com.ritik.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p></p>
	
		Hey <%  
		User user =  (User)request.getAttribute("user");
		%>
		
		<%= user.getName() %>
		<%= user.getUsername() %>
		
		
		 This is ur profile page.
		<a href="logout">Logout</a>
	
	<p>

	</p>
</body>
</html>
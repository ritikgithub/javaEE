<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		Hey <%= request.getAttribute("username") %>
	</p>
	<p>
		You are Successfully Registered.
	</p>
	<p>
		<a href="Login.jsp">Go To Login Page</a>
	</p>
</body>
</html>
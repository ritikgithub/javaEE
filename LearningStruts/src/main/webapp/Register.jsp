<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<html:errors />
	<logic:notEmpty name="error" scope="request">
		<bean:write name="error" scope="request" />
	</logic:notEmpty>
	

	

	<html:form action="/register">
		<p>Enter Your name :</p>
		<html:text property="name" />
		<p>Enter Your Username :</p>
		<html:text property="username" />
		<p>Enter Your Password :</p>
		<html:text property="password" /><br><br>
		<html:submit>Register</html:submit>
	</html:form>
</body>
</html>
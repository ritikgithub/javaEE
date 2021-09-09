<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<logic:present name="error" scope="request" property="message">
			<div style="color: red">
				<bean:write  name="error" scope="request" property="message" />
			</div>
		</logic:present>
	

	<%-- 	<logic:present name="myForm" scope="request">
		<bean:write name="myForm" scope="request"/>

	</logic:present> --%>
	
	
<!-- 	<form action="login.do" method="post">
		<input type="text" name="username" />
		<input type="text" name="password" /> 
		<button type="submit">Login </button>
	</form>  -->

	<html:form action="/login">
		<p>Enter UserName:</p>
		<html:text property="username" />
		<p>Enter Password:</p>
		<html:text property="password" />
		<html:submit>LogIn</html:submit>
	</html:form> 

</body>
</html>
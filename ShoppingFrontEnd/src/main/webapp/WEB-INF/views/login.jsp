<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Shopping cart</h2>
	<h4>
	${msg}</h4>
	<form action="./login" method="post">
		<fieldset>
			<table>
				<tr>
					<td>Email or Phone</td>
					<td>Password</td>
				</tr>
				<tr>
					<td><input type="text" name="emailid"></td>
					<td><input type="password" name="password"></td>
					<td><input type="submit" value="Login"></td>
				</tr>
				<tr>
					<td></td>
					<td><h6>
							<a href="#">Forgotten account?</a>
							<a href="http://localhost:8080/WebApplication1/registration.jsp">Sign Up</a>
						</h6></td>
				</tr>
			</table>
		</fieldset>
	</form>

	

</body>
</html>

</body>
</html>
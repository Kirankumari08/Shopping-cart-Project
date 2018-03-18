<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./RegistrationServlet">
		<fieldset>

			<h1>Create an account</h1>
			<h4>It's free, and always will be.</h4>
			<h4>
	${msg}</h4>
			<table>
				<tr>
					<td><input type="text" size="22" name="firstname"
						placeholder="First name"></td>
					<td><input type="text" size="22" name="lastname"
						placeholder="Last name"></td>
				</tr>
				<tr>
					<td style="padding-top: 10px" colspan="2"><input size="49"
						type="text" name="emailId"
						placeholder="Mobile number or email address"></td>
				</tr>
				<tr>
					<td style="padding-top: 10px" colspan="2"><input size="49"
						type="password" name="enterPassword" placeholder="Enter password"></td>
				</tr>
				<tr>
					<td style="padding-top: 10px" colspan="2"><input size="49"
						type="password" name="confirmPassword" placeholder="Confirm password"></td>
				</tr>
			</table>
			<br>
			<h4>Birthday</h4>
			<br> <select name="date" >
				<%
					for (int i = 1; i <= 31; i++) {
				%>
				<option value="<%=i%>"><%=i%></option>
				<%
					}
				%>
			</select> <select name="month" >
				<%
					for (int i = 1; i <= 12; i++) {
				%>
				<option value="<%=i%>"><%=i%></option>
				<%
					}
				%>
			</select> <select name="year" >
				<%
					for (int i = 1905; i <= 2005; i++) {
				%>
				<option value="<%=i%>"><%=i%></option>
				<%
					}
				%>
			</select>
			<h6 style="display: inline">
				<a href="#">Why do I need to provide my date of birth?</a>
			</h6>
			<br> <br> <input type="radio" name="gender" value="male"
				checked> Male <input type="radio" name="gender"
				value="female"> Female <br> <br> <input
				type="submit" value="Create an account">
		</fieldset>
	</form>
</body>
</html>
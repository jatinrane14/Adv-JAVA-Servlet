	<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<div class='form-con'>
		<%
    		String error = (String) request.getAttribute("error");
			String success = (String) request.getAttribute("result");
    		if (error != null) {
		%>
   		     <p style="color:red;"><%= error %></p>
		<%
   			 }

    		if (success != null) {
		%>
        	<p style="color:green;"><%= success %></p>
		<%
    		}
		%>
			<form action='login' method='post' class='login-form'>
				<input type='text' placeholder="Enter Username: " name='username'><br></br>
				<input type='password' placeholder="Enter Your Password: " name='pass'><br>
			
				<input type='submit'>
			</form>
			<span>Did not have an account? <a href='regester.jsp'>Regester</a></span>
		</div>
		
	</body>
	</html>
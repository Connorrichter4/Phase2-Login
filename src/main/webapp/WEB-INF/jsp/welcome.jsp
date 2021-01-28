<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
	rel="stylesheet">
<link href="index.css" rel="stylesheet">
</head>
<body class='body-container d-flex justify-content-center'>
	<div class="user_card align-items-center">
		<h1>Welcome</h1>
		<h3>Username: ${user.name}</h3>
		<h3>Password: ${user.password}</h3>
	</div>
</body>
</html>
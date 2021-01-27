<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
	rel="stylesheet">
<link href="index.css" rel="stylesheet">
</head>
<body class='body-container'>
	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
				<div class="d-flex justify-content-center form_container">
					<form action='' method='POST'>
					<h1>Login</h1>
						<div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" name="name" class="form-control input_user"
							 placeholder="username">
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="password" class="form-control input_pass"
							 placeholder="password">
						</div>
						<div class="d-flex justify-content-center mt-3 login_container">
							<input type="submit" value="Login" class="btn login_btn" >
						</div>
						<div class="d-flex justify-content-center" style="color: red">${error}</div>
					</form>
				</div>

				<div class="mt-4">
					<div class="d-flex justify-content-center links">
						Don't have an account? <a href="/signup" class="ml-2">Sign Up</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
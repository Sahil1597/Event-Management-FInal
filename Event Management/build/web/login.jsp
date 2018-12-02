<!DOCTYPE HTML>
<html>
<head>
<style>

	a:hover
	{
	background-color: crimson;
	color: white;
	}
	
	a
	{
	text-decoration: none;
	color: crimson;
	font-size: 20px;
	margin: 5px;
	font-family: Segoe UI;
	padding: 5px 20px 5px 20px;
	border-radius: 5px;
	}
	
	<!--a:hover
	{
	background-color:black;	
	}-->
	
	button
	{
		background-color:orange;
	}
	button:hover
	{
	background-color:green;	
	}
	
	b
	{
	font-family:Comic Sans MS;
	}
</style>
</head>
<body style = "background-color:grey;font-family:Comic Sans MS">

	<div>
	<h1><a href = "main.jsp" style = "background-color:black;font-size:30px;text-decoration:none;float:right">Home</a></h1>
	</div>
	
	<br><br><h1 style = "text-align:center;">Sign in</h1>
	
	<center>
	<div style="background-color:lightblue;height:500px;width:600px;">
	
	<br><br>
	<img src = "use.png" height = "150" width = "150">
	<br>
	<h1>MEMBER  LOGIN</h1><br>
	
	<form action = "Login" method = "POST">
	<b>Username&nbsp <input type="text" placeholder = "Username" name = "Username" required></b><br><br>	
	<b>Password&nbsp <input type="password" placeholder = "Password" name = "Password" required></b><br><br>
	
	<select type = "select" name = "abc">
		<option value = "admin"> Admin </option>
		<option value = "user"> User </option>
	</select>
	<center><button type = "submit" style = "height:45px;width:100px;">Login</button></center><br>
	</form>
	<h1>Dont have an Account?<a href = "signup.jsp" style = "text-decoration:none;color:blue;font-size:30px">Sign Up</h1>
	
	</div>
	</center>
	
</body>
</html>
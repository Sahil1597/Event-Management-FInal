<%--
	
--%>
<%@page contentType = "text/html" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<!-- -->
<html>
<head>
<style>
body
{
background-position:fixed;
}

body
{
background-attachment:fixed;
}

#abc
{
	background-color:orange;
}

#abc:hover
{
	background-color:green;
}

#cde
{
	background-color:white;
}

#cde:hover
{
	background-color:red;
}

input
{
	padding:5px;
}


</style>

</head>

<body background = "blur.jpg" style = "font-family:Comic Sans MS">
<font color="black">
</font>

<center>
<div style="background-color:grey;height:1230px;width:1000px;padding: 0px 20px 20px 20px;">
<form  action = "Signup" style = "font-family:Comic Sans Ms">
<fieldset>
<legend style = "text-align:center;font-size:40px;">Sign Up</legend>
<font color= "white">
<pre>
<h2>First name 			<input type="text" placeholder="FirstName" name = "fname" required><br><br><br>

Last name 			<input type="text" placeholder="LastName" name = "lname" required><br><br><br>

Email-ID 			<input type="text" placeholder="Email-ID" name = "email" required><br><br><br><br>

Password    			<input type = "password" placeholder = "password" name = "password" required><br><br><br><br>

Confirm Password    		<input type = "password" placeholder = "confirm password" name = "confirm password" required><br><br><br><br>

Phone No. 			<input type="text "maxlength = 10 placeholder="Phone No." name = "phone" required><br><br><br><br>

Address 			<input type="text"  placeholder="Address" name = "address" required>


</h2>
</pre>
</font>


<center><button type = "submit" id = "abc" style = "height:50px;width:100px">Submit</button></center><br><br><br>


<center><button type = "reset" id = "cde" style = "height:50px;width:100px">Reset</button></center><br><br>    

</fieldset>
</form>
</div>
</center>


</body>
</html>

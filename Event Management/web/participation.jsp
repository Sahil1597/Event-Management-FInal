<html>
<head>
<style>
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


</style>
</head>
<body background = "for.jpg" width = 100%>
<br><br><br><br>
<form action = "participation_servlet"><h1>
<pre>
&nbsp&nbsp
First Name 		<input type = "text" placeholder = "First Name" style="height:30px;" name = "fname" required><br><br>
	

&nbsp&nbsp	
Last Name 		<input type = "text" placeholder = "Last Name" style = "height:30px;" name = "lname" required><br><br>


&nbsp&nbsp
Mobile Number 		<input type = "text" maxlength = 10 style = "height:30px;" name = "phone" required><br><br>


&nbsp&nbsp
Email Id		<input type = "text" placeholder = "@gmail.com" style = "height:30px;" name = "id" required><br><br>

&nbsp &nbsp;
Address 		<input type = "text" placeholder = "address" style = "height:30px;" name = "address" required><br><br>
</pre>


<center><button type = "submit" id = "abc" style = "height:50px;width:100px">Submit</button></center><br><br><br>


<center><button type = "reset" id = "cde" style = "height:50px;width:100px">Reset</button></center><br><br>    
</h1>
</form>


</body>
</html>
		
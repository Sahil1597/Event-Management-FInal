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
	padding:10px;
}


</style>

</head>

<body background = "border.jpg" style = "font-family:Comic Sans MS">
<font color="black">
</font>

<center>
<div style="background-color:silver;height:1230px;width:1000px;padding: 0px 20px 20px 20px;">
<form action = "Create_event" style = "font-family:Comic Sans Ms">
<fieldset>
<legend style = "text-align:center;font-size:40px;">Create Event</legend>
<font color= "black">
<pre>
<h2>Event name 			<input type="text" placeholder="Event Name" name = "ename" required><br><br><br>

Event Place 			<input type="text" placeholder="Event Place" name = "eplace" required><br><br><br>

Name 				<input type="text" placeholder="Full Name" name = "name" required><br><br><br>

Email-ID 			<input type="text" placeholder="Email-ID" name = "email" required><br><br><br><br>

Phone No. 			<input type="text "maxlength = 10 placeholder="Phone No." name = "phone" required><br><br><br><br>

Date 				<input type="date"  placeholder="mm/dd/yyyy" name = "edate" required><br><br><br>

<!--Description					     <textarea rows="5" cols="30" name="comment" form="usrform"></textarea>-->

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

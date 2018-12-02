<%
    if(session.getAttribute("name") == null)
{
response.sendRedirect("login.jsp");
}

else
{
%>

<html>
<head>
<style>
a
{
	color:black;
	border-radius:25px;
	margin: 5px;	
	padding: 5px 10px 5px 10px;
}

a:hover
{
	background-color:black;
	color:white;
	border-radius:5px;
}
</style>

</head>
<body style = "font-family:Comic Sans MS">
 <h2 style = "text-align:right"> Welcome <%= session.getAttribute("name") %> ! </h2><br>
 
<div style = "height:55px;width:100%;background-color:gold;border-radius:5px">
<a href ="home.jsp" style = "font-size:30px;text-decoration:none">Home</a>&nbsp &nbsp &nbsp &nbsp &nbsp
<a href ="viewevent.jsp" style = "font-size:30px;text-decoration:none">View Event</a>&nbsp &nbsp &nbsp &nbsp &nbsp
<a href ="createevent.jsp" style = "font-size:30px;text-decoration:none">Create Event</a>&nbsp &nbsp &nbsp &nbsp &nbsp
<a href ="created.jsp" style = "font-size:30px;text-decoration:none">Created Events</a>
<a href = "login.jsp" style = "font-size:30px;text-decoration:none;float:right">Logout</a><br>
</div>

<div style = "height:100%;width:100%;background-color:lightgrey;font-family:Calibri">
<img src = "bg.png" height = 100% % width = 100%;
</div>

</body>
</html>

<%
    }
%>
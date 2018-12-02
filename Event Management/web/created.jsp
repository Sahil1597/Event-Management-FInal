<%@page import="modal.event"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modal.eventDAO"%>
<html>
<head>
<style> 
	
table
{
	border-collapse:collapse;
}

table,th,td
{
	font-size:30px;
	border:5px solid black;
}

th,td
{
	padding:7px;
}

th
{
	background-color:green;
	color:white;
	height:70px;
}

td
{
	background-color:grey;
	color:white;
	width:300px;
}
	
</style>
</head>
<body background = "cc.jpg" width = 100%>
<center>
<br><br><br><br><br><br>
<br><br><br><br><br><br>
<%

	eventDAO edao = new eventDAO();
	ArrayList <event> el = new ArrayList <event> ();
    el = edao.showEvents((String)(session.getAttribute("ph")));
%>
<table>
    <tr>
        <th>Event Place</th>
        <th>Event Name</th>
        <th>Name</th>
            
    <tr>    
    <%
        for(event e:el)
        {
        %>
        <tr>
            <td><%=e.getEventname()%></td>
            <td><%=e.getEventplace()%></td>
            <td><%=e.getName()%></td> 
           
        </tr>
        <%
        }
    %>
</table>
</center>
</body>
</html>

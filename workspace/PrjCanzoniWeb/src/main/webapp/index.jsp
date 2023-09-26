<%@page import="model.Canzone"%>
<%@page import="presentation.MVCController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% MVCController controller = new MVCController();  %>

	<h1>Canzoni</h1>

	<table>
	  <tr>
	    <th>Titolo</th>
	    <th>Cantante</th>
	  </tr>
	  
	  <% for (Canzone c : controller.mostraCanzoni()){ %>
	  
		  <tr>
		    <td><%= c.getTitolo() %></td>
		    <td><%= c.getCantante() %></td>
		  </tr>
	  
	  <% } %>
	</table>






</body>
</html>
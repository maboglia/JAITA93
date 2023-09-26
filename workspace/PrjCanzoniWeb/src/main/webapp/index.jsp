
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

	<a href="provami">Add canzone</a>

	<table>
	  <tr>
	    <th>Titolo</th>
	    <th>Cantante</th>
	  </tr>
	  
	  <% for (Canzone c : controller.mostraCanzoni()){ %>
	  
		  <tr>
		    <td> <a target="_blank" href="https://www.google.com/search?q=<%= c.getTitolo() %>"><%= c.getTitolo() %></a> </td>
		    <td><a target="_blank" href="https://www.google.com/search?q=<%= c.getCantante() %>"><%= c.getCantante() %></a></td>
		  </tr>
	  
	  <% } %>
	</table>






</body>
</html>
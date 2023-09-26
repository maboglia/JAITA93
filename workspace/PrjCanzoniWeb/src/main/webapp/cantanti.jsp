
<%@page import="java.util.Set"%>
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

	<h1>Cantanti</h1>

	<a href="provami">Add canzone</a>

	<table>
	  <tr>
	    <th>Cantante</th>
	  </tr>
	  <% Set<String> cantanti = (Set<String>) request.getAttribute("cantanti"); %>
	  <% for (String c : cantanti){ %>
	  
		  <tr>
		    <td><a target="_blank" href="https://www.google.com/search?q=<%= c %>"><%= c %></a></td>
		  </tr>
	  
	  <% } %>
	</table>






</body>
</html>
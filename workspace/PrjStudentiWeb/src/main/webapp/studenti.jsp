<%@page import="controller.GestioneEsami"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Studente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Studenti</h1>


	<ul>
		<% GestioneEsami gestionale = new GestioneEsami(); %>
		<% ArrayList<Studente> studenti = gestionale.getStudenti(); %>
		<% for (Studente s : studenti){ %>
			<li><%= s.getNome() %></li>
		<% } %>
	
	</ul>

</body>
</html>
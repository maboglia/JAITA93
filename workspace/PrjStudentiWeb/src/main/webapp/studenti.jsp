<%@page import ="controller.GestioneEsami"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Studente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">

	<h1>Studenti</h1>

<div class="row">
	<form action="" method="post">
		<div class="col-4">
			<input class="form-control " type="text" name="nomeStudente" placeholder="Nome studente">
		</div>
		<div class="col-4">		
			<input class="btn btn-success" type="submit" value="add">
		</div>
	</form>
</div>


<div class="row">
	
	<table class="table table-striped">
	  <thead>
	    <tr>
	      <th scope="col">Id</th>
	      <th scope="col">Nome</th>
	      <th scope="col">Azione</th>
	    </tr>
	  </thead>
	  <tbody>
	  
		<% GestioneEsami gestionale = new GestioneEsami(); %>
		
		<%
		
			if (request.getParameter("nomeStudente") != null){
				String nome = request.getParameter("nomeStudente");
				//out.print("Vuoi aggiungere lo studente " +  nome);
				
				gestionale.addStudente(new Studente(0, nome));
			}
		
			if (request.getParameter("elimina")!=null && request.getParameter("user")!=null){
				int id = Integer.parseInt(request.getParameter("user"));
				gestionale.eliminaStudenteById(id);
			}
		
		
		%>
		
		
		
		
		<% ArrayList<Studente> studenti = gestionale.getStudenti(); %>
		<% for (Studente s : studenti){ %>	  
	  
		    <tr>
		      <td><%= s.getId() %></td>
		      <td><%= s.getNome() %></td>
		      <td>
		      	<form method="post">
		      		<input type="hidden" name="user" value="<%= s.getId() %>">
		      		<input class="btn btn-danger" type="submit" value="elimina" name="elimina">
	      		</form>
      		  </td>
		    </tr>
	    
		<% } %>
	  </tbody>
	</table>
</div>
	
	
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
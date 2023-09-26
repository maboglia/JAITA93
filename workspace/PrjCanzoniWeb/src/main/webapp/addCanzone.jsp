<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1><%= request.getAttribute("titoloPagina") %></h1>
	
	<h2>Il numero fortunato è: <%= request.getAttribute("numeroFortunato") %></h2>

</body>
</html>
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
	
	<form action="provami" method="post">
	
		<input type="text" name="titolo" placeholder="titolo"><br>
		<input type="text" name="cantante" placeholder="cantante"><br>
		<input type="submit" value="add">
	
	</form>



</body>
</html>
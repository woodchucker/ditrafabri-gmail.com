<%@page import="fabrizio.model.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="width:100%">
  <tr>
    <th>id</th>
    <th>name</th>
    <th>mail</th>
  </tr>
  

	<c:forEach items="${registro}" var="persona">
	<tr>
		<td>${persona.id}</td>
		<td>${persona.nome}</td>
		<td>${persona.mail}</td>
	</tr>
	</c:forEach>
 
</table>
<div>Inserisci una persona
</div>
<form action="addPersona" method="post">
	<input type="text" name="nome" >
	<input type="text" name="mail" >
	<button type="submit">Salva</button>
</form>

<div>Cancella una persona
</div>
<form action="remPersona" method="post">
	<input type="text" name="id" >
	<button type="submit">Cancella</button>
</form>

<div>Aggiorna una persona
</div>
<form action="updatePersona" method="post">
	<input type="text" placeholder="id" name="id" >
	<input type="text" placeholder="nome" name="nome" >
	<input type="text" placeholder="mail" name="mail" >
	
	<button type="submit">Aggiorna</button>
</form>

</body>
</html>
<%@page import="fabrizio.model.Persona"%>
<%@page import="fabrizio.model.Registro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<% 
	Registro r = (Registro)request.getAttribute("registro");
	for(Persona p : r.getPersone()){
%>
<div>

<% out.append(p.toString()); %>

</div>
		
<%
	}
%>
</body>
</html>
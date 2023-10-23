<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirme a remoção</title>
</head>
<body>
	<h1>Tem certeza de que deseja remover o pedido ${pedidoId}?</h1>
	<a href="/crud-proj/RemoverPedido?id=${pedidoId}">Sim</a><br>
	<a href="/crud-proj/listaPedidos.jsp">Não</a>
</body>
</html>
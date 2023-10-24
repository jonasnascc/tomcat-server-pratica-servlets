<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.edu.academico.nascimento.jonas.model.Pedido" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditarPedido</title>
</head>
<body>
	<h1>Editar pedido.</h1>
	<form action="AtualizarPedido?id=${pedido.id}" method="POST">
		Nome do produto: <input type="text" value="${pedido.nomeProduto}" name="productName"/><br>
		Preço do produto: <input type="text" value="${pedido.precoProduto}" name="productPrice" /><br><br>
		Data do pedido: <input type="text" value=<fmt:formatDate value="${pedido.dataPedido}" pattern="dd/MM/yyyy"/> name="orderDate" /><br>
		CPF do cliente: <input type="text" value="${pedido.cpfCliente}" name="clientId" /><br>
		
		<input type="submit" name="cadastrar"/>
	</form>

</body>
</html>
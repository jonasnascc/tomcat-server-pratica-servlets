<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List,br.edu.academico.nascimento.jonas.model.Pedido" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de pedidos</title>
</head>
<body>
	<c:if test="${not empty pedido}">
		<p>Pedido ${pedido.id} do produto '${pedido.nomeProduto}' feito com sucesso! </p>
	</c:if>

	<h1>Lista de pedidos</h1>
	
		<c:choose>
			<c:when test="${not empty listaPedidos}">
			<table border="1">
				<tr>
					<th>Id</th>
					<th>Data</th>
					<th>Nome do produto</th>
					<th>Preço do produto</th>
					<th>CPF do cliente</th>
					<th>*</th>
					<th>*</th>
				</tr>
				<c:forEach items="${listaPedidos}" var="pedido">	
					<tr>
						<td>${pedido.id}</td>
						<td><fmt:formatDate value="${pedido.dataPedido}" pattern="dd/MM/yyyy"/></td>
						<td>${pedido.nomeProduto}</td>
						<td>${pedido.precoProduto}</td>
						<td>${pedido.cpfCliente}</td>
						<td><a href="/crud-proj/EditarPedido?id=${pedido.id}">Editar</a></td>
						<td><a href="/crud-proj/ConfirmaExclusao?id=${pedido.id}">Remover</a></td>
					</tr>	
				</c:forEach>	
				</table>
			</c:when>
			<c:otherwise>
				<p>A lista está vazia!</p>
			</c:otherwise>
		</c:choose>
	
</body>
</html>
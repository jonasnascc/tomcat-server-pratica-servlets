<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastrar um novo pedido.</h1>
	<form action="NovoPedido" method="POST">
		Nome do produto: <input type="text" name="productName"/><br>
		Preço do produto: <input type="text" name="productPrice" /><br><br>
		Data do pedido: <input type="text" name="orderDate" /><br>
		CPF do cliente: <input type="text" name="clientId" /><br>
		
		<input type="submit" name="cadastrar"/>
	</form>

</body>
</html>
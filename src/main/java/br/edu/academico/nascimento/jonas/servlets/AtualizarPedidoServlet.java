package br.edu.academico.nascimento.jonas.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.academico.nascimento.jonas.model.BancoPedidos;
import br.edu.academico.nascimento.jonas.model.Pedido;

@WebServlet("/AtualizarPedido")
public class AtualizarPedidoServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeProduto = (String) req.getParameter("productName");
		String precoParam = (String)req.getParameter("productPrice");
		String cpfCliente = (String) req.getParameter("clientId");
		String paramData = (String) req.getParameter("orderDate");
		
		Date dataPedido= null;
		try{
			int pedidoId = Integer.parseInt((String)req.getParameter("id"));
			
			BigDecimal precoProduto = BigDecimal.valueOf(Double.valueOf(precoParam.replace(",","."))) ;

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataPedido = sdf.parse(paramData);
			
			Pedido pedido = new Pedido(nomeProduto, precoProduto, dataPedido, cpfCliente);
			pedido.setId(pedidoId);
			
			BancoPedidos banco = BancoPedidos.getInstance();
			banco.atualizarPedido(pedido);
			
			req.setAttribute("pedido", pedido);
			
			resp.sendRedirect("ListaPedidos");
			
		}catch(ParseException ex) {
			ex.printStackTrace();
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
	}
	
}

package br.edu.academico.nascimento.jonas.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.academico.nascimento.jonas.model.BancoPedidos;
import br.edu.academico.nascimento.jonas.model.Pedido;

@WebServlet("/NovoPedido")
public class NovoPedidoServlet extends HttpServlet{
	
	public NovoPedidoServlet () {}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeProduto = (String) req.getParameter("productName");
		String precoParam = (String)req.getParameter("productPrice");
		String cpfCliente = (String) req.getParameter("clientId");
		String paramData = (String) req.getParameter("orderDate");
		
		Date dataPedido= null;
		try{
			
			BigDecimal precoProduto = BigDecimal.valueOf(Double.valueOf(precoParam.replace(",","."))) ;

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataPedido = sdf.parse(paramData);
			
			Pedido pedido = new Pedido(nomeProduto, precoProduto, dataPedido, cpfCliente);
			
			BancoPedidos banco = BancoPedidos.getInstance();
			banco.salvarPedido(pedido);
			
			req.setAttribute("pedido", pedido);
			
			resp.sendRedirect("ListaPedidos");
			
		}catch(ParseException ex) {
			ex.printStackTrace();
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
	}
	
}

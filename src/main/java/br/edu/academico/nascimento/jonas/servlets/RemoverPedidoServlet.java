package br.edu.academico.nascimento.jonas.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.academico.nascimento.jonas.model.BancoPedidos;

@WebServlet("/RemoverPedido")
public class RemoverPedidoServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pedidoId = Integer.valueOf((String)req.getParameter("id"));
		
		BancoPedidos banco = BancoPedidos.getInstance();
		
		req.setAttribute("pedido", banco.obterPedido(pedidoId));
		
		banco.removerPedido(pedidoId);
		
		resp.sendRedirect("ListaPedidos");
	}
}

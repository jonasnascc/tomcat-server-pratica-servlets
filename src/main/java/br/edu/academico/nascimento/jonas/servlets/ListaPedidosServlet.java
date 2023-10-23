package br.edu.academico.nascimento.jonas.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.edu.academico.nascimento.jonas.model.BancoPedidos;
import br.edu.academico.nascimento.jonas.model.Pedido;

@WebServlet("/ListaPedidos")
public class ListaPedidosServlet extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BancoPedidos banco = BancoPedidos.getInstance();
		
		List<Pedido> pedidos = banco.listarPedidos();
		
		RequestDispatcher rd = req.getRequestDispatcher("/listaPedidos.jsp");
		
		req.setAttribute("listaPedidos", banco.listarPedidos());
		
		rd.forward(req, resp);
	}
	
}

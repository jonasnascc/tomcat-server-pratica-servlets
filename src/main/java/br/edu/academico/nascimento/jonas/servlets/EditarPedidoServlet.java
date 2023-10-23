package br.edu.academico.nascimento.jonas.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.academico.nascimento.jonas.model.BancoPedidos;

@WebServlet("/EditarPedido")
public class EditarPedidoServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pedidoId = Integer.parseInt((String)req.getParameter("id"));
		

		BancoPedidos banco = BancoPedidos.getInstance(); 
		req.setAttribute("pedido", banco.obterPedido(pedidoId));
		
		RequestDispatcher rd = req.getRequestDispatcher("/editarPedido.jsp");
		
		req.setAttribute("pedido", banco.obterPedido(pedidoId));
		
		rd.forward(req, resp);
	}
}

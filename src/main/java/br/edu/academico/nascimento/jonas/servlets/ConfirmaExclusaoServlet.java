package br.edu.academico.nascimento.jonas.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ConfirmaExclusao")
public class ConfirmaExclusaoServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pedidoId = Integer.valueOf((String)req.getParameter("id"));
		
		RequestDispatcher rd = req.getRequestDispatcher("/removerPedido.jsp");
		
		req.setAttribute("pedidoId", pedidoId);
		
		rd.forward(req, resp);
	}

}

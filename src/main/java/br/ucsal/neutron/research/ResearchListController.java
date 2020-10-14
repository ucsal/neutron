package br.ucsal.neutron.research;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResearchListController
 */
@WebServlet("/research")
public class ResearchListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Research> researches = ResearchDAO.listar();
		request.setAttribute("researches", researches);
		request.getRequestDispatcher("./research/list.jsp").forward(request, response);
	}



}

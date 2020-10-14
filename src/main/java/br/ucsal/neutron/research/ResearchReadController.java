package br.ucsal.neutron.research;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/research/view")
public class ResearchReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		Research research = ResearchDAO.findById(id);
		request.setAttribute("research", research);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("../research/view.jsp");
		dispatcher.forward(request, response);
	}

}

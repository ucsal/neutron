package br.ucsal.neutron.research;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ResearchUpdateController
 */
@WebServlet("/research/edit")
public class ResearchUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		Research research = ResearchDAO.findById(id);
		request.setAttribute("research", research);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("../research/edit.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Research research = new Research(); 
		research.setId(id);
		research.setName(name);
		research.setDescription(description);
		ResearchDAO.atualizar(research);
		request.getSession().setAttribute("save_feedback", true);

		response.sendRedirect("../research");
		
	}

}

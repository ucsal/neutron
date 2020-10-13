package br.ucsal.neutron.research;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ResearchSaveController
 */
@WebServlet("/research/save")
public class ResearchSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
     
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		
		Research research = new Research(name, description);
		ResearchDAO.salvar(research);
		request.getSession().setAttribute("save_feedback", true);

		response.sendRedirect("../research");
	}

}

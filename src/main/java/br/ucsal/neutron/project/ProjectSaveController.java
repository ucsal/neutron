package br.ucsal.neutron.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/projectsave")
public class ProjectSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProjectDAO dao = new ProjectDAO();

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		
		Project project = new Project(title, description);
		dao.salvar(project);
		request.getSession().setAttribute("save_sucess", true);
		
		response.sendRedirect("./projectlist");
		
	}

}

package br.ucsal.neutron.course;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.neutron.course.dao.CourseDAO;

@WebServlet("/coursesave")
public class CourseSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        CourseDAO dao = new CourseDAO();
		String name = request.getParameter("name");
		String coordinator = request.getParameter("coordinator");
		String description = request.getParameter("description");
		
		Course course = new Course(name, coordinator, description);
		dao.salvar(course);
		request.getSession().setAttribute("save_feedback", true);

		response.sendRedirect("./course");
	}

}

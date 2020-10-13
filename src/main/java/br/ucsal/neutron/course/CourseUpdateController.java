package br.ucsal.neutron.course;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/course/edit")
public class CourseUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Course course = CourseDAO.findById(id);
		request.setAttribute("course", course);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("../course/edit.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String coordinator = request.getParameter("coordinator");
		String description = request.getParameter("description");
		Course course = new Course(); 
		course.setId(id);
		course.setName(name);
		course.setCoordinator(coordinator);
		course.setDescription(description);
		CourseDAO.atualizar(course);
		request.getSession().setAttribute("save_feedback", true);

		response.sendRedirect("../course");
		
	}

}

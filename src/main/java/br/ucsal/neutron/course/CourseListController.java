package br.ucsal.neutron.course;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.neutron.course.dao.CourseDAO;

@WebServlet("/course")
public class CourseListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CourseDAO dao = new CourseDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Course> courses = dao.listar();
		
		request.setAttribute("courses", courses);
		request.getRequestDispatcher("./course/list.jsp").forward(request, response);
	}

	

}

package br.ucsal.neutron.course;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/course/view")
public class CourseReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Course course = CourseDAO.findById(id);
		request.setAttribute("course", course);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("../course/view.jsp");
		dispatcher.forward(request, response);
	}


}

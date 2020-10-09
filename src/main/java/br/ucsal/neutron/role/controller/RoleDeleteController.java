package br.ucsal.neutron.role.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.neutron.course.dao.CourseDAO;
import br.ucsal.neutron.role.dao.RoleDAO;


@WebServlet("/roledelete")
public class RoleDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	RoleDAO dao = new RoleDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		dao.delete(id);
		response.sendRedirect("./role/list.jsp");
	}
    
}

	

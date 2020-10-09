package br.ucsal.neutron.role;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rolesave")
public class RoleSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RoleDAO dao = new RoleDAO();
		String name = request.getParameter("name");
		String description = request.getParameter("description");

		Role role = new Role(name, description);
		dao.salvar(role);
		request.getSession().setAttribute("salve_sucess", true);

		response.sendRedirect("./rolelist");
		
	
	}

}

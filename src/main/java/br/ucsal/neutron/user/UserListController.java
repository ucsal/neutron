package br.ucsal.neutron.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user/")
public class UserListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserListController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDAO dao = new UserDAO();
		List<User> usuarios = dao.listarTodos();
		request.setAttribute("users", usuarios);
		request.getRequestDispatcher("/user/list.jsp").forward(request, response);
	}

}
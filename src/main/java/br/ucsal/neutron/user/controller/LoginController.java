package br.ucsal.neutron.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.neutron.user.dao.UserDAO;
import br.ucsal.neutron.user.model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/user/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		UserDAO dao = new UserDAO();
		List<User> usuarios = dao.Listar();
		String user = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		User userLogin = new User(user, password);
		for (User usuario : usuarios) {
			if (userLogin.equals(usuario)) {
				request.getSession().setAttribute("userName", user);
				response.sendRedirect("/user/ListController");
			} else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}

	}

}
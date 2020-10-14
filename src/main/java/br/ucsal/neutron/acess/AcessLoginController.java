package br.ucsal.neutron.acess;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.neutron.user.User;
import br.ucsal.neutron.user.UserDAO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class AcessLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AcessLoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDAO dao = new UserDAO();
		String user = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		User userLogin = dao.buscarLogin(user);
		if (userLogin == null || !userLogin.getPassword().equals(password)) {
			request.setAttribute("erro", "Usuario ou Senha invalidos");
			request.getRequestDispatcher("/user/login.jsp").forward(request, response);
		} else {
			request.getSession().setAttribute("usuario", userLogin);
			response.sendRedirect("/user/dashboard");
		}

	}

}
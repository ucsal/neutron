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

	private AcessBO bo = new AcessBO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("userpassword");

		User user = bo.login(username,password);
		if (user == null) {
			request.setAttribute("erro", "Usuário ou Senha inválidos");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			request.getSession().setAttribute("usuario", user);
			response.sendRedirect("/user/dashboard");
		}

	}

}
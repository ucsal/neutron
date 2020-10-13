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

@WebServlet("/user/ListController")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDAO dao = new UserDAO();
		List<User> usuarios = dao.Listar();
		request.setAttribute("users", usuarios);
		request.getRequestDispatcher("/user/userlist.jsp").forward(request, response);
	}

}
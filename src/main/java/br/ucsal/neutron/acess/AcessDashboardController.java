package br.ucsal.neutron.acess;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.neutron.user.User;


@WebServlet("/user/dashboard")
public class AcessDashboardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public AcessDashboardController() {
		super();
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = (User) request.getSession().getAttribute("usuario");
		request.setAttribute("user", user);
		request.getRequestDispatcher("/user/dashboard.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}

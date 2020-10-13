package br.ucsal.neutron.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user/save")
public class UserSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserSaveController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDAO dao = new UserDAO();
		String mensagem = "Usuário criado com sucesso!";
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		
		dao.save(new User(userName, passWord));
		
		request.setAttribute("mensagem", mensagem);
		request.getRequestDispatcher("/user/login.jsp").forward(request, response);
		
	}

}
package br.ucsal.neutron.teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/teacher/form")
public class TeacherFormController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Degree> degrees = new ArrayList<Degree>();
		degrees.add(new Degree(1l, "Graduado"));
		degrees.add(new Degree(2l, "Especialista"));
		degrees.add(new Degree(3l, "Mestre"));
		degrees.add(new Degree(3l, "Doutor"));

		request.setAttribute("degrees", degrees);

		
		request.setAttribute("teacher", new Teacher());
		request.getRequestDispatcher("/teacher/form.jsp").forward(request, response);

	}

	
}

package br.ucsal.neutron.teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/teacher/list")
public class TeacherListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Teacher> teachers = new ArrayList<Teacher>();
		Teacher teacher = new Teacher();
		teacher.setName("Mario Jorge");
		teachers.add(teacher);
		request.setAttribute("teachers", teachers);
		request.getRequestDispatcher("/teacher/list.jsp").forward(request, response);
	}
}

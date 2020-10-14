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

	private DegreeBO degreeBO = new DegreeBO();
	
	private TeacherBO teacherBO = new TeacherBO();

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Degree> degrees = degreeBO.list();
		request.setAttribute("degrees", degrees);
		request.setAttribute("teacher", new Teacher());
		request.getRequestDispatcher("/teacher/form.jsp").forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String titulo = req.getParameter("degree");
		String nome = req.getParameter("name");

		Teacher teacher = new Teacher();
		if(id !=null && !id.isEmpty()) {
			teacher.setId(Long.parseLong(id));
		}
		teacher.setName(nome);
		Degree degree = new Degree();
		if(titulo !=null && !titulo.isEmpty()) {
			degree.setId(Long.parseLong(titulo));
		}
		teacher.setDegree(degree);
		
		teacherBO.savar(teacher);
		
		resp.sendRedirect("/teacher/list");
	}

	
}

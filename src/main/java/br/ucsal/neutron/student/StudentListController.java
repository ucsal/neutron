package br.ucsal.neutron.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentListController extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private StudentDAO stDao = new StudentDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Student> students = stDao.listar();
        request.setAttribute("students", students);
        request.getRequestDispatcher("./student/list.jsp").forward(request, response);

    }
}
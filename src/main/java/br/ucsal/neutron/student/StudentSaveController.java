package br.ucsal.neutron.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student/save")

public class StudentSaveController extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        StudentDAO stdDao = new StudentDAO();
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String email = request.getParameter("email");
        String enrollment = request.getParameter("enrollment");

        Student student = new Student(name, course, email, enrollment);
        stdDao.save(student);

        request.getSession().setAttribute("salvo", true);

        response.sendRedirect("./student");

    }

}
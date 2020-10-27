package br.ucsal.neutron.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentremove")
public class StudentRemoveController extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    StudentDAO stdDao = new StudentDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        stdDao.remover(id);
        response.sendRedirect("./student");

    }

}
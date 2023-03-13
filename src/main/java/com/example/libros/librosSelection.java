package com.example.libros;

import com.example.libros.DAO.MLD_DAO;
import com.example.libros.DAO.MLD_DAOlibro;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "librosSelection", urlPatterns = "/SelectCategory.do")
public class librosSelection extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public librosSelection() {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cat = request.getParameter("category");

        MLD_DAO MLD_libro = new MLD_DAOlibro();



        ArrayList<MLDlibros> MLD_librosByCategory = MLD_libro.MLD_getAllLibro();

        List<String> MLD_category = MLD_libro.MLD_BooksByCategory(cat);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println ("<table>");
        out.println ("<tbody>");
        out.println ("<h1> Libros por categoria </h1>");
        out.println ("<h2> Tipos: " + MLD_category + "</h2>");
        out.println (MLD_librosByCategory);
        out.println ("</table>");
        out.println ("</tbody>");


    }
}

package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio7", urlPatterns = {"/ejercicio7"})
public class ejercicio7 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica 1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ejercicio 7</h1>");
            out.println("<form action='salida7' method='post'>");
            out.println("<label>Tamaño de la matriz N * N :</label>");
            out.println("<input type='numer' name='anio'>");
            out.println("<br>");
            out.println("<input type='submit' value='Calcular'>");
            out.println("<br>");
            out.println("</form>");
            out.println("<br>");
            out.println("<a href='index.html'>Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}

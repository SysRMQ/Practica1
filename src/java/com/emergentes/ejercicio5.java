
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio5", urlPatterns = {"/ejercicio5"})
public class ejercicio5 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica 5</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ejercicio 5</h1>");
            out.print("<form action='salida5' method='post'>");
            out.println("Primer Numero:");
            out.println("<input type='numer' name='numeroA' >");
            out.println("<br><br>");
            out.println("Segundo Numero:");
            out.println("<input type='numer' name='numeroB' >");
            out.println("<br><br>");
            out.println("<select name='operador'>");
            out.println("<option value='sum'>Suma</option>");
            out.println("<option value='res'>Resta</option>");
            out.println("<option value='mul'>Multiplicación</option>");
            out.println("<option value='div'>División</option>");
            out.println("</select>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<a href='index.html'>Volver al inicio</a>");
            out.println("</body>");
            out.println("</html");    
        }
    }

}

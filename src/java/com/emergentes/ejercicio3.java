package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio3", urlPatterns = {"/ejercicio3"})
public class ejercicio3 extends HttpServlet {

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
            out.println("<h1>Ejercicio 3</h1>");
            out.println("<form action='ejercicio3' method='post'>");
            out.println("<label>E3 Nombre:</label>");
            out.println("<input type='text' name='nombre'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label>E3 Año de nacimiento:</label>");
            out.println("<input type='numer' name='anio'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("<br>");
            out.println("</form>");
            out.println("<br><br>");
            out.println("<a href='index.html'>Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String anio = request.getParameter("anio");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Salida 1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ejercicio 1</h1>");
            out.println("<h2>E3.- Su edad es " + (2021 - Integer.parseInt(anio)) + " años</h2>"); 
            out.println("<br><br>");
            out.println("<a href='ejercicio3'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
}
    }
}

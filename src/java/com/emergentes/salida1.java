package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PCC
 */
@WebServlet(name = "salida1", urlPatterns = {"/salida1"})
public class salida1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
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
            out.println("<h2>Su edad es " + (2021 - Integer.parseInt(anio)) + " años</h2>"); 
            out.println("<br><br>");
            out.println("<a href='ejercicio1'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
    }
  }
}
    
    

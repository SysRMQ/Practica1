package com.emergentes;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ejercicio4"})
public class ejercicio4 extends HttpServlet {

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
            out.println("<h1>Ejercicio 4</h1>");
            out.println("<h2>Cambio de Bs A $$ Y VICEVERSA</h2>");
            out.print("<form action='salida4' method='post'>");
            out.println("Monto: ");
            out.println("<input type='numer' name='tdinero' >");
            out.println("<br><br>");
            out.println("Seleccione tipo de moneda a cambiar:");
            out.println("<select name='tipo'>");
            out.println("<option value='dol' >Dolar</option>");
            out.println("<option value='bol'>Boliviano</option>");
            out.println("</select>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Cambiar'>");
            out.println("<br><br>");
            out.println("<a href='index.html'>Volver al inicio</a>");
            out.println("</form>");
            out.println("<br>");
            out.println("</body>");
            out.println("</html>");
    }
   }
}

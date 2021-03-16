package com.emergentes;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/salida4"})
public class salida4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String tipo = request.getParameter("tipo");
            String tdinero = request.getParameter("tdinero");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica 1</title>");
            out.println("</head>");
            out.println("<body>");
            if ( "dol".equals(tipo)) {
                out.println("<h1>El monto en dolares es : " + Double.parseDouble(tdinero) / 6.97 + "</h1>");
                
            } else {
                out.println("<h1>El monto en bolivianos es: " + Double.parseDouble(tdinero) * 6.97 + "</h1>");
            }
            out.println("<br><br>");
            out.println("<a href='ejercicio4'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}

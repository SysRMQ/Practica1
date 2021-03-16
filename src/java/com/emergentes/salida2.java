package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida2", urlPatterns = {"/salida2"})
public class salida2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String numero = request.getParameter("numero");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>salida2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("El factorial de "+ numero +" es "+ factorial(Integer.parseInt(numero)));
            out.println("<br><br>");
            out.println("<a href='ejercicio2'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    private int factorial(int a) {
        if (a <= 1)
        return 1;
        else {
        a = a * factorial(a - 1);
        return a;
        }
    }

}

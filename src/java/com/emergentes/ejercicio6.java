
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio6", urlPatterns = {"/ejercicio6"})
public class ejercicio6 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio6</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> </h1>");
            int suma = 0;
            suma = Obtener_suma();
            if (suma == 7 || suma == 11) {
                out.println("<h1>La suma es: " + suma + " ¡¡Gano el juego!! </h1>");
            } else {
                out.println("<h1>La suma es: " + suma + " ¡¡Perdio el juego!! </h1>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
        

    }  
    private int Obtener_suma() {
        int dado1=(int)(Math.random()*6)+1;
        int dado2=(int)(Math.random()*6)+1;
        return(dado1 + dado2);
    }
}

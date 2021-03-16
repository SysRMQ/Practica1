
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida7", urlPatterns = {"/salida7"})
public class salida7 extends HttpServlet {

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
            out.println("<title>Practica 1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Matriz Caracol Generada</h1>");
            int n = Integer.parseInt(anio);
            int c = 1;
            int mat[][] = new int[100][100];
            for (int r = 0; r < n / 2; r++) {
                for (int i = r; i < n - r; i++) {
                    mat[r][i] = c;
                    c++;
                }
                for (int i = r + 1; i < n - r; i++) {
                    mat[i][n - r - 1] = c;
                    c++;
                }
                for (int i = n - r - 2; i > r; i--) {
                    mat[n - r - 1][i] = c;
                    c++;
                }
                for (int i = n - r - 1; i > r; i--) {
                    mat[i][r] = c;
                    c++;
                }
            }
            
            out.println("<table border =1>");
            for (int i = 0; i < n; i++) {
                out.println("<tr>");
                for (int j = 0; j < n; j++) {
                    out.print("<td>" + mat[i][j] + "</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<br><br>");
            out.println("<a href='ejercicio7'>Volver</a>");
            out.println("</body>");
            out.println("</html>");

        }
    }

}

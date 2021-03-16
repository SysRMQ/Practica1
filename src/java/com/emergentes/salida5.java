
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida5", urlPatterns = {"/salida5"})
public class salida5 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String operador = request.getParameter("operador");
            String num1 = request.getParameter("numeroA");
            String num2 = request.getParameter("numeroB");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>salida5</title>");
            out.println("</head>");
            out.println("<body>");
            if("sum".equals(operador)){
                out.println("El valor de la suma es : ");
                out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
            }
            else{
                if("res".equals(operador)){
                out.println("El valor de la resta es : ");
                out.println(Integer.parseInt(num1) - Integer.parseInt(num2));
                }
                else{
                    if("mul".equals(operador)){
                out.println("El valor de la multiplicacion es : ");
                out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
                }
                    else{
                        if(Integer.parseInt(num2) != 0){
                        out.println("El valor de la division es : ");
                        out.println(Integer.parseInt(num1) / Integer.parseInt(num2));
                        }
                        else{
                            out.println("no existe la division entre cero");
                        }
                    }
                }
            }
            out.println("<br>");
            out.println("<a href='ejercicio5'>Volver</a>");
            out.println("</body>");
            out.println("</html>");

        }
    }
}

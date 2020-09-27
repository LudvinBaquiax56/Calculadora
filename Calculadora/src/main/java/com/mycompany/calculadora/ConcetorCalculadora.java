/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author baquiax
 */
@WebServlet(name = "ConcetorCalculadora", urlPatterns = {"/ConcetorCalculadora"})
public class ConcetorCalculadora extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConcetorCalculadora</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConcetorCalculadora at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String cadena = "";
        Calculadora calc = new Calculadora();
        if (request.getParameter("suma") != null) {
            cadena = cadena + "<h1>Suma</h1>" + calc.suma(num1, num2);
            //out.println("<h1>Suma</h1>" + calc.suma(num1, num2));
        }
        if (request.getParameter("resta") != null) {
            cadena = cadena + "<h1>Resta</h1>" + calc.resta(num1, num2);
            //out.println("<h1>Resta</h1>" + calc.resta(num1, num2));
        }
        if (request.getParameter("multiplicacion") != null) {
            cadena = cadena + "<h1>Multiplicacion</h1>" + calc.multiplicacion(num1, num2);
            //out.println("<h1>Multiplicacion</h1>" + calc.multiplicacion(num1, num2));
        }
        if (request.getParameter("division") != null) {
            cadena = cadena + "<h1>Division</h1>" + calc.division(num1, num2);
            //out.println("<h1>Division</h1>" + calc.division(num1, num2));
        }
        if (request.getParameter("numMayor") != null) {
            cadena = cadena + "<h1>El numero mayor es: </h1>" + calc.numeroMayor(num1, num2);
            //out.println("<h1>El numero mayor es: </h1>" + calc.numeroMayor(num1, num2));
        }
        if (request.getParameter("potencia") != null) {
            cadena = cadena + "<h1>Potencia</h1>" + calc.potencia(num1, num2);
            //out.println("<h1>Potencia</h1>" + calc.(num1, num2));
        }
        if (request.getParameter("binario") != null) {
            cadena = cadena + "<h1>El numero binario de: </h1>" + num1 + ", es: " + calc.binario(num1);
            cadena = cadena + "<h1>El numero binario de: </h1>" + num2 + ", es: " + calc.binario(num2);
            //out.println("<h1>El numero binario de: </h1>" + num1 + ", es: " + calc.binario(num1));
            //out.println("<h1>El numero binario de: </h1>" + num2 + ", es: " + calc.binario(num2));
        }
        //processRequest(request, response);
        request.setAttribute("Resultado", cadena);
        RequestDispatcher despachar = request.getRequestDispatcher("index.jsp");
        despachar.forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaesfot.holamundoclient;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import esfot.soa.HolaMundo_Service;

/**
 *
 * @author Nohemi
 */
@WebServlet(name = "HolaServlet", urlPatterns = {"/HolaServlet"})
public class HolaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @WebServiceRef
    private holamundo_Service service;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HolaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HolaServlet at " + request.getContextPath() + "</h1>");
            try
            {
              esfot.soa.holamundo port=service.getHolaMundoPort();
              String cadena=request.getParameter("x");
              java.lang.String result =port.saluda(cadena);
              out.println("Mensaje = "+result);
            }
            catch(Exception ex)
            {
                
            }          
            out.println("</body>");
            out.println("</html>");
        }finally {
            out.close();
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}




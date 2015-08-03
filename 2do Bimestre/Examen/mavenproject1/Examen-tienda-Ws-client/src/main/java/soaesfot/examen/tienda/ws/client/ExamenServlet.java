/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaesfot.examen.tienda.ws.client;

import esfot.soa.PeliculaTO;
import esfot.soa.TiendaDvdWS;
import esfot.soa.TiendaDvdWS_Service;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import static java.util.Collections.list;

import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Nohemi
 */
@WebServlet(name = "ExamenServlet", urlPatterns = {"/ExamenServlet"})
public class ExamenServlet extends HttpServlet {
    
    @WebServiceRef
    private  TiendaDvdWS_Service service;

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
        
        try  (PrintWriter out = response.getWriter())
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ExamenServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Información Pelicula " + request.getContextPath() + "</h1>");
            try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Peliculas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Peliculas desde "
                    + request.getContextPath() + "</h1>");
            try { 
                
                esfot.soa.TiendaDvdWS port =  service.getTiendaDvdWSPort();
                java.lang.String director = request.getParameter("d");
                
                
                        
                           
            List<PeliculaTO> listar = port.buscarDirector(director);
                        
               
                              
                for (PeliculaTO a : listar) {
                out.println("<p>Director:" + a.getDirector()+"</p>");
                
                out.println("<p>Titulo:" + a.getTitulo() +"</p>" );
                out.println("<p>Precio:" + a.getPrecio() +"</p>");
            }
             
            } catch (Exception ex) {

            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
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
        processRequest(request, response);
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


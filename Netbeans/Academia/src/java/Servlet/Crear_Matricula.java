
package Servlet;

import Modelo.Matricula;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Crear_Matricula", urlPatterns = {"/Crear_Matricula"})
public class Crear_Matricula extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String codigomatricula = request.getParameter("codmatricula");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String sede = request.getParameter("sede");
        String ciclo = request.getParameter("ciclo");
        String turno = request.getParameter("Turno");
        
        Matricula objMatricula = new Matricula();
        if(objMatricula.GetRegistrarMatricula(codigomatricula,nombre,apellido,sede,ciclo,turno)) 
        {
            String redirectURL="registrar_alumno.jsp";
            response.sendRedirect(redirectURL);
        }else{
            String redirectURL="registrar_alumno.jsp";
            response.sendRedirect(redirectURL);
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

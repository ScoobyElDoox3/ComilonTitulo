/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Valentin Levenier
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

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
        String action = request.getParameter("action");
        if(action.equals("ingresar"))
        {
            String usuario = request.getParameter("txtUser");
            String pass = request.getParameter("txtPass");
            int tipoUsuario = Integer.parseInt(request.getParameter("txtTipo"));
            UsuarioController uc = new UsuarioController();
            String xd = uc.Ingresar(usuario, pass,tipoUsuario);
        
            request.getRequestDispatcher("AdministrarUsuarios.jsp").forward(request, response);
        }
        if(action.equals("modificar"))
        {
            String usuario = request.getParameter("txtUser");
            String pass = request.getParameter("txtPass");
            int codigo =  Integer.parseInt(request.getParameter("txtCodigo"));
            UsuarioController us = new UsuarioController();
            String xd = us.Modificar(usuario, pass, codigo);
       
            request.getRequestDispatcher("AdministrarUsuarios.jsp").forward(request, response);
        }
        if(action.equals("eliminar"))
        {
            int codigo =  Integer.parseInt(request.getParameter("codHidden"));
            UsuarioController us = new UsuarioController();
            String xd = us.eliminar(codigo);
            request.getRequestDispatcher("AdministrarUsuarios.jsp").forward(request, response);
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

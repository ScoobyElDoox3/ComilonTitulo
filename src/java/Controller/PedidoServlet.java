/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Despacho;
import Model.Detalle_Pedido;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JOHN
 */
@WebServlet(name = "PedidoServlet", urlPatterns = {"/PedidoServlet"}, initParams = {
    @WebInitParam(name = "Name", value = "Value")})
public class PedidoServlet extends HttpServlet {

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
        String action = request.getParameter("accion");
        PedidoController pedcon = new PedidoController();
        
        if(action.equals("getEstadoPedido"))
        {   
            int idPedido = Integer.parseInt(request.getParameter("idPedido"));
            Despacho despacho =  pedcon.getEstadoPedidoByIdPedido(idPedido);
            request.setAttribute("estadoPedido", despacho);
            String from = (String)request.getParameter("from");
            if(from.equals("consultarEstadoPedido")){
                request.getRequestDispatcher("consultarEstadoPedido.jsp").forward(request, response);
            }
            else
            {
                request.getRequestDispatcher("AsignarRepartidor.jsp").forward(request, response);
            }
        }
        if(action.equals("EditarPedido")){
            int idPedido = Integer.parseInt(request.getParameter("IDPedido"));
            ArrayList<Detalle_Pedido> detPed = pedcon.getDetallePedido(idPedido);
            request.setAttribute("EditDetPedido", detPed);

            request.getRequestDispatcher("gestionPedido.jsp").forward(request, response);
        }
        if(action.equals("EliminarPedido")){
            int idPedido = Integer.parseInt(request.getParameter("IDPedido"));
            pedcon.eliminarPedidoById(idPedido);
            request.setAttribute("msg", "Pedido con ID <strong>"+ idPedido +"</strong> eliminado correctamente");
            request.getRequestDispatcher("gestionPedido.jsp").forward(request, response);
        }
        if(action.equals("VerDetalle")){
            PrintWriter out = response.getWriter();

            int idPedido = Integer.parseInt(request.getParameter("IDPedido"));
            ArrayList<Detalle_Pedido> detPed = pedcon.getDetallePedido(idPedido);
            request.setAttribute("detPedido", detPed);

            request.getRequestDispatcher("gestionPedido.jsp").forward(request, response);
        }
        
        if(action.equals("EliminarPlatoPedido")){
            int idPedido = Integer.parseInt(request.getParameter("IDPedido"));
            int idPlato = Integer.parseInt(request.getParameter("IDPlato"));
            
            pedcon.eliminarDetallePedido(idPedido, idPlato);
            request.setAttribute("msg", "Pedido con ID <strong>"+ idPedido +"</strong> eliminado correctamente");
            request.getRequestDispatcher("gestionPedido.jsp").forward(request, response);
        }
        if(action.equals("asignarRepartidor")){
            int idPedido = Integer.parseInt(request.getParameter("idPedido"));
            int idRepartidor = Integer.parseInt(request.getParameter("cmbRepartidor"));
            pedcon.asignarRepartidorPedido(idPedido, idRepartidor);
            request.setAttribute("msg", "Pedido asignado correctamente");
            request.getRequestDispatcher("AsignarRepartidor.jsp").forward(request, response);
        }
        if(action.equals("ListarByTipoPedido")){
            String tipoPedido = (String)request.getParameter("TipoPedido");
            ArrayList<Detalle_Pedido> listDetPedido = pedcon.obtenerPedidosByTipoPedido(tipoPedido);
            request.setAttribute("detallePedidoByTipoPedido", listDetPedido);
            request.getRequestDispatcher("gestionPedido.jsp").forward(request, response);
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

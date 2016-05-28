<%@page import="Model.Despacho"%>
<%@page import="Model.Repartidor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Detalle_Pedido"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : asignarPedido
    Created on : 14-05-2016, 20:23:01
    Author     : john
--%>

<jsp:include page="header.jsp"/>
<%@page import="java.sql.Connection"%>
<%@page import="Controller.PedidoController"%>
<%@page import="Model.Pedido"%>
<%
    try
    {   
      if(session.getAttribute("Perfil") != null)
     {
        String user = session.getAttribute("User").toString();
        String perfil = session.getAttribute("Perfil").toString();
        
       //String perfil = session.getAttribute("Perfil").toString();
       if(session.getAttribute("Perfil").toString().equals("Admin"))
       {
     %>   
         <jsp:include page="menuAdmin.html"/>
         <h1><% out.println("Bienvenido!,  "+user); %></h1>
         <h1><% out.println("Perfil,  "+perfil); %></h1>
            
                <form action="SessionServlet" name="logout">
                <input type="submit" value="Salir"/>
                <input type="hidden" name="action" value="logout"/>
                </form>
     <%     
       }
       if(session.getAttribute("Perfil").equals("Cliente Tradicional"))
       {
           %>
           <jsp:include page="menuTradicional.html"/>
         <h1><% out.println("Bienvenido!,  "+user); %></h1>
         <h1><% out.println("Perfil,  "+perfil); %></h1>
            
                <form action="SessionServlet" name="logout">
                <input type="submit" value="Salir"/>
                <input type="hidden" name="action" value="logout"/>
                </form>
       <%    
       }
         
    }
    else
    {
       %><jsp:include page="menu.html"/><% 
    }
    }
    catch(Exception ex)
    {
        out.println(ex.getMessage());
    }
    
    %>
        <h1>Asignar Repartidor</h1>
        
        <h3>Datos</h3>
        <form action="PedidoServlet" method="POST">
            <label>Ingrese código de pedido</label>
            <input name="idPedido" type="number" />
            <input type="hidden" name="accion" value="getEstadoPedido" /> 
            <input type="hidden" name="from" value="getAsignarRepartidor"  />    
            <input name="enviar" type="submit"/>
        </form>
        
        
            <%
                if(request.getAttribute("estadoPedido") != null){
                %>    
        <table class="table-bordered table-striped table">
            <tr>
                <td>ID Pedido</td>
                <td>Cliente</td>
                <td>Tipo Pedido</td>
                <td>Comuna</td>
                <td>Direccion</td>
                <td>Número</td>
                <td>Repartidor</td>
            </tr>
                <%
                    Despacho estadoPed = (Despacho)request.getAttribute("estadoPedido");
                    out.println("<tr>");
                    out.println("<td>"+ estadoPed.getPedido().getId() +"</td>");
                    out.println("<td>"+ estadoPed.getPedido().getCliente().getPersona().getNombre() + " " + estadoPed.getPedido().getCliente().getPersona().getApp()   +"</td>");
                    out.println("<td>"+ estadoPed.getPedido().getTipoPedido().getNombre()+"</td>");
                    out.println("<td>"+ estadoPed.getComuna()+"</td>");
                    out.println("<td>"+ estadoPed.getDireccion()+"</td>");
                    out.println("<td>"+ estadoPed.getNumeracion()+"</td>");
                    out.println("<td>"+ estadoPed.getRepartidor().getPersona().getNombre() + " " + estadoPed.getRepartidor().getPersona().getApp()+"</td>");
                    out.println("</tr>");
                    out.println("</table>");
            %>
        
        
            <br>
            <div>
                <form action="PedidoServlet" method="POST">
                    <label>Repartidor: </label>
                    <input type ="hidden" name="idPedido" value="<% out.print(estadoPed.getPedido().getId()); %>"/
                           >
                    <select name="cmbRepartidor">
                    <%

                    PedidoController pedidoCon = new PedidoController();
                    ArrayList<Repartidor> listRepartidor = pedidoCon.seleccionarRepartidor();
                     for(int i = 0; i < listRepartidor.size(); i++){
                        out.println("<option value='"+ listRepartidor.get(i).getId() +"'>"+ listRepartidor.get(i).getPersona().getNombre() + "" + listRepartidor.get(i).getPersona().getApp() +"</option>");
                    }
                    %>
                    </select><br />
                    <input type ="hidden" name="accion" value="asignarRepartidor">
                    <input value="Asignar Repartidor" type="submit"/>
                </form>
            </div>
                    
            <%} %>
            <% 
            if(request.getAttribute("msg") != null)
            {
                %>
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h4 class="modal-title" id="<% // out.print(pedido.getId()); %>">Asignar repartidor</h4>
                                </div>
                                <div class="modal-body">
                                    <%
                                        out.print(request.getAttribute("msg"));
               %>
               </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                    <button type="submit" class="btn btn-primary">Guardar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <script type='text/javascript'>$(window).load(function(){$('#myModal').modal('show');});</script>
               <%
               
            }  
        %>
        
</body>
<jsp:include page="footer.jsp"/>
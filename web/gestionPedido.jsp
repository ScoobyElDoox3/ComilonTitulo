<%@page import="Model.Repartidor"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : gestionPedido
    Created on : 14-05-2016, 20:23:01
    Author     : john
--%>

<%@page import="Model.Pedido"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Detalle_Pedido"%>
<%@page import="java.util.List"%>
<jsp:include page="header.jsp"/>
<%@page import="java.sql.Connection"%>
<%@page import="Controller.PedidoController"%>
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
    <%
        PedidoController pedidoCon = new PedidoController();
        Pedido pedido;
    %>
        <h1>Gesti�n Pedido</h1>
        <% 
            if(request.getAttribute("msg") != null)
            {
               out.print(request.getAttribute("msg"));
            }  
        %>
        
        <label>Tipo Pedido</label>    
        <select>
            <option value='NONE'>- Seleccionar -</option>
        <%
           ArrayList<String> listTipo = pedidoCon.seleccionarTipoPedido();
                 for(int i = 0; i < listTipo.size(); i++){
                    out.println("<option value='"+ listTipo.get(i) +"'>"+ listTipo.get(i) +"</option>");
                }
        %>
        </select>
        
        <%
            
            //Pedido pedido = new Pedido();
            //pedido = pedidoCon.obtenerPedidos();
            ArrayList<Detalle_Pedido> listDetPedido = pedidoCon.obtenerPedidos();
            
            %>
            
            <table class="table-bordered table-striped table">
            <tr>
                <td>ID Pedido</td>
                <td>Detalle</td>
                <td>Cliente</td>
                <td>Tipo Despacho</td>
                <td>Id Convenio</td>
                <td>Total</td>
                <!--<td>Editar</td>-->
                <td>Eliminar</td>
            </tr>
            <%
                String html = "";
                for(int i = 0; i < listDetPedido.size(); i++){
                    Detalle_Pedido detallePedido  = listDetPedido.get(i);
                    pedido = detallePedido.getPedido();
                    
                    out.println("<tr>");
                    out.println("<td>"+ pedido.getId() +"</td>");
                    //out.println("<td><a href='PedidoServlet?accion=VerDetalle&IDPedido="+pedido.getId()+"'>Ver detalle</a></td>");
                    out.println("<td><button type='button' class='btn btn-primary btn-sm' data-toggle='modal' data-target='#"+pedido.getId()+"'>Ver detalle</button></td>");
                    out.println("<td>"+ pedido.getCliente().getPersona().getNombre() + pedido.getCliente().getPersona().getApp()+"</td>");
                    out.println("<td>"+ pedido.getTipoPedido().getNombre() +"</td>");
                    out.println("<td></td>");
                    out.println("<td>" + pedidoCon.totalVenta + "</td>");
                    //out.println("<td><a href='gestionPedido.jsp?accion=EditarPedido&IDPedido="+pedido.getId()+"'>Editar</a></td>");
                    out.println("<td><a href='PedidoServlet?accion=EliminarPedido&IDPedido="+pedido.getId()+"'>Eliminar</a></td>");
                    out.println("</tr>");
                    %>
                   
                    <div class="modal fade" id="<%  out.print(pedido.getId()); %>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h4 class="modal-title" id="<%  out.print(pedido.getId()); %>">Ver Detalle</h4>
                                </div>
                                <div class="modal-body">
                                    <label></label>
                                    <label></label>
                                    <label></label>
                                    <%  out.println("<label>ID Pedido;</label><span> " + listDetPedido.get(i).getPedido().getId()  + "</span><br />");
                                        out.println("<label>Cliente:</label><span> " + listDetPedido.get(i).getPedido().getCliente().getPersona().getNombre() + " " + listDetPedido.get(i).getPedido().getCliente().getPersona().getApp()+ "</span></br>"); 
                                         out.println("<label>Plato;</label><span> Porotos con riendas" + "</span></br>"); 
                                        out.println("<label>Tipo Plato:</label><span> Entrada" + "</span></br>"); 
                                        out.println("<label>Precio:</label><span> 4500" + "</span></br>"); 
                                        
                                       //out.println("<label>Plato</label><span>" +listDetPedido.get(i).getPlato().getId_plato()  + "</br>"); 
                                       // out.println("<label>Tipo Plato</label><span>" + listDetPedido.get(i).getPlato().getTipo_plato()  + "</br>"); 
                                        //out.println("<label>Precio</label><span>" + listDetPedido.get(i).getPlato().getPrecio()  + "</br>"); 
                                    %>
                                          

                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                    <button type="submit" class="btn btn-primary">Guardar</button>
                                </div>
                            </div>
                        </div>
                    </div>
              <%
                }
            %>
            <a href=""></a>

        <div>
            <label>ID Pedido:</label> <strong><label><% %></label></strong>
            
                //forma de obtener get desde url 
                <% 
                    out.print(request.getAttribute("detallePedido"));
                    if(request.getAttribute("detallePedido") != null){
                        Detalle_Pedido detped = (Detalle_Pedido)request.getAttribute("detallePedido");
                        
                        out.println("<tr>");
                        out.println("<td>"+ detped.getPedido().getId() +"<td>");
                        out.println("<td>"+ detped.getPedido().getCliente().getIdCliente() +"<td>");
                        out.println("<td>"+ detped.getPlato().getNombre() +"<td>");
                        out.println("<td>"+ detped.getPlato().getTipo_plato() +"<td>");
                        out.println("<td>"+ detped.getPlato().getPrecio() +"<td>");
                        out.println("</tr>");
                    }
                    
                    
                %>
                
            </table>    
        </div>
        
        
        
        <script>
            //$("body").append("<% //out.print(listDetPedido.get(1).getTotalVenta()); %>");

            if(location.search != ""){
                document.getElementById("tblDetalle").style.currentStyle.display = "block";

            }
        </script>
</body>
<jsp:include page="footer.jsp"/>
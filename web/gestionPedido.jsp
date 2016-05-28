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
        <h1>Gestión Pedido</h1>
        <% 
            if(request.getAttribute("msg") != null)
            {
                %>
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h4 class="modal-title" id="<% // out.print(pedido.getId()); %>">Eliminar pedido</h4>
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
        
        <label>Tipo Pedido</label>    
        <select id="cmbTipoPedido" name="cmbTipoPedido">
            <option value='0'>- Seleccionar -</option>
        <%
           ArrayList<String> listTipo = pedidoCon.seleccionarTipoPedido();
            for(int i = 0; i < listTipo.size(); i++){
               out.println("<option value='"+ listTipo.get(i) +"'>"+ listTipo.get(i) +"</option>");
           }
        %>
        </select>
        <script>
            $("#cmbTipoPedido").change(function(){
                var tipo = $(this).val();
                window.location = "PedidoServlet?accion=ListarByTipoPedido&TipoPedido=" + tipo;
            });
        </script>
        
        <%
            ArrayList<Detalle_Pedido> listDetPedido;
            if(request.getAttribute("detallePedidoByTipoPedido") == null){
                listDetPedido = pedidoCon.obtenerPedidos();
            }
            else{
                listDetPedido = (ArrayList<Detalle_Pedido>)request.getAttribute("detallePedidoByTipoPedido");
            }
            %>
            
            <table class="table-bordered table-striped table">
            <tr>
                <td>ID Pedido</td>
                <td>Detalle</td>
                <td>Cliente</td>
                <td>Tipo Despacho</td>
                <td>Id Convenio</td>
                <td>Nombre Convenio</td>
                <td>Total</td>
                <td>Editar</td>
                <td>Eliminar</td>
            </tr>
            <%
                String html = "";
                for(int i = 0; i < listDetPedido.size(); i++){
                    Detalle_Pedido detallePedido  = listDetPedido.get(i);
                    pedido = detallePedido.getPedido();
                    
                    out.println("<tr>");
                    out.println("<td>"+ pedido.getId() +"</td>");
                    out.println("<td><a href='PedidoServlet?accion=VerDetalle&IDPedido="+pedido.getId()+"'>Ver detalle</a></td>");
                    //out.println("<td><button type='button' class='btn btn-primary btn-sm' data-toggle='modal' data-target='#"+pedido.getId()+"'>Ver detalle</button></td>");
                    out.println("<td>"+ pedido.getCliente().getPersona().getNombre() + pedido.getCliente().getPersona().getApp()+"</td>");
                    out.println("<td>"+ pedido.getTipoPedido().getNombre() +"</td>");
                    out.println("<td>"+ pedido.getCliente().getEmpresa().getConvenio().getId_convenio()+"</td>");
                    out.println("<td>"+ pedido.getCliente().getEmpresa().getConvenio().getNombre_convenio()+"</td>");
                    out.println("<td>" + pedidoCon.totalVenta + "</td>");
                    out.println("<td><a href='PedidoServlet?accion=EditarPedido&IDPedido="+pedido.getId()+"'>Editar</a></td>");
                    out.println("<td><a href='PedidoServlet?accion=EliminarPedido&IDPedido="+pedido.getId()+"'>Eliminar</a></td>");
                    out.println("</tr>");
                    
                }
                out.println("</table>");
                        

                        if(request.getAttribute("detPedido") != null)
                        {
                            ArrayList<Detalle_Pedido> array = (ArrayList<Detalle_Pedido>)request.getAttribute("detPedido");

                            out.print(array.size());
                            
                            %>
                            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h4 class="modal-title" id="<% // out.print(pedido.getId()); %>">Ver Detalle</h4>
                                </div>
                                <div class="modal-body">
                                    <label></label>
                                    <label></label>
                                    <label></label>
                                    <% 
                                        out.println("<label>ID Pedido:</label><span> " + array.get(0).getPedido().getId()  + "</span><br />");
                                        out.println("<label>Cliente: </label><span> " + array.get(0).getPedido().getCliente().getPersona().getNombre() + " " + array.get(0).getPedido().getCliente().getPersona().getApp()+ "</span></br>"); 
                                        out.println("<label>Dirección: </label><span> " + array.get(0).getPedido().getCliente().getPersona().getDireccion() +"</span></br>"); 
                                        out.println("<table class='table'>");
                                        out.println("<tr>");
                                        out.println("<td>Plato</td>");
                                        out.println("<td>Tipo Plato</td>");
                                        out.println("<td>Precio</td>");
                                        
                                        out.println("</tr>");
                                        int totalPedido = 0;
                                        for(int i = 0; i<array.size(); i++){
                                        //
                                        out.println("<tr>");
                                        out.println("<td>" + array.get(i).getPlato().getNombre()  + "</td>"); 
                                        out.println("<td>" + array.get(i).getPlato().getTipo_plato()  + "</td>"); 
                                        out.println("<td>" + array.get(i).getPlato().getPrecio()  + "</td>"); 
                                        out.println("</tr>"); 
                                        totalPedido += array.get(i).getPlato().getPrecio();
                                        }
                                        out.println("</table>");
                                        out.println("<label>Total Venta: </label>" + totalPedido);
                                    %>
                                          

                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                            <%
                            out.print("<script type='text/javascript'>$(window).load(function(){$('#myModal').modal('show');});</script>");
                                
                        }
                        else if(request.getAttribute("EditDetPedido") != null)
                        {
                             ArrayList<Detalle_Pedido> detPed = (ArrayList<Detalle_Pedido>)request.getAttribute("EditDetPedido");
                               %>
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h4 class="modal-title" id="<% // out.print(pedido.getId()); %>">Editar Pedido</h4>
                                </div>
                                <div class="modal-body">
                                    
                                <%
                                    out.println("<label>ID Pedido: </label>" + detPed.get(0).getPedido().getId() + "<br />");
                                    out.println("<label>Nombre: </label>"+ detPed.get(0).getPedido().getCliente().getPersona().getNombre() +"<br />");
                                    out.println("<label>Apellido Paterno: </label>"+ detPed.get(0).getPedido().getCliente().getPersona().getApp()+"<br />");
                                    out.println("<label>Apellido Materno: </label>"+ detPed.get(0).getPedido().getCliente().getPersona().getApm()+"<br />");
                                    out.println("<label>Rut: </label>"+ detPed.get(0).getPedido().getCliente().getPersona().getRut()+"<br />");
                                    out.println("<table class='table'>");
                                    out.println("<tr>");
                                    out.println("<td><strong>Nombre plato</strong></td>");
                                    //out.println("<td><strong>Editar</strong></td>");
                                    out.println("<td><strong>Eliminar</strong></td>");
                                    out.println("</tr>");
                                    
                                    for(int i = 0; i<detPed.size(); i++){
                                        out.println("<tr>");
                                        out.println("<td>"+ detPed.get(i).getPlato().getNombre() +"</td>");
                                        //out.println("<td><a href='PedidoServlet?accion=ActualizarPedido&IDPedido="+detPed.get(i).getPedido().getId()+"'>Editar</a></td>");
                                        out.println("<td><a href='PedidoServlet?accion=EliminarPlatoPedido&IDPedido="+detPed.get(i).getPedido().getId()+"&IDPlato="+ detPed.get(i).getPlato().getId_plato()+" '>Eliminar</a</td>");
                                        out.println("</tr>");
                                    }
                                    out.println("</table>");
                                %>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                                <%
                                    out.print("<script type='text/javascript'>$(window).load(function(){$('#myModal').modal('show');});</script>");
                        }
            %>
            
            
            <a href=""></a>

        <div>
               
             
        </div>
        
        
        
        <script>
            //$("body").append("<% //out.print(listDetPedido.get(1).getTotalVenta()); %>");

            if(location.search != ""){
                document.getElementById("tblDetalle").style.currentStyle.display = "block";

            }
        </script>
</body>
<jsp:include page="footer.jsp"/>
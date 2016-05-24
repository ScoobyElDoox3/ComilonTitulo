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
        <form>
            <label>Ingrese código de pedido</label>
            <input type="text" />
            <input type="submit"/>
        </form>
        
        <table class="table-bordered table-striped table">
            <tr>
                <td>ID Pedido</td>
                <td>Detalle</td>
                <td>Cliente</td>
                <td>Tipo Despacho</td>
                <td>Id Convenio</td>
                <td>Total</td>
                <td>Seleccionar</td>
            </tr>
            <%
                PedidoController pedidoCon = new PedidoController();
                Pedido pedido;
                ArrayList<Detalle_Pedido> listDetPedido = pedidoCon.obtenerPedidos();
                String html = "";
                for(int i = 0; i < listDetPedido.size(); i++){
                    Detalle_Pedido detallePedido  = listDetPedido.get(i);
                    pedido = detallePedido.getPedido();
                    out.println("<tr>");
                    out.println("<td>"+ pedido.getId() +"</td>");
                    out.println("<td><a href='PedidoServlet?accion=VerDetalle&IDPedido="+pedido.getId()+"'>Ver detalle</a></td>");
                    out.println("<td>"+ pedido.getCliente().getPersona().getNombre() + pedido.getCliente().getPersona().getApp()+"</td>");
                    out.println("<td>"+ pedido.getTipoPedido().getNombre() +"</td>");
                    out.println("<td></td>");
                    out.println("<td>" + pedidoCon.totalVenta + "</td>");
                    out.println("<td><a href='PedidoServlet?accion=AsignarRepartidor&IDPedido="+pedido.getId()+"'>Eliminar</a></td>");
                    out.println("</tr>");
                }
            %>
            <a href=""></a>
        </table>
        
        <h3>Datos de pedido</h3>
        
        <div>
            <form class="">
                <label>ID Pedido</label>   <input type=""/><br />
                <label>Tipo Pedido</label> <input type=""/><br />
                <label>ID Cliente</label>  <input type=""/><br />
                <label>Repartidor</label> 
                <select name="cmbRepartidor">
                <%


                ArrayList<Repartidor> listRepartidor = pedidoCon.seleccionarRepartidor();
                 for(int i = 0; i < listRepartidor.size(); i++){
                    out.println("<option value='"+ listRepartidor.get(i).getId() +"'>"+ listRepartidor.get(i).getPersona().getNombre() + "" + listRepartidor.get(i).getPersona().getApp() +"</option>");
                }
                %>
                </select><br />
                <input type="submit"/>
            </form>
        </div>
        
</body>
<jsp:include page="footer.jsp"/>
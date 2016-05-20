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
        <h1>Gestión Pedido</h1>
        
        
        <label>Tipo Pedido</label>    <select></select>
        
        <%
            PedidoController pedidoCon = new PedidoController();
            Pedido pedido;
            //Pedido pedido = new Pedido();
            //pedido = pedidoCon.obtenerPedidos();
            ArrayList<Detalle_Pedido> listDetPedido = pedidoCon.obtenerPedidos();
            pedidoCon.seleccionarTipoPedido();
            %>
            
            <table class="table-bordered table-striped table">
            <tr>
                <td>ID Pedido</td>
                <td>Detalle</td>
                <td>Cliente</td>
                <td>Tipo Despacho</td>
                <td>Id Convenio</td>
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
                    out.println("<td><a href='gestionPedido.jsp?IDPedido="+pedido.getId()+"'>Ver detalle</a></td>");
                    out.println("<td>"+ pedido.getCliente().getPersona().getNombre() + pedido.getCliente().getPersona().getApp()+"</td>");
                    out.println("<td>"+ pedido.getTipoPedido().getNombre() +"</td>");
                    out.println("<td>"+ listDetPedido.get(i).getTotalVenta() +"</td>");
                    out.println("<td>" + listDetPedido.get(i).getTotalVenta() + "</td>");
                    out.println("<td><a href='gestionPedido.jsp?Action=Editar&IDPedido="+pedido.getId()+"'>Editar</a></td>");
                    out.println("<td><a href='gestionPedido.jsp?Acttion=Eliminar&IDPedido="+pedido.getId()+"'>Eliminar</a></td>");
                    out.println("</tr>");
                }
            %>
        </table>
        <script>
            //$("body").append("<% //out.print(listDetPedido.get(1).getTotalVenta()); %>");
        </script>
</body>
<jsp:include page="footer.jsp"/>
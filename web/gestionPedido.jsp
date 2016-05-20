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
        
        
        
        <label>Consultar Promedio venta día</label>    <button></button>    <input type="text" />
        <label>Consultar Promedio ventas mes</label>    <button></button>   <input type="text" />
        <label>Consultar Número ventas efectuadas día</label>   <button></button>   <input type="text" />
        <label>Consultar Número ventas efectuadas mes</label>   <button></button>   <input type="text" />
        
        
        <%
            PedidoController pedidoCon = new PedidoController();
            Pedido pedido;
            //Pedido pedido = new Pedido();
            //pedido = pedidoCon.obtenerPedidos();
            ArrayList<Detalle_Pedido> listDetPedido = pedidoCon.obtenerPedidos();
            %>
            
            <table>
            <tr>
                <td>ID Pedido</td>
                <td>Detalle</td>
                <td>Cliente</td>
                <td>Tipo Despacho</td>
                <td>Id Convenio</td>
                <td>Total</td>
                
            </tr>
            <%
                String html = "";
                for(int i = 0; i < listDetPedido.size(); i++){
                    Detalle_Pedido detallePedido  = listDetPedido.get(i);
                    pedido = detallePedido.getPedido();
                    out.println("<tr>");
                    
                    out.println("<td>"+ pedido.getId() +"</td>");
                    out.println("<td><a href='gestionpedido.jsp?IDPedido="+pedido.getId()+"'>Ver detalle</a></td>");
                    out.println("<td>"+ pedido.getCliente().getPersona().getNombre()+"</td>");
                    out.println("<td>"+ pedido.getTipoPedido() +"</td>");
                    out.println("<td>"+ listDetPedido.get(i).getTotalVenta() +"</td>");
                    out.println("<td>" + listDetPedido.get(i).getTotalVenta() + "</td>");
                    
                    out.println("</tr>");
                }
            %>
        </table>
        
</body>
<jsp:include page="footer.jsp"/>
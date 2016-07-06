<%@page import="java.util.ArrayList"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : consultarEstadoPedido
    Created on : 14-05-2016, 20:23:01
    Author     : john
--%>

<jsp:include page="header.jsp"/>
<%@page import="java.sql.Connection"%>
<%@page import="Controller.PedidoController"%>
<%@page import="Model.*"%>
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
    <div class="">
        <h1>Consultar Estado Pedido</h1><hr></hr>
        
        <h3>Buscar</h3>
        <form action="PedidoServlet" method="POST">
            <label>Ingrese código de pedido</label>
            <input name="idPedido" type="number" min="1" required/>
            <input type="hidden" name="accion" value="getEstadoPedido" />
            <input type="hidden" name="from" value="consultarEstadoPedido"  />
            <input name="enviar" type="submit"/>
        </form>
        <%
            if(request.getAttribute("estadoPedido") != null)
            {
                Despacho estadoPed = (Despacho)request.getAttribute("estadoPedido");
                if(estadoPed.getId() != 0){
                //String ad = request.getAttribute("estadoPedido").toString();
                //PedidoController pedidoCon = new PedidoController();
                //
                         
        %>
                         
        <h3>Datos de pedido</h3><br>
        <form>
            <label>ID Pedido: </label> <% out.println(estadoPed.getPedido().getId()); %><br />
            <label>Tipo Pedido: </label><% out.println(estadoPed.getPedido().getTipoPedido().getNombre()); %><br />
            <label>Fecha Entrega: </label><% out.println(estadoPed.getPedido().getFechaEntrega()); %><br />
            <label>Estado Pedido: </label><br /> <% out.println(estadoPed.getPedido().getEstadoPedido().getDescripcion()); %><br />
            <label>Nombre Cliente: </label><% out.println(estadoPed.getPedido().getCliente().getPersona().getNombre() + " " + estadoPed.getPedido().getCliente().getPersona().getApp() + " " + estadoPed.getPedido().getCliente().getPersona().getApm()); %><br />
            <label>Teléfono: </label><% out.println(estadoPed.getPedido().getCliente().getPersona().getTelefono()); %><br />
            <label>Dirección: </label><% out.println(estadoPed.getDireccion()); %><br />
            <label>Comuna: </label><% out.println(estadoPed.getComuna()); %><br />
            <label>Número: </label><% out.println(estadoPed.getNumeracion()); %><br />
            <label>Repartidor: </label><% out.println(estadoPed.getRepartidor().getPersona().getNombre() + " " + estadoPed.getRepartidor().getPersona().getApp()); %><br />


            <!-- input type="submit"/> -->
        </form>

            <%}else{
                %>
                <label>Codigo ingresado no existe</label>
                <%
            }



} %>
    </div>
    <hr></hr>
</body>
<jsp:include page="footer.jsp"/>
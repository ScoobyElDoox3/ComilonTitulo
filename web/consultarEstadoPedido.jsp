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
            <input name="idPedido" type="text" />
            <input type="hidden" name="accion" value="getEstadoPedido" />
            <input name="enviar" type="submit"/>
        </form>
        <%
            Detalle_Pedido estadoPed = (Detalle_Pedido)request.getAttribute("estadoPedido");
            if(estadoPed != null)
            {
                //String ad = request.getAttribute("estadoPedido").toString();
                //PedidoController pedidoCon = new PedidoController();
                //
                         
        %>
                         
                <h3>Datos de pedido</h3>
                <form>
                    
                    <label>ID Pedido</label>
                    
                    <label>Tipo Pedido</label><input value="" type=""/>
                    <label>Fecha Entrega</label>
                    <label>Tiempo de entreega</label>
                    <label>Estado Pedido</label>
                    <label>Nombre Cliente</label>
                    <label>Teléfono</label>
                    <label>Dirección</label>
                    <label>Comuna</label>
                    <label>Número</label>
                    <label>Repartidor</label>
                    
                    <select name="cmbRepartidor">
                    </select>
                    <input type="submit"/>
                </form>

            <%} %>
    </div>
    <hr></hr>
</body>
<jsp:include page="footer.jsp"/>
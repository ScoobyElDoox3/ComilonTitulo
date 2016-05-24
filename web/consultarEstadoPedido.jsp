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
            <label>Ingrese c�digo de pedido</label>
            <input name="idPedido" type="text" />
            <input type="hidden" name="accion" value="getEstadoPedido" />
            <input name="enviar" type="submit"/>
        </form>
        <%
            if(request.getAttribute("estadoPedido") != null)
            {
                String ad = request.getAttribute("estadoPedido").toString();
                PedidoController pedidoCon = new PedidoController();
                Detalle_Pedido estadoPed = (Detalle_Pedido)request.getAttribute("estadoPedido");
                         
                             %>
                         
                <h3>Datos de pedido</h3>
                <form>
                    <label>Nombre Pedido</label><input value="" type=""/>
                    <label>Tipo Pedido</label><input value="" type=""/>
                    <label>Estado Pedido</label><input value="" type=""/>
                    <label>ID Cliente</label><input type=""/>
                    <label>Repartidor</label><input value="" type=""/>
                    <label>Ubicaci�n Pedido</label><input value="" type=""/>
                    <label>Mostrar Ubicaci�n</label><input value="" type=""/>
                    <select name="cmbRepartidor">
                    </select>
                    <input type="submit"/>
                </form>

            <%} %>
    </div>
    <hr></hr>
</body>
<jsp:include page="footer.jsp"/>
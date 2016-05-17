<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : consultarEstadoPedido
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
        <h1>Con</h1>
        
        <h3>Buscar</h3>
        <form>
            <label>Ingrese código de pedido</label>
            <input type="text" />
            <input type="submit"/>
        </form>
        
        <h3>Listar</h3>
        <table>
            
        </table>
        
        <h3>Datos de pedido</h3>
        <form>
            <label>Tipo Pedido</label><input type=""/>
            <label>ID Cliente</label><input type=""/>
            <label>Repartidor</label>
            <select name="cmbRepartidor">
            </select>
            <input type="submit"/>
        </form>
        
       
        
        <%
            PedidoController pedidoCon = new PedidoController();
            //Pedido pedido = new Pedido();
            //pedido = pedidoCon.obtenerPedidos();
            
            %>
            <h1><% 
                Pedido pedido = pedidoCon.obtenerPedidos();
                

            %></h1>
        
</body>
<jsp:include page="footer.jsp"/>
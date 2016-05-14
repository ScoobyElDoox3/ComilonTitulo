<jsp:include page="header.jsp"/>
<jsp:include page="menuAdmin.html"/>
           <%
            
              
               String user = session.getAttribute("User").toString();
               
            %>
            <h1><% out.println("Bienvenido!,  "+user); %></h1>
            
            <form action="SessionServlet" name="logout">
                <input type="submit" value="Salir"/>
                <input type="hidden" name="action" value="logout"/>
                
            </form>
            
            <form method="POST" action="UserServlet" name="formIngresar">
                <pre>
                   Usuario       <input type="text" name="txtUser" value="" required/>
                   Contraseña    <input type="text" name="txtPass" value="" required/>
                   Tipo Usuario  <select name="txtTipo">
                              <option value="1">Admin</option>  
                              <option value="2">Repartidor</option>
                              <option value="3">Encargado Pedidos</option>
                              <option value="4">Cliente Convenio</option>
                              <option value="5">Cliente Tradicional</option>
                              <option value="6">Encargado Convenios</option>
                              <option value="7">Encargado Proveedores y Platos</option>
                                 </select>
                    <input type="hidden" name="btnIngresar" value="Ingresar"/>
                    <input type="submit" name="action" value="ingresar"/>
 
                </pre>
            </form>
            <jsp:include page="listaUsuarios.jsp"/>
           
            
            
            
            
            

<jsp:include page="footer.jsp"/>
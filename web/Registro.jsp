<jsp:include page="header.jsp"/>
<jsp:include page="menu.html"/>

<%
                         if(request.getAttribute("msg") != null)
                         {
                            out.print(request.getAttribute("msg"));
                         }
                         else
                         {
%>
<form method="POST" action="PersonaServlet" name="registroUsuario">
    <pre>
    Nombre          <input type="text" name="txtNombre" required/>
    Apellido Paterno<input type="text" name="txtApp" required/>
    Apellido Materno<input type="text" name="txtApm" required/>
    Rut             <input type="text" name="txtRut" required/>-<input type="text" name="txtDv" maxlength="1" required/>
    Direccion       <input type="text" name="txtDireccion" required/>
    Email           <input type="text" name="txtEmail" required/>
    Telefono        <input type="text" name="txtTelefono" required/>
                    <input type="hidden" name="action" value="ingresarTradicional"/>
  
    Nombre Usuario <input type="text" name="txtUser" required/>
    Contraseña     <input type="password" name="txtPass" required/>
                   <input type="submit" value="Registrar" required/>
    </pre>
    
    
</form>
                       <%} %>

<jsp:include page="footer.jsp"/>

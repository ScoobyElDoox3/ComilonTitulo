<jsp:include page="header.jsp"/>
<jsp:include page="menu.html"/>

<form method="POST" action="SessionServlet" name="wena">
    <pre>
            
          Usuario    <input type="text" name="txtUser" required/>
          Contraseña <input type="password" name="txtPass" required/>
                     <input type="Submit" value="Enviar"/>
                     <input type="hidden" name="action" value="login"/>
                     
                     <%
                         if(request.getAttribute("error") != null)
                         {
                            out.print(request.getAttribute("error"));
                         }
                     %>
    </pre>
  </form>




<jsp:include page="footer.jsp"/>
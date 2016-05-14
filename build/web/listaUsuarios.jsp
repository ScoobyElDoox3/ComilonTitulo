
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
   
    <h:dataTable value="#{userBean.usuarios}" var="c" border="1">
            <h:column>
            <f:facet name="header">Codigo</f:facet>
            <h:outputText value="#{c.codigo}"></h:outputText>
            </h:column>
            <h:column>
            <f:facet name="header">Usuario</f:facet>
            <h:outputText value="#{c.user}"></h:outputText>
            </h:column>
            <h:column>
            <f:facet name="header">Pass</f:facet>
            <h:outputText value="#{c.pass}"></h:outputText>
            </h:column>
            <h:column>
            <f:facet name="header">Perfil</f:facet>
            <h:outputText value="#{c.perfil}"></h:outputText>
            </h:column>
            
            <%  //Boton Eliminar que abre la ventana de eliminacion de usuario segun los datos del usuario seleccionado      %>
             <h:column>
            <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#delete<h:outputText value="#{c.codigo}"></h:outputText>">Eliminar</button>
            </h:column>
            <% // Boton Modificar que abre la ventana de Modificacion del usuario segun los datos del usuario seleccionado  %>
            <h:column>
                <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#<h:outputText value="#{c.codigo}"></h:outputText>">Modificar</button>
            </h:column>
            <% //Modal Bootstrap para Modificar  %>
            <h:column>
            <div class="modal fade" id="<h:outputText value="#{c.codigo}"></h:outputText>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="<h:outputText value="#{c.codigo}"></h:outputText>">Modificar Usuario</h4>
            </div>
            <div class="modal-body">
            <form method="POST" action="UserServlet">
              <pre>
              Codigo    <input type="text" name="txtCodigo" value="<h:outputText value="#{c.codigo}"></h:outputText>"/>
              Usuario    <input type="text" name="txtUser" value="<h:outputText value="#{c.user}"></h:outputText>"/>
              Contraseña <input type="text" name="txtPass" value="<h:outputText value="#{c.pass}"></h:outputText>"</input>
              <input type="hidden" name="action" value="modificar"/>
                
              
             
              <input type="submit" value="Modificar2"/>
              </pre>
            </form>
          
              
          </div>
          <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
              <div class="modal fade" id="delete<h:outputText value="#{c.codigo}"></h:outputText>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="delete<h:outputText value="#{c.codigo}"></h:outputText>">Modificar Usuario</h4>
      </div>
      <div class="modal-body">
           Estas seguro que deseas eliminar a este usuario?
           
      </div>
      <div class="modal-footer">
          <form method="POST" action="UserServlet" name="forEliminar">
              <input type="hidden" value="<h:outputText value="#{c.codigo}"></h:outputText>" name="codHidden"/>
           <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
           <input type="submit" class="btn btn-primary" value="guardar"/>
           <input type="hidden" name="action" value="eliminar"/>
          </form>
      </div>
    </div>
  </div>
</div>
            </h:column>
            
            
            
            
            
            
            
            
            
            
            
            
            </h:dataTable>
     
</f:view>

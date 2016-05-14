package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.html", out, false);
      out.write('\n');
      out.write('\n');

                         if(request.getAttribute("msg") != null)
                         {
                            out.print(request.getAttribute("msg"));
                         }
                         else
                         {

      out.write("\n");
      out.write("<form method=\"POST\" action=\"PersonaServlet\" name=\"registroUsuario\">\n");
      out.write("    <pre>\n");
      out.write("    Nombre          <input type=\"text\" name=\"txtNombre\" required/>\n");
      out.write("    Apellido Paterno<input type=\"text\" name=\"txtApp\" required/>\n");
      out.write("    Apellido Materno<input type=\"text\" name=\"txtApm\" required/>\n");
      out.write("    Rut             <input type=\"text\" name=\"txtRut\" required/>-<input type=\"text\" name=\"txtDv\" maxlength=\"1\" required/>\n");
      out.write("    Direccion       <input type=\"text\" name=\"txtDireccion\" required/>\n");
      out.write("    Email           <input type=\"text\" name=\"txtEmail\" required/>\n");
      out.write("    Telefono        <input type=\"text\" name=\"txtTelefono\" required/>\n");
      out.write("                    <input type=\"hidden\" name=\"action\" value=\"ingresarTradicional\"/>\n");
      out.write("  \n");
      out.write("    Nombre Usuario <input type=\"text\" name=\"txtUser\" required/>\n");
      out.write("    Contraseña     <input type=\"password\" name=\"txtPass\" required/>\n");
      out.write("                   <input type=\"submit\" value=\"Registrar\" required/>\n");
      out.write("    </pre>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</form>\n");
      out.write("                       ");
} 
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

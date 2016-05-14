package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdministrarUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menuAdmin.html", out, false);
      out.write("\n");
      out.write("           ");

            
              
               String user = session.getAttribute("User").toString();
              
            
      out.write("\n");
      out.write("            <h1>");
 out.println("Bienvenido!,  "+user); 
      out.write("</h1>\n");
      out.write("            \n");
      out.write("            <form action=\"SessionServlet\" name=\"logout\">\n");
      out.write("                <input type=\"submit\" value=\"Salir\"/>\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"logout\"/>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            <form method=\"POST\" action=\"UserServlet\" name=\"formIngresar\">\n");
      out.write("                <pre>\n");
      out.write("                   Usuario       <input type=\"text\" name=\"txtUser\" value=\"\" required/>\n");
      out.write("                   Contraseña    <input type=\"text\" name=\"txtPass\" value=\"\" required/>\n");
      out.write("                   Tipo Usuario  <select name=\"txtTipo\">\n");
      out.write("                              <option value=\"a\">Admin</option>  \n");
      out.write("                              <option value=\"a\">Repartidor</option>\n");
      out.write("                              <option value=\"a\">Usuario Tradicional</option>\n");
      out.write("                              <option value=\"a\">Usuario Convenio</option>\n");
      out.write("                    </select>\n");
      out.write("                    <input type=\"hidden\" name=\"btnIngresar\" value=\"Ingresar\"/>\n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"ingresar\"/>\n");
      out.write(" \n");
      out.write("                </pre>\n");
      out.write("            </form>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "listaUsuarios.jsp", out, false);
      out.write("\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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

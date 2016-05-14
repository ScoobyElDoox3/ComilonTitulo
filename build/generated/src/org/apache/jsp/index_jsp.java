package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\r');
      out.write('\n');

    try
    {   
      if(session.getAttribute("Perfil") != null)
     {
        String user = session.getAttribute("User").toString();
        String perfil = session.getAttribute("Perfil").toString();
        
       //String perfil = session.getAttribute("Perfil").toString();
       if(session.getAttribute("Perfil").toString().equals("Admin"))
       {
     
      out.write("   \r\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menuAdmin.html", out, false);
      out.write("\r\n");
      out.write("         <h1>");
 out.println("Bienvenido!,  "+user); 
      out.write("</h1>\r\n");
      out.write("         <h1>");
 out.println("Perfil,  "+perfil); 
      out.write("</h1>\r\n");
      out.write("            \r\n");
      out.write("                <form action=\"SessionServlet\" name=\"logout\">\r\n");
      out.write("                <input type=\"submit\" value=\"Salir\"/>\r\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"logout\"/>\r\n");
      out.write("                </form>\r\n");
      out.write("     ");
     
       }
       if(session.getAttribute("Perfil").equals("Cliente Tradicional"))
       {
           
      out.write("\r\n");
      out.write("           ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menuAdmin.html", out, false);
      out.write("\r\n");
      out.write("         <h1>");
 out.println("Bienvenido!,  "+user); 
      out.write("</h1>\r\n");
      out.write("         <h1>");
 out.println("Perfil,  "+perfil); 
      out.write("</h1>\r\n");
      out.write("            \r\n");
      out.write("                <form action=\"SessionServlet\" name=\"logout\">\r\n");
      out.write("                <input type=\"submit\" value=\"Salir\"/>\r\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"logout\"/>\r\n");
      out.write("                </form>\r\n");
      out.write("       ");
    
       }
         
    }
    else
    {
       
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.html", out, false);
 
    }
    }
    catch(Exception ex)
    {
        out.println(ex.getMessage());
    }
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("  <!-- Indicators -->\r\n");
      out.write("  <ol class=\"carousel-indicators\">\r\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\r\n");
      out.write("  </ol>\r\n");
      out.write("\r\n");
      out.write("  <!-- Wrapper for slides -->\r\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("    <div class=\"item active\">\r\n");
      out.write("      <img src=\"libs/img/car_1.jpg\" alt=\"Mosaico Loica\">\r\n");
      out.write("\t  <div class=\"carousel-caption\">\r\n");
      out.write("        <h3>La Mejor Calidad Gastronomica!!!</h3>\r\n");
      out.write("        <p>Ven a conocer nuestro platos o pidelos a traves de nuestro servicio delivery</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("      <img src=\"libs/img/car_2.jpg\" alt=\"esto escribe aca\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("      <img src=\"libs/img/car_1.jpg\" alt=\"Mosaico Lagarto\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("      <img src=\"libs/img/car_2.jpg\" alt=\"Mosaico Mariposa\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Left and right controls -->\r\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Next</span>\r\n");
      out.write("  </a>\r\n");
      out.write("</div>\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
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

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
     
      out.write("   \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menuAdmin.html", out, false);
      out.write("\n");
      out.write("         <h1>");
 out.println("Bienvenido!,  "+user); 
      out.write("</h1>\n");
      out.write("         <h1>");
 out.println("Perfil,  "+perfil); 
      out.write("</h1>\n");
      out.write("            \n");
      out.write("                <form action=\"SessionServlet\" name=\"logout\">\n");
      out.write("                <input type=\"submit\" value=\"Salir\"/>\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"logout\"/>\n");
      out.write("                </form>\n");
      out.write("     ");
     
       }
       if(session.getAttribute("Perfil").equals("Cliente Tradicional"))
       {
           
      out.write("\n");
      out.write("           ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menuTradicional.html", out, false);
      out.write("\n");
      out.write("         <h1>");
 out.println("Bienvenido!,  "+user); 
      out.write("</h1>\n");
      out.write("         <h1>");
 out.println("Perfil,  "+perfil); 
      out.write("</h1>\n");
      out.write("            \n");
      out.write("                <form action=\"SessionServlet\" name=\"logout\">\n");
      out.write("                <input type=\"submit\" value=\"Salir\"/>\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"logout\"/>\n");
      out.write("                </form>\n");
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
    
    
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("      <img src=\"libs/img/car_1.jpg\" alt=\"Mosaico Loica\">\n");
      out.write("\t  <div class=\"carousel-caption\">\n");
      out.write("        <h3>La Mejor Calidad Gastronomica!!!</h3>\n");
      out.write("        <p>Ven a conocer nuestro platos o pidelos a traves de nuestro servicio delivery</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"libs/img/car_2.jpg\" alt=\"esto escribe aca\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"libs/img/car_1.jpg\" alt=\"Mosaico Lagarto\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"libs/img/car_2.jpg\" alt=\"Mosaico Mariposa\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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

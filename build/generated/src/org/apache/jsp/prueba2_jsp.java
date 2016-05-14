package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prueba2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_panelGrid_columns;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_dataTable_var_value_border;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_column;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_commandButton_value_actionListener_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_facet_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_panelGrid_columns = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_dataTable_var_value_border = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_column = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_p_commandButton_value_actionListener_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_facet_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_panelGrid_columns.release();
    _jspx_tagPool_h_dataTable_var_value_border.release();
    _jspx_tagPool_h_column.release();
    _jspx_tagPool_h_outputText_value_nobody.release();
    _jspx_tagPool_p_commandButton_value_actionListener_nobody.release();
    _jspx_tagPool_h_form_id.release();
    _jspx_tagPool_f_facet_name.release();
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_form.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      //  f:view
      com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
      _jspx_th_f_view_0.setPageContext(_jspx_page_context);
      _jspx_th_f_view_0.setParent(null);
      _jspx_th_f_view_0.setJspId("id8");
      int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_f_view_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("    <html>\r\n");
          out.write("        <head>\r\n");
          out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
          out.write("            <title>JSP Page</title>\r\n");
          out.write("            <link rel=\"stylesheet\" href=\"libs/css/bootstrap.min.css\">\r\n");
          out.write("            \r\n");
          out.write("\t    \r\n");
          out.write("        </head>\r\n");
          out.write("        <body>\r\n");
          out.write("            ");

            
              
               String user = session.getAttribute("User").toString();
              
            
          out.write("\r\n");
          out.write("            <h1>");
 out.println("Bienvenido!,  "+user); 
          out.write("</h1>\r\n");
          out.write("            \r\n");
          out.write("            <form action=\"LogoutServlet\" name=\"logout\">\r\n");
          out.write("                <input type=\"submit\" value=\"Salir\"/>\r\n");
          out.write("                \r\n");
          out.write("            </form>\r\n");
          out.write("           \r\n");
          out.write("         ");

        /*  Form Insertar con JSF
            <h:form id="insertar">
                <p:panelGrid columns="3">
                <p:outputLabel value="Nombre"/>
                <p:inputText value="#{userBean.user}"/></br>
                <p:outputLabel value="Contraseña"/>
                <p:inputText value="#{userBean.pass}"/></br>
               
                <p:outputLabel value="Tipo Usuario"/></br>
                          <select>
                            <option value="admin">admin</option>
                            <option value="repartidor">Repartidor</option>
                          </select>
                </p:panelGrid>
                <p:commandButton actionListener="#{userBean.insertarUsuario()}" value="Ingresar"/>
               
                
            </h:form>  
            */
        
          out.write("\r\n");
          out.write("            \r\n");
          out.write("          \r\n");
          out.write("            <form method=\"POST\" action=\"ingresar\" name=\"formIngresar\">\r\n");
          out.write("                <pre>\r\n");
          out.write("                    <input type=\"text\" name=\"txtUser\" value=\"\" required/>\r\n");
          out.write("                    <input type=\"text\" name=\"txtPass\" value=\"\" required/>\r\n");
          out.write("                    <select name=\"txtTipo\">\r\n");
          out.write("                        <option value=\"a\">Admin</option>  \r\n");
          out.write("                        <option value=\"a\">Repartidor</option>\r\n");
          out.write("                        <option value=\"a\">Usuario Tradicional</option>\r\n");
          out.write("                        <option value=\"a\">Usuario Convenio</option>\r\n");
          out.write("                    </select>\r\n");
          out.write("                    <input type=\"submit\" name=\"btnIngresar\" value=\"Ingresar\"/>\r\n");
          out.write(" \r\n");
          out.write("                </pre>\r\n");
          out.write("            </form>\r\n");
          out.write("            \r\n");
          out.write("            ");
          if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    \r\n");
          out.write("    <script src=\"libs/js/jquery-1.11.2.min.js\"></script>\r\n");
          out.write("    <script src=\"libs/js/bootstrap.min.js\"></script>\r\n");
          out.write("    <script src=\"libs/js/owl.carousel.min.js\"></script>\r\n");
          out.write("    <script src=\"libs/js/contact.js\"></script>\r\n");
          out.write("    <script src=\"libs/js/jquery.flexslider.js\"></script>\r\n");
          out.write("\t<script src=\"libs/js/script.js\"></script>\r\n");
          out.write("        </body>\r\n");
          out.write("    </html>\r\n");
          int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
        return;
      }
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      out.write('\r');
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

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_0.setJspId("id45");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            \r\n");
        out.write("            ");
        if (_jspx_meth_h_dataTable_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_dataTable_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:dataTable
    com.sun.faces.taglib.html_basic.DataTableTag _jspx_th_h_dataTable_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.DataTableTag.class) : new com.sun.faces.taglib.html_basic.DataTableTag();
    _jspx_th_h_dataTable_0.setPageContext(_jspx_page_context);
    _jspx_th_h_dataTable_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_dataTable_0.setJspId("id47");
    _jspx_th_h_dataTable_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{userBean.usuarios}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_dataTable_0.setVar("c");
    _jspx_th_h_dataTable_0.setBorder(org.apache.jasper.runtime.PageContextImpl.getValueExpression("1", (PageContext)_jspx_page_context, int.class, null));
    int _jspx_eval_h_dataTable_0 = _jspx_th_h_dataTable_0.doStartTag();
    if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_dataTable_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_dataTable_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            \r\n");
        out.write("             ");
        if (_jspx_meth_h_column_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_h_column_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("           \r\n");
        out.write("            ");
        if (_jspx_meth_h_column_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("           \r\n");
        out.write("           \r\n");
        out.write("           \r\n");
        out.write("            ");
        if (_jspx_meth_h_column_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_h_column_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_h_column_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_dataTable_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_dataTable_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_dataTable_var_value_border.reuse(_jspx_th_h_dataTable_0);
      return true;
    }
    _jspx_tagPool_h_dataTable_var_value_border.reuse(_jspx_th_h_dataTable_0);
    return false;
  }

  private boolean _jspx_meth_h_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_0.setPageContext(_jspx_page_context);
    _jspx_th_h_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_0.setJspId("id49");
    int _jspx_eval_h_column_0 = _jspx_th_h_column_0.doStartTag();
    if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_f_facet_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_h_outputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_column_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_0);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_0);
    return false;
  }

  private boolean _jspx_meth_f_facet_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_0 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_0.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_0);
    _jspx_th_f_facet_0.setName("header");
    int _jspx_eval_f_facet_0 = _jspx_th_f_facet_0.doStartTag();
    if (_jspx_eval_f_facet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Codigo");
        int evalDoAfterBody = _jspx_th_f_facet_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_0);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_0);
    _jspx_th_h_outputText_0.setJspId("id54");
    _jspx_th_h_outputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.codigo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_h_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_1.setPageContext(_jspx_page_context);
    _jspx_th_h_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_1.setJspId("id57");
    int _jspx_eval_h_column_1 = _jspx_th_h_column_1.doStartTag();
    if (_jspx_eval_h_column_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_f_facet_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_h_outputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_column_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_1);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_1);
    return false;
  }

  private boolean _jspx_meth_f_facet_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_1 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_1.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_1);
    _jspx_th_f_facet_1.setName("header");
    int _jspx_eval_f_facet_1 = _jspx_th_f_facet_1.doStartTag();
    if (_jspx_eval_f_facet_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Nombre");
        int evalDoAfterBody = _jspx_th_f_facet_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_1);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_1);
    return false;
  }

  private boolean _jspx_meth_h_outputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_1);
    _jspx_th_h_outputText_1.setJspId("id62");
    _jspx_th_h_outputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.user}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_1 = _jspx_th_h_outputText_1.doStartTag();
    if (_jspx_th_h_outputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
    return false;
  }

  private boolean _jspx_meth_h_column_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_2.setPageContext(_jspx_page_context);
    _jspx_th_h_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_2.setJspId("id65");
    int _jspx_eval_h_column_2 = _jspx_th_h_column_2.doStartTag();
    if (_jspx_eval_h_column_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_f_facet_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_h_outputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_column_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_2);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_2);
    return false;
  }

  private boolean _jspx_meth_f_facet_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_2 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_2.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_2);
    _jspx_th_f_facet_2.setName("header");
    int _jspx_eval_f_facet_2 = _jspx_th_f_facet_2.doStartTag();
    if (_jspx_eval_f_facet_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Pass");
        int evalDoAfterBody = _jspx_th_f_facet_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_2);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_2);
    return false;
  }

  private boolean _jspx_meth_h_outputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_2.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_2);
    _jspx_th_h_outputText_2.setJspId("id70");
    _jspx_th_h_outputText_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.pass}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_2 = _jspx_th_h_outputText_2.doStartTag();
    if (_jspx_th_h_outputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
    return false;
  }

  private boolean _jspx_meth_h_column_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_3.setPageContext(_jspx_page_context);
    _jspx_th_h_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_3.setJspId("id73");
    int _jspx_eval_h_column_3 = _jspx_th_h_column_3.doStartTag();
    if (_jspx_eval_h_column_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            <button type=\"button\" class=\"btn btn-primary btn-sm\" data-toggle=\"modal\" data-target=\"#delete");
        if (_jspx_meth_h_outputText_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_3, _jspx_page_context))
          return true;
        out.write("\">Eliminar</button>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_column_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_3);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_3);
    return false;
  }

  private boolean _jspx_meth_h_outputText_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_3.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_3);
    _jspx_th_h_outputText_3.setJspId("id76");
    _jspx_th_h_outputText_3.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.codigo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_3 = _jspx_th_h_outputText_3.doStartTag();
    if (_jspx_th_h_outputText_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_3);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_3);
    return false;
  }

  private boolean _jspx_meth_h_column_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_4.setPageContext(_jspx_page_context);
    _jspx_th_h_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_4.setJspId("id80");
    int _jspx_eval_h_column_4 = _jspx_th_h_column_4.doStartTag();
    if (_jspx_eval_h_column_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                <button type=\"button\" class=\"btn btn-primary btn-sm\" data-toggle=\"modal\" data-target=\"#");
        if (_jspx_meth_h_outputText_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_4, _jspx_page_context))
          return true;
        out.write("\">Modificar</button>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_column_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_4);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_4);
    return false;
  }

  private boolean _jspx_meth_h_outputText_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_4.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_4);
    _jspx_th_h_outputText_4.setJspId("id83");
    _jspx_th_h_outputText_4.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.codigo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_4 = _jspx_th_h_outputText_4.doStartTag();
    if (_jspx_th_h_outputText_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_4);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_4);
    return false;
  }

  private boolean _jspx_meth_h_column_5(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_5.setPageContext(_jspx_page_context);
    _jspx_th_h_column_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_5.setJspId("id87");
    int _jspx_eval_h_column_5 = _jspx_th_h_column_5.doStartTag();
    if (_jspx_eval_h_column_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      <div class=\"modal fade\" id=\"");
        if (_jspx_meth_h_outputText_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
        out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
        out.write("    <div class=\"modal-content\">\r\n");
        out.write("      <div class=\"modal-header\">\r\n");
        out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
        out.write("        <h4 class=\"modal-title\" id=\"");
        if (_jspx_meth_h_outputText_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\">Modificar Usuario</h4>\r\n");
        out.write("      </div>\r\n");
        out.write("      <div class=\"modal-body\">\r\n");
        out.write("          <form method=\"POST\" action=\"modificarUsuario\">\r\n");
        out.write("              <pre>\r\n");
        out.write("              Codigo    <input type=\"text\" name=\"txtCodigo\" value=\"");
        if (_jspx_meth_h_outputText_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("              Usuario    <input type=\"text\" name=\"txtUser\" value=\"");
        if (_jspx_meth_h_outputText_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("              Contraseña <input type=\"text\" name=\"txtPass\" value=\"");
        if (_jspx_meth_h_outputText_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\"</input>\r\n");
        out.write("             \r\n");
        out.write("                \r\n");
        out.write("              \r\n");
        out.write("             \r\n");
        out.write("              <input type=\"submit\" value=\"Modificar2\"/>\r\n");
        out.write("          </pre>\r\n");
        out.write("          </form>\r\n");
        out.write("          \r\n");
        out.write("              \r\n");
        out.write("      </div>\r\n");
        out.write("      <div class=\"modal-footer\">\r\n");
        out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
        out.write("        ");
        if (_jspx_meth_h_form_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("     \r\n");
        out.write("        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\r\n");
        out.write("      </div>\r\n");
        out.write("    </div>\r\n");
        out.write("  </div>\r\n");
        out.write("</div>\r\n");
        out.write("              <div class=\"modal fade\" id=\"delete");
        if (_jspx_meth_h_outputText_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
        out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
        out.write("    <div class=\"modal-content\">\r\n");
        out.write("      <div class=\"modal-header\">\r\n");
        out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
        out.write("        <h4 class=\"modal-title\" id=\"delete");
        if (_jspx_meth_h_outputText_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\">Modificar Usuario</h4>\r\n");
        out.write("      </div>\r\n");
        out.write("      <div class=\"modal-body\">\r\n");
        out.write("           Estas seguro que deseas eliminar a este usuario?\r\n");
        out.write("           \r\n");
        out.write("      </div>\r\n");
        out.write("      <div class=\"modal-footer\">\r\n");
        out.write("          <form method=\"POST\" action=\"eliminar\" name=\"forEliminar\">\r\n");
        out.write("              <input type=\"hidden\" value=\"");
        if (_jspx_meth_h_outputText_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\" name=\"codHidden\"/>\r\n");
        out.write("           <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
        out.write("           <input type=\"submit\" class=\"btn btn-primary\" value=\"guardar\"/>\r\n");
        out.write("          </form>\r\n");
        out.write("      </div>\r\n");
        out.write("    </div>\r\n");
        out.write("  </div>\r\n");
        out.write("</div>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_column_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_5);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_5);
    return false;
  }

  private boolean _jspx_meth_h_outputText_5(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_5.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_outputText_5.setJspId("id90");
    _jspx_th_h_outputText_5.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.codigo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_5 = _jspx_th_h_outputText_5.doStartTag();
    if (_jspx_th_h_outputText_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_5);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_5);
    return false;
  }

  private boolean _jspx_meth_h_outputText_6(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_6.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_outputText_6.setJspId("id100");
    _jspx_th_h_outputText_6.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.codigo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_6 = _jspx_th_h_outputText_6.doStartTag();
    if (_jspx_th_h_outputText_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_6);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_6);
    return false;
  }

  private boolean _jspx_meth_h_outputText_7(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_7.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_outputText_7.setJspId("id108");
    _jspx_th_h_outputText_7.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.codigo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_7 = _jspx_th_h_outputText_7.doStartTag();
    if (_jspx_th_h_outputText_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_7);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_7);
    return false;
  }

  private boolean _jspx_meth_h_outputText_8(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_8.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_outputText_8.setJspId("id111");
    _jspx_th_h_outputText_8.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.user}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_8 = _jspx_th_h_outputText_8.doStartTag();
    if (_jspx_th_h_outputText_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_8);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_8);
    return false;
  }

  private boolean _jspx_meth_h_outputText_9(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_9.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_outputText_9.setJspId("id114");
    _jspx_th_h_outputText_9.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.pass}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_9 = _jspx_th_h_outputText_9.doStartTag();
    if (_jspx_th_h_outputText_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_9);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_9);
    return false;
  }

  private boolean _jspx_meth_h_form_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_1.setPageContext(_jspx_page_context);
    _jspx_th_h_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_form_1.setJspId("id124");
    _jspx_th_h_form_1.setId("mod");
    int _jspx_eval_h_form_1 = _jspx_th_h_form_1.doStartTag();
    if (_jspx_eval_h_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_p_panelGrid_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_p_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_1);
      return true;
    }
    _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_1);
    return false;
  }

  private boolean _jspx_meth_p_panelGrid_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:panelGrid
    com.sun.faces.taglib.html_basic.PanelGridTag _jspx_th_p_panelGrid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.PanelGridTag.class) : new com.sun.faces.taglib.html_basic.PanelGridTag();
    _jspx_th_p_panelGrid_0.setPageContext(_jspx_page_context);
    _jspx_th_p_panelGrid_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_1);
    _jspx_th_p_panelGrid_0.setJspId("id126");
    _jspx_th_p_panelGrid_0.setColumns(org.apache.jasper.runtime.PageContextImpl.getValueExpression("3", (PageContext)_jspx_page_context, int.class, null));
    int _jspx_eval_p_panelGrid_0 = _jspx_th_p_panelGrid_0.doStartTag();
    if (_jspx_eval_p_panelGrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_panelGrid_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_panelGrid_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_panelGrid_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_p_panelGrid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_panelGrid_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_panelGrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_panelGrid_columns.reuse(_jspx_th_p_panelGrid_0);
      return true;
    }
    _jspx_tagPool_p_panelGrid_columns.reuse(_jspx_th_p_panelGrid_0);
    return false;
  }

  private boolean _jspx_meth_p_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_p_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_p_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_p_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_1);
    _jspx_th_p_commandButton_0.setJspId("id129");
    _jspx_th_p_commandButton_0.setActionListener(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{userBean.ModificarUsuario()}", (PageContext)_jspx_page_context, null, void.class, new Class[] {javax.faces.event.ActionEvent.class}));
    _jspx_th_p_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("mod", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_p_commandButton_0 = _jspx_th_p_commandButton_0.doStartTag();
    if (_jspx_th_p_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_commandButton_value_actionListener_nobody.reuse(_jspx_th_p_commandButton_0);
      return true;
    }
    _jspx_tagPool_p_commandButton_value_actionListener_nobody.reuse(_jspx_th_p_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_10(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_10.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_outputText_10.setJspId("id139");
    _jspx_th_h_outputText_10.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.codigo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_10 = _jspx_th_h_outputText_10.doStartTag();
    if (_jspx_th_h_outputText_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_10);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_10);
    return false;
  }

  private boolean _jspx_meth_h_outputText_11(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_11.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_outputText_11.setJspId("id149");
    _jspx_th_h_outputText_11.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.codigo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_11 = _jspx_th_h_outputText_11.doStartTag();
    if (_jspx_th_h_outputText_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_11);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_11);
    return false;
  }

  private boolean _jspx_meth_h_outputText_12(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_12.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_outputText_12.setJspId("id158");
    _jspx_th_h_outputText_12.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{c.codigo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_12 = _jspx_th_h_outputText_12.doStartTag();
    if (_jspx_th_h_outputText_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_12);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_12);
    return false;
  }
}

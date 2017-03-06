package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.sql.*;

public final class menu_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");



      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Pagina de la Academia\">\n");
      out.write("        <meta name=\"keywords\" content=\"ACADAEMIA\">\n");
      out.write("        <title>XYZ: admin</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"menu_admin_style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_icon.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"seccioncentral\">\n");
      out.write("            <header></header>\n");
      out.write("            <section id=\"main\">\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a aria-hidden=\"true\" data-icon=\"&#xe902;\" href=\"index.jsp\">&nbsp;Inicio</a></li>\n");
      out.write("                        <li><a aria-hidden=\"true\" data-icon=\"&#xe915;\" href=\"#\">&nbsp;Registro</a>\n");
      out.write("                            <div class=\"submenu\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"titulo\"><a href=\"registrar_ciclo.jsp\">Ciclo</a></li>\n");
      out.write("                                    <li><a href=\"registrar_sede.jsp\">Sede</a></li>\n");
      out.write("                                    <li><a href=\"registrar_alumno.jsp\">Matricula</a></li>\n");
      out.write("                                    <li><a href=\"registrar_notas.jsp\">Notas</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\" aria-hidden=\"true\" data-icon=\"&#xe94e;\">&nbsp;Consultas</a>\n");
      out.write("                            <div class=\"submenu\">\n");
      out.write("                                <ul>\n");
      out.write("                                    \n");
      out.write("                                    <li><a href=\"consultar_notas.jsp\">Notas</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a aria-hidden=\"true\" data-icon=\"&#xe975;\" href=\"admin_cerrar_sesion.jsp\">&nbsp;Cerrar sesión</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                \n");
      out.write("                <footer>\n");
      out.write("                    <span style=\"font-weight: bold;\"> </span> Lima<br>\n");
      out.write("                    <h1>correo@hotmail.com</h1>\n");
      out.write("                    <span style=\"font-size:9px;\">Copyrigth &copy; 2016</span>\n");
      out.write("                </footer>\n");
      out.write("            </section>\n");
      out.write("            <div class=\"ajustar\"></div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

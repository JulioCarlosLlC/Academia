package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.sql.*;

public final class registrar_005fsede_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"Pagina web de la Academia\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"academia\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"submenu_admin_style.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_icon.css\"/>\r\n");
      out.write("        <title>Registrar ciclo</title>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            <!-- \r\n");
      out.write("      function permite(elEvento, permitidos) {\r\n");
      out.write("                // Variables que definen los caracteres permitidos\r\n");
      out.write("                var numeros = \"0123456789\";\r\n");
      out.write("                var caracteres = \" abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ\";\r\n");
      out.write("                var numeros_caracteres = numeros + caracteres;\r\n");
      out.write("                var teclas_especiales = [8, 37, 39, 46];\r\n");
      out.write("                // 8 = BackSpace, 46 = Supr, 37 = flecha izquierda, 39 = flecha derecha\r\n");
      out.write("\r\n");
      out.write("                // Seleccionar los caracteres a partir del parámetro de la función\r\n");
      out.write("                switch (permitidos) {\r\n");
      out.write("                    case 'num':\r\n");
      out.write("                        permitidos = numeros;\r\n");
      out.write("                        break;\r\n");
      out.write("                    case 'car':\r\n");
      out.write("                        permitidos = caracteres;\r\n");
      out.write("                        break;\r\n");
      out.write("                    case 'num_car':\r\n");
      out.write("                        permitidos = numeros_caracteres;\r\n");
      out.write("                        break;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // Obtener la tecla pulsada \r\n");
      out.write("                var evento = elEvento || window.event;\r\n");
      out.write("                var codigoCaracter = evento.charCode || evento.keyCode;\r\n");
      out.write("                var caracter = String.fromCharCode(codigoCaracter);\r\n");
      out.write("\r\n");
      out.write("                // Comprobar si la tecla pulsada es alguna de las teclas especiales\r\n");
      out.write("                // (teclas de borrado y flechas horizontales)\r\n");
      out.write("                var tecla_especial = false;\r\n");
      out.write("                for (var i in teclas_especiales) {\r\n");
      out.write("                    if (codigoCaracter == teclas_especiales[i]) {\r\n");
      out.write("                        tecla_especial = true;\r\n");
      out.write("                        break;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // Comprobar si la tecla pulsada se encuentra en los caracteres permitidos\r\n");
      out.write("                // o si es una tecla especial\r\n");
      out.write("                return permitidos.indexOf(caracter) != -1 || tecla_especial;\r\n");
      out.write("            }\r\n");
      out.write("            //-->\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section class=\"seccioncentral\">\r\n");
      out.write("            <header></header>\r\n");
      out.write("            <section id=\"main\">\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a aria-hidden=\"true\" data-icon=\"&#xe902;\" href=\"menu_admin.jsp\">&nbsp;Inicio</a></li>\r\n");
      out.write("                        <li><a aria-hidden=\"true\" data-icon=\"&#xe915;\" href=\"#\">&nbsp;Registro</a>\r\n");
      out.write("                            <div class=\"submenu\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li class=\"titulo\"><a href=\"registrar_ciclo.jsp\">Ciclo</a></li>\r\n");
      out.write("                                    <li><a href=\"registrar_alumno.jsp\">Alumnos</a></li>\r\n");
      out.write("                                    <li><a href=\"registrar_sede.jsp\">Sede</a></li>\r\n");
      out.write("                                    <li><a href=\"registrar_notas.jsp\">Notas</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\" aria-hidden=\"true\" data-icon=\"&#xe94e;\">&nbsp;Consultas</a>\r\n");
      out.write("                            <div class=\"submenu\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <li><a href=\"consultar_notas.jsp\">Notas</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a aria-hidden=\"true\" data-icon=\"&#xe975;\" href=\"index_principal.jsp\">&nbsp;Cerrar sesión</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <article>\r\n");
      out.write("                            <form id=\"form1\" name=\"form1\" method=\"post\" action=\"Crear_Sede\">\r\n");
      out.write("                            <h1>Registrar Sede</h1> \r\n");
      out.write("                            \r\n");
      out.write("                            <label><b>Código de la Sede:</b></label> \r\n");
      out.write("                            <input type=\"text\"  required onkeypress=\"return permite(event, 'num')\"  name=\"codigo\" style=\"width: 140px; height: 22px;\" value=\"\" maxlength=\"10\"><br>                            \r\n");
      out.write("                            <label><b>Nombre de de la Sede:</b></label> \r\n");
      out.write("                            <input type=\"text\"  required onkeypress=\"return permite(event, 'car')\"  name=\"nombre\" style=\"width: 140px; height: 22px;\" value=\"\" maxlength=\"10\"><br>                                              \r\n");
      out.write("                            \r\n");
      out.write("                            <button type=\"submit\" name=\"ok\" value=\"Guardar\" aria-hidden=\"true\" data-icon=\"&#xe938;\">&nbsp;Guardar</button>\r\n");
      out.write("                            <button type=\"reset\" value=\"Cancelar\" aria-hidden=\"true\" data-icon=\"&#xe956;\">&nbsp;Cancelar</button>\r\n");
      out.write("                            <button type=\"button\" name=\"volver\" value=\"Regresar\" onclick=\"location.href = 'menu_admin.jsp'\" aria-hidden=\"true\" data-icon=\"&#xe93b;\">&nbsp;Regresar</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </article>\r\n");
      out.write("                </section>\r\n");
      out.write("                <footer>\r\n");
      out.write("                    <span style=\"font-weight: bold;\"> </span> Lima<br>\r\n");
      out.write("                    <h1>correo@hotmail.com</h1>\r\n");
      out.write("                    <span style=\"font-size:9px;\"> Copyrigth &copy; 2017</span>\r\n");
      out.write("                </footer>\r\n");
      out.write("            </section>\r\n");
      out.write("            <div class=\"ajustar\"></div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </body>\r\n");
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

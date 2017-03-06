package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Info.*;
import java.sql.*;

public final class registrar_005falumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Pagina web de la Academia\">\n");
      out.write("        <meta name=\"keywords\" content=\"academia\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"submenu_admin_style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_icon.css\"/>\n");
      out.write("        <title>REGISTRAR MATRICULA</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            <!-- \n");
      out.write("      function permite(elEvento, permitidos) {\n");
      out.write("                // Variables que definen los caracteres permitidos\n");
      out.write("                var numeros = \"0123456789\";\n");
      out.write("                var caracteres = \" abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ\";\n");
      out.write("                var numeros_caracteres = numeros + caracteres;\n");
      out.write("                var teclas_especiales = [8, 37, 39, 46];\n");
      out.write("                // 8 = BackSpace, 46 = Supr, 37 = flecha izquierda, 39 = flecha derecha\n");
      out.write("\n");
      out.write("                // Seleccionar los caracteres a partir del parámetro de la función\n");
      out.write("                switch (permitidos) {\n");
      out.write("                    case 'num':\n");
      out.write("                        permitidos = numeros;\n");
      out.write("                        break;\n");
      out.write("                    case 'car':\n");
      out.write("                        permitidos = caracteres;\n");
      out.write("                        break;\n");
      out.write("                    case 'num_car':\n");
      out.write("                        permitidos = numeros_caracteres;\n");
      out.write("                        break;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Obtener la tecla pulsada \n");
      out.write("                var evento = elEvento || window.event;\n");
      out.write("                var codigoCaracter = evento.charCode || evento.keyCode;\n");
      out.write("                var caracter = String.fromCharCode(codigoCaracter);\n");
      out.write("\n");
      out.write("                // Comprobar si la tecla pulsada es alguna de las teclas especiales\n");
      out.write("                // (teclas de borrado y flechas horizontales)\n");
      out.write("                var tecla_especial = false;\n");
      out.write("                for (var i in teclas_especiales) {\n");
      out.write("                    if (codigoCaracter == teclas_especiales[i]) {\n");
      out.write("                        tecla_especial = true;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Comprobar si la tecla pulsada se encuentra en los caracteres permitidos\n");
      out.write("                // o si es una tecla especial\n");
      out.write("                return permitidos.indexOf(caracter) != -1 || tecla_especial;\n");
      out.write("            }\n");
      out.write("            //-->\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"seccioncentral\">\n");
      out.write("            <header></header>\n");
      out.write("            <section id=\"main\">\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a aria-hidden=\"true\" data-icon=\"&#xe902;\" href=\"menu_admin.jsp\">&nbsp;Inicio</a></li>\n");
      out.write("                        <li><a aria-hidden=\"true\" data-icon=\"&#xe915;\" href=\"#\">&nbsp;Registro</a>\n");
      out.write("                            <div class=\"submenu\">\n");
      out.write("                                <ul>\n");
      out.write("                                     <li class=\"titulo\"><a href=\"registrar_ciclo.jsp\">Ciclo</a></li>\n");
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
      out.write("                        <li><a aria-hidden=\"true\" data-icon=\"&#xe975;\" href=\"index_principal.jsp\">&nbsp;Cerrar sesión</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <section>\n");
      out.write("                    <article>\n");
      out.write("                        <form id=\"form1\" name=\"form1\" method=\"post\" action=\"Crear_Matricula\">\n");
      out.write("                            <h1><b>Matricular estudiante</b></h1>\n");
      out.write("                                <label><b>Codigo de Matricula:</b></label>                \n");
      out.write("                                <input type=\"text\" required onkeypress=\"return permite(event, 'num')\"  name=\"codmatricula\" style=\"width: 260px; height: 22px;\" value=\"\" maxlength=\"30\"><br>\n");
      out.write(" \n");
      out.write("                                <label><b>Nombres:</b></label>                \n");
      out.write("                                <input type=\"text\" required onkeypress=\"return permite(event, 'car')\"  name=\"nombre\" style=\"width: 260px; height: 22px;\" value=\"\" maxlength=\"30\"><br>\n");
      out.write("                                <label><b>Apellidos:</b></label>                           \n");
      out.write("                                <input type=\"text\" required onkeypress=\"return permite(event, 'car')\"  name=\"apellido\" style=\"width: 260px; height: 22px;\" value=\"\" maxlength=\"30\"><br>\n");
      out.write("                                \n");
      out.write("                                ");
//SEDE
      out.write("\n");
      out.write("                                <label><b>Sede:</b></label>\n");
      out.write("                                ");

                                    try {                           
                                        Connection conex =Info.Conexion.obtener();
                                        PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getListaSede();");
                                        ResultSet li =Consultar.executeQuery();
                                
      out.write("                            \n");
      out.write("                                <select name=\"sede\" required=\"\" style=\"height: 25px; width: 195px;\">\n");
      out.write("\n");
      out.write("                                ");
  while (li.next()) {
      out.write(" \n");
      out.write("                                <option>");
      out.print(li.getObject("NomSede"));
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                </select><br>\n");
      out.write("                                ");

                                   Info.Conexion.obtener();
                                    } catch (Exception e) {
                                    }
                                
      out.write("\n");
      out.write("                                ");
//FIN SEDE
      out.write("\n");
      out.write("                                \n");
      out.write("                                ");
//CICLO
      out.write("\n");
      out.write("                                <label><b>Ciclo:</b></label>\n");
      out.write("                                ");

                                    try {                           
                                        Connection conex =Info.Conexion.obtener();
                                        PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getListaCiclo();");
                                        ResultSet lis =Consultar.executeQuery();
                                
      out.write("                            \n");
      out.write("                                <select name=\"ciclo\" required=\"\" style=\"height: 25px; width: 195px;\">\n");
      out.write("                                ");
  while (lis.next()) {
      out.write(" \n");
      out.write("                                <option>");
      out.print(lis.getString("NomCiclo"));
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select><br>\n");
      out.write("                                ");

                                    Info.Conexion.cerrar();
                                    } catch (Exception e) {
                                    }
                                
      out.write("\n");
      out.write("                                ");
//FIN CICLO
      out.write("\n");
      out.write("                                \n");
      out.write("                                <label><b>Turno:</b></label>                           \n");
      out.write("                                <input type=\"text\" required onkeypress=\"return permite(event, 'car')\"  name=\"Turno\" style=\"width: 260px; height: 22px;\" value=\"\" maxlength=\"30\"><br>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            <button type=\"button\" name=\"volver\" value=\"Regresar\" onclick=\"location.href = 'menu_admin.jsp'\" aria-hidden=\"true\" data-icon=\"&#xe93b;\">&nbsp;Consultar</button>           \n");
      out.write("                            <button type=\"submit\" name=\"ok\" value=\"Guardar\" aria-hidden=\"true\" data-icon=\"&#xe938;\">&nbsp;Guardar</button>\n");
      out.write("                            <button type=\"reset\" value=\"Cancelar\" aria-hidden=\"true\" data-icon=\"&#xe956;\">&nbsp;Cancelar</button>\n");
      out.write("                            <button type=\"button\" name=\"volver\" value=\"Regresar\" onclick=\"location.href = 'menu_admin.jsp'\" aria-hidden=\"true\" data-icon=\"&#xe93b;\">&nbsp;Regresar</button>\n");
      out.write("                        </form>\n");
      out.write("                    </article>\n");
      out.write("                </section>\n");
      out.write("                <footer>\n");
      out.write("                    <span style=\"font-weight: bold;\"> </span>Av.  Lima<br>\n");
      out.write("                    <h1>correo@hotmail.com</h1>\n");
      out.write("                    <span style=\"font-size:9px;\">Academa XYZ- Copyrigth &copy; 2017</span>\n");
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

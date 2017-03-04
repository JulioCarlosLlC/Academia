package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Pagina web de la Academia\">\n");
      out.write("        <meta name=\"keywords\" content=\"academia\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"login_admin_style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_icon.css\"/>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            <!-- \n");
      out.write("                function permite(elEvento, permitidos) {\n");
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
      out.write("                \n");
      out.write("                // Comprobar si la tecla pulsada se encuentra en los caracteres permitidos\n");
      out.write("                // o si es una tecla especial\n");
      out.write("                return permitidos.indexOf(caracter) != -1 || tecla_especial;\n");
      out.write("            }\n");
      out.write("            //-->\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function entrarLogin() {\n");
      out.write("                document.getElementById('enviar').type=\"submit\";\n");
      out.write("            }\n");
      out.write("            function salirLogin() {\n");
      out.write("                opener.location.href = 'index.jsp';\n");
      out.write("                window.close();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"seccioncentral\">\n");
      out.write("            <header></header>\n");
      out.write("            <section id=\"main\">\n");
      out.write("                <nav></nav>\n");
      out.write("                <section>\n");
      out.write("                    <article>\n");
      out.write("                        <form id=\"campo\" action=\"Validar\" method=\"post\" name=\"formLogin\">\n");
      out.write("                                                  \n");
      out.write("                            <h1>Solo<br> personal autorizado</h1>\n");
      out.write("                            <input type=\"text\" required onkeypress=\"return permite(event, 'num_car')\"  name=\"usuario\" maxlength=\"10\" placeholder=\"Escriba su código\"/><br>\n");
      out.write("                            <input type=\"password\" required onkeypress=\"return permite(event, 'num_car')\"  name=\"contrasena\" maxlength=\"15\" placeholder=\"Escriba su contraseña\"/><br>\n");
      out.write("                            <button type=\"button\" id=\"btnsalir\" name=\"btnsalir\" onclick=\"salirLogin()\" aria-hidden=\"true\" data-icon=\"&#xe93b;\">&nbsp;Regresar</button>\n");
      out.write("                            <button type=\"button\" id=\"enviar\" name=\"enviar\" value=\"enviar\" onclick=\"entrarLogin()\" aria-hidden=\"true\" data-icon=\"&#xe946;\">&nbsp;Ingresar</button>\n");
      out.write("                        </form>\n");
      out.write("                    </article>\n");
      out.write("                </section>\n");
      out.write("                \n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

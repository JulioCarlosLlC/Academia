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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Pagina web de la Universidad Nacional Federico Villarreal\">\n");
      out.write("        <meta name=\"keywords\" content=\"UNFV, Federico Villarreal\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"index_principal_style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_icon.css\"/>\n");
      out.write("        <title>UNFV: FIIS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"fb-root\"></div>\n");
      out.write("<script>(function(d, s, id) {\n");
      out.write("  var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("  if (d.getElementById(id)) return;\n");
      out.write("  js = d.createElement(s); js.id = id;\n");
      out.write("  js.src = \"//connect.facebook.net/es_ES/sdk.js#xfbml=1&version=v2.8&appId=239079776555286\";\n");
      out.write("  fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("}(document, 'script', 'facebook-jssdk'));</script>\n");
      out.write("        \n");
      out.write("        <div class=\"social\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a target=\"_blank\" href=\"https://www.facebook.com/Academia.Villa.Pruba/\" class=\"icon-facebook2\"></a></li>\n");
      out.write("                <li><a target=\"_blank\" href=\"https://www.youtube.com/user/PrensaUNFV\" class=\"icon-play\"></a></li>\n");
      out.write("                <li><a target=\"_blank\" href=\"https://login.microsoftonline.com/?whr=unfv.edu.pe\" class=\"icon-envelop\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"anexos\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a target=\"_blank\" class=\"icon-key\" href=\"login_admin.jsp\" ></br></a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <section class=\"seccioncentral\">\n");
      out.write("            <header></header>\n");
      out.write("            <section id=\"main\">\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp\" data-icon=\"&#xe902;\">&nbsp;Inicio</a></li>\n");
      out.write("                        <li><a href=\"#\" data-icon=\"&#xe90e;\">&nbsp;La Facultad</a>\n");
      out.write("                            <div class=\"submenu\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"titulo\"><a href=\"#\">Reseña Histórica</a></li>\n");
      out.write("                                    <li><a href=\"#\">Misión y Visión</a></li>\n");
      out.write("                                    <li><a href=\"#\">Valores</a></li>\n");
      out.write("                                    <li><a href=\"#\">Organigrama</a></li>\n");
      out.write("                                    <li><a href=\"#\">Decanato</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\" data-icon=\"&#xe912;\">&nbsp;Oficinas Internas</a>\n");
      out.write("                            <div class=\"submenu\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"titulo\"><a href=\"#\"> Autoevaluación y Acreditación</a></li>\n");
      out.write("                                    <li><a href=\"#\">Grados y Títulos</a></li>\n");
      out.write("                                    <li><a href=\"#\">Prácticas Preprofesionales</a></li>\n");
      out.write("                                    <li><a href=\"#\">Orientación y Tutoría</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"#\" data-icon=\"&#xe903;\">&nbsp;Noticias</a>\n");
      out.write("                            <div class=\"submenu\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"titulo\"><a href=\"#\">Matrícula 2016</a></li>\n");
      out.write("                                    <li><a href=\"#\">Presentación Plan Estratégico EPIS</a></li>\n");
      out.write("                                    <li><a href=\"#\">Reglamento Contratación</a></li>\n");
      out.write("                                    <li><a href=\"#\">Fotos</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <section>\n");
      out.write("                    <article>\n");
      out.write("                        <div class=\"the_content\">\n");
      out.write("                            <h1><b>¿Por qué estudiar en la Academia Villa?</b></h1>\n");
      out.write("                            <p><strong>Perfil Profesional del Ingeniero de Sistemas</strong></p>\n");
      out.write("                            <p>El Ingeniero de Sistemas es un especialista en la resolución de problemas complejos, para ello, debe tener las siguientes capacidades: analizar, diseñar, implementar, evaluar y administrar los sistemas de información y dirigir equipos de desarrollo y mantenimiento.</p>\n");
      out.write("                            <ul><li>Analizar problemas reales de las organizaciones para su automatización, es una tarea importante que afrontará el Ingeniero de Sistemas. Con un bagaje pluridisciplinario en diversas áreas como la economía, la física y otras para asegurar dicho entendimiento.</li>\n");
      out.write("                                <li>Diseñar soluciones a los problemas de automatización analizados, utilizando métodos, técnicas y herramientas de ingeniería de software.</li>\n");
      out.write("                                <li>Implementar soluciones concretas conforme al diseño elaborado, a partir del conocimiento de software y hardware, utilizando las herramientas de desarrollo de aplicaciones y de equipos informáticos de última tecnología.</li>\n");
      out.write("                                <li>Evaluar los sistemas automatizados, con fines de consultoría o de auditoría, para organizaciones deseosas de mejorar sus sistemas de información.</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </article>\n");
      out.write("                    <article>\n");
      out.write("                        <div id=\"twit\">\n");
      out.write("                            <a class=\"twitter-timeline\"  href=\"https://twitter.com/hashtag/academia\" data-widget-id=\"837478878440472576\">Tweets sobre #academia</a>\n");
      out.write("                            <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                     <div class=\"fb-page\" data-href=\"https://www.facebook.com/Academia.Villa.Pruba\" data-tabs=\"timeline\" data-height=\"395\" data-small-header=\"true\" data-adapt-container-width=\"true\" data-hide-cover=\"false\" data-show-facepile=\"true\"><blockquote cite=\"https://www.facebook.com/Academia.Villa.Pruba\" class=\"fb-xfbml-parse-ignore\"><a href=\"https://www.facebook.com/Academia.Villa.Pruba\">Academia Villa</a></blockquote></div>             \n");
      out.write("                        \n");
      out.write("                    </article>\n");
      out.write("                </section>\n");
      out.write("                <footer>\n");
      out.write("                    <span style=\"font-weight: bold;\">ANEXO 8: </span>Av. Óscar R. Benavides N°450 (3er. Piso), Lima<br>\n");
      out.write("                    <h1>(01)9947-01174 | decanato.fiis@unfv.edu.pe</h1>\n");
      out.write("                    <span style=\"font-size:9px;\">UNFV, Escuela Profesional de Ingeniería de Sistemas - Copyrigth &copy; 2016</span>\n");
      out.write("                </footer>\n");
      out.write("            </section>\n");
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

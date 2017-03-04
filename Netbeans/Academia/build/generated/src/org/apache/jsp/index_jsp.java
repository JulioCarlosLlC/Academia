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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Pagina web de la Universidad Nacional Federico Villarreal\">\n");
      out.write("        <meta name=\"keywords\" content=\"UNFV, Federico Villarreal\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index_principal_style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_icon.css\"/>\n");
      out.write("        <title>UNFV: FIIS</title>\n");
      out.write("        <script src=\"js/jquery-latest.min.js\"></script>\n");
      out.write("        <script src=\"js/slides.min.jquery.js\"></script>\n");
      out.write("        <script src=\"js/slides.jquery.js\"></script>\n");
      out.write("        <script src=\"js/selection.json\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $('#slides').slides({\n");
      out.write("                    preload: true,\n");
      out.write("                    preloadImage: 'img/loading.gif',\n");
      out.write("                    play: 5000,\n");
      out.write("                    pause: 2500,\n");
      out.write("                    hoverPause: true,\n");
      out.write("                    animationStart: function (current) {\n");
      out.write("                        $('.caption').animate({\n");
      out.write("                            bottom: -35\n");
      out.write("                        }, 100);\n");
      out.write("                        if (window.console && console.log) {\n");
      out.write("                            // example return of current slide number\n");
      out.write("                            console.log('animationStart on slide: ', current);\n");
      out.write("                        }\n");
      out.write("                        ;\n");
      out.write("                    },\n");
      out.write("                    animationComplete: function (current) {\n");
      out.write("                        $('.caption').animate({\n");
      out.write("                            bottom: 0\n");
      out.write("                        }, 200);\n");
      out.write("                        if (window.console && console.log) {\n");
      out.write("                            // example return of current slide number\n");
      out.write("                            console.log('animationComplete on slide: ', current);\n");
      out.write("                        }\n");
      out.write("                        ;\n");
      out.write("                    },\n");
      out.write("                    slidesLoaded: function () {\n");
      out.write("                        $('.caption').animate({\n");
      out.write("                            bottom: 0\n");
      out.write("                        }, 200);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var miLogin\n");
      out.write("            function abreVentana() {\n");
      out.write("                miLogin = window.open(\"login_admin.jsp\", \"miwin\", \"width=700,height=750,scrollbars=yes\")\n");
      out.write("                miLogin.focus()\n");
      out.write("            }\n");
      out.write("        </script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"social\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a target=\"_blank\" href=\"https://www.facebook.com/Elvillarrealino\" class=\"icon-facebook2\"></a></li>\n");
      out.write("                <li><a target=\"_blank\" href=\"https://www.youtube.com/user/PrensaUNFV\" class=\"icon-play\"></a></li>\n");
      out.write("                <li><a target=\"_blank\" href=\"https://login.microsoftonline.com/?whr=unfv.edu.pe\" class=\"icon-envelop\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"anexos\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a target=\"_blank\" class=\"icon-key\" onclick=\"abreVentana()\"></a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <section class=\"seccioncentral\">\n");
      out.write("            <header></header>\n");
      out.write("            <section id=\"main\">\n");
      out.write("                <div id=\"container\">\n");
      out.write("                    <div id=\"example\">\n");
      out.write("                        <div id=\"slides\">\n");
      out.write("                            <div class=\"slides_container\">\n");
      out.write("                                <div class=\"slide\">\n");
      out.write("                                    <a href=\"#\"><img src=\"img/large1.JPG\" width=\"570\" height=\"270\" alt=\"Slide 1\"></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"slide\">\n");
      out.write("                                    <a href=\"#\"><img src=\"img/large0.JPG\" width=\"570\" height=\"270\" alt=\"Slide 2\"></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"slide\">\n");
      out.write("                                    <a href=\"#\"><img src=\"img/large2.JPG\" width=\"570\" height=\"270\" alt=\"Slide 3\"></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\" class=\"prev\"><img src=\"img/arrow-prev.png\" width=\"24\" height=\"43\" alt=\"Arrow Prev\"></a>\n");
      out.write("                            <a href=\"#\" class=\"next\"><img src=\"img/arrow-next.png\" width=\"24\" height=\"43\" alt=\"Arrow Next\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <img src=\"img/example-frame.png\" width=\"739\" height=\"341\" alt=\"Example Frame\" id=\"frame\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index_principal.jsp\" data-icon=\"&#xe902;\">&nbsp;Inicio</a></li>\n");
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
      out.write("                        <li><a href=\"#\" data-icon=\"&#xe913;\">&nbsp;Investigación</a>\n");
      out.write("                            <div class=\"submenu\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"titulo\"><a href=\"#\">Presentación</a></li>\n");
      out.write("                                    <li><a href=\"#\">Biblioteca Virtual</a></li>\n");
      out.write("                                    <li><a href=\"#\">Reglamentos</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
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
      out.write("                            <h1><b>¿Por qué estudiar Ingeniería de Sistemas en la UNFV?</b></h1>\n");
      out.write("                            <p><strong>Perfil Profesional del Ingeniero de Sistemas</strong></p>\n");
      out.write("                            <p>El Ingeniero de Sistemas es un especialista en la resolución de problemas complejos, para ello, debe tener las siguientes capacidades: analizar, diseñar, implementar, evaluar y administrar los sistemas de información y dirigir equipos de desarrollo y mantenimiento.</p>\n");
      out.write("                            <ul><li>Analizar problemas reales de las organizaciones para su automatización, es una tarea importante que afrontará el Ingeniero de Sistemas. Con un bagaje pluridisciplinario en diversas áreas como la economía, la física y otras para asegurar dicho entendimiento.</li>\n");
      out.write("                                <li>Diseñar soluciones a los problemas de automatización analizados, utilizando métodos, técnicas y herramientas de ingeniería de software.</li>\n");
      out.write("                                <li>Implementar soluciones concretas conforme al diseño elaborado, a partir del conocimiento de software y hardware, utilizando las herramientas de desarrollo de aplicaciones y de equipos informáticos de última tecnología.</li>\n");
      out.write("                                <li>Evaluar los sistemas automatizados, con fines de consultoría o de auditoría, para organizaciones deseosas de mejorar sus sistemas de información.</li>\n");
      out.write("                                <li>Administrar los sistemas computacionales en funcionamiento, aprovechando las herramientas de monitoreo y mantenimiento de sistemas.</li>\n");
      out.write("                                <li>Dirigir, supervisar y coordinar equipos de desarrollo y mantenimiento de sistemas informáticos que optimicen procesos administrativos e industriales.</li>\n");
      out.write("                                <li>Planificar la ejecución y la integración de los sistemas informáticos en las diversas organizaciones.</li>\n");
      out.write("                                <li>Un marcado interés por profundizar críticamente en el desarrollo investigativo y científico de su profesión de acuerdo con las prioridades sociales y humanas.</li></ul>\n");
      out.write("                        </div>\n");
      out.write("                    </article>\n");
      out.write("                    <article>\n");
      out.write("                        <div class=\"the_content\">\n");
      out.write("                            <h1>Después no digas que no te lo advertimos...</h1>\n");
      out.write("                        </div>\n");
      out.write("                        <video width=\"750\" controls loop>\n");
      out.write("                            <source src=\"videos/Ismael Cala.mp4\">\n");
      out.write("                        </video>\n");
      out.write("                    </article>\n");
      out.write("                </section>\n");
      out.write("                <footer>\n");
      out.write("                    <span style=\"font-weight: bold;\">ANEXO 8: </span>Av. Óscar R. Benavides N°450 (3er. Piso), Lima<br>\n");
      out.write("                    <h1>(01)748-0888 | decanato.fiis@unfv.edu.pe</h1>\n");
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

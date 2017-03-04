<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Pagina web de la Universidad Nacional Federico Villarreal">
        <meta name="keywords" content="UNFV, Federico Villarreal">
        <link rel="stylesheet" href="css/index_principal_style.css"/>
        <link rel="stylesheet" href="css/style_icon.css"/>
        <title>UNFV: FIIS</title>
        <script src="js/jquery-latest.min.js"></script>
        <script src="js/slides.min.jquery.js"></script>
        <script src="js/slides.jquery.js"></script>
        <script src="js/selection.json"></script>
        <script>
            $(function () {
                $('#slides').slides({
                    preload: true,
                    preloadImage: 'img/loading.gif',
                    play: 5000,
                    pause: 2500,
                    hoverPause: true,
                    animationStart: function (current) {
                        $('.caption').animate({
                            bottom: -35
                        }, 100);
                        if (window.console && console.log) {
                            // example return of current slide number
                            console.log('animationStart on slide: ', current);
                        }
                        ;
                    },
                    animationComplete: function (current) {
                        $('.caption').animate({
                            bottom: 0
                        }, 200);
                        if (window.console && console.log) {
                            // example return of current slide number
                            console.log('animationComplete on slide: ', current);
                        }
                        ;
                    },
                    slidesLoaded: function () {
                        $('.caption').animate({
                            bottom: 0
                        }, 200);
                    }
                });
            });
        </script>
        <script>
            var miLogin
            function abreVentana() {
                miLogin = window.open("login_admin.jsp", "miwin", "width=700,height=750,scrollbars=yes")
                miLogin.focus()
            }
        </script> 
    </head>
    <body>
        <div class="social">
            <ul>
                <li><a target="_blank" href="https://www.facebook.com/Elvillarrealino" class="icon-facebook2"></a></li>
                <li><a target="_blank" href="https://www.youtube.com/user/PrensaUNFV" class="icon-play"></a></li>
                <li><a target="_blank" href="https://login.microsoftonline.com/?whr=unfv.edu.pe" class="icon-envelop"></a></li>
            </ul>
        </div>
        <div class="anexos">
            <ul>
                <li><a target="_blank" class="icon-key" onclick="abreVentana()"></a>
                </li>
            </ul>
        </div>
        <section class="seccioncentral">
            <header></header>
            <section id="main">
                <div id="container">
                    <div id="example">
                        <div id="slides">
                            <div class="slides_container">
                                <div class="slide">
                                    <a href="#"><img src="img/large1.JPG" width="570" height="270" alt="Slide 1"></a>
                                </div>
                                <div class="slide">
                                    <a href="#"><img src="img/large0.JPG" width="570" height="270" alt="Slide 2"></a>
                                </div>
                                <div class="slide">
                                    <a href="#"><img src="img/large2.JPG" width="570" height="270" alt="Slide 3"></a>
                                </div>
                            </div>
                            <a href="#" class="prev"><img src="img/arrow-prev.png" width="24" height="43" alt="Arrow Prev"></a>
                            <a href="#" class="next"><img src="img/arrow-next.png" width="24" height="43" alt="Arrow Next"></a>
                        </div>
                        <img src="img/example-frame.png" width="739" height="341" alt="Example Frame" id="frame">
                    </div>
                </div>
                <nav>
                    <ul>
                        <li><a href="index_principal.jsp" data-icon="&#xe902;">&nbsp;Inicio</a></li>
                        <li><a href="#" data-icon="&#xe90e;">&nbsp;La Facultad</a>
                            <div class="submenu">
                                <ul>
                                    <li class="titulo"><a href="#">Reseña Histórica</a></li>
                                    <li><a href="#">Misión y Visión</a></li>
                                    <li><a href="#">Valores</a></li>
                                    <li><a href="#">Organigrama</a></li>
                                    <li><a href="#">Decanato</a></li>
                                </ul>
                            </div>
                        </li>
                        <li><a href="#" data-icon="&#xe912;">&nbsp;Oficinas Internas</a>
                            <div class="submenu">
                                <ul>
                                    <li class="titulo"><a href="#"> Autoevaluación y Acreditación</a></li>
                                    <li><a href="#">Grados y Títulos</a></li>
                                    <li><a href="#">Prácticas Preprofesionales</a></li>
                                    <li><a href="#">Orientación y Tutoría</a></li>
                                </ul>
                            </div>
                        </li>
                        <li><a href="#" data-icon="&#xe913;">&nbsp;Investigación</a>
                            <div class="submenu">
                                <ul>
                                    <li class="titulo"><a href="#">Presentación</a></li>
                                    <li><a href="#">Biblioteca Virtual</a></li>
                                    <li><a href="#">Reglamentos</a></li>
                                </ul>
                            </div>
                        </li>
                        <li><a href="#" data-icon="&#xe903;">&nbsp;Noticias</a>
                            <div class="submenu">
                                <ul>
                                    <li class="titulo"><a href="#">Matrícula 2016</a></li>
                                    <li><a href="#">Presentación Plan Estratégico EPIS</a></li>
                                    <li><a href="#">Reglamento Contratación</a></li>
                                    <li><a href="#">Fotos</a></li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </nav>
                <section>
                    <article>
                        <div class="the_content">
                            <h1><b>¿Por qué estudiar Ingeniería de Sistemas en la UNFV?</b></h1>
                            <p><strong>Perfil Profesional del Ingeniero de Sistemas</strong></p>
                            <p>El Ingeniero de Sistemas es un especialista en la resolución de problemas complejos, para ello, debe tener las siguientes capacidades: analizar, diseñar, implementar, evaluar y administrar los sistemas de información y dirigir equipos de desarrollo y mantenimiento.</p>
                            <ul><li>Analizar problemas reales de las organizaciones para su automatización, es una tarea importante que afrontará el Ingeniero de Sistemas. Con un bagaje pluridisciplinario en diversas áreas como la economía, la física y otras para asegurar dicho entendimiento.</li>
                                <li>Diseñar soluciones a los problemas de automatización analizados, utilizando métodos, técnicas y herramientas de ingeniería de software.</li>
                                <li>Implementar soluciones concretas conforme al diseño elaborado, a partir del conocimiento de software y hardware, utilizando las herramientas de desarrollo de aplicaciones y de equipos informáticos de última tecnología.</li>
                                <li>Evaluar los sistemas automatizados, con fines de consultoría o de auditoría, para organizaciones deseosas de mejorar sus sistemas de información.</li>
                                <li>Administrar los sistemas computacionales en funcionamiento, aprovechando las herramientas de monitoreo y mantenimiento de sistemas.</li>
                                <li>Dirigir, supervisar y coordinar equipos de desarrollo y mantenimiento de sistemas informáticos que optimicen procesos administrativos e industriales.</li>
                                <li>Planificar la ejecución y la integración de los sistemas informáticos en las diversas organizaciones.</li>
                                <li>Un marcado interés por profundizar críticamente en el desarrollo investigativo y científico de su profesión de acuerdo con las prioridades sociales y humanas.</li></ul>
                        </div>
                    </article>
                    <article>
                        <div class="the_content">
                            <h1>Después no digas que no te lo advertimos...</h1>
                        </div>
                        <video width="750" controls loop>
                            <source src="videos/Ismael Cala.mp4">
                        </video>
                    </article>
                </section>
                <footer>
                    <span style="font-weight: bold;">ANEXO 8: </span>Av. Óscar R. Benavides N°450 (3er. Piso), Lima<br>
                    <h1>(01)748-0888 | decanato.fiis@unfv.edu.pe</h1>
                    <span style="font-size:9px;">UNFV, Escuela Profesional de Ingeniería de Sistemas - Copyrigth &copy; 2016</span>
                </footer>
            </section>
        </section>
    </body>
</html>
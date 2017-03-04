<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.net.*,java.sql.*" %>

<%

%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Pagina de la Academia">
        <meta name="keywords" content="ACADAEMIA">
        <title>XYZ: admin</title>
        <link rel="stylesheet" href="menu_admin_style.css"/>
        <link rel="stylesheet" href="css/style_icon.css"/>
    </head>
    <body>
        <section class="seccioncentral">
            <header></header>
            <section id="main">
                <nav>
                    <ul>
                        <li><a aria-hidden="true" data-icon="&#xe902;" href="index.jsp">&nbsp;Inicio</a></li>
                        <li><a aria-hidden="true" data-icon="&#xe915;" href="#">&nbsp;Registro</a>
                            <div class="submenu">
                                <ul>
                                    <li class="titulo"><a href="registrar_ciclo.jsp">Ciclo</a></li>
                                    <li><a href="registrar_sede.jsp">Sede</a></li>
                                    <li><a href="registrar_alumno.jsp">Matricula</a></li>
                                    <li><a href="registrar_notas.jsp">Notas</a></li>
                                </ul>
                            </div>
                        </li>
                        <li><a href="#" aria-hidden="true" data-icon="&#xe94e;">&nbsp;Consultas</a>
                            <div class="submenu">
                                <ul>
                                    
                                    <li><a href="consultar_notas.jsp">Notas</a></li>
                                </ul>
                            </div>
                        </li>
                        <li><a aria-hidden="true" data-icon="&#xe975;" href="admin_cerrar_sesion.jsp">&nbsp;Cerrar sesión</a></li>
                    </ul>
                </nav>
                
                <footer>
                    <span style="font-weight: bold;"> </span> Lima<br>
                    <h1>correo@hotmail.com</h1>
                    <span style="font-size:9px;">Copyrigth &copy; 2016</span>
                </footer>
            </section>
            <div class="ajustar"></div>
        </section>
    </body>
</html>
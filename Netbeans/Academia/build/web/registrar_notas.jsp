<%@page import="Modelo.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.net.*,java.sql.*" %>
<%
    Boolean validado = (Boolean) session.getAttribute("validado");
// Si la variable de sesión
// 'validado' no ha sido creada
    if (validado == null) // Establecemos la variable local
    // 'validado' a true
    {
        validado = new Boolean(false);
    }
// Añadimos la variable de sesión 'validado'
// con el contenido de la variable local
    session.setAttribute("validado", validado);
// Si la variable local 'validado' es false
    if (!validado.booleanValue()) // Redireccionamos a la página login.jsp
    {
        response.sendRedirect("login_admin.jsp");
    }
%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Pagina web de la Academia">
        <meta name="keywords" content="academia">
        <link rel="stylesheet" href="submenu_admin_style.css"/>
        <link rel="stylesheet" href="css/style_icon.css"/>
        <title>Registrar ciclo</title>
        <script type="text/javascript">
            <!-- 
      function permite(elEvento, permitidos) {
                // Variables que definen los caracteres permitidos
                var numeros = "0123456789";
                var caracteres = " abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                var numeros_caracteres = numeros + caracteres;
                var teclas_especiales = [8, 37, 39, 46];
                // 8 = BackSpace, 46 = Supr, 37 = flecha izquierda, 39 = flecha derecha

                // Seleccionar los caracteres a partir del parámetro de la función
                switch (permitidos) {
                    case 'num':
                        permitidos = numeros;
                        break;
                    case 'car':
                        permitidos = caracteres;
                        break;
                    case 'num_car':
                        permitidos = numeros_caracteres;
                        break;
                }

                // Obtener la tecla pulsada 
                var evento = elEvento || window.event;
                var codigoCaracter = evento.charCode || evento.keyCode;
                var caracter = String.fromCharCode(codigoCaracter);

                // Comprobar si la tecla pulsada es alguna de las teclas especiales
                // (teclas de borrado y flechas horizontales)
                var tecla_especial = false;
                for (var i in teclas_especiales) {
                    if (codigoCaracter == teclas_especiales[i]) {
                        tecla_especial = true;
                        break;
                    }
                }

                // Comprobar si la tecla pulsada se encuentra en los caracteres permitidos
                // o si es una tecla especial
                return permitidos.indexOf(caracter) != -1 || tecla_especial;
            }
            //-->
        </script>
    </head>
    <body>
        <section class="seccioncentral">
            <header></header>
            <section id="main">
                <nav>
                    <ul>
                        <li><a aria-hidden="true" data-icon="&#xe902;" href="menu_admin.jsp">&nbsp;Inicio</a></li>
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
                        <li><a aria-hidden="true" data-icon="&#xe975;" href="index_principal.jsp">&nbsp;Cerrar sesión</a></li>
                    </ul>
                </nav>
                <section>
                    <article>
                        <form id="form1" name="form1" method="post" action="Crear_Nota">
                            <h1>Registrar Notas</h1>      
                        <label><b>Código del Alumno:</b></label> 
                            <input type="text"  required onkeypress="return permite(event, 'num')"  name="codigo" style="width: 140px; height: 22px;" value="" maxlength="10"><br>                            
                           
                            <label><b>Nota Semanal:</b></label> <select name="Nota1" size="1" style="width: 100px;" required="">
                                <option selected>00</option>                                        
                                <option>01</option>    
                                <option>02</option>    
                                <option>03</option> 
                                <option>04</option>
                                <option>05</option>    
                                <option>06</option>    
                                <option>07</option> 
                                <option>08</option>
                                <option>09</option>    
                                <option>10</option>    
                                <option>11</option> 
                                <option>12</option>
                                <option>13</option>    
                                <option>14</option>    
                                <option>15</option> 
                                <option>16</option>
                                <option>17</option>    
                                <option>18</option>    
                                <option>19</option> 
                                <option>20</option>
                            </select>&nbsp;  
                            
                            <label><b>Nota Mensual:</b></label> <select name="Nota2" size="1" style="width: 100px;" required="">
                                <option selected>00</option>                                        
                                <option>01</option>    
                                <option>02</option>    
                                <option>03</option> 
                                <option>04</option>
                                <option>05</option>    
                                <option>06</option>    
                                <option>07</option> 
                                <option>08</option>
                                <option>09</option>    
                                <option>10</option>    
                                <option>11</option> 
                                <option>12</option>
                                <option>13</option>    
                                <option>14</option>    
                                <option>15</option> 
                                <option>16</option>
                                <option>17</option>    
                                <option>18</option>    
                                <option>19</option> 
                                <option>20</option>
                            </select>&nbsp; 
                            
                            <label><b>Nota Simulacro:</b></label> <select name="Nota3" size="1" style="width: 100px;" required="">
                                <option selected>00</option>                                        
                                <option>01</option>    
                                <option>02</option>    
                                <option>03</option> 
                                <option>04</option>
                                <option>05</option>    
                                <option>06</option>    
                                <option>07</option> 
                                <option>08</option>
                                <option>09</option>    
                                <option>10</option>    
                                <option>11</option> 
                                <option>12</option>
                                <option>13</option>    
                                <option>14</option>    
                                <option>15</option> 
                                <option>16</option>
                                <option>17</option>    
                                <option>18</option>    
                                <option>19</option> 
                                <option>20</option>
                            </select>&nbsp; 
                            
                            <button type="submit" name="ok" value="Guardar" aria-hidden="true" data-icon="&#xe938;">&nbsp;Guardar</button>
                            <button type="reset" value="Cancelar" aria-hidden="true" data-icon="&#xe956;">&nbsp;Cancelar</button>
                            <button type="button" name="volver" value="Regresar" onclick="location.href = 'menu_admin.jsp'" aria-hidden="true" data-icon="&#xe93b;">&nbsp;Regresar</button>
                        </form>
                    </article>
                </section>
                <footer>
                    <span style="font-weight: bold;"> </span> Lima<br>
                    <h1>correo@hotmail.com</h1>
                    <span style="font-size:9px;"> Copyrigth &copy; 2017</span>
                </footer>
            </section>
            <div class="ajustar"></div>
        </section>
    </body>
</html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
// Leemos la variable de sessión 'validado'
    Boolean validado = (Boolean) session.getAttribute("validado");
// Si la variable de session 'valiadado' ya ha sido creada o el valor es 'true'
    if (validado != null && validado.booleanValue()) // Redireccionamos a la página bienvenido.jsp
    {
        response.sendRedirect("menu_admin.jsp");
    }
    // Leemos la variable de sesión 'usuario'
    String usuario = (String) session.getAttribute("usuario");
    // Si las variable de sesión 'validado' y 'usuario' ya habia sido creadadas
    if (validado != null && usuario != null) // Mostramos mensaje de advertencia
    {
        out.println("<p>Usuario o contraseña incorrectos</p>");
    }
    // Si la variable de sesión usuario no ha sido creada
    if (usuario == null) // Instanciamos la variable local 'usuario'
    {
        usuario = "";
    }
    // Borramos la variable de sesión 'usuario'
    session.setAttribute("usuario", null);

%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Pagina web de la Universidad Nacional Federico Villarreal">
        <meta name="keywords" content="UNFV, Federico Villarreal">
        <link rel="stylesheet" href="login_admin_style.css"/>
        <link rel="stylesheet" href="css/style_icon.css"/>
        <title>Login</title>
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
        <script>
            function entrarLogin() {
                document.getElementById('enviar').type="submit";
            }
            function salirLogin() {
                opener.location.href = 'index.jsp';
                window.close();
            }
        </script>
    </head>
    <body>
        <section class="seccioncentral">
            <header></header>
            <section id="main">
                <nav></nav>
                <section>
                    <article>
                        <form id="campo" action="menu_admin.jsp" method="post" name="formLogin">
                            <header><img src="img/logo_unfvv.png" alt=""/></header>                        
                            <h1>Solo<br> personal autorizado</h1>
                            <input type="text" required onkeypress="return permite(event, 'num_car')"  name="usuario" maxlength="10" placeholder="Escriba su usuario"/><br>
                            <input type="password" required onkeypress="return permite(event, 'num_car')"  name="contrasena" maxlength="15" placeholder="Escriba su contraseña"/><br>
                            <button type="button" id="btnsalir" name="btnsalir" onclick="salirLogin()" aria-hidden="true" data-icon="&#xe93b;">&nbsp;Regresar</button>
                            <button type="button" id="enviar" name="enviar" value="enviar" onclick="entrarLogin()" aria-hidden="true" data-icon="&#xe946;">&nbsp;Ingresar</button>
                        </form>
                    </article>
                </section>
                
            </section>
        </section>
    </body>
</html>

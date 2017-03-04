<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Pagina web de la Academia">
        <meta name="keywords" content="academia">
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
                        <form id="campo" action="Validar" method="post" name="formLogin">
                                                  
                            <h1>Solo<br> personal autorizado</h1>
                            <input type="text" required onkeypress="return permite(event, 'num_car')"  name="usuario" maxlength="10" placeholder="Escriba su código"/><br>
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

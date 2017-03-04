<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.net.*,java.sql.*" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Info.*"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Pagina web de la Academia">
        <meta name="keywords" content="academia">
        <link rel="stylesheet" href="submenu_admin_style.css"/>
        <link rel="stylesheet" href="css/style_icon.css"/>
        <title>REGISTRAR MATRICULA</title>
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
                                    <li><a href="registrar_alumno.jsp">Alumnos</a></li>
                                    <li><a href="registrar_sede.jsp">Sede</a></li>
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
                        <form id="form1" name="form1" method="post" action="Crear_Matricula">
                            <h1><b>Matricular estudiante</b></h1>
                                <label><b>Codigo de Matricula:</b></label>                
                                <input type="text" required onkeypress="return permite(event, 'num')"  name="codmatricula" style="width: 260px; height: 22px;" value="" maxlength="30"><br>
 
                                <label><b>Nombres:</b></label>                
                                <input type="text" required onkeypress="return permite(event, 'car')"  name="nombre" style="width: 260px; height: 22px;" value="" maxlength="30"><br>
                                <label><b>Apellidos:</b></label>                           
                                <input type="text" required onkeypress="return permite(event, 'car')"  name="apellido" style="width: 260px; height: 22px;" value="" maxlength="30"><br>
                                
                                <%//SEDE%>
                                <label><b>Sede:</b></label>
                                <%
                                    try {
                                         Class.forName("com.mysql.jdbc.Driver");
                                        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/academia", "root", "");

                                        Statement st = conexion.createStatement();
                                        ResultSet rs = st.executeQuery("select * from sede");
                                %>                            
                                <select name="sede" required="" style="height: 25px; width: 195px;">
                                <option></option>
                                <%  while (rs.next()) {%> 
                                <option><%=rs.getObject("NomSede")%>
                                <%}%>
                                </select><br>
                                <%
                                    conexion.close();
                                    } catch (Exception e) {
                                    }
                                %>
                                <%//FIN SEDE%>
                                
                                <%//CICLO%>
                                <label><b>Ciclo:</b></label>
                                <%
                                    try {
                                         Class.forName("com.mysql.jdbc.Driver");
                                        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/academia", "root", "");

                                        Statement st = conexion.createStatement();
                                        ResultSet rs = st.executeQuery("select * from ciclo");
                                %>                            
                                <select name="ciclo" required="" style="height: 25px; width: 195px;">
                                <option></option>
                                <%  while (rs.next()) {%> 
                                <option><%=rs.getObject("NombCiclo")%>
                                <%}%>
                            </select><br>
                                <%
                                    conexion.close();
                                    } catch (Exception e) {
                                    }
                                %>
                                <%//FIN CICLO%>
                                
                                <label><b>Turno:</b></label>                           
                                <input type="text" required onkeypress="return permite(event, 'car')"  name="Turno" style="width: 260px; height: 22px;" value="" maxlength="30"><br>

                                
                            <button type="button" name="volver" value="Regresar" onclick="location.href = 'menu_admin.jsp'" aria-hidden="true" data-icon="&#xe93b;">&nbsp;Consultar</button>
                                
                            <button type="submit" name="ok" value="Guardar" aria-hidden="true" data-icon="&#xe938;">&nbsp;Guardar</button>
                            <button type="reset" value="Cancelar" aria-hidden="true" data-icon="&#xe956;">&nbsp;Cancelar</button>
                            <button type="button" name="volver" value="Regresar" onclick="location.href = 'menu_admin.jsp'" aria-hidden="true" data-icon="&#xe93b;">&nbsp;Regresar</button>
                        </form>
                        <%
                            Connection canal = null;
                            Statement instruccion = null;
                            try {
                                Class.forName("com.mysql.jdbc.Driver").newInstance();
                                canal = DriverManager.getConnection("jdbc:mysql://localhost:3306/academia","root","");
                                instruccion = canal.createStatement();
                            } catch (SQLException e) {};
                            
                            try{
                            if (request.getParameter("ok") != null) {
                                String codigo = request.getParameter("codigo");
                                String nombre = request.getParameter("nombre");
                                String apellidos = request.getParameter("apellidos");;
                                
                                try {
                                    ResultSet rs = instruccion.executeQuery("SELECT *FROM alumno");
                                    while (rs.next()) {
                                        String codigoexistente = rs.getString(1);
                                        String cicloexistente = rs.getString(2);
                                        if (codigo.equals(codigoexistente) && codigo.equals(cicloexistente)) {%>
                                            <script type="text/javascript">alert("YA SE ENCUENTRA REGISTRADO");</script>
                                        <%  
                                        };
                                    }
                                } catch (Exception e) {  out.println("1"+e.getMessage()); }
                                String q = "INSERT INTO alumno  values('" +codigo + "','" + nombre + "','" + apellidos + "')";
                                try {
                                    instruccion.executeUpdate(q);
                              
                            %>                         
                             <p id="negrita">REGISTRO REALIZADO</p>
                            <%  
                                } catch (SQLException e) {  out.println("2"+e.getMessage()); };
                                
                                try {
                                    instruccion.close();
                                    canal.close();
                                } catch (SQLException e) {
                                };
                            };
                            } catch (Exception e) { out.println("5"+e.getMessage()); };
                        %>
                    </article>
                </section>
                <footer>
                    <span style="font-weight: bold;"> </span>Av.  Lima<br>
                    <h1>correo@hotmail.com</h1>
                    <span style="font-size:9px;">Academa XYZ- Copyrigth &copy; 2017</span>
                </footer>
            </section>
            <div class="ajustar"></div>
        </section>
    </body>
</html>
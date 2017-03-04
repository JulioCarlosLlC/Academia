<%-- 
    Document   : admin_cerrar_sesion
    Created on : 13-jul-2016, 23:48:25
    Author     : Will
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page session="true" %>
        <%
            HttpSession sesionOk = request.getSession();
            sesionOk.invalidate();
        %>
        <jsp:forward page="index.jsp"></jsp:forward>
    </body>
</html>

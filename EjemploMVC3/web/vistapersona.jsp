<%-- 
    Document   : vistapersona
    Created on : 07-10-2019, 10:05:00
    Author     : duque
--%>

<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Persona persona = ( Persona )request.getSession().getAttribute("persona");
        %>
        
        <h1> Rut: <%= persona.getRut() %> </h1>
        <h1> Nombre: <%= persona.getNombre() %> </h1>
        <h1> Apellido: <%= persona.getApellido() %> </h1>
    </body>
</html>

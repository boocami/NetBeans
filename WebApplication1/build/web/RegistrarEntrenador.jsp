<%-- 
    Document   : administracion
    Created on : 27-11-2019, 12:03:21
    Author     : HP
--%>

<%@page import="dao.Entrenador"%>
<%@page import="modelo.Daoentrenador"%>
<%@page import="dao.Profesion"%>
<%@page import="modelo.Daoprofesion"%>
<%@page import="modelo.Daopersona"%>
<%@page import="modelo.Daopersona"%>
<%@page import="dao.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.Persona"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="modelo.DaoUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <!--<link rel = "stylesheet" type = "text/css" href = "Css/style.css" />
        <link rel="stylesheet" type="text/css" href="Css/iniciarSesion.css"/>
        <link rel="stylesheet" type="text/css" href="Css/Div.css"/>-->
        <script type="text/javascript" src="showDiv.js"></script>
    </head>
    <body translate="no">
        <div class="dashboard-wrapper">
            <div class="dashboard-header">
                <div class="branding">
                    <a class="" href="#" title="User Menu">
                        <img class="component-image component-image--circle" src="https://placem.at/things?w=40&amp;h=40">
                        <span class="">Administrador Fitness</span>
                    </a>
                </div>
                <nav class="component-nav">
                    <ul class="component-menu component-menu--horizontal">
                        <li class="">
                            <a class="" href="#" title="User Menu">
                                <input type="submit" value="Cerrar Sesión">
                            </a>
                            <ul aria-hidden="true" class="">
                                <li class="">
                                    <a class="" href="#">
                                    Settings
                                    </a>
                                </li>
                                <li class="">
                                    <a class="" href="#">
                                    Logout
                                    </a>
                                </li>
                            </ul>   
                        </li>
                        <li class="">
                            <a class="" href="#">
                                <i class="fa fa-fw fa-cog" title="Settings"></i>
                            </a>
                            <ul aria-hidden="true" class="">
                                <li class="">
                                    <div class="button-group">
                                        <input class="" id="sidebar-hidden">
                                        <label class="" for="sidebar-hidden"></label>
                                        <input class="" id="sidebar-mini">
                                        <label class="" for="sidebar-mini"></label>
                                        <input class="" id="sidebar-full">
                                        <label class="" for="sidebar-full"></label>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </nav>
            </div>
            <div class="dashboard-body">
                <div aria-hidden="false" class="dashboard-sidebar">
                    <nav class="component-nav ui-full-height ui-scrollable">
                        <ul class="component-menu component-menu--vertical">
                            <li class="">
                                <a class="" href="#">
                                <img class="component-image component-image--circle cucha" src="entrenador.png">
                                <span class="registrar-entrenador">
                                <i class="fa fa-fw fa-file"></i>
                                </span>
                                <span class="registarEntrenadoresclick">
                                Registrar entrenadores
                                </span>
                                </a>
                            </li>
                            <li class="">
                                <a class="" href="#">
                                <img class="component-image component-image--circle cucha" src="actualizar.png">
                                <span class="">
                                <i class="fa fa-fw fa-folder"></i>
                                </span>
                                <span class="actualizarEntrenadoresclick">
                                Actualizar entrenadores
                                </span>
                                </a>
                            <li class="">
                                <a class="" href="#">
                                <img class="component-image component-image--circle cucha" src="eliminar.png">
                                <span class="">
                                <i class="fa fa-fw fa-globe"></i>
                                </span>
                                <span class="dardeBajaclickEntrenador">
                                    Dar de baja entrenador
                                </span>
                                </a>
                            </li>
                            <li class="">
                                <a class="" href="#">
                                <img class="component-image component-image--circle cucha" src="usuario.png">
                                <span class="">
                                <i class="fa fa-fw fa-users"></i>
                                </span>
                                <span class="vizualizarUsuarioclick">
                                Visualizar Usuario
                                </span>
                                </a>
                            </li>
                            <li class="">
                                <a class="" href="#">
                                      <img class="component-image component-image--circle cucha" src="prueba.png">
                                <span class="">
                                <i class="fa fa-fw fa-cogs"></i>
                                </span>
                                <span class="evaluacionesUsuariosclick">
                                    Evaluaciones de los usuarios
                                </span>
                                </a>
                            </li>
                            <li class="">
                                <a class="" href="#">
                                <img class="component-image component-image--circle cucha" src="eliminar.png">    
                                <span class="">
                                <i class="fa fa-fw fa-cogs"></i>
                                </span>
                                <span class="darBajaUsuarioclick">
                                    Dar de baja usuarios
                                </span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
                <div class="dashboard-content">
                    <div class="page" id="dashboard">
                        <div class="page-header">
                            <h1 class="page-title">Dashboard</h1>
                            <div aria-hidden="false" class="page-search">
                                <input class="search-field" role="search" type="search">
                            </div>
                            <div aria-hidden="false" class="page-actions">
                            </div>
                            <div aria-hidden="false" class="page-filters">
                            </div>
                        </div>
                        <div class="page-body">
                              <div class="wrapper" id="wrapper">
                                <form class="form-signin" method="POST" action="Proceso">       
                                  <h2 class="form-signin-heading">Registrar Entrenador</h2>
                                  <br><input type="text" class="form-control espacio" name="nombreusuarioEntrenador" placeholder="Usuario" required="" autofocus="" />
                                  <br><input type="text" class="form-control espacio" name="nombrePersona" required="" placeholder="Nombre" autofocus="">
                                  <br><input type="text"  class="form-control espacio" name="apellidoPaternoPersona" required="" placeholder="Apellido Paterno" autofocus="">
                                  <br><input type="text" class="form-control espacio" name="apellidoMaternoPersona" required="" placeholder="Apellido Materno" autofocus="">
                                  <br><select name="profesion">
                                      <option value="">Seleccione profesion</option>
                                      <option value="1">Entrenador Personal</option>
                                      <option value="2">Deportista Profesional</option>
                                      <option value="3">Monitor Deportivo</option>
                                      <option value="4">Instructor de actividades al aire libre</option>
                                      <option value="5">Profesor de yoga</option>
                                      <option value="6">Deportista Profesional</option>
                                      <option value="7">Terapeuta deportivo</option>
                                  </select><br><br>
                                  <input type="clave" class="form-control" name="claveUsuario" placeholder="Password" required=""/><br>      
                                  <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnInsertar">Insertar</button>
                                </form>
                                  ${respuesta}    
    <h2>Listado de Personas</h2>
    
    <%
    Daopersona daopersona = new Daopersona();
    List<Persona> datos = new ArrayList();// definir la variable para 
    String resp;
   
    //guardar lo que retorna el mÃ©todo.
    if(request.getAttribute("respuestaDatos") != null){
        //listar con parametro, respuestaDatos viene con un List.
     datos = (List<Persona>) (request.getAttribute("respuestaDatos"));
     int dimension = datos.size();
       if(dimension == 0){
       resp = "No hay registros";
       out.print(resp);
       }
    }else{
        //listar todo
    datos = daopersona.listar();
    }
    
    
    

    for(Persona p : datos){
    %>
    <h3>Identificador</h3>
    <%=  p.getUsuario() %>
    <h3>Nombre Persona</h3>
    <%= p.getNombre() %>
    <h3>Apellido Persona</h3>
    <%= p.getApellidoPaterno() %>
    <br>
    ---------------------
    <br>
    <%
    }
    %>

                              
                        <div class="page-footer">
                            <ul class="pagination"></ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
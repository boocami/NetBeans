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
        <link rel = "stylesheet" type = "text/css" href = "Css/style.css" />
        <link rel="stylesheet" type="text/css" href="Css/iniciarSesion.css"/>
        <link rel="stylesheet" type="text/css" href="Css/Div.css"/>
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
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
                                <img class="component-image component-image--circle cucha" src="Imagenes/entrenador.png">
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
                                <img class="component-image component-image--circle cucha" src="Imagenes/actualizar.png">
                                <span class="">
                                <i class="fa fa-fw fa-folder"></i>
                                </span>
                                <span class="actualizarEntrenadoresclick">
                                Actualizar entrenadores
                                </span>
                                </a>
                            <li class="">
                                <a class="" href="#">
                                <img class="component-image component-image--circle cucha" src="Imagenes/eliminar.png">
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
                                <img class="component-image component-image--circle cucha" src="Imagenes/usuario.png">
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
                                      <img class="component-image component-image--circle cucha" src="Imagenes/prueba.png">
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
                                <img class="component-image component-image--circle cucha" src="Imagenes/eliminar.png">    
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
                             <div class="wrapper 4" id="wrapper4">
                                    <div class="divTable" style="border: 2px solid #000;" >
                                        <div class="divTableBody">
                                            <div class="divTableRow">
                                                <div class="divTableCell">Usuario</div>
                                                <div class="divTableCell">Entrenador</div>
                                                <div class="divTableCell">Estatura</div>
                                                <div class="divTableCell">Peso</div>
                                                <div class="divTableCell">Medida cintura</div>
                                                <div class="divTableCell">Porcentaje grasa formula</div>
                                                <div class="divTableCell">Imc</div>
                                                <div class="divTableCell">Indice grasa instrumento;</div>
                                                <div class="divTableCell">Foto</div>
                                                <div class="divTableCell">Fecha</div>
                                            </div>
                                            <div class="divTableRow">
                                                <div class="divTableCell">&nbsp;</div>
                                                <div class="divTableCell">&nbsp;</div>
                                                <div class="divTableCell">&nbsp;</div>
                                                <div class="divTableCell">&nbsp;</div>
                                                <div class="divTableCell">&nbsp;</div>
                                                <div class="divTableCell">&nbsp;</div>
                                                <div class="divTableCell">&nbsp;</div>
                                                <div class="divTableCell">&nbsp;</div>
                                                <div class="divTableCell">&nbsp;</div>
                                                <div class="divTableCell">&nbsp;</div>
                                            </div>
                                        </div>
                                    </div>
                             </div>
                        </div>
                              
                        <div class="page-footer">
                            <ul class="pagination"></ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
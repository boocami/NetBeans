<%-- 
    Document   : iniciarSesion
    Created on : 25-11-2019, 15:39:48
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel = "stylesheet" type = "text/css" href = "style.css" />
        <link rel = "stylesheet" type = "text/css" href = "iniciarSesion.css" />
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
                              <div class="wrapper">
                                  <form class="form-signin" action="Proceso" method="POST">      
                                        <h2 class="form-signin-heading">Please login</h2>
                                  <input type="text" class="form-control" name="usuario" placeholder="Usuario" required="" autofocus="" />
                                  <input type="password" class="form-control" name="clave" placeholder="Password" required=""/>      

                                  <button class="btn btn-lg btn-primary btn-block" type="submit" name="login">Login</button>   
                                </form>
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

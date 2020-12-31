/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.Entrenador;
import dao.Persona;
import dao.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Daoentrenador;
import modelo.Daopersona;
import modelo.DaoUsuario;

/**
 *
 * @author duque
 */
public class Proceso extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher requestDispatcher; /*La interfaz RequestDispatcher proporciona la facilidad de enviar la solicitud a otro recurso, puede ser html, servlet o jsp. */
        Persona p = new Persona();
        Daopersona daopersona = new Daopersona();
        Entrenador e = new Entrenador();
        Daoentrenador daoentrenador = new Daoentrenador();
        DaoUsuario daousuario = new DaoUsuario();
        if(request.getParameter("login")!=null){
            String usuario, nombre, apellidopaterno, apellidomaterno;
            int idestado,  clave;
            usuario = request.getParameter("username");
            clave = Integer.parseInt(request.getParameter("password"));
            nombre = "Juan Carlos";
            apellidopaterno = "Garrido";
            apellidomaterno = "Morales";
            idestado = 1;
            Persona persona = new Persona(usuario,nombre,apellidopaterno,apellidomaterno,clave,idestado);
            request.getSession().setAttribute("persona", persona );
            request.getRequestDispatcher("registroEntrenador.jsp").forward(request, response);   
        }else if( request.getParameter("btnInsertar")!= null ){
            String usuario;
            int clave;
            String nombre, apellidoPaterno, apellidoMaterno, respuesta, respuesta1, parametro, respuesta3;
            
            parametro = request.getParameter("usuario");
            List<Persona> datos = daopersona.listarParametro(parametro);
            
            int nfilas = datos.size();
            if(nfilas == 0){
                List<Entrenador> datos2 = daoentrenador.listarParametro(parametro);
                int nfilas2 = datos.size();
                if(nfilas2 == 0){
                    int idProfesion;
                    int idestado = 1;
                    usuario = request.getParameter("usuario");
                    clave = Integer.parseInt(request.getParameter("clave"));
                    nombre =request.getParameter("nombre");
                    apellidoPaterno = request.getParameter("apellidoPaterno");
                    apellidoMaterno = request.getParameter("apellidoMaterno");
                    idProfesion = Integer.parseInt(request.getParameter("profesion"));
                    p.setUsuario(usuario);
                    p.setNombre(nombre);
                    p.setApellidoPaterno(apellidoPaterno);
                    p.setApellidoMaterno(apellidoMaterno);
                    p.setClave(clave);
                    p.setIdestado(idestado);
                    e.setUsuario(usuario);
                    e.setIdProfesion(idProfesion);

                        //  enti, entity, objeto.
                     respuesta = daopersona.insertar(p);
                     request.setAttribute("respuesta", respuesta);
                     respuesta1 = daoentrenador.insertar(e);
                     request.setAttribute("respuesta", respuesta1);
                     //scope peticion contexto(this), session 
                     requestDispatcher = request.getRequestDispatcher("registroEntrenador.jsp");
                     requestDispatcher.forward(request, response);  
                }
            }
        }else if(request.getParameter("BuscarDatos")!=null){
            //recibir parametro.-> mandar parametro a busqueda -> recibir arreglo.(LIst)
        String parametro;
        parametro = request.getParameter("usuario");
        List<Entrenador> datos = new ArrayList();
        datos = daoentrenador.listarParametro(parametro);
        request.setAttribute("respuestaDatos", datos);
        //scope peticion contexto(this), session 
        requestDispatcher = request.getRequestDispatcher("actualizarEntrenador.jsp");
        requestDispatcher.forward(request, response);
    }else if(request.getParameter("cambiarclave") != null){
        int clave;
        String usuario, respuesta;
        clave =  Integer.parseInt(request.getParameter("clave1"));
        usuario = request.getParameter("usuario");
        
        p.setUsuario(usuario);
        p.setClave(clave);
        
        respuesta = daopersona.actualizar(p);
        request.setAttribute("respuesta", respuesta);
        requestDispatcher = request.getRequestDispatcher("actualizarEntrenador.jsp");
        requestDispatcher.forward(request, response);
        
    }else if(request.getParameter("BuscarDatosBaja")!=null){
            //recibir parametro.-> mandar parametro a busqueda -> recibir arreglo.(LIst)
        String parametro;
        parametro = request.getParameter("usuario");
        List<Entrenador> datos = new ArrayList();
        datos = daoentrenador.listarParametro(parametro);
        request.setAttribute("respuestaDatos", datos);
        //scope peticion contexto(this), session 
        requestDispatcher = request.getRequestDispatcher("bajaEntrenador.jsp");
        requestDispatcher.forward(request, response);
        
    }else if(request.getParameter("darDeBaja")!=null){
        int idestado = 2;
        String usuario, respuesta;
        usuario = request.getParameter("usuario");
        p.setUsuario(usuario);
        p.setIdestado(idestado);
       respuesta = daopersona.darBaja(p);
        request.setAttribute("respuesta", respuesta);
        requestDispatcher = request.getRequestDispatcher("bajaEntrenador.jsp");
        requestDispatcher.forward(request, response);        
    }else if(request.getParameter("BuscarDatosBajaUsuario")!=null){
        String parametro;
        parametro = request.getParameter("usuario");
        List<Usuario> datos = new ArrayList();
        request.setAttribute("respuestaDatos", datos);
        datos = daousuario.listarParametro(parametro);
        request.setAttribute("respuestaDatos",datos);
        requestDispatcher = request.getRequestDispatcher("bajaUsuario.jsp");
        requestDispatcher.forward(request, response);
    }else if(request.getParameter("darDeBajaUsuario")!=null){
        int idestado = 2;
        String usuario, respuesta;
        usuario = request.getParameter("usuario");
        p.setUsuario(usuario);
        p.setIdestado(idestado);
       respuesta = daopersona.darBaja(p);
        request.setAttribute("respuesta", respuesta);
        requestDispatcher = request.getRequestDispatcher("bajaUsuario.jsp");
        requestDispatcher.forward(request, response);     
    }            
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

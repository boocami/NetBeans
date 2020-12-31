package Proceso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.Entrenador;
import dao.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.DaoUsuario;
import modelo.Daoentrenador;
import modelo.Daopersona;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/Proceso"})
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            RequestDispatcher requestDispatcher; /*La interfaz RequestDispatcher proporciona la facilidad de enviar la solicitud a otro recurso, puede ser html, servlet o jsp. */
            Persona p = new Persona();
            Daopersona daopersona = new Daopersona();
            Entrenador e = new Entrenador();
            Daoentrenador daoentrenador = new Daoentrenador();
            DaoUsuario daousuario = new DaoUsuario();
            
            if(request.getParameter("btnInsertar")!=null){
                String usuario, nombre,apellidopaterno, apellidomaterno,respuesta1, respuesta, parametro;
                int idprofesion, clave, idestado;
                parametro = request.getParameter("usuario");
                List<Persona> datos = daopersona.listarParametro(parametro);
                int nfilas = datos.size();
                if(nfilas == 0){
                     List<Entrenador> datos2 = daoentrenador.listarParametro(parametro);
                    int nfilas2 = datos2.size();
                    if(nfilas2 == 0 ){
                      usuario = request.getParameter("nombreusuarioEntrenador");
                        nombre = request.getParameter("nombrePersona");
                        apellidopaterno = request.getParameter("apellidoPaternoPersona");
                        apellidomaterno = request.getParameter("apellidoMaternoPersona");
                        idprofesion = Integer.parseInt(request.getParameter("profesion"));
                        clave = Integer.parseInt(request.getParameter("claveUsuario"));
                        idestado = 1;
                        p.setUsuario(usuario);
                        p.setNombre(nombre);
                        p.setApellidoPaterno(apellidopaterno);
                        p.setApellidoMaterno(apellidomaterno);
                        p.setClave(clave);
                        p.setIdestado(idestado);
                        e.setUsuario(usuario);
                        e.setIdProfesion(idprofesion);           
                        respuesta1 = daopersona.insertar(p);
                        respuesta = daoentrenador.insertar(e);
                        request.setAttribute("respuestaDatos", datos);
                        requestDispatcher = request.getRequestDispatcher("/RegistrarEntrenador.jsp");
                        requestDispatcher.forward(request, response);
                    }
                }
            }else if(request.getParameter("BuscarEntrenador")!=null){
                //recibir parametro.-> mandar parametro a busqueda -> recibir arreglo.(LIst)
                out.print("entro");
                String parametro;
                parametro = request.getParameter("UsuarioEntrenador");
                List<Entrenador> datos2 = new ArrayList();
        datos2 = daoentrenador.listarParametro(parametro);
        request.setAttribute("respuestaDatos", datos2);
        //scope peticion contexto(this), session 
        requestDispatcher = request.getRequestDispatcher("/administracion.jsp");
        requestDispatcher.forward(request, response);

            }
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

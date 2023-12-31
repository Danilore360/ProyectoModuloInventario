/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.danilore.proyectomoduloinventario.servlets;

import com.danilore.proyectomoduloinventario.logica.Controladora;
import com.danilore.proyectomoduloinventario.logica.IngresoProducto;
import com.danilore.proyectomoduloinventario.logica.Producto;
import com.danilore.proyectomoduloinventario.logica.SalidaProducto;
import com.danilore.proyectomoduloinventario.logica.TipoMoneda;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Danilore
 */
@WebServlet(name = "SvSalidaProducto", urlPatterns = {"/SvSalidaProducto"})
public class SvSalidaProducto extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<SalidaProducto> lista = new ArrayList<SalidaProducto>();

        lista = control.listSalidaProducto();

        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaSalidaProducto", lista);

        response.sendRedirect("Vistas/mostrarSalidaProducto.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String producto = request.getParameter("idProducto");
        long cantidad = Long.parseLong(request.getParameter("cantidad"));
        double totalCosto = Double.parseDouble(request.getParameter("totalCosto"));
        String tipoMoneda = request.getParameter("idTipoMoneda");
        String guia = request.getParameter("idGuia");
        String personal = request.getParameter("nombrePersonal");

        //long ruc = Long.parseLong(request.getParameter("ruc"));
        //Consiguiendo objeto producto por el id
        Producto produ = control.getProducto(producto);

        produ = control.getProducto(producto);

        //Consiguiendo objeto tipoMoneda por el id
        TipoMoneda tipo = control.getTipoMoneda(tipoMoneda);

        tipo = control.getTipoMoneda(tipoMoneda);

        if (produ != null) {
            if (tipo != null) {
                SalidaProducto salida = new SalidaProducto();
                salida.setId_producto(producto);
                salida.setCantidad(cantidad);
                salida.setTotal_costo(totalCosto);
                salida.setId_tipo_moneda(tipoMoneda);
                salida.setId_guia(guia);
                salida.setPersonal_salida(personal);
                control.crearSalidaProducto(salida);

                List<SalidaProducto> lista = new ArrayList<SalidaProducto>();

                lista = control.listSalidaProducto();

                HttpSession misesion = request.getSession();
                misesion.setAttribute("listaSalidaProducto", lista);

                response.sendRedirect("Vistas/mostrarSalidaProducto.jsp");
            } else {
                response.sendRedirect("Vistas/addSalidaProducto.jsp?error=tipoMonedaNoExiste");
            }

        } else {
            response.sendRedirect("Vistas/addSalidaProducto.jsp?error=productoNoExiste");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

package com.danilore.proyectomoduloinventario.logica;

import com.danilore.proyectomoduloinventario.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Danilore
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
        
    public void crearUsuario(String correo, String contra, int cargo, int estado) {
        Usuario usu = new Usuario();
        usu.setCorreo_usuario(correo);
        usu.setContra_usuario(contra);
        usu.setId_cargo(cargo);
        usu.setId_estado(estado);
        controlPersis.crearUsuario(usu);
    }
    
    public List<Usuario> listUsuario(){
        return controlPersis.listUsuario();
    }
    
    public Usuario getUsuario(int id_editar) {
        return controlPersis.getUsuario(id_editar);
    }
    
    public void editUsuario(Usuario usu) {
        
        controlPersis.editUsuario(usu);
    }
    
    ////////////////////////////////////////////////
    
    public void crearProducto(Producto produ){
        controlPersis.crearProducto(produ);
    }
    
    public List<Producto> listProducto(){
        return controlPersis.listProducto();
    }
    
    public Producto getProducto(String id_editar) {
        return controlPersis.getProducto(id_editar);
    }
    
    public void editProducto(Producto produ) {
        controlPersis.editProducto(produ);
    }
    
    ////////////////////////////////////////////////
    
    public void crearCategoriaProducto(CategoriaProducto categoria){
        controlPersis.crearCategoriaProducto(categoria);
    }
    
    public List<CategoriaProducto> listCategoria(){
        return controlPersis.listCategoria();
    }
    
    public void deleteCategoriaProducto(int id_eliminar) {
        controlPersis.deleteCategoriaProducto(id_eliminar);
    }
    
    public CategoriaProducto getCategoriaProducto(int id_editar) {
        return controlPersis.getCategoriaProducto(id_editar);
    }
    
    public void editCategoriaProducto(CategoriaProducto categoria) {
        controlPersis.editCategoriaProducto(categoria);
    }
    
    ////////////////////////////////////////////////
    
    public void crearCargo(Cargo cargo){
        controlPersis.crearCargo(cargo);
    }
    
    public List<Cargo> listCargo(){
        return controlPersis.listCargo();
    }
    
    public Cargo getCargo(int id_editar) {
        return controlPersis.getCargo(id_editar);
    }

    public void editCargo(Cargo cargo) {
        controlPersis.editCargo(cargo);
    }

    ////////////////////////////////////////////////


    public void crearProveedor(Proveedor proveedor){
        controlPersis.crearProveedor(proveedor);
    }
    
    public List<Proveedor> listProveedor(){
        return controlPersis.listProveedor();
    }
    
    public Proveedor getProveedor(String id_editar) {
        return controlPersis.getProveedor(id_editar);
    }
    
    public void editProveedor(Proveedor proveedor) {
        controlPersis.editProveedor(proveedor);
    }
    
    
    /////////////////////////////////////////////////////////////////////

    public void crearIngresoProducto(IngresoProducto ingresoProducto){
        controlPersis.crearIngresoProducto(ingresoProducto);
    }
    
    public List<IngresoProducto> listIngresoProducto(){
        return controlPersis.listIngresoProducto();
    }
    
    public IngresoProducto getIngresoProducto(String id_editar) {
        return controlPersis.getIngresoProducto(id_editar);
    }
    
    public void editIngresoProducto(IngresoProducto ingresoProducto) {
        controlPersis.editIngresoProducto(ingresoProducto);
    }

    
    //////////////////////////////////////////////////////////////////////////////////////////
    
        public void crearGuiaRemisionEntrada(GuiaRemisionEntrada guia){
        controlPersis.crearGuiaRemisionEntrada(guia);
    }
    
    public List<GuiaRemisionEntrada> listGuiaRemisionEntrada(){
        return controlPersis.listGuiaRemisionEntrada();
    }
    
    public GuiaRemisionEntrada getGuiaRemisionEntrada(String id_editar) {
        return controlPersis.getGuiaRemisionEntrada(id_editar);
    }
    
    public void editGuiaRemisionEntrada(GuiaRemisionEntrada guia) {
        controlPersis.editGuiaRemisionEntrada(guia);
    }
    
    ////////////////////////////////////////////////
    
    public void crearSalidaProducto(SalidaProducto salida){
        controlPersis.crearSalidaProducto(salida);
    }
    
    public List<SalidaProducto> listSalidaProducto(){
        return controlPersis.listSalidaProducto();
    }
    
    public SalidaProducto getSalidaProducto(String id_editar) {
        return controlPersis.getSalidaProducto(id_editar);
    }
    
    public void editSalidaProducto(SalidaProducto salida) {
        controlPersis.editSalidaProducto(salida);
    }
    
    ////////////////////////////////////////////////
    
    public void crearGuiaRemisionSalida(GuiaRemisionSalida guia){
        controlPersis.crearGuiaRemisionSalida(guia);
    }
    
    public List<GuiaRemisionSalida> listGuiaRemisionSalida(){
        return controlPersis.listGuiaRemisionSalida();
    }
    
    public GuiaRemisionSalida getGuiaRemisionSalida(String id_editar) {
        return controlPersis.getGuiaRemisionSalida(id_editar);
    }
    
    public void editGuiaRemisionSalida(GuiaRemisionSalida salida) {
        controlPersis.editGuiaRemisionSalida(salida);
    }
    
    
    ////////////////////////////////////////////////
    
    public void crearKardex(Kardex kar){
        controlPersis.crearKardex(kar);
    }
    
    public List<Kardex> listKardex(){
        return controlPersis.listKardex();
    }
    
    public Kardex getKardex(String id_editar) {
        return controlPersis.getKardex(id_editar);
    }
    
    public void editKardex(Kardex kar) {
        controlPersis.editKardex(kar);
    }
    
}
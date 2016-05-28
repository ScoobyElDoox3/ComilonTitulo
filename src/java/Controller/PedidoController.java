/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.*;
import Model.*;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author john
 */
public class PedidoController {
  
   public int totalVenta;
    
   public ArrayList<Detalle_Pedido> obtenerPedidos(){
        Persona persona;
        Cliente cliente;
        TipoPedido tipoPedido;
        Pedido pedido;
        Detalle_Pedido detallePedido;
        Plato plato;
        Venta venta;
        Empresa empresa;
        Convenio convenio;
        ArrayList<Detalle_Pedido> listDetPedido = new ArrayList<Detalle_Pedido>();
        Conexion con = new Conexion();
        Connection rescon = con.Con(); 
        try {
            Statement st;
            ResultSet rs = null;
            CallableStatement cStmt = rescon.prepareCall("{call PEDIDOLISTAR(?)}");
            cStmt.registerOutParameter(1, OracleTypes.CURSOR);
            
            cStmt.execute ();
            ResultSet rset = (ResultSet)cStmt.getObject(1);
            while (rset.next ()){
                persona = new Persona(rset.getInt(4), rset.getString(7), rset.getString(8), rset.getString(9), rset.getString(10), rset.getString(11), rset.getInt(12));
                convenio = new Convenio(rset.getInt(20), rset.getString(21), rset.getString(22), rset.getDate(23), rset.getDate(24), rset.getInt(25));
                empresa = new Empresa(rset.getInt(16), rset.getString(17), rset.getString(18), rset.getInt(19), convenio);
                cliente = new Cliente(rset.getInt(3), rset.getString(5), persona, empresa);
                tipoPedido = new TipoPedido(rset.getInt(13), rset.getString(14));
                pedido = new Pedido(rset.getInt(1), rset.getDate(2), cliente, tipoPedido);
                //venta = new Venta(0, null, rset.getInt(15), pedido);
                
               
                detallePedido = new Detalle_Pedido(pedido, null);
                totalVenta += rset.getInt(15);
                listDetPedido.add(detallePedido);
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }finally{
            return listDetPedido;
        }
        
        
   }
   //
   public ArrayList<Detalle_Pedido> obtenerPedidosByTipoPedido(String tp){
        Persona persona;
        Cliente cliente;
        TipoPedido tipoPedido;
        Pedido pedido;
        Detalle_Pedido detallePedido;
        Plato plato;
        Venta venta;
        Empresa empresa;
        Convenio convenio;
        ArrayList<Detalle_Pedido> listDetPedido = new ArrayList<Detalle_Pedido>();
        Conexion con = new Conexion();
        Connection rescon = con.Con(); 
        try {
            Statement st;
            ResultSet rs = null;
            CallableStatement cStmt = rescon.prepareCall("{call PEDIDOLISTARBYTIPOPEDIDO(?, ?)}");
            cStmt.setString(1, tp);
            cStmt.registerOutParameter(2, OracleTypes.CURSOR);
            
            cStmt.execute ();
            ResultSet rset = (ResultSet)cStmt.getObject(2);
            while (rset.next ()){
                persona = new Persona(rset.getInt(4), rset.getString(7), rset.getString(8), rset.getString(9), rset.getString(10), rset.getString(11), rset.getInt(12));
                convenio = new Convenio(rset.getInt(20), rset.getString(21), rset.getString(22), rset.getDate(23), rset.getDate(24), rset.getInt(25));
                empresa = new Empresa(rset.getInt(16), rset.getString(17), rset.getString(18), rset.getInt(19), convenio);
                cliente = new Cliente(rset.getInt(3), rset.getString(5), persona, empresa);
                tipoPedido = new TipoPedido(rset.getInt(13), rset.getString(14));
                pedido = new Pedido(rset.getInt(1), rset.getDate(2), cliente, tipoPedido);
                //venta = new Venta(0, null, rset.getInt(15), pedido);
                
               
                detallePedido = new Detalle_Pedido(pedido, null);
                totalVenta += rset.getInt(15);
                listDetPedido.add(detallePedido);
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }finally{
            return listDetPedido;
        }
        
        
   }
   //
   public ArrayList<Detalle_Pedido> getDetallePedido(int idPedido){
        Persona persona;
        Cliente cliente;
        TipoPedido tipoPedido;
        Pedido pedido;
        Detalle_Pedido detallePedido;
        Plato plato;
        Venta venta;
        Convenio convenio;
        Empresa empresa;
        ArrayList<Detalle_Pedido> detPedido = new ArrayList<Detalle_Pedido>();
        Conexion con = new Conexion();
        Connection rescon = con.Con(); 
        try {
            Statement st;
            ResultSet rs = null;
            CallableStatement cStmt = rescon.prepareCall("{call DETALLEPEDIDOLISTAR_BYIDPEDIDO(?,?)}");
            cStmt.setInt(1, idPedido);
            cStmt.registerOutParameter(2, OracleTypes.CURSOR);
            
            cStmt.executeUpdate();
            ResultSet rset = (ResultSet)cStmt.getObject(2);
            while (rset.next ()){
                persona = new Persona(rset.getInt(4), rset.getString(7), rset.getString(8), rset.getString(9), rset.getString(10), rset.getString(11), rset.getInt(12));
                convenio = new Convenio(rset.getInt(24), rset.getString(25), rset.getString(26), rset.getDate(27), rset.getDate(28), rset.getInt(29));
                empresa = new Empresa(rset.getInt(20), rset.getString(21), rset.getString(22), rset.getInt(23), convenio);
                cliente = new Cliente(rset.getInt(3), rset.getString(5), persona, empresa);
                tipoPedido = new TipoPedido(rset.getInt(13), rset.getString(14));
                pedido = new Pedido(rset.getInt(1), rset.getDate(2), cliente, tipoPedido);
                plato = new Plato(rset.getInt(15), rset.getString(16), rset.getString(17), rset.getInt(18), rset.getString(19), null, null);
                detallePedido = new Detalle_Pedido(pedido, plato);
                totalVenta += rset.getInt(18);
                
                detPedido.add(detallePedido);
            }
            
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }finally{
            return detPedido;
        }
   }
   //
   public Despacho getEstadoPedidoByIdPedido(int idPedido){
       Detalle_Pedido detPed = new Detalle_Pedido(null, null);
       Conexion con = new Conexion();
        Connection rescon = con.Con(); 
        Pedido pedido;
         Persona persona;
        Cliente cliente;
        TipoPedido tipoPedido;
        Detalle_Pedido detallePedido;
        Plato plato;
        Venta venta;
        Despacho despacho = new Despacho();
        Repartidor repartidor;
        Estado_Pedido estadoPed;
        try {
            Statement st;
            ResultSet rs = null;
            CallableStatement cStmt = rescon.prepareCall("{call GetEstadoPedidoByIdPedio(?, ?)}");
            cStmt.setInt(1, idPedido);
            cStmt.registerOutParameter(2, OracleTypes.CURSOR);
            cStmt.executeUpdate();
            ResultSet rset = (ResultSet)cStmt.getObject(2);
            while (rset.next ()){
                persona = new Persona(rset.getInt(7), rset.getString(8), rset.getString(10), rset.getString(11), rset.getString(12), rset.getString(14), rset.getInt(13));
                cliente = new Cliente(rset.getInt(5), rset.getString(6), persona, null);
                tipoPedido = new TipoPedido(rset.getInt(3), rset.getString(4));
                estadoPed = new Estado_Pedido(rset.getInt(21), rset.getInt(22), rset.getString(23));
                pedido = new Pedido(rset.getInt(1), rset.getDate(2), cliente, tipoPedido, estadoPed);
                persona = new Persona(rset.getInt(20), rset.getString(24), rset.getString(25), rset.getString(26), rset.getString(27), rset.getString(28), rset.getInt(29));
                //plato = new Plato(rset.getInt(15), rset.getString(16), rset.getString(17), rset.getInt(18), rset.getString(19), null, null);
                repartidor = new Repartidor(rset.getInt(17), rset.getString(18), rset.getString(19), persona);
                despacho = new Despacho(idPedido, rset.getString(14), rset.getString(15), rset.getInt(16), pedido, repartidor);
//                detPedido.add(detallePedido);
            }
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }
       
       return despacho;
   }
   //
   public void eliminarPedidoById(int idPedido){
        Conexion con = new Conexion();
        Connection rescon = con.Con(); 
        try {
            Statement st;
            ResultSet rs = null;
            CallableStatement cStmt = rescon.prepareCall("{call DeletePedidoByIdPedido(?)}");
            cStmt.setInt(1, idPedido);
            
            cStmt.executeUpdate();
        
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }
    }
   //
   public void eliminarDetallePedido(int idPedido, int idplato){
        Conexion con = new Conexion();
        Connection rescon = con.Con(); 
        try {
            Statement st;
            ResultSet rs = null;
            CallableStatement cStmt = rescon.prepareCall("{call DelDetByIdPedidoIdPlato(?, ?)}");
            cStmt.setInt(1, idPedido);
             cStmt.setInt(2, idplato);
            cStmt.executeUpdate();
        
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }
   }
   //
   public void asignarRepartidorPedido(int idPedido, int idRepartidor){
       Conexion con = new Conexion();
        Connection rescon = con.Con(); 
        try {
            Statement st;
            ResultSet rs = null;
            CallableStatement cStmt = rescon.prepareCall("{call ASIGNARREPARTIDOR(?, ?)}");
            cStmt.setInt(1, idPedido);
             cStmt.setInt(2, idRepartidor);
            cStmt.executeUpdate();
        
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }
   }
    //
   public ArrayList<String> seleccionarTipoPedido(){
        //int asd
       String resultado = "no hay resultado";
       ArrayList<String> listTipo = new ArrayList<String>();
       Conexion conn = new Conexion();
       String sql = "SELECT nombre from TIPO_PEDIDO";
       Statement command = conn.Conectar();
       try{
           ResultSet rset = command.executeQuery(sql);
           //ResultSet rset = command.getResultSet();
           while (rset.next ()){
               listTipo.add(rset.getString(1));
           }
           
       }
       catch(Exception ex){
           resultado = ex.getMessage();
       }
       return listTipo;
   }
   //
   public ArrayList<Repartidor> seleccionarRepartidor(){
        //int asd
       String resultado = "no hay resultado";
       ArrayList<Repartidor> listRepartidor = new ArrayList<Repartidor>();
       Conexion conn = new Conexion();
       String sql = "SELECT r.ID_REPARTIDOR, r.VEHICULO, r.LICENCIA, p.RUT, p.DV, p.NOMBRE, p.APP, p.APM, p.DIRECCION, p.TELEFONO from REPARTIDOR r join persona p on r.PERSONA_RUT = p.RUT";
       Statement command = conn.Conectar();
       try{
           ResultSet rset = command.executeQuery(sql);
           //ResultSet rset = command.getResultSet();
           
           while (rset.next ()){
                Persona per = new Persona(rset.getInt(4), rset.getString(5), rset.getString(6), rset.getString(7), rset.getString(8), rset.getString(9), rset.getInt(10));
                Repartidor rep = new Repartidor(rset.getInt(1), rset.getString(2), rset.getString(3), per);
                listRepartidor.add(rep);
           }
           
       }
       catch(Exception ex){
           resultado = ex.getMessage();
       }
       return listRepartidor;
   }
}

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
  
    public Persona persona;
    public Cliente cliente;
    public TipoPedido tipoPedido;
    public Pedido pedido;
    public Detalle_Pedido detallePedido;
    public Detalle_Pedido[] pedidoArray;      
    public ArrayList<Detalle_Pedido> listDetPedido = new ArrayList<Detalle_Pedido>();
    
   public ArrayList<Detalle_Pedido> obtenerPedidos(){
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
                cliente = new Cliente(rset.getInt(3), rset.getString(5), persona, null);
                tipoPedido = new TipoPedido(rset.getInt(13), rset.getString(14));
                pedido = new Pedido(rset.getInt(1), rset.getDate(2), cliente, tipoPedido);
                detallePedido = new Detalle_Pedido(pedido, null, rset.getInt(15));
                listDetPedido.add(detallePedido);
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }finally{
            return listDetPedido;
        }
        
        
   }
   
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
}

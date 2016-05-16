/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.*;
import Model.*;
/**
 *
 * @author john
 */
public class PedidoController {
  
    public Persona persona;
    public Cliente cliente;
    public TipoPedido tipoPedido;
    public Pedido pedido;
    public Pedido[] pedidoArray;      
    
    
   public Pedido obtenerPedidos(){
        Conexion con = new Conexion();
        Connection rescon = con.Con(); 
        try {
            Statement st;
            ResultSet rs = null;
            CallableStatement cStmt = rescon.prepareCall("{call LISTARPEDIDO(?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?)}");
           
            cStmt.registerOutParameter(1, java.sql.Types.NUMERIC);
            cStmt.registerOutParameter(2, java.sql.Types.DATE);
            cStmt.registerOutParameter(3, java.sql.Types.NUMERIC);
            cStmt.registerOutParameter(4, java.sql.Types.NUMERIC);
            cStmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            cStmt.registerOutParameter(6, java.sql.Types.NUMERIC);
            cStmt.registerOutParameter(7, java.sql.Types.VARCHAR);
            cStmt.registerOutParameter(8, java.sql.Types.VARCHAR);
            cStmt.registerOutParameter(9, java.sql.Types.VARCHAR);
            cStmt.registerOutParameter(10, java.sql.Types.VARCHAR);
            cStmt.registerOutParameter(11, java.sql.Types.CLOB);
            cStmt.registerOutParameter(12, java.sql.Types.NUMERIC);
            cStmt.registerOutParameter(13, java.sql.Types.NUMERIC);
            cStmt.registerOutParameter(14, java.sql.Types.VARCHAR);
            
            cStmt.executeUpdate(); 
            int updateCount = cStmt.getUpdateCount();
            int id = cStmt.getInt(1);
            //tipoPedido = cStmt.getNString(2);
            
            persona = new Persona(cStmt.getInt(4), cStmt.getNString(7), cStmt.getNString(8), cStmt.getNString(9), cStmt.getNString(10), cStmt.getNString(11), cStmt.getInt(12));
            cliente = new Cliente(cStmt.getInt(3), cStmt.getNString(5), cStmt.getInt(4), null);
            tipoPedido = new TipoPedido(cStmt.getInt(13), cStmt.getNString(14));
            pedido = new Pedido(cStmt.getInt(1), cStmt.getDate(2), cliente, tipoPedido);
            
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }finally{
            return pedido;
        }
        
        
   }
}

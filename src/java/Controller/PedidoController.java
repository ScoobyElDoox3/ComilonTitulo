/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.*;
import Model.*;
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
    public Plato plato;
    public Pedido[] pedidoArray;      
    
    
   public Pedido obtenerPedidos(){
        Conexion con = new Conexion();
        Connection rescon = con.Con(); 
        try {
            Statement st;
            ResultSet rs = null;
            //CallableStatement cStmt = rescon.prepareCall("{call LISTARPEDIDO(?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?)}");
            CallableStatement cStmt = rescon.prepareCall("{call PEDIDOLISTAR(?)}");
            cStmt.registerOutParameter(1, OracleTypes.CURSOR);
            
            //cStmt.setString (2, "SALESMAN");
            cStmt.execute ();
            ResultSet rset = (ResultSet)cStmt.getObject(1);
            while (rset.next ()){
//                rset.getInt("ENAME");
//                rset.getString ("ENAME");
                persona = new Persona(rset.getInt(4), rset.getString(7), rset.getString(8), rset.getString(9), rset.getString(10), rset.getString(11), rset.getInt(12));
                cliente = new Cliente(rset.getInt(3), rset.getString(5), persona, null);
                tipoPedido = new TipoPedido(rset.getInt(13), rset.getString(14));
                pedido = new Pedido(rset.getInt(1), rset.getDate(2), cliente, tipoPedido);
                //plato = new Plato(0, nombre, descripcion, 0, tipo_plato, proveedor, categoria)
            }
                
//            cStmt.registerOutParameter(2, java.sql.Types.DATE);
//            cStmt.registerOutParameter(3, java.sql.Types.NUMERIC);
//            cStmt.registerOutParameter(4, java.sql.Types.NUMERIC);
//            cStmt.registerOutParameter(5, java.sql.Types.VARCHAR);
//            cStmt.registerOutParameter(6, java.sql.Types.NUMERIC);
//            cStmt.registerOutParameter(7, java.sql.Types.VARCHAR);
//            cStmt.registerOutParameter(8, java.sql.Types.VARCHAR);
//            cStmt.registerOutParameter(9, java.sql.Types.VARCHAR);
//            cStmt.registerOutParameter(10, java.sql.Types.VARCHAR);
//            cStmt.registerOutParameter(11, java.sql.Types.CLOB);
//            cStmt.registerOutParameter(12, java.sql.Types.NUMERIC);
//            cStmt.registerOutParameter(13, java.sql.Types.NUMERIC);
//            cStmt.registerOutParameter(14, java.sql.Types.VARCHAR);
            
//            cStmt.executeUpdate(); 
//            int updateCount = cStmt.getUpdateCount();
            //ResultSet resultSet = (ResultSet)cStmt.getObject(1, )
            //int id = cStmt.GET(1);
            //tipoPedido = cStmt.getNString(2);
            
            
            
            
            
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }finally{
            return pedido;
        }
        
        
   }
}

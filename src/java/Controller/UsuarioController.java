/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Conexion;
import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Valentin Levenier
 */
public class UsuarioController {
    public String eliminar(int codigo)
    {
        String resultado = "nulo";
        Conexion conn = new Conexion();
        String sql = "DELETE FROM USUARIO WHERE ID_USUARIO="+codigo+"";
        Statement command = conn.Conectar();
      
       try{
           command.execute(sql);
           resultado = "Entro y ejecuto";
           
       }
       catch(Exception ex){
           resultado = ex.getMessage();
       }
        
        return resultado;
    }
    public String Perfil(int cod)
    {
        String resultado = "no hay";
        
        Conexion conn = new Conexion();
        //String sql = "SELECT * FROM PERSONA WHERE USER='"+user+"' AND PASSWORD='"+pass+"'";
        String sql = "SELECT NOMBRE FROM TIPO_USUARIO WHERE ID_TIPO_USUARIO="+cod+"";
        PreparedStatement command = conn.conectar(sql);
        try{
            
           // command.setString(1, user);
           
                    
            
        ResultSet result = command.executeQuery();
        if (result.next()) {
                      
             resultado = (result.getString("NOMBRE"));
            
            
            //usuario.setPass(result.getString("CONTRASEÑA"));
           
        }
        }
        catch(Exception ex){
             resultado = ex.getMessage();
                }
        
        
       return resultado;
    }
    public Usuario login(String user, String pass)
    {
        Usuario usuario = new Usuario();
        Conexion conn = new Conexion();
        //String sql = "SELECT * FROM PERSONA WHERE USER='"+user+"' AND PASSWORD='"+pass+"'";
        String sql = "SELECT NOMBRE_USUARIO,ID_TIPO_USUARIO FROM USUARIO WHERE NOMBRE_USUARIO='"+user+"' AND CONTRASEÑA='"+pass+"' ";
        PreparedStatement command = conn.conectar(sql);
        try{
            
           // command.setString(1, user);
           
                    
            
        ResultSet result = command.executeQuery();
        if (result.next()) {
                      
            usuario.setUser(result.getString("NOMBRE_USUARIO"));
            usuario.setTipoUsuario(result.getInt("ID_TIPO_USUARIO"));
            
            //usuario.setPass(result.getString("CONTRASEÑA"));
           
        }
        }
        catch(Exception ex){
             usuario.setUser(ex.getMessage());
                }
        
        
       return usuario;
    }
    public String Ingresar(String user,String pass, int tipoUsuario)
    {
       String resultado = "no hay resultado";
       Conexion conn = new Conexion();
       String sql = "INSERT INTO USUARIO VALUES(sqcUsuario.NextVal,'"+user+"','"+pass+"',18275628,"+tipoUsuario+")";
       Statement command = conn.Conectar();
       try{
           command.executeUpdate(sql);
           resultado = "entro y ejecuto";
       }
       catch(Exception ex){
           resultado = ex.getMessage();
       }
       return resultado;
    }
    
     public String Modificar(String user, String pass, int codigo)
    {
        String resultado = "no hay resultado";
        Conexion conn = new Conexion();
       String sql = "UPDATE USUARIO SET NOMBRE_USUARIO='"+user+"',CONTRASEÑA='"+pass+"' where ID_USUARIO="+codigo+"";
       Statement command = conn.Conectar();
       try{
           command.execute(sql);
           resultado = "Entro y ejecuto";
           
       }
       catch(Exception ex){
           resultado = ex.getMessage();
       }
        
        return resultado;
    }
    
    
}

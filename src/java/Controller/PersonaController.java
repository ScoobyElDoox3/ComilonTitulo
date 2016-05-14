/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Conexion;
import java.sql.Statement;

/**
 *
 * @author Valentin Levenier
 */
public class PersonaController {
    
    public String Ingresar(int rut,String dv, String nombre, String app, String apm, String direccion, int telefono)
    {
       String resultado = "no hay resultado";
       Conexion conn = new Conexion();
       String sql = "INSERT INTO PERSONA VALUES("+rut+",'"+dv+"','"+nombre+"','"+app+"','"+apm+"','"+direccion+"',"+telefono+")";
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
    
    
}

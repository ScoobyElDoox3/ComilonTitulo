/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Valentin Levenier
 */
public class Conexion {
    Connection conn = null;
//    String driver = "oracle.jdbc.driver.OracleDriver";
//    //Localhost
//    String url = "jdbc:oracle:thin:@localhost:1521:XE";    
//    String user = "COMILON_PRUEBA";
//    String password = "12311231gb";
    
   
    String driver = "oracle.jdbc.driver.OracleDriver";
    //Localhost
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";    
    String user = "elcomilon";
    String password = "elcomilon1";
    public Statement Conectar(){    
try
    {
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        return conn.createStatement();
    }
    catch(Exception e)
    {
        return null;
    }
}
   
   public PreparedStatement conectar(String consultaSQL){    
try
    {
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        return conn.prepareStatement(consultaSQL);
    }
    catch(Exception e)
    {
        return null;
    }
}
   
   
   public Connection Con(){
        Connection conn = null;
        Statement stmt = null;
        try{
           Class.forName("oracle.jdbc.OracleDriver");

           conn = DriverManager.getConnection(url,user,password);

        }catch(SQLException se){
           //Handle errors for JDBC
           se.printStackTrace();
           conn=null;
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
           conn=null;
        }finally{
           return conn;
        }//end try
    }
   public void Desconectar(){
   try{
       conn.close();
   }
   catch(SQLException e)
   {
       
   }
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

/**
 *
 * @author Valentin Levenier
 */
public class ImagenPlato {
   private int codigoImagen;
   private String nombreImagen;
   private String tipoImagen;
   private int peso;
   private String ruta;
   private String codigoPlato;

    public ImagenPlato() {
    }

    public ImagenPlato(int codigoImagen, String nombreImagen, String tipoImagen, int peso, String ruta, String codigoPlato) {
        this.codigoImagen = codigoImagen;
        this.nombreImagen = nombreImagen;
        this.tipoImagen = tipoImagen;
        this.peso = peso;
        this.ruta = ruta;
        this.codigoPlato = codigoPlato;
    }

    public int getCodigoImagen() {
        return codigoImagen;
    }

    public void setCodigoImagen(int codigoImagen) {
        this.codigoImagen = codigoImagen;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getTipoImagen() {
        return tipoImagen;
    }

    public void setTipoImagen(String tipoImagen) {
        this.tipoImagen = tipoImagen;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getCodigoPlato() {
        return codigoPlato;
    }

    public void setCodigoPlato(String codigoPlato) {
        this.codigoPlato = codigoPlato;
    }
   public int obtenerCodigoPlato()
    {
       String sql = "SELECT MAX(ID_PLATO) AS ID_PLATO FROM PLATO";
       Conexion conn = new Conexion();
       int codigo = 0;
      PreparedStatement command = conn.conectar(sql);
        try{
            ResultSet result = command.executeQuery();
            if(result.next()) {
                
               codigo = result.getInt("ID_PLATO");
               
            }
        }
        catch(Exception ex){}
        
         
        return codigo;
    }
 public String getCadenaAlfanumAleatoria (int longitud){
String cadenaAleatoria = "";
long milis = new java.util.GregorianCalendar().getTimeInMillis();
Random r = new Random(milis);
int i = 0;
while ( i < longitud){
char c = (char)r.nextInt(255);
if ( (c >= '0' && c <='9') || (c >='A' && c <='Z') ){
cadenaAleatoria += c;
i ++;
}
}
return cadenaAleatoria;
}
   public String IngresarImagen(String nombre, String tipo, long peso)
    {
        String resultado = "no hay resultado";
        Conexion conn = new Conexion();
       int codigo = obtenerCodigoPlato();
       String ruta = "libs/img/platos/"+nombre;
       String sql = "INSERT INTO IMAGEN VALUES(sqcImagen.NextVal,'"+nombre+"','"+tipo+"',"+peso+",'"+ruta+"',"+codigo+")";
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

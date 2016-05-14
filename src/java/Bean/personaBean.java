/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.Conexion;
import Model.Persona;
import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Valentin Levenier
 */
@ManagedBean
@RequestScoped
public class personaBean {

    /**
     * Creates a new instance of personaBean
     */
    private int rut;
    private String dv;
    private String nombre;
    private String app;
    private String apm;
    private String direccion;
    private int telefono;
    public personaBean() {
    
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public ArrayList<Persona> getPersonas()
    {
       
        Conexion conn = new Conexion();
        ArrayList<Persona> array = new ArrayList<>();
        String sql = "SELECT * FROM PERSONA";
        PreparedStatement command = conn.conectar(sql);
        try{
            ResultSet result = command.executeQuery();
            while(result.next()) {
                Persona persona = new Persona();
                persona.setRut(result.getInt("RUT"));
                persona.setDv(result.getString("DV"));
                persona.setNombre(result.getString("NOMBRE"));
                persona.setApp(result.getString("APP"));
                persona.setApm(result.getString("APM"));
                persona.setDireccion(result.getString("DIRECCION"));
                persona.setTelefono(result.getInt("TELEFONO"));
                array.add(persona);
            }
        }
        catch(Exception ex){}
        
         
        return array;
    }
    
}

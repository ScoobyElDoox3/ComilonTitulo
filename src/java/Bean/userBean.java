/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.Conexion;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//import javax.faces.context.FacesContext;

/**
 *
 * @author Valentin Levenier
 */
//@ManagedBean
//@RequestScoped
public class userBean {

    /**
     * Creates a new instance of userBean
     */
    private String user;
    private String pass;
    private int codigo;
    private String perfil;
    
    public userBean() {
        
  
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
    public ArrayList<Usuario> getUsuarios()
    {
        Conexion conn = new Conexion();
        ArrayList<Usuario> array = new ArrayList<>();
        String sql2="SELECT USUARIO.ID_USUARIO AS ID_USUARIO,USUARIO.CONTRASEÑA AS CONTRASEÑA,USUARIO.NOMBRE_USUARIO AS NOMBRE_USUARIO, TIPO_USUARIO.NOMBRE AS NOMBRE FROM USUARIO INNER JOIN TIPO_USUARIO ON USUARIO.ID_TIPO_USUARIO = TIPO_USUARIO.ID_TIPO_USUARIO";
        String sql = "SELECT NOMBRE_USUARIO, CONTRASEÑA, ID_USUARIO FROM USUARIO";
        PreparedStatement command = conn.conectar(sql2);
        try{
            ResultSet result = command.executeQuery();
            while(result.next()) {
                Usuario user = new Usuario();
                user.setUser(result.getString("NOMBRE_USUARIO"));
                user.setPass(result.getString("CONTRASEÑA"));
                user.setCodigo(result.getInt("ID_USUARIO"));
                user.setPerfil(result.getString("NOMBRE"));
                array.add(user);
            }
        }
        catch(Exception ex){}
        
         
        return array;
    }
}

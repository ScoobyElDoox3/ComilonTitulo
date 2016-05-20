/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author john
 */
public class Cliente {
    private int idCliente;
    private String tipoCliente;
    private Persona persona;
    private Empresa empresa;

    public Cliente(){
        
    
    }
    
    public Cliente(int idCliente, String tipoCliente, Persona persona, Empresa empresa) {
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.persona = persona;
        this.empresa = empresa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    
}

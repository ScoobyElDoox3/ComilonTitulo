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
    private int rut;
    private Empresa empresa;

    public Cliente(){
        this.idCliente = 0;
        this.tipoCliente = "";
        this.rut = 0;
        this.empresa = new Empresa();
    
    }
    
    public Cliente(int idCliente, String tipoCliente, int rut, Empresa empresa) {
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.rut = rut;
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
}

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
public class Despacho {
    private int id;
    private String direccion; 
    private String comuna;
    private int numeracion;
    private Pedido pedido;
    private Repartidor repartidor;

    public Despacho(){
        
    }
    public Despacho(int id, String direccion, String comuna, int numeracion, Pedido pedido, Repartidor repartidor) {
        this.id = id;
        this.direccion = direccion;
        this.comuna = comuna;
        this.numeracion = numeracion;
        this.pedido = pedido;
        this.repartidor = repartidor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }
    
    
    
}

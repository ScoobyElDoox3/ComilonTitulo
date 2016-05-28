/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author bruno
 */
public class Estado_Pedido {
    int id_estado_pedido;
    int tiempoEntrega;
    String descripcion;

    public Estado_Pedido(int id_estado_pedido, int tiempoEntrega, String descripcion) {
        this.id_estado_pedido = id_estado_pedido;
        this.tiempoEntrega = tiempoEntrega;
        this.descripcion = descripcion;
    }

    
    
    public int getId_estado_pedido() {
        return id_estado_pedido;
    }

    public void setId_estado_pedido(int id_estado_pedido) {
        this.id_estado_pedido = id_estado_pedido;
    }

    public int getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(int tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}

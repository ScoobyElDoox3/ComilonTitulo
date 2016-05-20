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
public class Detalle_Pedido {
    private Pedido pedido;
    private Plato plato;
    private int totalVenta;

    public Detalle_Pedido(Pedido pedido, Plato plato, int totalVenta) {
        this.pedido = pedido;
        this.plato = plato;
        this.totalVenta = totalVenta;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public int getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    
}

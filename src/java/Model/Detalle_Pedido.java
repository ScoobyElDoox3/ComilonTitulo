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

    public Detalle_Pedido(Pedido pedido, Plato plato) {
        this.pedido = pedido;
        this.plato = plato;
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
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author john
 */
public class Pedido {
    private int id;
    private Date fechaEntrega;
    private Cliente cliente;
    private TipoPedido tipoPedido;
    private Estado_Pedido estadoPedido;

    public Pedido(int id, Date fechaEntrega, Cliente cliente, TipoPedido tipoPedido) {
        this.id = id;
        this.fechaEntrega = fechaEntrega;
        this.cliente = cliente;
        this.tipoPedido = tipoPedido;
    }
    
    public Pedido(int id, Date fechaEntrega, Cliente cliente, TipoPedido tipoPedido, Estado_Pedido estadoPedido) {
        this.id = id;
        this.fechaEntrega = fechaEntrega;
        this.cliente = cliente;
        this.tipoPedido = tipoPedido;
        this.estadoPedido = estadoPedido;
    }

    public Estado_Pedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Estado_Pedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
     
    
    
}

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
public class Detalle_Despacho {
    private Despacho despacho;
    private Venta venta;

    public Detalle_Despacho(Despacho despacho, Venta venta) {
        this.despacho = despacho;
        this.venta = venta;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    
    
}

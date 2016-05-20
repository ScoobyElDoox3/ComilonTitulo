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
public class Ruta {
    private int id_ruta;
    private String rutaOptima;
    private String rutaAlternativa;
    private Despacho despacho;

    public Ruta(int id_ruta, String rutaOptima, String rutaAlternativa, Despacho despacho) {
        this.id_ruta = id_ruta;
        this.rutaOptima = rutaOptima;
        this.rutaAlternativa = rutaAlternativa;
        this.despacho = despacho;
    }

    
    
    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getRutaOptima() {
        return rutaOptima;
    }

    public void setRutaOptima(String rutaOptima) {
        this.rutaOptima = rutaOptima;
    }

    public String getRutaAlternativa() {
        return rutaAlternativa;
    }

    public void setRutaAlternativa(String rutaAlternativa) {
        this.rutaAlternativa = rutaAlternativa;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }
            
    
    
}

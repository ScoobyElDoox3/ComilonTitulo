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
public class Convenio {
    private int id_convenio;
    private String nombre_convenio;
    private String descripcion;
    private Date fecha_contrato;
    private Date fecha_caducacion;
    private int saldo_trabajador;
    

    public Convenio(int id_convenio, String nombre_convenio, String descripcion, Date fecha_contrato, Date fecha_caducacion, int saldo_trabajador) {
        this.id_convenio = id_convenio;
        this.nombre_convenio = nombre_convenio;
        this.descripcion = descripcion;
        this.fecha_contrato = fecha_contrato;
        this.fecha_caducacion = fecha_caducacion;
        this.saldo_trabajador = saldo_trabajador;
    }

    public Convenio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    public String getNombre_convenio() {
        return nombre_convenio;
    }

    public void setNombre_convenio(String nombre_convenio) {
        this.nombre_convenio = nombre_convenio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public Date getFecha_caducacion() {
        return fecha_caducacion;
    }

    public void setFecha_caducacion(Date fecha_caducacion) {
        this.fecha_caducacion = fecha_caducacion;
    }

    public int getSaldo_trabajador() {
        return saldo_trabajador;
    }

    public void setSaldo_trabajador(int saldo_trabajador) {
        this.saldo_trabajador = saldo_trabajador;
    }

    public void setPerfil(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

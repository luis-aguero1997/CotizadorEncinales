package FacturasXML;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macbookair
 */
public class Conceptos {
     String cantidad;
     String unidad;
     String descripcion;
     String valorunit;
     String importe;

    public String getCantidad() {
        return cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getValorunit() {
        return valorunit;
    }

    public String getImporte() {
        return importe;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValorunit(String valorunit) {
        this.valorunit = valorunit;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }  
}

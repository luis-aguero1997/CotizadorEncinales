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
public class Receptor {
    String rfc;
    String nombre;
    String fecha;
    String folio;
    String serie;
    String importe;
    String impuestos;
    String subTotal;
    String montoTotal;
    String mail;
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    

    public void setMontoTotal(String montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMontoTotal() {
        return montoTotal;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public void setImpuestos(String impuestos) {
        this.impuestos = impuestos;
    }

  

  

    public String getRfc() {
        return rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getFolio() {
        return folio;
    }

    public String getSerie() {
        return serie;
    }

    public String getImporte() {
        return importe;
    }

    public String getImpuestos() {
        return impuestos;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }   
}

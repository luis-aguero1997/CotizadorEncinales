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
public class Tabla {
    String RFC;
    String Nombre;
    String calle;
    String exterior;
    String colonia;
    String municipio;
    String estado;
    String totalimpuestos;
    String impuesto;
    String tasa;
    String importe;

    public void setTotalimpuestos(String totalimpuestos) {
        this.totalimpuestos = totalimpuestos;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public void setTasa(String tasa) {
        this.tasa = tasa;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getTotalimpuestos() {
        return totalimpuestos;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public String getTasa() {
        return tasa;
    }

    public String getImporte() {
        return importe;
    }
    
    public void setRfc(String RFC) {
        this.RFC = RFC;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRfc() {
        return RFC;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCalle() {
        return calle;
    }

    public String getExterior() {
        return exterior;
    }

    public String getColonia() {
        return colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getEstado() {
        return estado;
    }
}

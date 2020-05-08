/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author eduardogarciadelgado
 */
public class ClaseProductosLinea {
    String Clave;
    String NombreProducto;
    double Diametro;
    double PesoMaterial;
    double UnidadEmpaque;
    double UnidadUtilizacionM;
    double UnidadUtilizacionKg;
    double PrecioSugerido;
    
    public ClaseProductosLinea()
    {
        Clave = "";
        NombreProducto = "";
        Diametro = 0;
        PesoMaterial = 0;
        UnidadEmpaque = 0;
        UnidadUtilizacionM = 0;
        UnidadUtilizacionKg = 0;
        PrecioSugerido = 0;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public double getDiametro() {
        return Diametro;
    }

    public void setDiametro(double Diametro) {
        this.Diametro = Diametro;
    }

    public double getPesoMaterial() {
        return PesoMaterial;
    }

    public void setPesoMaterial(double PesoMaterial) {
        this.PesoMaterial = PesoMaterial;
    }

    public double getUnidadEmpaque() {
        return UnidadEmpaque;
    }

    public void setUnidadEmpaque(double UnidadEmpaque) {
        this.UnidadEmpaque = UnidadEmpaque;
    }

    public double getUnidadUtilizacionM() {
        return UnidadUtilizacionM;
    }

    public void setUnidadUtilizacionM(double UnidadUtilizacionM) {
        this.UnidadUtilizacionM = UnidadUtilizacionM;
    }

    public double getUnidadUtilizacionKg() {
        return UnidadUtilizacionKg;
    }

    public void setUnidadUtilizacionKg(double UnidadUtilizacionKg) {
        this.UnidadUtilizacionKg = UnidadUtilizacionKg;
    }

    public double getPrecioSugerido() {
        return PrecioSugerido;
    }

    public void setPrecioSugerido(double PrecioSugerido) {
        this.PrecioSugerido = PrecioSugerido;
    }
    
    
}

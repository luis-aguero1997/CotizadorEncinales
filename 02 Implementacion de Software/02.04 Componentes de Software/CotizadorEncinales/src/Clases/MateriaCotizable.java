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
public class MateriaCotizable {
    int idMateriaCotizable;
    String Clave;
    String Descripcion;
    double PrecioCorte;
    double PrecioDobles;
    double PrecioRoscado;
    double PrecioSoldadura;
    double PrecioUnitario;
    
    public MateriaCotizable()
    {
        idMateriaCotizable = 0;
        Clave = "";
        Descripcion = "";
        PrecioCorte = 0;
        PrecioDobles = 0;
        PrecioRoscado = 0;
        PrecioSoldadura = 0;
        PrecioUnitario = 0;
    }

    public int getIdMateriaCotizable() {
        return idMateriaCotizable;
    }

    public void setIdMateriaCotizable(int idMateriaCotizable) {
        this.idMateriaCotizable = idMateriaCotizable;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecioCorte() {
        return PrecioCorte;
    }

    public void setPrecioCorte(double PrecioCorte) {
        this.PrecioCorte = PrecioCorte;
    }

    public double getPrecioDobles() {
        return PrecioDobles;
    }

    public void setPrecioDobles(double PrecioDobles) {
        this.PrecioDobles = PrecioDobles;
    }

    public double getPrecioRoscado() {
        return PrecioRoscado;
    }

    public void setPrecioRoscado(double PrecioRoscado) {
        this.PrecioRoscado = PrecioRoscado;
    }

    public double getPrecioSoldadura() {
        return PrecioSoldadura;
    }

    public void setPrecioSoldadura(double PrecioSoldadura) {
        this.PrecioSoldadura = PrecioSoldadura;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    
}

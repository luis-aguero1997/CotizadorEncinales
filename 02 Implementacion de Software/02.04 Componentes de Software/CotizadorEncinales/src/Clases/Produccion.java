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
public class Produccion 
{
    int idProduccion;
    double Cantidad;
    String UnidadMedida;
    String ElementoCosto;
    int Personal;
    double PrecioUnit;
    double PrecioCantidad;
    int Producto_idProducto;
    
    public Produccion()
    {
        idProduccion = 0;
        Cantidad = 0;
        UnidadMedida = "";
        ElementoCosto = "";
        Personal = 0;
        PrecioUnit = 0;
        PrecioCantidad = 0;
        Producto_idProducto = 0;
    }

    public int getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(int idProduccion) {
        this.idProduccion = idProduccion;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public String getElementoCosto() {
        return ElementoCosto;
    }

    public void setElementoCosto(String ElementoCosto) {
        this.ElementoCosto = ElementoCosto;
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }

    public int getPersonal() {
        return Personal;
    }

    public void setPersonal(int Personal) {
        this.Personal = Personal;
    }

    public double getPrecioUnit() {
        return PrecioUnit;
    }

    public void setPrecioUnit(double PrecioUnit) {
        this.PrecioUnit = PrecioUnit;
    }

    public double getPrecioCantidad() {
        return PrecioCantidad;
    }

    public void setPrecioCantidad(double PrecioCantidad) {
        this.PrecioCantidad = PrecioCantidad;
    }

    public int getProducto_idProducto() {
        return Producto_idProducto;
    }

    public void setProducto_idProducto(int Producto_idProducto) {
        this.Producto_idProducto = Producto_idProducto;
    }     
}
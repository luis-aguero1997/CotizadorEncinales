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
public class DP_Produccion 
{
    int idDeterminacionPrecio;
    double CostoUnitOperativo;
    double CostoTotalVenta;
    double Utilidad;
    double PrecioSinIVA;
    double PrecioConIVA;
    int Producto_idProducto;
    
    public DP_Produccion()
    {
        idDeterminacionPrecio = 0;
        CostoUnitOperativo = 0;
        CostoTotalVenta = 0;
        Utilidad = 0;
        PrecioSinIVA = 0;
        PrecioConIVA = 0;
        Producto_idProducto = 0;
    }

    public int getIdDeterminacionPrecio() {
        return idDeterminacionPrecio;
    }

    public void setIdDeterminacionPrecio(int idDeterminacionPrecio) {
        this.idDeterminacionPrecio = idDeterminacionPrecio;
    }

    public double getCostoUnitOperativo() {
        return CostoUnitOperativo;
    }

    public void setCostoUnitOperativo(double CostoUnitOperativo) {
        this.CostoUnitOperativo = CostoUnitOperativo;
    }

    public double getCostoTotalVenta() {
        return CostoTotalVenta;
    }

    public void setCostoTotalVenta(double CostoTotalVenta) {
        this.CostoTotalVenta = CostoTotalVenta;
    }

    public double getUtilidad() {
        return Utilidad;
    }

    public void setUtilidad(double Utilidad) {
        this.Utilidad = Utilidad;
    }

    public double getPrecioSinIVA() {
        return PrecioSinIVA;
    }

    public void setPrecioSinIVA(double PrecioSinIVA) {
        this.PrecioSinIVA = PrecioSinIVA;
    }

    public double getPrecioConIVA() {
        return PrecioConIVA;
    }

    public void setPrecioConIVA(double PrecioConIVA) {
        this.PrecioConIVA = PrecioConIVA;
    }

    public int getProducto_idProducto() {
        return Producto_idProducto;
    }

    public void setProducto_idProducto(int Producto_idProducto) {
        this.Producto_idProducto = Producto_idProducto;
    }
    
}

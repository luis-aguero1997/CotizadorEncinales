/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author eduardogarciadelgado
 */
public class MateriaPrima 
{
    int idMateriaPrima;
    String Clave;
    String Descripcion;
    double Cantidad;
    String UnidadMedida;
    double PrecioUnitario;
    double PrecioTotal;
    Date FechaCompra;
    int Facturas_idfacturas;
    
    public MateriaPrima()
    {
        idMateriaPrima = 0;
        Clave = "";
        Descripcion = "";
        Cantidad = 0;
        UnidadMedida = "";
        PrecioUnitario = 0;
        PrecioTotal = 0;
        FechaCompra = null;
        Facturas_idfacturas = 0;
    }

    public int getIdMateriaPrima() {
        return idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
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

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public int getFacturas_idfacturas() {
        return Facturas_idfacturas;
    }

    public void setFacturas_idfacturas(int Facturas_idfacturas) {
        this.Facturas_idfacturas = Facturas_idfacturas;
    }
    
    
    
}

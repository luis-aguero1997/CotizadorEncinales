/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author luis_
 */
public class Compras {
    private int Id;
    private String Clave;
    private String Descripcion;
    private int Cantidad;
    private String UMedida;
    private float Precio;
    private Date Fecha;
    private int IdFactura;

    public Compras() {
        Id = 0;
        Clave = "";
        Descripcion = "";
        Cantidad = 0;
        UMedida = "";
        Precio = 0;
        Fecha = null;
        IdFactura = 0;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getUMedida() {
        return UMedida;
    }

    public void setUMedida(String UMedida) {
        this.UMedida = UMedida;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }
    
    
}
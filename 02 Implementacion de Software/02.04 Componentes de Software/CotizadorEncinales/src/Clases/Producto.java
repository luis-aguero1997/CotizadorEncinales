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
public class Producto {
    int idProducto;
    String Clave;
    String NombreProducto;
    String Descripcion;
    double PrecioUnitaro;

    public Producto() {
        idProducto = 0;
        Clave = "";
        NombreProducto = "";
        Descripcion = "";
        PrecioUnitaro = 0;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecioUnitaro() {
        return PrecioUnitaro;
    }

    public void setPrecioUnitaro(double PrecioUnitaro) {
        this.PrecioUnitaro = PrecioUnitaro;
    } 
}

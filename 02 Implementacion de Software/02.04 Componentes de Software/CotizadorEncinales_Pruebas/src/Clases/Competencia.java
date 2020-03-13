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
public class Competencia {
    int idCompetencia;
    String Clave;
    String Empresa;
    String NombreProducto;
    String Descripcion;
    double PrecioUnitario;
    int Producto_idProducto;
    
    public Competencia()
    {
        idCompetencia = 0;
        Clave = "";
        Empresa = "";
        NombreProducto = "";
        Descripcion = "";
        PrecioUnitario = 0;
        Producto_idProducto = 0;
    }

    public int getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(int idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
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

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public int getProducto_idProducto() {
        return Producto_idProducto;
    }

    public void setProducto_idProducto(int Producto_idProducto) {
        this.Producto_idProducto = Producto_idProducto;
    }
    
    
}

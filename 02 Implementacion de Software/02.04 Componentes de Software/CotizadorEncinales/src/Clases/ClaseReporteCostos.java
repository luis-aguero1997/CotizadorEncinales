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
public class ClaseReporteCostos 
{
    int idReporteCostes;
    String Especificaciones;
    double Diametro;
    double PesoMaterial;
    double UnidadEmpaque;
    double UnidadUtilizacionM;
    double UnidadUtilizacionKg;
    double Merma;
    double CMatPrim;
    double CMatPrimTotal;
    double TManoDeObra;
    double COpTotal;
    double ConsEnerKWh;
    double ConsEnerPesos;
    double CostoAdmin;
    double CostoFleteEmbarq;
    double CostoTotalOp;
    double Utilidad;
    double IVA;
    double PrecioSugerido;
    int Producto_idProducto;
    
    public ClaseReporteCostos()
    {
        idReporteCostes = 0;
        Especificaciones = "";
        Diametro = 0;
        PesoMaterial = 0;
        UnidadEmpaque = 0;
        UnidadUtilizacionM = 0;
        UnidadUtilizacionKg = 0;
        Merma = 0;
        CMatPrim = 0;
        CMatPrimTotal = 0;
        TManoDeObra = 0;
        COpTotal = 0;
        ConsEnerKWh = 0;
        ConsEnerPesos = 0;
        CostoAdmin = 0;
        CostoFleteEmbarq = 0;
        CostoTotalOp = 0;
        Utilidad = 0;
        IVA = 0;
        PrecioSugerido = 0;
        Producto_idProducto = 0;
    }

    public int getIdReporteCostes() {
        return idReporteCostes;
    }

    public void setIdReporteCostes(int idReporteCostes) {
        this.idReporteCostes = idReporteCostes;
    }

    public String getEspecificaciones() {
        return Especificaciones;
    }

    public void setEspecificaciones(String Especificaciones) {
        this.Especificaciones = Especificaciones;
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

    public double getMerma() {
        return Merma;
    }

    public void setMerma(double Merma) {
        this.Merma = Merma;
    }    

    public double getCMatPrimTotal() {
        return CMatPrimTotal;
    }

    public void setCMatPrimTotal(double CMatPrimTotal) {
        this.CMatPrimTotal = CMatPrimTotal;
    }    

    public double getCOpTotal() {
        return COpTotal;
    }

    public void setCOpTotal(double COpTotal) {
        this.COpTotal = COpTotal;
    }

    public double getConsEnerKWh() {
        return ConsEnerKWh;
    }

    public void setConsEnerKWh(double ConsEnerKWh) {
        this.ConsEnerKWh = ConsEnerKWh;
    }

    public double getConsEnerPesos() {
        return ConsEnerPesos;
    }

    public void setConsEnerPesos(double ConsEnerPesos) {
        this.ConsEnerPesos = ConsEnerPesos;
    }

    public double getCostoAdmin() {
        return CostoAdmin;
    }

    public void setCostoAdmin(double CostoAdmin) {
        this.CostoAdmin = CostoAdmin;
    }

    public double getCostoFleteEmbarq() {
        return CostoFleteEmbarq;
    }

    public void setCostoFleteEmbarq(double CostoFleteEmbarq) {
        this.CostoFleteEmbarq = CostoFleteEmbarq;
    }

    public double getCostoTotalOp() {
        return CostoTotalOp;
    }

    public void setCostoTotalOp(double CostoTotalOp) {
        this.CostoTotalOp = CostoTotalOp;
    }

    public double getUtilidad() {
        return Utilidad;
    }

    public void setUtilidad(double Utilidad) {
        this.Utilidad = Utilidad;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getPrecioSugerido() {
        return PrecioSugerido;
    }

    public void setPrecioSugerido(double PrecioSugerido) {
        this.PrecioSugerido = PrecioSugerido;
    }

    public int getProducto_idProducto() {
        return Producto_idProducto;
    }

    public void setProducto_idProducto(int Producto_idProducto) {
        this.Producto_idProducto = Producto_idProducto;
    }

    public double getCMatPrim() {
        return CMatPrim;
    }

    public void setCMatPrim(double CMatPrim) {
        this.CMatPrim = CMatPrim;
    }

    public double getTManoDeObra() {
        return TManoDeObra;
    }

    public void setTManoDeObra(double TManoDeObra) {
        this.TManoDeObra = TManoDeObra;
    }
    
}
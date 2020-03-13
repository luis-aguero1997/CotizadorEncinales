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
public class Constantes {
    int idConstantes;
    double CostoTotalOp;
    double CostoUnitOp;
    double Utilidad;
    double IVA;
    double PrecioKW_Mes;
    
    public Constantes()
    {
        idConstantes = 0;
        CostoTotalOp = 0;
        CostoUnitOp = 0;
        Utilidad = 0;
        IVA = 0;
        PrecioKW_Mes = 0;
    }

    public int getIdConstantes() {
        return idConstantes;
    }

    public void setIdConstantes(int idConstantes) {
        this.idConstantes = idConstantes;
    }

    public double getCostoTotalOp() {
        return CostoTotalOp;
    }

    public void setCostoTotalOp(double CostoTotalOp) {
        this.CostoTotalOp = CostoTotalOp;
    }

    public double getCostoUnitOp() {
        return CostoUnitOp;
    }

    public void setCostoUnitOp(double CostoUnitOp) {
        this.CostoUnitOp = CostoUnitOp;
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

    public double getPrecioKW_Mes() {
        return PrecioKW_Mes;
    }

    public void setPrecioKW_Mes(double PrecioKW_Mes) {
        this.PrecioKW_Mes = PrecioKW_Mes;
    }
}

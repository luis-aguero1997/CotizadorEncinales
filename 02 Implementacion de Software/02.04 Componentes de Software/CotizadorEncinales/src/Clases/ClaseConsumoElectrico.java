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
public class ClaseConsumoElectrico 
{
    int idConsumoElectrico;
    String NombreEquipos;
    double ConsumoKW_Eq;
    int NumeroEquipo;
    double HorasEquipo;
    double KW_Hora;
    double Watts_Dia;
    double KW_Dia;
    double DiasPorMes;
    double KW_Mes;
    int Producto_idProducto;
    
    public ClaseConsumoElectrico()
    {
        idConsumoElectrico = 0;
        NombreEquipos = "";
        ConsumoKW_Eq = 0;
        NumeroEquipo = 0;
        HorasEquipo = 0;
        KW_Hora = 0;
        Watts_Dia = 0;
        KW_Dia = 0;
        DiasPorMes = 0;
        KW_Mes = 0;
        Producto_idProducto = 0;
    }

    public int getIdConsumoElectrico() {
        return idConsumoElectrico;
    }

    public void setIdConsumoElectrico(int idConsumoElectrico) {
        this.idConsumoElectrico = idConsumoElectrico;
    }

    public String getNombreEquipos() {
        return NombreEquipos;
    }

    public void setNombreEquipos(String NombreEquipos) {
        this.NombreEquipos = NombreEquipos;
    }

    public double getConsumoKW_Eq() {
        return ConsumoKW_Eq;
    }

    public void setConsumoKW_Eq(double ConsumoKW_Eq) {
        this.ConsumoKW_Eq = ConsumoKW_Eq;
    }

    public int getNumeroEquipo() {
        return NumeroEquipo;
    }

    public void setNumeroEquipo(int NumeroEquipo) {
        this.NumeroEquipo = NumeroEquipo;
    }

    public double getHorasEquipo() {
        return HorasEquipo;
    }

    public void setHorasEquipo(double HorasEquipo) {
        this.HorasEquipo = HorasEquipo;
    }

    public double getKW_Hora() {
        return KW_Hora;
    }

    public void setKW_Hora(double KW_Hora) {
        this.KW_Hora = KW_Hora;
    }

    public double getWatts_Dia() {
        return Watts_Dia;
    }

    public void setWatts_Dia(double Watts_Dia) {
        this.Watts_Dia = Watts_Dia;
    }

    public double getKW_Dia() {
        return KW_Dia;
    }

    public void setKW_Dia(double KW_Dia) {
        this.KW_Dia = KW_Dia;
    }

    public double getDiasPorMes() {
        return DiasPorMes;
    }

    public void setDiasPorMes(double DiasPorMes) {
        this.DiasPorMes = DiasPorMes;
    }

    public double getKW_Mes() {
        return KW_Mes;
    }

    public void setKW_Mes(double KW_Mes) {
        this.KW_Mes = KW_Mes;
    }

    public int getProducto_idProducto() {
        return Producto_idProducto;
    }

    public void setProducto_idProducto(int Producto_idProducto) {
        this.Producto_idProducto = Producto_idProducto;
    }   
    
}

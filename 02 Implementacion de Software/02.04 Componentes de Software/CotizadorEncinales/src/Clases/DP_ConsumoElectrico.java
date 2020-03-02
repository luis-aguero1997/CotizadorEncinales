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
public class DP_ConsumoElectrico {
    int idDeterPrecioConsumo;
    double TotalKwHora;
    double PrecioKwHora;
    double Subtotal;
    double PrecioConIVA;
    
    public DP_ConsumoElectrico()
    {
        idDeterPrecioConsumo = 0;
        TotalKwHora = 0;
        PrecioKwHora = 0;
        Subtotal = 0;
        PrecioConIVA = 0;
    }

    public int getIdDeterPrecioConsumo() {
        return idDeterPrecioConsumo;
    }

    public void setIdDeterPrecioConsumo(int idDeterPrecioConsumo) {
        this.idDeterPrecioConsumo = idDeterPrecioConsumo;
    }

    public double getTotalKwHora() {
        return TotalKwHora;
    }

    public void setTotalKwHora(double TotalKwHora) {
        this.TotalKwHora = TotalKwHora;
    }

    public double getPrecioKwHora() {
        return PrecioKwHora;
    }

    public void setPrecioKwHora(double PrecioKwHora) {
        this.PrecioKwHora = PrecioKwHora;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getPrecioConIVA() {
        return PrecioConIVA;
    }

    public void setPrecioConIVA(double PrecioConIVA) {
        this.PrecioConIVA = PrecioConIVA;
    }
        
}

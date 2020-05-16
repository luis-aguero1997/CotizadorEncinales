/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Cotizacion.Reporte;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author eduardogarciadelgado
 */
public final class CallReport 
{
    //SIN parametros
    public void abrirReporte(String Ruta, Connection con)
    {
        try
        {
            JasperReport Report = JasperCompileManager.compileReport(Ruta);
            JasperPrint Print = JasperFillManager.fillReport(Report, new HashMap(), con);
            JasperViewer.viewReport(Print, false);
        }
        catch (JRException jRException)
        {
            System.err.println(jRException.getMessage());
            JOptionPane.showMessageDialog(null, "Error al abrir el reporte " + jRException.getMessage());
        }
    }
    
    //CON parametros
    public void abrirReporte(String Ruta, Connection con, Map Parametros)
    {
        try
        {
            
                //JasperReport Report = (JasperReport) JRLoader.loadObject(getClass().getResource("ReporteCostos.jasper"));
                JasperReport Report = (JasperReport) JRLoader.loadObject(ClassLoader.getSystemResource(Ruta));
                JasperPrint Print = JasperFillManager.fillReport(Report, Parametros, con);
                JasperViewer.viewReport(Print, false);
                //JasperViewer jv = new JasperViewer(Print,false);
                //jv.setVisible(true);
                //jv.setTitle("Reporte");
                //jv.show();
            
            /*
                JasperReport Report = JasperCompileManager.compileReport(Ruta);
                JasperPrint Print = JasperFillManager.fillReport(Report, Parametros, con);
                //JasperExportManager.exportReportToPdfFile(Print, "Reporte.pdf");
                JasperViewer.viewReport(Print, false);
            */
        }
        catch (JRException jRException)
        {
            System.err.println(jRException.getMessage());
            JOptionPane.showMessageDialog(null, "Error al abrir el reporte " + jRException.getMessage());
        }
    }
}

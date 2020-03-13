package Formularios.Cotizacion;



import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CHAPARRO
 */
public class ConexionReporte 
{      
    Connection Conn;

    public ConexionReporte ()
    {    
        Conn = null;
    }
    
    public void Connect()
    {
        try
        {
           Class.forName("jdbc:mysql://");
           Conn = DriverManager.getConnection("jdbc:mysql://" + "bd_encinales", "root", "root");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            
        }
    }
    
    public void getStateConnection()
    {
        try
        {
            if (!this.Conn.isClosed())
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Bye");
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null, "NO Bye");
            }
        }
        catch (HeadlessException | SQLException e)
        {
            
        }
    }
    
    public Connection getConnection()
    {
        return Conn;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BaseDeDatos;
import java.sql.*;

/**
 *
 * @author eduardogarciadelgado
 */
public class Conexion {
    public String Driver = "com.mysql.jdbc.Driver";       
    public String Database = "bd_encinales";
    public String Hostname = "localhost";
    public String Port = "8889";
    public String URL = "jdbc:mysql://" + Hostname + ":" + Port + "/" + Database;
    public String Username = "root";
    public String Password = "root";
    
    public String Port_N2 = "8886";
    public String Password_N2 = "";
    public String URL_N2 = "jdbc:mysql://" + Hostname + ":" + Port_N2 + "/" + Database;
    
    private Connection Conexion;
    
    ResultSet rs = null;
    Statement statement = null;


    public boolean Conectar() 
    {
        try 
        {
            Class.forName(Driver).newInstance();
            
            if ("Mac OS X".equals(System.getProperty("os.name")))
            {
                Conexion = DriverManager.getConnection(URL, Username, Password);
            }
            else
            {
                if ("Windows".equals(System.getProperty("os.name")))
                {
                    Conexion = DriverManager.getConnection(URL_N2, Username, Password_N2);
                }
                else
                {
                    
                }
            }
            
            return Conexion != null;
        } 
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) 
        {
            return false;
        }
    }
    
    public void Desconectar()
    {
        
        try 
        {
            this.Conexion.close();
        } 
        catch (SQLException e) 
        {
            System.err.println(e.getMessage());
        }
    }
    
}

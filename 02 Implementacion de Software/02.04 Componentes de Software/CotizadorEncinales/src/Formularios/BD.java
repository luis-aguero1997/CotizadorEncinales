/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author manuelvaquera
 */
public class BD 
{
    public String Driver = "com.mysql.jdbc.Driver";       
    public String Database = "bd_encinales";
    public String Hostname = "localhost";
    public String Port = "8889";
    public String URL = "jdbc:mysql://" + Hostname + ":" + Port + "/" + Database;
    public String Username = "root";
    public String Password = "root";
    
    public String Port_N2 = "3306";
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
                if ("Windows 10".equals(System.getProperty("os.name")))
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
    
   public ArrayList ConsultaUsuario(String User, String Password) 
   {
       Conectar();
        Usuario mUsuario = null;
        ArrayList mListaUsuario = new ArrayList();
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select * from usuarios where Usuario  = '" + User + "' and Password = '" + Password + "';");
            while (resultado.next()) 
            {
                mUsuario = new Usuario();
                mUsuario.setId_Usuario(resultado.getInt("idUsuarios"));
                mUsuario.setUsuario(resultado.getString("Usuario"));
                mUsuario.setNomCompleto(resultado.getString("NomCompleto"));
                mUsuario.setPassword(resultado.getString("Password"));
                mUsuario.setCorreo(resultado.getString("Correo"));
                mUsuario.setTipo(resultado.getString("Tipo"));
                mListaUsuario.add(mUsuario);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
            e.printStackTrace();
        }
        Desconectar();
        return mListaUsuario;      
    }
         
}
    


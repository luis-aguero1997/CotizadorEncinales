/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
      
        public ArrayList<Usuario> Listar_Usuario() {
        Conectar();
        ArrayList<Usuario> list = new ArrayList<Usuario>();
        Conexion conec = new Conexion();
        Statement consulta;
        String sql = "SELECT * FROM Usuarios;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            consulta = Conexion.createStatement();
            rs = consulta.executeQuery(sql);
            while (rs.next()) {
                Usuario Usuario = new Usuario();
                Usuario.setId_Usuario(rs.getInt(1));
                Usuario.setNomCompleto(rs.getString(3));
                Usuario.setUsuario(rs.getString(2));
                Usuario.setPassword(rs.getString(4));
                Usuario.setCorreo(rs.getString(5));
                Usuario.setTipo(rs.getString(6));
                
                list.add(Usuario);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.Desconectar();
            } catch (Exception ex) {
            }
        }
        Desconectar();
        return list;
    }
        
        public void Agregar_Usuario(Usuario Usuario) {
        Conectar();
        Conexion conec = new Conexion();
        String sql = "INSERT INTO Usuarios (idUsuarios,Usuario,NomCompleto,Password,Correo,Tipo) VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        
        try {
            ps = getConnection().prepareStatement(sql);    
            ps.setInt(1, 0);
            ps.setString(2, Usuario.getUsuario());
            ps.setString(3, Usuario.getNomCompleto());
            ps.setString(4, Usuario.getPassword());
            ps.setString(5, Usuario.getCorreo());
            ps.setString(6, Usuario.getTipo());
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Agregada con Exito");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            try {
                ps.close();
                Desconectar();
            } catch (Exception ex) {
                
            }
        }
    }
        public Connection getConnection(){
            return Conexion;
        }
        
     
     public void Modificar(Usuario Usuario) {
        Conectar();
        Conexion conec = new Conexion();
        String sql = "UPDATE Usuarios SET NomCompleto = ?,Usuario = ?, Password = ?,Correo = ?, Tipo = ? WHERE idUsuarios =  ?;";
        PreparedStatement ps = null;
        
        try {
        ps = getConnection().prepareStatement(sql);    
            ps.setString(1, Usuario.getNomCompleto());
            ps.setString(2, Usuario.getUsuario());
            ps.setString(3, Usuario.getPassword());
            ps.setString(4, Usuario.getCorreo());
            ps.setString((5), Usuario.getTipo());
            ps.setInt(6, Usuario.getId_Usuario());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Modificado con Exito");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Modificar");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Modificar");
        } finally {
            try {
                
                
                ps.close();
                Desconectar();
            } catch (Exception ex) {
                
            }
        }
    }
     
     public void Eliminar(int Id) {
        Conectar();
        Statement consulta;

        
        Conexion conec = new Conexion();
        String sql = "DELETE FROM  Usuarios WHERE idUsuarios =  ?;";

        
        PreparedStatement ps = null;

        try {
            ps = getConnection().prepareStatement(sql);
            ps.setInt(1, Id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Eliminardo con Exito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        } finally {
            try {

                ps.close();
                Desconectar();
            } catch (Exception ex) {

            }
        }

    }
         
}
    


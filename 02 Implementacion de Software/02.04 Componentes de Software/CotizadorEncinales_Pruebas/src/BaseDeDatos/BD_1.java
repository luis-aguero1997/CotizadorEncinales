package BaseDeDatos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class BD_1 
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
  
     // ------------  RP R O D U C C I O N   ------------
   
   
   public ArrayList ConsultaProductos() 
   {
        Conectar();
        Producto mProducto = null;
        ArrayList mListaProducto = new ArrayList();
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select * from Producto;");
            while (resultado.next()) 
            {
                mProducto = new Producto();
                mProducto.setIdProducto(resultado.getInt("idProducto"));
                mProducto.setClave(resultado.getString("Clave"));
                mProducto.setNombreProducto(resultado.getString("NombreProducto"));
                mProducto.setDescripcion(resultado.getString("Descripcion"));
                mProducto.setPrecioUnitaro(resultado.getDouble("PrecioUnitario"));
                mListaProducto.add(mProducto);               
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe el producto");
        }
        Desconectar();
        return mListaProducto;      
    }
   
   public ArrayList ConsultaProductosFiltro(String Buscar)
   {
        Conectar();
        Producto mProducto = null;
        ArrayList mListaProducto = new ArrayList();
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("SELECT * FROM Producto WHERE Clave LIKE '%" + Buscar + "%' OR NombreProducto LIKE '%"+ Buscar +"%'");
            while (resultado.next()) 
            {
                mProducto = new Producto();
                mProducto.setIdProducto(resultado.getInt("idProducto"));
                mProducto.setClave(resultado.getString("Clave"));
                mProducto.setNombreProducto(resultado.getString("NombreProducto"));
                mProducto.setDescripcion(resultado.getString("Descripcion"));
                mProducto.setPrecioUnitaro(resultado.getDouble("PrecioUnitario"));
                mListaProducto.add(mProducto);               
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe esa búsqueda");
        }
        Desconectar();
        return mListaProducto;
   }
   
   public ArrayList ConsultaPreciosProduccion(String Clave) 
   {
        Conectar();
        int idProducto = 0;
        Produccion mProduccion;
        ArrayList mListaPrecioProduccion = new ArrayList();
        Statement consulta;
        ResultSet resultado, resultado2;
        
        try 
        {
            consulta = Conexion.createStatement();
            
            resultado = consulta.executeQuery("select idProducto from Producto where Clave = '"+ Clave +"';");
            while (resultado.next()) 
            {
                idProducto = resultado.getInt("idProducto");              
            }
            
            resultado2 = consulta.executeQuery("select * from Produccion where Producto_idProducto = '"+ idProducto +"';");
            while (resultado2.next()) 
            {
                mProduccion = new Produccion();
                mProduccion.setIdProduccion(resultado2.getInt("idProduccion"));
                mProduccion.setCantidad(resultado2.getDouble("Cantidad"));
                mProduccion.setUnidadMedida(resultado2.getString("UnidadMedida"));
                mProduccion.setElementoCosto(resultado2.getString("ElementoCosto"));
                mProduccion.setPersonal(resultado2.getInt("Personal"));
                mProduccion.setPrecioUnit(resultado2.getDouble("PrecioUnit"));
                mProduccion.setPrecioCantidad(resultado2.getDouble("PrecioCantidad"));
                mProduccion.setProducto_idProducto(resultado2.getInt("Producto_idProducto"));
                mListaPrecioProduccion.add(mProduccion);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No hay producciones dadas de alta");
        }
        Desconectar();
        return mListaPrecioProduccion;      
    }
   
   public int ConsultarIdProductoClave(String Clave)
   {
        int idProducto = 0;
        Conectar();
        Statement consulta;
        ResultSet resultado;
        try 
        {
            consulta = Conexion.createStatement();

            resultado = consulta.executeQuery("select idProducto from Producto where Clave = '"+ Clave +"';");
            while (resultado.next()) 
            {
                idProducto = resultado.getInt("idProducto");              
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe esa clave");
        }
        Desconectar();
        return idProducto;
   }
            
   public boolean AgregarPreciosProduccion(Produccion mProduccion) 
   {
       Conectar();
       Statement consulta;     
       
        try 
        {
         consulta = Conexion.createStatement();
         consulta.execute("insert into Produccion "
                + "values (null," + mProduccion.getCantidad() + ","
                + "'" + mProduccion.getUnidadMedida() + "',"
                + "'" + mProduccion.getElementoCosto() + "'," 
                + mProduccion.getPersonal() + ","
                + mProduccion.getPrecioUnit()+","
                + mProduccion.getPrecioCantidad() + ","
                + mProduccion.getProducto_idProducto() + ");");
         return true;
        } 
        catch (SQLException e) 
        {
         return false;
        }      
    }
   
   public boolean ActualizarPreciosProduccion(Produccion mProduccion, int vProduccion) 
   {
       Conectar();
       Statement consulta;     
       
        try 
        {
            consulta = Conexion.createStatement();
            consulta.execute("update Produccion set "
               + "Cantidad = " + mProduccion.getCantidad() + ","
               + "UnidadMedida = '" + mProduccion.getUnidadMedida() + "',"
               + "ElementoCosto = '" + mProduccion.getElementoCosto() + "',"
               + "Personal = " + mProduccion.getPersonal() + ","
               + "PrecioUnit = " + mProduccion.getPrecioUnit() + ","
               + "PrecioCantidad = " + mProduccion.getPrecioCantidad()
               + " where idProduccion = " + vProduccion + ";");
            return true;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }                   
    }
   
   public double SumarPreciosProduccion(String Clave)
   {
        double  Suma = 0;
        Conectar();
        Statement consulta;
        ResultSet resultado;
        try 
        {
            consulta = Conexion.createStatement();

            resultado = consulta.executeQuery("SELECT SUM(PrecioCantidad) FROM Produccion WHERE Producto_idProducto = '"+ ConsultarIdProductoClave(Clave) +"';");
            while (resultado.next()) 
            {
                Suma = resultado.getDouble("SUM(PrecioCantidad)");              
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No hay producciones por sumar");
        }
        Desconectar();
        return Suma;
    }
   
   public ArrayList ConsultaConstantes()
   {
        int idConstantes = 0;
        Conectar();
        Constantes mConstantes;
        ArrayList mListaConstantes = new ArrayList();
        Statement consulta;
        ResultSet resultado, resultado2;
        
        try 
        {
            consulta = Conexion.createStatement();
            
            resultado = consulta.executeQuery("SELECT MAX(idConstantes) FROM Constantes;");
            
            while (resultado.next()) 
            {
                idConstantes = resultado.getInt("MAX(idConstantes)");              
            }
            
            resultado2 = consulta.executeQuery("SELECT * FROM Constantes where idConstantes = '" + idConstantes + "';");
            while (resultado2.next()) 
            {
                mConstantes = new Constantes();
                mConstantes.setIdConstantes(resultado2.getInt("idConstantes"));
                mConstantes.setCostoTotalOp(resultado2.getDouble("CostoTotalOp"));
                mConstantes.setCostoUnitOp(resultado2.getDouble("CostoUnitOp"));
                mConstantes.setUtilidad(resultado2.getDouble("Utilidad"));
                mConstantes.setIVA(resultado2.getDouble("IVA"));
                mConstantes.setPrecioKW_Mes(resultado2.getDouble("PrecioKw_Mes"));
                mListaConstantes.add(mConstantes);               
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No existen las constantes");
        }
        Desconectar();
        return mListaConstantes;
   }
   
   public boolean AgregarCostoProduccion(DP_Produccion mDP_P, String Clave)
   {
        int idProducto;
        int idDP_P;
        Statement consulta; 
        idProducto = ConsultarIdProductoClave(Clave);
        Conectar();
        ResultSet resultado;
        try 
        {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("SELECT * FROM DeterPrecioProd where Producto_idProducto =  '"+ idProducto +"';");
            if(resultado.next())
            {
                idDP_P = resultado.getInt("idDeterminacionPrecio"); //SI existe
                
                consulta = Conexion.createStatement();
                consulta.execute("update DeterPrecioProd set "
                    + "CostoUnitOperativo = " + mDP_P.getCostoUnitOperativo() + ","
                    + "CostoTotalVenta = " + mDP_P.getCostoTotalVenta() + ","
                    + "Utilidad = " + mDP_P.getUtilidad() + ","
                    + "PrecioSinIVA = " + mDP_P.getPrecioSinIVA() + ","
                    + "PrecioConIVA = " + mDP_P.getPrecioConIVA() + ""
                    + " where idDeterminacionPrecio = " + idDP_P + ";");
                
                return true;
            }
            else    // NO existe
            {
                consulta = Conexion.createStatement();
                consulta.execute("insert into DeterPrecioProd "
                    + "values (null," + mDP_P.getCostoUnitOperativo() + ","
                    + "" + mDP_P.getCostoTotalVenta() + ","
                    + "" + mDP_P.getUtilidad() + "," 
                    + mDP_P.getPrecioSinIVA() + ","
                    + mDP_P.getPrecioConIVA()+ "," 
                    + idProducto + ");");
                return true;
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }
        
   }
   
    public boolean EliminarProduccion(int idPrecioProduccion) 
    {
       Conectar();
       Statement consulta;     
       
        try 
        {
            consulta = Conexion.createStatement();
            consulta.execute("DELETE FROM Produccion WHERE idProduccion = " + idPrecioProduccion + ";");
            return true;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }                   
    }
   
   
// ------------  C O N S U M O  E L E C T R I C O  ------------
 
   
   public ArrayList ConsultaConsumosElectricos(String Clave) 
   {
        Conectar();
        int idProducto = 0;
        ClaseConsumoElectrico mCCE;
        ArrayList mListaPrecioConsumoElectrico = new ArrayList();
        Statement consulta;
        ResultSet resultado, resultado2;
        
        try 
        {
            consulta = Conexion.createStatement();
            
            resultado = consulta.executeQuery("select idProducto from Producto where Clave = '"+ Clave +"';");
            while (resultado.next()) 
            {
                idProducto = resultado.getInt("idProducto");              
            }
            
            resultado2 = consulta.executeQuery("select * from ConsumoElectrico where Producto_idProducto = '"+ idProducto +"';");
            while (resultado2.next()) 
            {
                mCCE = new ClaseConsumoElectrico();
                mCCE.setIdConsumoElectrico(resultado2.getInt("idConsumoElectrico"));
                mCCE.setNombreEquipos(resultado2.getString("NombreEquipos"));
                mCCE.setConsumoKW_Eq(resultado2.getDouble("ConsumoKWEq"));
                mCCE.setNumeroEquipo(resultado2.getInt("NumEquipo"));
                mCCE.setHorasEquipo(resultado2.getDouble("HorasEquipo"));
                mCCE.setKW_Hora(resultado2.getDouble("KWHora"));
                mCCE.setWatts_Dia(resultado2.getDouble("WattsDia"));
                mCCE.setKW_Dia(resultado2.getDouble("KwDia"));
                mCCE.setDiasPorMes(resultado2.getInt("DiasPorMes"));
                mCCE.setKW_Mes(resultado2.getDouble("KwMes"));
                mCCE.setProducto_idProducto(resultado2.getInt("Producto_idProducto"));
                mListaPrecioConsumoElectrico.add(mCCE);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return mListaPrecioConsumoElectrico;      
    }
   
   public boolean AgregarConsumoElectrico(ClaseConsumoElectrico mCCE) 
   {
       Conectar();
       Statement consulta;     
       
        try 
        {
         consulta = Conexion.createStatement();
         consulta.execute("insert into ConsumoElectrico "
                + "values (null,'" + mCCE.getNombreEquipos() + "',"
                + "" + mCCE.getConsumoKW_Eq() + ","
                + "" + mCCE.getNumeroEquipo() + "," 
                + mCCE.getHorasEquipo() + ","
                + mCCE.getKW_Hora() +","
                + mCCE.getWatts_Dia() + ","
                + mCCE.getKW_Dia() + ","
                + mCCE.getDiasPorMes() + ","
                + mCCE.getKW_Mes() + ","
                + mCCE.getProducto_idProducto() + ");");
         return true;
        } 
        catch (SQLException e) 
        {
         return false;
        }      
    }
     
   public boolean ActualizarConsumosElectricos(ClaseConsumoElectrico mCCE, int vConsumoElectrico) 
   {
       Conectar();
       Statement consulta;     
       
        try 
        {
            consulta = Conexion.createStatement();
            consulta.execute("update ConsumoElectrico set "
               + "NombreEquipos = '" + mCCE.getNombreEquipos() + "',"
               + "ConsumoKWEq = " + mCCE.getConsumoKW_Eq() + ","
               + "NumEquipo = " + mCCE.getNumeroEquipo() + ","
               + "HorasEquipo = " + mCCE.getHorasEquipo() + ","
               + "KWHora = " + mCCE.getKW_Hora() + ","
               + "WattsDia = " + mCCE.getWatts_Dia() + ","
               + "KwDia = " + mCCE.getKW_Dia() + ","
               + "DiasPorMes = " + mCCE.getDiasPorMes() + ","
               + "KwMes = " + mCCE.getKW_Mes()
               + " where idConsumoElectrico = " + vConsumoElectrico + ";");
            return true;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }                   
    }

   public double SumarConsumosElectricos(String Clave)
   {
        double  Suma = 0;
        Conectar();
        Statement consulta;
        ResultSet resultado;
        try 
        {
            consulta = Conexion.createStatement();

            resultado = consulta.executeQuery("SELECT SUM(KWHora) FROM ConsumoElectrico WHERE Producto_idProducto = '"+ ConsultarIdProductoClave(Clave) +"';");
            while (resultado.next()) 
            {
                Suma = resultado.getDouble("SUM(KWHora)");              
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return Suma;
    }
   
   public boolean AgregarCostoConsumoElectrico(DP_ConsumoElectrico mDP_CE, String Clave)
   {
        int idProducto;
        int idDP_CE;
        Statement consulta; 
        idProducto = ConsultarIdProductoClave(Clave);
        Conectar();
        ResultSet resultado;
        try 
        {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("SELECT * FROM DeterPrecioConsumo where Producto_idProducto =  '"+ idProducto +"';");
            if(resultado.next())
            {
                idDP_CE = resultado.getInt("idDeterPrecioConsumo"); //SI existe
                
                consulta = Conexion.createStatement();
                consulta.execute("update DeterPrecioConsumo set "
                    + "TotalKwHora = " + mDP_CE.getTotalKwHora() + ","
                    + "PrecioKwHora = " + mDP_CE.getPrecioKwHora() + ","
                    + "Subtotal = " + mDP_CE.getSubtotal() + ","
                    + "TotalIVA = " + mDP_CE.getPrecioConIVA()
                    + " where idDeterPrecioConsumo = " + idDP_CE + ";");
                
                return true;
            }
            else    // NO existe
            {
                consulta = Conexion.createStatement();
                consulta.execute("insert into DeterPrecioConsumo "
                    + "values (null," + mDP_CE.getTotalKwHora() + ","
                    + "" + mDP_CE.getPrecioKwHora() + ","
                    + "" + mDP_CE.getSubtotal() + "," 
                    + mDP_CE.getPrecioConIVA() + ","
                    + idProducto + ");");
                return true;
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }
        
   }
   
   public boolean EliminarConsumoElectrico(int idConsumoElectrico) 
    {
       Conectar();
       Statement consulta;     
       
        try 
        {
            consulta = Conexion.createStatement();
            consulta.execute("DELETE FROM ConsumoElectrico WHERE idConsumoElectrico = " + idConsumoElectrico + ";");
            return true;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }                   
    }
   
   
// ------------  R E P O R T E  C O S T O S  ------------
   
   // ------------  Materia prima
        
   public double ConsultarCostoUnitOp(String Clave)
    {
        double  MateriaPrima = 0;
        Conectar();
        Statement consulta;
        ResultSet resultado;
        try 
        {
            consulta = Conexion.createStatement();

            resultado = consulta.executeQuery("SELECT CostoUnitOperativo FROM DeterPrecioProd WHERE Producto_idProducto = '"+ ConsultarIdProductoClave(Clave) +"';");
            while (resultado.next()) 
            {
                MateriaPrima = resultado.getDouble("CostoUnitOperativo");              
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return MateriaPrima;
    }
   
   public double ConsultarCostoMateriaPrima(String Clave)
   {
        double  CostoMateriaPrima = 0;
        Conectar();
        Statement consulta;
        ResultSet resultado;
        try 
        {
            consulta = Conexion.createStatement();

            resultado = consulta.executeQuery("SELECT Sum(PrecioCantidad) FROM Produccion WHERE ElementoCosto LIKE '%Materia prima%' and Producto_idProducto = '"+ ConsultarIdProductoClave(Clave) +"';");
            while (resultado.next()) 
            {
                CostoMateriaPrima = resultado.getDouble("Sum(PrecioCantidad)");              
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return CostoMateriaPrima;
   }
   
   // ------------  Mano de obra
   
   
   public double ConsultarTiempos(String Clave, boolean Bandera)
   {
        double  TiempoCosto = 0;
        Conectar();
        Statement consulta;
        ResultSet resultado;
        try 
        {
            consulta = Conexion.createStatement();

            resultado = consulta.executeQuery("SELECT Sum(Cantidad), Sum(PrecioCantidad) FROM Produccion WHERE ElementoCosto LIKE '%Mano de obra%' and UnidadMedida LIKE '%horas%' and Producto_idProducto = '"+ ConsultarIdProductoClave(Clave) +"';");
            while (resultado.next()) 
            {
                if (Bandera == true)    //Pide tiempo
                {
                    TiempoCosto = resultado.getDouble("Sum(Cantidad)"); 
                }
                else    //Pide precio
                {
                    TiempoCosto = resultado.getDouble("Sum(PrecioCantidad)");
                }
                             
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return TiempoCosto;
   }
   
   
   // ------------  Maquinaria y herramientas
   
    public double ConsultaCostoOpoConsumoElectrico(String Clave) 
    {
        Conectar();
        double Subtotal = 0;
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = Conexion.createStatement();
                       
            resultado = consulta.executeQuery("select * from DeterPrecioConsumo where Producto_idProducto = '"+ ConsultarIdProductoClave(Clave) +"';");
            while (resultado.next()) 
            {
                Subtotal = resultado.getDouble("Subtotal");
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return Subtotal;      
    }
    
    public ArrayList ConsultaDeterminacionPreciosProduccion(String Clave) 
    {
        Conectar();
        DP_Produccion mDPP;
        ArrayList mListaDP_P = new ArrayList();
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = Conexion.createStatement();
                       
            resultado = consulta.executeQuery("select * from DeterPrecioProd where Producto_idProducto = '"+ ConsultarIdProductoClave(Clave) +"';");
            while (resultado.next()) 
            {
                mDPP = new DP_Produccion();
                mDPP.setIdDeterminacionPrecio(resultado.getInt("idDeterminacionPrecio"));
                mDPP.setCostoUnitOperativo(resultado.getDouble("CostoUnitOperativo"));
                mDPP.setCostoTotalVenta(resultado.getDouble("CostoTotalVenta"));
                mDPP.setUtilidad(resultado.getDouble("Utilidad"));
                mDPP.setPrecioSinIVA(resultado.getDouble("PrecioSinIVA"));
                mDPP.setPrecioConIVA(resultado.getDouble("PrecioConIVA"));
                mDPP.setProducto_idProducto(resultado.getInt("Producto_idProducto"));
                mListaDP_P.add(mDPP);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return mListaDP_P;      
    }
    
    public boolean AgregarReportes(ClaseReporteCostos mRC, String Clave)
    {
        int idRP;
        Statement consulta; 
        int idProducto;
        idProducto = ConsultarIdProductoClave(Clave);
        Conectar();
        ResultSet resultado;
        try 
        {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("SELECT * FROM ReporteCostes where Producto_idProducto =  '"+ idProducto +"';");
            if(resultado.next())
            {
                idRP = resultado.getInt("idReporteCostes"); //SI existe
                
                consulta = Conexion.createStatement();
                
                consulta.execute("update ReporteCostes set "
                    + "Especificaciones = '" + mRC.getEspecificaciones() + "',"
                    + "Diametro = " + mRC.getDiametro() + ","
                    + "PesoMaterial = " + mRC.getPesoMaterial() + ","
                    + "UnidadEmpaque = " + mRC.getUnidadEmpaque() + ","
                    + "UnidadUtilizacionM = " + mRC.getUnidadUtilizacionM() + ","
                    + "UnidadUtilizacionKg = " + mRC.getUnidadUtilizacionKg() + ","
                    + "Merma = " + mRC.getMerma() + ","
                    + "CMatPrim = " + mRC.getCMatPrim()+ ","
                    + "CMatPrimTotal = " + mRC.getCMatPrimTotal() + ","
                    + "TManoDeObra = " + mRC.getTManoDeObra()+ ","
                    + "COpTotal = " + mRC.getCOpTotal()+ ","
                    + "ConsEnerKWh = " + mRC.getConsEnerKWh() + ","
                    + "ConsEnerPesos = " + mRC.getConsEnerPesos() + ","
                    + "CostoAdmin = " + mRC.getCostoAdmin() + ","
                    + "CostoFleteEmbarq = " + mRC.getCostoFleteEmbarq() + ","
                    + "CostoTotalOp = " + mRC.getCostoTotalOp() + ","
                    + "Utilidad = " + mRC.getUtilidad() + ","
                    + "IVA = " + mRC.getIVA() + ","
                    + "PrecioSugerido = " + mRC.getPrecioSugerido() + 
                    "where idReporteCostes = " + idRP + ";");
                
                return true;
            }
            else    // NO existe
            {
                consulta = Conexion.createStatement();
                
                consulta.execute("insert into ReporteCostes "
                    + "values (null, '" + mRC.getEspecificaciones() + "',"
                    + mRC.getDiametro() + ","
                    + mRC.getPesoMaterial() + ","
                    + mRC.getUnidadEmpaque() + ","
                    + mRC.getUnidadUtilizacionM() + ","
                    + mRC.getUnidadUtilizacionKg()+ ","
                    + mRC.getMerma() + ","
                    + mRC.getCMatPrim()+ ","
                    + mRC.getCMatPrimTotal() + ","
                    + mRC.getTManoDeObra() + ","
                    + mRC.getCOpTotal() + ","
                    + mRC.getConsEnerKWh() + ","
                    + mRC.getConsEnerPesos() + ","
                    + mRC.getCostoAdmin() + ","
                    + mRC.getCostoFleteEmbarq() + ","
                    + mRC.getCostoTotalOp() + ","
                    + mRC.getUtilidad() + ","
                    + mRC.getIVA() + ","
                    + mRC.getPrecioSugerido() + ","
                    + idProducto + ");");
                return true;
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }
   }
    
    
// ------------  C O T I Z A C I O N  P R E V I A  ------------
    
     
    public ArrayList ConsultaMateriaPrima()
    {
        Conectar();
        MateriaPrima mMP;
        ArrayList mListaMP = new ArrayList();
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = Conexion.createStatement();
                       
            resultado = consulta.executeQuery("select * from MateriaPrima;");
            while (resultado.next()) 
            {
                mMP = new MateriaPrima();
                mMP.setIdMateriaPrima(resultado.getInt("idMateriaPrima"));
                mMP.setClave(resultado.getString("Clave"));
                mMP.setDescripcion(resultado.getString("Descripcion"));
                mMP.setCantidad(resultado.getDouble("Cantidad"));
                mMP.setUnidadMedida(resultado.getString("UnidadMedida"));
                mMP.setPrecioUnitario(resultado.getDouble("PrecioUnitario"));
                mMP.setPrecioTotal(resultado.getDouble("PrecioTotal"));
                mMP.setFechaCompra(resultado.getDate("FechaCompra"));
                mMP.setFacturas_idfacturas(resultado.getInt("Facturas_idfacturas"));
                mListaMP.add(mMP);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return mListaMP;
    }
    
    public ArrayList ConsultaMateriaPrimaFiltro(String Buscar)
    {
        Conectar();
        MateriaPrima mMP;
        ArrayList mListaMP = new ArrayList();
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("SELECT * FROM MateriaPrima WHERE Clave LIKE '%" + Buscar + "%' OR Descripcion LIKE '%"+ Buscar +"%'");
            while (resultado.next()) 
            {
                mMP = new MateriaPrima();
                mMP.setIdMateriaPrima(resultado.getInt("idMateriaPrima"));
                mMP.setClave(resultado.getString("Clave"));
                mMP.setDescripcion(resultado.getString("Descripcion"));
                mMP.setCantidad(resultado.getDouble("Cantidad"));
                mMP.setUnidadMedida(resultado.getString("UnidadMedida"));
                mMP.setPrecioUnitario(resultado.getDouble("PrecioUnitario"));
                mMP.setPrecioTotal(resultado.getDouble("PrecioTotal"));
                mMP.setFechaCompra(resultado.getDate("FechaCompra"));
                mMP.setFacturas_idfacturas(resultado.getInt("Facturas_idfacturas"));
                mListaMP.add(mMP);               
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe esa búsqueda");
        }
        Desconectar();
        return mListaMP;
    }
    
    
// ------------  C O M P A R A C I O N  D E  P R E C I O S  ------------
    
    public boolean AgregarProductoCompetencia(Competencia mC, String Clave) 
    {
       Conectar();
       Statement consulta;     
       
        try 
        {
         consulta = Conexion.createStatement();
         consulta.execute("insert into Competencia "
                + "values (null,'" + mC.getClave() + "',"
                + "'" + mC.getEmpresa() + "',"
                + "'" + mC.getNombreProducto() + "'," 
                + "'" + mC.getDescripcion()+ "',"
                + mC.getPrecioUnitario()+","
                + ConsultarIdProductoClave(Clave) + ");");
         return true;
        } 
        catch (SQLException e) 
        {
         return false;
        }
    }
    
    public ArrayList ConsultaNombresProducto() 
    {
        ArrayList mListaProductos = new ArrayList();
        Conectar();
        Statement consulta; 
        ResultSet resultado;
       
        try 
        {
         consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select * from Producto;");
            while (resultado.next()) {
                mListaProductos.add((resultado.getString("Clave")) + "_" + (resultado.getString("NombreProducto")));
        }
        }
        catch (SQLException e) 
        {
        }
        return mListaProductos;
    }
    
    public ArrayList ConsultaCompetencia(String Clave) 
    {
        Conectar();
        Competencia mC;
        ArrayList mListaCompetencia = new ArrayList();
        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = Conexion.createStatement();
                       
            resultado = consulta.executeQuery("select * from Competencia where Producto_idProducto = '"+ ConsultarIdProductoClave(Clave) +"';");
            while (resultado.next()) 
            {
                mC = new Competencia();
                mC.setIdCompetencia(resultado.getInt("idCompetencia"));
                mC.setClave(resultado.getString("Clave"));
                mC.setEmpresa(resultado.getString("Empresa"));
                mC.setNombreProducto(resultado.getString("NombreProducto"));
                mC.setDescripcion(resultado.getString("Descripcion"));
                mC.setPrecioUnitario(resultado.getDouble("PrecioUnitario"));
                mC.setProducto_idProducto(resultado.getInt("Producto_idProducto"));
                mListaCompetencia.add(mC);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return mListaCompetencia;      
    }
    
    public boolean ModificarProductoCompetencia(Competencia mC, int idCompetencia) 
    {
       Conectar();
       Statement consulta;     
       
        try 
        {
            consulta = Conexion.createStatement();
            consulta.execute("update Competencia set "
               + "Empresa = '" + mC.getEmpresa() + "',"
               + "NombreProducto = '" + mC.getNombreProducto() + "',"
               + "Descripcion = '" + mC.getDescripcion() + "',"
               + "PrecioUnitario = " + mC.getPrecioUnitario() + ","
               + "Producto_idProducto = " + mC.getProducto_idProducto()
               + " where idCompetencia = " + idCompetencia + ";");
            return true;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }                   
    }
    
    public int Consulta_Id_Competencia(Competencia mC) 
    {
        Conectar();
        int IdCompetencia = 0;

        Statement consulta;
        ResultSet resultado;
        
        try 
        {
            consulta = Conexion.createStatement();
            
            resultado = consulta.executeQuery("select idCompetencia from Competencia where Empresa = '" + mC.getEmpresa() +
                    "' and NombreProducto = '" + mC.getNombreProducto() +
                    "' and PrecioUnitario = "+ mC.getPrecioUnitario() + ";");
            while (resultado.next()) 
            {
                IdCompetencia = resultado.getInt("idCompetencia");
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No Existe");
        }
        Desconectar();
        return IdCompetencia;      
    }
    
    public boolean EliminarCompetencia(int idCompetencia) 
    {
       Conectar();
       Statement consulta;     
       
        try 
        {
            consulta = Conexion.createStatement();
            consulta.execute("DELETE FROM Competencia WHERE idCompetencia = " + idCompetencia + ";");
            return true;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }
    }
}
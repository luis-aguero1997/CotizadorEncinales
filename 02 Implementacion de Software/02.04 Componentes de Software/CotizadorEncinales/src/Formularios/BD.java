/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import BaseDeDatos.Conexion;
import Clases.*;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author manuelvaquera
 */
public class BD {

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

    private Connection Conexion = null;

    ResultSet rs = null;
    Statement statement = null;

    public boolean Conectar() {
        try {
            Class.forName(Driver).newInstance();

            if ("Mac OS X".equals(System.getProperty("os.name"))) {
                Conexion = DriverManager.getConnection(URL, Username, Password);
            } else {
                if ("Windows 10".equals(System.getProperty("os.name"))) {
                    Conexion = DriverManager.getConnection(URL_N2, Username, Password_N2);
                } else {

                }
            }

            return Conexion != null;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            return false;
        }
    }

    public void Desconectar() {
        try {
            this.Conexion.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList ConsultaUsuario(String User, String Password) {
        Conectar();
        Usuario mUsuario = null;
        ArrayList mListaUsuario = new ArrayList();
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = Conexion.createStatement();
            resultado = consulta.executeQuery("select * from usuarios where Usuario  = '" + User + "' and Password = '" + Password + "';");
            while (resultado.next()) {
                mUsuario = new Usuario();
                mUsuario.setId_Usuario(resultado.getInt("idUsuarios"));
                mUsuario.setUsuario(resultado.getString("Usuario"));
                mUsuario.setNomCompleto(resultado.getString("NomCompleto"));
                mUsuario.setPassword(resultado.getString("Password"));
                mUsuario.setCorreo(resultado.getString("Correo"));
                mUsuario.setTipo(resultado.getString("Tipo"));
                mListaUsuario.add(mUsuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe el usuario");
            e.printStackTrace();
        }
        Desconectar();
        return mListaUsuario;
    }

    public void Agregar_PdfVO(Archivo vo) {
        Conectar();
        Conexion conec = new Conexion();
        String sql = "INSERT INTO facturas (idFacturas, Nombre, Archivo, Formato, Fecha) VALUES(?, ?, ?, ?, ?);";
        PreparedStatement ps = null;

        try {
            ps = getConnection().prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, vo.getNombre());
            ps.setBytes(3, vo.getPDF());
            ps.setString(4, "PDF");
            ps.setDate(5, (java.sql.Date) vo.getFecha());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Factura agregada con éxito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar la factura");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar la factura");
        } finally {
            try {

                ps.close();
                Desconectar();
            } catch (Exception ex) {

            }
        }
    }

    //Consulta de Facturas general(Aparecen todas)
    public ArrayList<Archivo> Listar_PdfVO() {
        Conectar();
        ArrayList<Archivo> list = new ArrayList<Archivo>();
        Conexion conec = new Conexion();
        Statement consulta;
        String sql = "SELECT * FROM facturas;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            consulta = Conexion.createStatement();
            rs = consulta.executeQuery(sql);
            while (rs.next()) {
                Archivo vo = new Archivo();
                vo.setID(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setPDF(rs.getBytes(3));
                vo.setFecha(rs.getDate(5));
                
                list.add(vo);
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

    //Metodo de Consulta especifico, tomara dos fechas para realizar una busqieda
    public ArrayList<Archivo> Listar_PdfVO(Date Fecha1, Date Fecha2) {
        Conectar();
        ArrayList<Archivo> list = new ArrayList<Archivo>();
        Conexion conec = new Conexion();
        Statement consulta;
        //elect IdFacturas,nombre, fecha from facturas where Fecha between '2020-02-02' AND '2020-02-05';
        String sql = "SELECT * FROM facturas WHERE Fecha BETWEEN '" + Fecha1 + "' AND '" + Fecha2 + "';";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            consulta = Conexion.createStatement();
            rs = consulta.executeQuery(sql);
            while (rs.next()) {
                Archivo vo = new Archivo();
                vo.setID(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setPDF(rs.getBytes(3));
                vo.setFecha(rs.getDate(5));
                list.add(vo);

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

    //Agregar Compra
    //Agregar PDF
    /*Metodo agregar*/
    public boolean Agregar_Compra(Compras vo) {
        //Archivo mArchivo = new Archivo();
        Conectar();
        Statement consulta;
        try {
            consulta = Conexion.createStatement();
            String SQL = "INSERT INTO materiaprima "
                    + "(idMateriaPrima, Clave, Descripcion, Cantidad, UnidadMedida, PrecioUnitario, PrecioTotal, FechaCompra, Facturas_idfacturas) "
                    + "VALUES ("
                    + "null" + ", '"
                    + vo.getClave() + "','"
                    + vo.getDescripcion() + "',"
                    + vo.getCantidad() + ",'"
                    + vo.getUMedida() + "',"
                    + vo.getPrecio() / vo.getCantidad() + ","
                    + vo.getPrecio() + ",'"
                    + vo.getFecha() + "',"
                    + vo.getIdFactura() + ");";
            consulta.execute(SQL);
            Desconectar();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Desconectar();
            return false;
        }

    }

    //Consultar la Fecha de Factura
    public Date FechaFactura(int Id) {
        Conectar();
        Date Fecha = null;
        Conexion conec = new Conexion();
        Statement consulta;
        //elect IdFacturas,nombre, fecha from facturas where Fecha between '2020-02-02' AND '2020-02-05';
        String sql = "SELECT Fecha FROM facturas WHERE idFacturas =" + Id + ";";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            consulta = Conexion.createStatement();
            rs = consulta.executeQuery(sql);
            while (rs.next()) {
                Fecha = rs.getDate("Fecha");
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
        return Fecha;
    }

    //Muestra el archivo PDF
    //Permite mostrar PDF contenido en la base de datos
    public void Ejecutar_ArchivoPDF(int Id) {
        Conectar();
        Statement consulta;
        ResultSet rs = null;
        byte[] b = null;

        try {
            consulta = Conexion.createStatement();
            String sql = "SELECT Archivo FROM facturas WHERE idFacturas = " + Id + ";";
            rs = consulta.executeQuery(sql);
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();

            rs.close();
            Desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

    public void Agregar_Producto(Productos Pro) {
        Conectar();
        Conexion conec = new Conexion();
        String sql = "INSERT INTO producto (idProducto, Clave, NombreProducto, Descripcion, Imagen, PrecioUnitario) VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;

        try {
            ps = getConnection().prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, Pro.getClave());
            ps.setString(3, Pro.getNombre());
            ps.setString(4, Pro.getDesc());
            ps.setBytes(5, Pro.getImagen());
            ps.setDouble(6, Pro.getPrecio());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto agregado con éxito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar el producto, verifique el formato de \n los datos e inténtelo de nuevo");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar el producto, verifique el formato de \n los datos e inténtelo de nuevo");
        } finally {
            try {

                ps.close();
                Desconectar();
            } catch (Exception ex) {

            }
        }
    }

    //Consulta de Facturas general(Aparecen todas)
    public ArrayList<Productos> Listar_Productos() {
        Conectar();
        ArrayList<Productos> list = new ArrayList<Productos>();
        Conexion conec = new Conexion();
        Statement consulta;
        String sql = "SELECT * FROM producto;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            consulta = Conexion.createStatement();
            rs = consulta.executeQuery(sql);
            while (rs.next()) {
                Productos Pro = new Productos();
                Pro.setClave(rs.getString(2));
                Pro.setNombre(rs.getString(3));
                Pro.setDesc(rs.getString(4));
                Pro.setImagen(rs.getBytes(5));
                Pro.setPrecio(rs.getDouble(6));

                list.add(Pro);
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

    public byte[] Imagen(String Clave) {

        Conectar();
        byte Pics[] = null;
        Conexion conec = new Conexion();
        Statement consulta;
        //elect IdFacturas,nombre, fecha from facturas where Fecha between '2020-02-02' AND '2020-02-05';
        String sql = "SELECT Imagen FROM producto WHERE clave = '" + Clave + "';";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            consulta = Conexion.createStatement();
            rs = consulta.executeQuery(sql);
            while (rs.next()) {
                Pics = rs.getBytes(1);
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

        return Pics;
    }

    public ArrayList<Productos> Listar_ProductosClave(String Clave) {
        Conectar();
        ArrayList<Productos> list = new ArrayList<Productos>();
        Conexion conec = new Conexion();
        Statement consulta;
        String sql = "SELECT * FROM producto WHERE Clave ='" + Clave + "';";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            consulta = Conexion.createStatement();
            rs = consulta.executeQuery(sql);
            while (rs.next()) {
                Productos Pro = new Productos();
                Pro.setNombre(rs.getString(3));
                Pro.setDesc(rs.getString(4));
                Pro.setImagen(rs.getBytes(5));
                Pro.setPrecio(rs.getDouble(6));

                list.add(Pro);
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

    public void Modificar(Productos Pro) {
        Conectar();
        Conexion conec = new Conexion();
        String sql = "UPDATE producto SET NombreProducto = ?, Descripcion = ?, Imagen = ?, PrecioUnitario = ? WHERE Clave =  ?;";
        PreparedStatement ps = null;

        try {
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, Pro.getNombre());
            ps.setString(2, Pro.getDesc());
            ps.setBytes(3, Pro.getImagen());
            ps.setDouble(4, Pro.getPrecio());
            ps.setString(5, Pro.getClave());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos del producto modificados con éxito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al modificar el producto, verifique el formato de \n los datos e inténtelo de nuevo");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al modificar el producto, verifique el formato de \n los datos e inténtelo de nuevo");
        } finally {
            try {

                ps.close();
                Desconectar();
            } catch (Exception ex) {

            }
        }
    }

    public void Modificar2(Productos Pro) {
        Conectar();
        Conexion conec = new Conexion();
        String sql = "UPDATE producto SET NombreProducto = ?, Descripcion = ?, PrecioUnitario = ? WHERE Clave =  ?;";
        PreparedStatement ps = null;

        try {
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, Pro.getNombre());
            ps.setString(2, Pro.getDesc());
            ps.setDouble(3, Pro.getPrecio());
            ps.setString(4, Pro.getClave());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Modificado con Exito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al modificar el producto, verifique el formato de \n los datos e inténtelo de nuevo");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al modificar el producto, verifique el formato de \n los datos e inténtelo de nuevo");
        } finally {
            try {

                ps.close();
                Desconectar();
            } catch (Exception ex) {

            }
        }
    }

    public void Eliminar(String Clave) {
        Conectar();
        Statement consulta;

        Conexion conec = new Conexion();
        String sql = "DELETE FROM  producto WHERE Clave =  ?;";

        PreparedStatement ps = null;

        try {
            ps = getConnection().prepareStatement(sql);
            ps.setString(1, Clave);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Eliminardo con Exito");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar, este producto contiene dependencias \n con datos externos que prohiben su eliminación \n elimine las dependencias e inténtelo de nuevo");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar, este producto contiene dependencias \n con datos externos que prohiben su eliminación \n elimine las dependencias e inténtelo de nuevo");
        } finally {
            try {

                ps.close();
                Desconectar();
            } catch (Exception ex) {

            }
        }

    }

    private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());

        return sDate;
    }

    public ArrayList<MateriaPrima> Listar_Materia() {
        Conectar();
        ArrayList<MateriaPrima> list = new ArrayList<MateriaPrima>();
        Conexion conec = new Conexion();
        Statement consulta;
        String sql = "SELECT * FROM materiaprima;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            consulta = Conexion.createStatement();
            rs = consulta.executeQuery(sql);
            while (rs.next()) {
                MateriaPrima MT = new MateriaPrima();
                MT.setClave(rs.getString(2));
                MT.setDescripcion(rs.getString(3));
                MT.setCantidad(rs.getInt(4));
                MT.setUnidadMedida(rs.getString(5));
                MT.setPrecioUnitario(rs.getFloat(6));
                MT.setPrecioTotal(rs.getFloat(7));
                MT.setFechaCompra(rs.getDate(8));
                MT.setFacturas_idfacturas(rs.getInt(9));

                list.add(MT);
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

    public ArrayList Listar_MateriaEspecifica(String Clave) {
        Conectar();
        MateriaPrima MT = null;
        ArrayList mListaMt = new ArrayList();
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = Conexion.createStatement();
            String SQL = "SELECT * FROM materiaprima WHERE Clave LIKE '%" + Clave + "%';";
            resultado = consulta.executeQuery(SQL);
            while (resultado.next()) {
                MT = new MateriaPrima();
                MT.setClave(resultado.getString("Clave"));
                MT.setDescripcion(resultado.getString("Descripcion"));
                MT.setCantidad(resultado.getInt("Cantidad"));
                MT.setUnidadMedida(resultado.getString("UnidadMedida"));
                MT.setPrecioUnitario(resultado.getDouble("PrecioUnitario"));
                MT.setPrecioTotal(resultado.getDouble("PrecioTotal"));
                MT.setFechaCompra(resultado.getDate("FechaCompra"));
                MT.setFacturas_idfacturas(resultado.getInt("Facturas_idfacturas"));

                mListaMt.add(MT);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe la materia prima en esta búsqueda");
        }
        Desconectar();
        return mListaMt;
    }
    
    public ArrayList Listar_MateriaFecha(Date F1, Date F2) {
        Conectar();
        MateriaPrima MT = null;
        ArrayList mListaMt = new ArrayList();
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = Conexion.createStatement();
            String SQL = "SELECT * FROM materiaprima WHERE FechaCompra BETWEEN '" + F1 + "' AND '" + F2 + "';";
            resultado = consulta.executeQuery(SQL);
            while (resultado.next()) {
                MT = new MateriaPrima();
                MT.setClave(resultado.getString("Clave"));
                MT.setDescripcion(resultado.getString("Descripcion"));
                MT.setCantidad(resultado.getInt("Cantidad"));
                MT.setUnidadMedida(resultado.getString("UnidadMedida"));
                MT.setPrecioUnitario(resultado.getDouble("PrecioUnitario"));
                MT.setPrecioTotal(resultado.getDouble("PrecioTotal"));
                MT.setFechaCompra(resultado.getDate("FechaCompra"));
                MT.setFacturas_idfacturas(resultado.getInt("Facturas_idfacturas"));

                mListaMt.add(MT);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe la materia prima en esta búsqueda");
        }
        Desconectar();
        return mListaMt;
    }

    public Connection getConnection() {
        return Conexion;
    }
}

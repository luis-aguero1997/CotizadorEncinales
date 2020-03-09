/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Productos;

import Formularios.Productos.ModProducto;
import BaseDeDatos.Conexion;
import Clases.Archivo;
import Clases.Productos;
import Clases.imgTabla;
import Formularios.Admin;
import Formularios.BD;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author luis_
 */
public class GestionProductos extends javax.swing.JFrame {

    /**
     * Creates new form GestionProductos
     */
    int Seleccion;
    int SeleccionY;
    String Clave;
    public static String Clave2;
    BD mBD = new BD();

    public GestionProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        visualizar_Productos(Table);
        /*TableColumn columna;
        columna = Table.getColumnModel().getColumn(6);
        columna.setMaxWidth(190);
        columna.setMinWidth(890);
        
        
        TableColumnModel columnModel = Table.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
        columnModel.getColumn(i).setPreferredWidth(300);
        }*/
        Table.setRowHeight(6, 1500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnAdd = new javax.swing.JButton();
        LblImagenProducto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 28)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/busqueda.png"))); // NOI18N
        jLabel2.setText("Productos");

        BtnAdd.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/portapapeles.png"))); // NOI18N
        BtnAdd.setText("Agregar Nuevo Producto");
        BtnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddMouseClicked(evt);
            }
        });
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        LblImagenProducto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Table.setBackground(new java.awt.Color(153, 204, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table.setRowHeight(50);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(335, 335, 335)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(LblImagenProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblImagenProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddMouseClicked
        // TODO add your handling code here:
        AgregarProducto Add = new AgregarProducto();
        Add.setVisible(true);
    }//GEN-LAST:event_BtnAddMouseClicked

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        Icon icono = null;
        int filaseleccionada = 0;
        filaseleccionada = Table.getSelectedRow();
        SeleccionY = Table.getSelectedColumn();
        Clave = (String) Table.getValueAt(filaseleccionada, 0);

        switch (SeleccionY) {
            case 4:
                if (JOptionPane.showConfirmDialog(null, "Desea Eliminar Este Producto, toda la informacion se perdera") == 0) {
                    mBD.Eliminar(Clave);
                    Borrar();
                    this.visualizar_Productos(Table);
                }

                break;
            case 5:
                if (JOptionPane.showConfirmDialog(null, "Desea Modificar Este Producto, la informacion Modificada no regresara") == 0) {
                    Clave2 = Clave;
                    ModProducto Pro = new ModProducto();
                    Pro.setVisible(true);
                }

                break;
            default:
                LblImagenProducto.setText(null);
                ImageIcon Imagen = new ImageIcon(mBD.Imagen(Clave));
                icono = new ImageIcon(Imagen.getImage().getScaledInstance(LblImagenProducto.getWidth(), LblImagenProducto.getHeight(), 100));
                this.LblImagenProducto.setIcon(icono);
                break;
        }
    }//GEN-LAST:event_TableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        Admin mAdmin = new Admin();
        this.dispose();
        mAdmin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddActionPerformed

    public void visualizar_Productos(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Clave");
        dt.addColumn("Producto");
        dt.addColumn("Descripcion");
        dt.addColumn("Precio");
        dt.addColumn("Eliminar");
        dt.addColumn("Modificar");

        BD mBD = new BD();
        Productos vo = new Productos();
        ArrayList<Productos> list = mBD.Listar_Productos();

        if (list.size() > 0) {

            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[7];

                vo = list.get(i);
                fila[0] = vo.getClave();
                fila[1] = vo.getNombre();
                fila[2] = vo.getDesc();
                fila[3] = vo.getPrecio();

                ImageIcon icono = new ImageIcon(get_Image("trash.jpg"));
                if (get_Image("trash.jpg") != null) {
                    icono = new ImageIcon(get_Image("trash.jpg").getScaledInstance(20, 20, 20));
                }

                if (icono == null) {
                    fila[4] = new JButton("eliminar");
                } else {
                    
                    fila[4] = new JButton(icono);
                }

                ImageIcon icono2 = new ImageIcon(get_Image("file.jpg"));
                icono = new ImageIcon(get_Image("file.jpg").getScaledInstance(10, 10, 10));

                if (get_Image("file.jpg") == null) {
                    JButton Boton2 = new JButton(icono);
                    Boton2.setBackground(java.awt.Color.RED);
                    fila[5] = Boton2;
                } else {
                    fila[5] = new JButton(icono2);
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    void Borrar() {
        DefaultTableModel LimpiadoTabla = (DefaultTableModel) Table.getModel();
        //Borramosla tabla...
        int a = Table.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {
            LimpiadoTabla.removeRow(LimpiadoTabla.getRowCount() - 1);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JLabel LblImagenProducto;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

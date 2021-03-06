/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Productos;

import Clases.*;
import Formularios.BD;
import java.awt.Event;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author luis_
 */
public class ModProducto extends javax.swing.JFrame {

    /**
     * Creates new form AgregarProducto
     */
    String Ruta;
    Icon icono;
    BD mBD;
    GestionProductos Gestion;

    public ModProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        Ruta = "";
        mBD = new BD();
        this.llenado();
        this.jLabel7.setText("");
        this.jLabel8.setText("");
        this.jLabel9.setText("");
        
        evitarPegar(this.TxtDes);
        evitarPegar(this.TxtNom);
        evitarPegar(this.TxtPrecio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        TxtDes = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        BtnSeleccion = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        LblImagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel4.setText("Precio");

        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

        TxtDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDesKeyTyped(evt);
            }
        });

        TxtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrecioKeyTyped(evt);
            }
        });

        BtnSeleccion.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        BtnSeleccion.setText("Seleccionar Imagen");
        BtnSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSeleccionMouseClicked(evt);
            }
        });

        BtnSave.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BtnSave.setText("Guardar Nuevos Datos ");
        BtnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSaveMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel3.setText("Descripcion");

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        jLabel1.setText("Modificar Producto");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel5.setText("Imagen");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtDes, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TxtNom, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TxtPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BtnSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(LblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(BtnSave)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)
                        .addGap(172, 172, 172))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSeleccion)
                            .addComponent(jLabel5)))
                    .addComponent(LblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSeleccionMouseClicked
        // TODO add your handling code here:
        LblImagen.setIcon(null);
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        Ruta = j.getSelectedFile().getAbsolutePath();

        if (se == JFileChooser.APPROVE_OPTION) {
            Ruta = j.getSelectedFile().getAbsolutePath();
            ImageIcon Imagen = new ImageIcon(Ruta);
            icono = new ImageIcon(Imagen.getImage().getScaledInstance(LblImagen.getWidth(), LblImagen.getHeight(), se));
            this.LblImagen.setIcon(icono);
        }

    }//GEN-LAST:event_BtnSeleccionMouseClicked

    private void BtnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSaveMouseClicked
        // TODO add your handling code here:
        if (!this.TxtDes.getText().isEmpty() || !this.TxtNom.getText().isEmpty() || this.TxtPrecio.getText().isEmpty()) {
            if (!Ruta.isEmpty()) {
                Productos Pro = new Productos();

                Pro.setDesc(TxtDes.getText());
                Pro.setNombre(TxtNom.getText());
                Pro.setPrecio(Float.parseFloat(TxtPrecio.getText()));
                Pro.setClave(GestionProductos.Clave2);

                File ruta = new File(this.Ruta);

                InputStream input = null;
                try {
                    byte[] Imagen = new byte[(int) ruta.length()];

                    input = new FileInputStream(new File(Ruta));
                    input.read(Imagen);
                    Pro.setImagen(Imagen);
                } catch (FileNotFoundException ex) {
                    Pro.setImagen(null);
                } catch (IOException ex) {
                    Logger.getLogger(ModProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
                mBD.Modificar(Pro);

                Gestion = new GestionProductos();
                Gestion.setVisible(true);
                this.dispose();
            } else {
                Productos Pro = new Productos();

                Pro.setDesc(TxtDes.getText());
                Pro.setNombre(TxtNom.getText());
                Pro.setPrecio(Float.parseFloat(TxtPrecio.getText()));
                Pro.setClave(GestionProductos.Clave2);
                mBD.Modificar2(Pro);

                Gestion = new GestionProductos();
                Gestion.setVisible(true);
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Llene Todos los campos y seleccione una imagen");
        }
    }//GEN-LAST:event_BtnSaveMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GestionProductos mGestionProductos = new GestionProductos();
        this.dispose();
        mGestionProductos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        // TODO add your handling code here:
         if (this.TxtNom.getText().isEmpty()) {
            this.jLabel7.setText("");
        } else if (this.TxtNom.getText().length() == 45) {
            evt.consume();
        }  else if (this.TxtNom.getText().length() < 5) {
            this.jLabel7.setText("Invalido, Demasiado corto");
        } else if (this.TxtNom.getText().length() >= 5){
            this.jLabel7.setText("");
        }
    }//GEN-LAST:event_TxtNomKeyTyped

    private void TxtDesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDesKeyTyped
        // TODO add your handling code here:
        if (this.TxtDes.getText().isEmpty()) {
            this.jLabel8.setText("");
        } else if (this.TxtDes.getText().length() == 45) {
            evt.consume();
        }  else if (this.TxtDes.getText().length() < 5) {
            this.jLabel8.setText("Invalido, Demasiado corto");
        } else if (this.TxtDes.getText().length() >= 5){
            this.jLabel8.setText("");
        }
    }//GEN-LAST:event_TxtDesKeyTyped

    private void TxtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrecioKeyTyped
        // TODO add your handling code here:
                char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TxtPrecio.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtPrecioKeyTyped

    public void llenado() {
        BD mBD = new BD();

        Icon icono;
        Productos vo = new Productos();
        ArrayList<Productos> list = mBD.Listar_ProductosClave(GestionProductos.Clave2);

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {

                vo = list.get(i);

                this.TxtNom.setText(vo.getNombre());
                this.TxtDes.setText(vo.getDesc());
                this.TxtPrecio.setText(String.valueOf(vo.getPrecio()));

                byte[] data = vo.getImagen();
                ImageIcon Imagen = new ImageIcon(mBD.Imagen(GestionProductos.Clave2));
                icono = new ImageIcon(Imagen.getImage().getScaledInstance(LblImagen.getWidth(), LblImagen.getHeight(), 100));
                this.LblImagen.setIcon(icono);

            }
        }
    }

    public static void evitarPegar(JTextField campo) {

        InputMap map2 = campo.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

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
            java.util.logging.Logger.getLogger(ModProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModProducto().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JButton BtnSeleccion;
    private javax.swing.JLabel LblImagen;
    private javax.swing.JTextField TxtDes;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Productos;

import Clases.Productos;
import Formularios.BD;
import java.awt.Event;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author luis_
 */
public class AgregarProducto extends javax.swing.JFrame {

    /**
     * Creates new form AgregarProducto
     */
    String Ruta;
    Icon icono;
    BD mBD;
    GestionProductos Gestion;

    public AgregarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        Ruta = "";
        mBD = new BD();
        this.jLabel8.setText("");
        this.jLabel9.setText("");
        this.jLabel10.setText("");
        this.jLabel11.setText("");
        
        evitarPegar(this.TxtClave);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtClave = new javax.swing.JTextField();
        TxtNom = new javax.swing.JTextField();
        TxtDes = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        BtnSeleccion = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        LblImagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 20)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/portapapeles.png"))); // NOI18N
        jLabel1.setText("Agregar Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 213, -1));

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel2.setText("Nombre: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 138, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel3.setText("Descripcion: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 263, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel4.setText("Precio: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 201, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel6.setText("Clave: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 79, -1, -1));

        TxtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtClaveKeyTyped(evt);
            }
        });
        jPanel1.add(TxtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 81, 210, -1));

        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });
        jPanel1.add(TxtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 140, 210, -1));

        TxtDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDesKeyTyped(evt);
            }
        });
        jPanel1.add(TxtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 265, 210, -1));

        TxtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioActionPerformed(evt);
            }
        });
        TxtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(TxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 203, 210, -1));

        BtnSeleccion.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        BtnSeleccion.setText("Seleccionar Imagen");
        BtnSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSeleccionMouseClicked(evt);
            }
        });
        BtnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 328, 213, 26));

        BtnSave.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        BtnSave.setText("Guardar Producto");
        BtnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSaveMouseClicked(evt);
            }
        });
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 205, 50));

        LblImagen.setBackground(new java.awt.Color(255, 255, 255));
        LblImagen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(LblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 280, 270));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel5.setText("Imagen");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 325, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 173, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 235, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 297, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSeleccionMouseClicked
        // TODO add your handling code here:
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
        if (!this.TxtClave.getText().isEmpty() || this.TxtDes.getText().isEmpty() || this.TxtNom.getText().isEmpty() || this.TxtPrecio.getText().isEmpty() || !Ruta.isEmpty()) {
            Productos Pro = new Productos();
            Pro.setClave(TxtClave.getText());
            Pro.setDesc(TxtDes.getText());
            Pro.setNombre(TxtNom.getText());
            Pro.setPrecio(Float.parseFloat(TxtPrecio.getText()));

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
                Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            mBD.Agregar_Producto(Pro);

            TxtClave.setText("");
            TxtDes.setText("");
            TxtNom.setText("");
            TxtPrecio.setText("");
            this.LblImagen.setIcon(null);
            Gestion = new GestionProductos();
            Gestion.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Llene Todos los campos y seleccione una imagen");
        }
    }//GEN-LAST:event_BtnSaveMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        
         this.dispose();
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtClaveKeyTyped
        // TODO add your handling code here:
        if (this.TxtClave.getText().isEmpty()) {
            this.jLabel8.setText("");
        } else if (this.TxtClave.getText().length() == 45) {
            evt.consume();
        }  else if (this.TxtClave.getText().length() < 3) {
            this.jLabel8.setText("Invalido, Demasiado corto");
        } else if (this.TxtClave.getText().length() > 3) {
            this.jLabel8.setText("");
        } 
        
         if (evt.getKeyChar() == ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtClaveKeyTyped

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        // TODO add your handling code here:
        if (this.TxtNom.getText().isEmpty()) {
            this.jLabel9.setText("");
        } else if (this.TxtNom.getText().length() == 45) {
            evt.consume();
        }  else if (this.TxtNom.getText().length() < 5) {
            this.jLabel9.setText("Invalido, Demasiado corto");
        } else if (this.TxtNom.getText().length() >= 5){
            this.jLabel9.setText("");
        }
    }//GEN-LAST:event_TxtNomKeyTyped

    private void TxtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrecioKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TxtPrecio.getText().length() == 10) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '.' && TxtPrecio.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtPrecioKeyTyped

    private void TxtDesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDesKeyTyped
        // TODO add your handling code here:
        if (this.TxtDes.getText().isEmpty()) {
            this.jLabel11.setText("");
        } else if (this.TxtDes.getText().length() == 45) {
            evt.consume();
        }  else if (this.TxtDes.getText().length() < 5) {
            this.jLabel11.setText("Invalido, Demasiado corto");
        } else if (this.TxtDes.getText().length() >= 5){
            this.jLabel11.setText("");
        }
    }//GEN-LAST:event_TxtDesKeyTyped

    private void BtnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSeleccionActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void TxtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JButton BtnSeleccion;
    private javax.swing.JLabel LblImagen;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtDes;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

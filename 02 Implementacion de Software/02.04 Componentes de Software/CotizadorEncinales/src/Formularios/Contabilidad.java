/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import BaseDeDatos.BD_1;
import Formularios.Comparacion.*;
import Formularios.Constantes.FRM_ContaConstantes;
import Formularios.Cotizacion.*;
import Formularios.CotizacionPrevia.*;
import Formularios.Facturas.*;

/**
 *
 * @author manuelvaquera
 */
public class Contabilidad extends javax.swing.JFrame {

    /**
     * Creates new form Cotizador
     */
    public Contabilidad() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        BtnAdminFacturas1.setEnabled(false);
        BTN_ModifConstantes.setEnabled(true);
        jButton1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAdminFacturas = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTN_ModifConstantes = new javax.swing.JButton();
        BtnCotizadorComparacion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnAdminFacturas1 = new javax.swing.JButton();
        BtnAdminSalirMenu = new javax.swing.JButton();

        BtnAdminFacturas.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BtnAdminFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/proyecto-de-ley.png"))); // NOI18N
        BtnAdminFacturas.setText("Facturas");
        BtnAdminFacturas.setBorderPainted(false);
        BtnAdminFacturas.setContentAreaFilled(false);
        BtnAdminFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAdminFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAdminFacturas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/proyecto-de-ley (1).png"))); // NOI18N
        BtnAdminFacturas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/proyecto-de-ley (1).png"))); // NOI18N
        BtnAdminFacturas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/proyecto-de-ley (1).png"))); // NOI18N
        BtnAdminFacturas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAdminFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdminFacturasActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("AppleGothic", 0, 28)); // NOI18N
        jLabel1.setText("Bienvenido Encargado de Contabilidad ");

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel2.setText("Seleccione Alguna de las Siguientes Opciones ");

        BTN_ModifConstantes.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BTN_ModifConstantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/boligrafo.png"))); // NOI18N
        BTN_ModifConstantes.setText("Modificar Constantes");
        BTN_ModifConstantes.setBorderPainted(false);
        BTN_ModifConstantes.setContentAreaFilled(false);
        BTN_ModifConstantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_ModifConstantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_ModifConstantes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/boligrafo_1.png"))); // NOI18N
        BTN_ModifConstantes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/boligrafo_1.png"))); // NOI18N
        BTN_ModifConstantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_ModifConstantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ModifConstantesMouseClicked(evt);
            }
        });
        BTN_ModifConstantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModifConstantesActionPerformed(evt);
            }
        });

        BtnCotizadorComparacion.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        BtnCotizadorComparacion.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BtnCotizadorComparacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/documento.png"))); // NOI18N
        BtnCotizadorComparacion.setText("Comparar Precio");
        BtnCotizadorComparacion.setBorderPainted(false);
        BtnCotizadorComparacion.setContentAreaFilled(false);
        BtnCotizadorComparacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCotizadorComparacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCotizadorComparacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/documento (1).png"))); // NOI18N
        BtnCotizadorComparacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/documento (1).png"))); // NOI18N
        BtnCotizadorComparacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnCotizadorComparacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCotizadorComparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCotizadorComparacionActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporte (2).png"))); // NOI18N
        jButton1.setText("Cotizacion Preliminar ");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporte (4).png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporte (4).png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporte (4).png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        BtnAdminFacturas1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BtnAdminFacturas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cuenta.png"))); // NOI18N
        BtnAdminFacturas1.setText("Facturas y Compras");
        BtnAdminFacturas1.setBorderPainted(false);
        BtnAdminFacturas1.setContentAreaFilled(false);
        BtnAdminFacturas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAdminFacturas1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAdminFacturas1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/proyecto-de-ley (2).png"))); // NOI18N
        BtnAdminFacturas1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/proyecto-de-ley (2).png"))); // NOI18N
        BtnAdminFacturas1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/proyecto-de-ley (2).png"))); // NOI18N
        BtnAdminFacturas1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAdminFacturas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdminFacturas1ActionPerformed(evt);
            }
        });

        BtnAdminSalirMenu.setBackground(new java.awt.Color(255, 255, 255));
        BtnAdminSalirMenu.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtnAdminSalirMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida (1).png"))); // NOI18N
        BtnAdminSalirMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAdminSalirMenu.setBorderPainted(false);
        BtnAdminSalirMenu.setContentAreaFilled(false);
        BtnAdminSalirMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida (2).png"))); // NOI18N
        BtnAdminSalirMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida (2).png"))); // NOI18N
        BtnAdminSalirMenu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida (2).png"))); // NOI18N
        BtnAdminSalirMenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida (5).png"))); // NOI18N
        BtnAdminSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdminSalirMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAdminSalirMenu)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BtnCotizadorComparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTN_ModifConstantes, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnAdminFacturas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdminSalirMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTN_ModifConstantes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdminFacturas1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCotizadorComparacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 647, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAdminFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdminFacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAdminFacturasActionPerformed

    private void BTN_ModifConstantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModifConstantesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BTN_ModifConstantesActionPerformed

    private void BtnCotizadorComparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCotizadorComparacionActionPerformed
        // TODO add your handling code here:
        ComparacionPrecios mCP = new ComparacionPrecios();
        mCP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnCotizadorComparacionActionPerformed

    private void BtnAdminFacturas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdminFacturas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAdminFacturas1ActionPerformed

    private void BTN_ModifConstantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ModifConstantesMouseClicked
        // TODO add your handling code here:
        FRM_ContaConstantes mFCC = new FRM_ContaConstantes();
        mFCC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_ModifConstantesMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void BtnAdminSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdminSalirMenuActionPerformed

        Login mLogin = new Login();
        this.dispose();
        String Descripcion = "El usuario " + Login.NombreUsuario + " salió del sistema";
        BD_1 mBD = new BD_1();
        mBD.AgregarRegistro(Descripcion);
        mLogin.setVisible(true);
    }//GEN-LAST:event_BtnAdminSalirMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ModifConstantes;
    private javax.swing.JButton BtnAdminFacturas;
    private javax.swing.JButton BtnAdminFacturas1;
    private javax.swing.JButton BtnAdminSalirMenu;
    private javax.swing.JButton BtnCotizadorComparacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}

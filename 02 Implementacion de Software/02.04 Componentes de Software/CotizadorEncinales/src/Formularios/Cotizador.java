/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author manuelvaquera
 */
public class Cotizador extends javax.swing.JFrame {

    /**
     * Creates new form Cotizador
     */
    public Cotizador() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnCotizadorCotizar = new javax.swing.JButton();
        BtnCotizadorComparacion = new javax.swing.JButton();
        BtnCotizadorSalirMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnAdminFacturas1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("AppleGothic", 0, 28)); // NOI18N
        jLabel1.setText("Bienvenido Cotizador ");

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel2.setText("Seleccione Alguna de las Siguientes Opciones ");

        BtnCotizadorCotizar.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BtnCotizadorCotizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tutorial.png"))); // NOI18N
        BtnCotizadorCotizar.setText("Cotización General");
        BtnCotizadorCotizar.setBorderPainted(false);
        BtnCotizadorCotizar.setContentAreaFilled(false);
        BtnCotizadorCotizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCotizadorCotizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCotizadorCotizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tutorial (2).png"))); // NOI18N
        BtnCotizadorCotizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tutorial (2).png"))); // NOI18N
        BtnCotizadorCotizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCotizadorCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCotizadorCotizarActionPerformed(evt);
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

        BtnCotizadorSalirMenu.setBackground(new java.awt.Color(255, 255, 255));
        BtnCotizadorSalirMenu.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtnCotizadorSalirMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        BtnCotizadorSalirMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCotizadorSalirMenu.setBorderPainted(false);
        BtnCotizadorSalirMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (1).png"))); // NOI18N
        BtnCotizadorSalirMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (1).png"))); // NOI18N
        BtnCotizadorSalirMenu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (1).png"))); // NOI18N
        BtnCotizadorSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCotizadorSalirMenuActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporte (2).png"))); // NOI18N
        jButton1.setText("Cotizacion Preliminar ");
        jButton1.setBorderPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporte (4).png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporte (4).png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reporte (4).png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        BtnAdminFacturas1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BtnAdminFacturas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cuenta.png"))); // NOI18N
        BtnAdminFacturas1.setText("Facturas");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(BtnCotizadorCotizar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(BtnCotizadorComparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAdminFacturas1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnCotizadorSalirMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(548, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCotizadorCotizar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdminFacturas1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCotizadorComparacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnCotizadorSalirMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(641, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAdminFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdminFacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAdminFacturasActionPerformed

    private void BtnCotizadorCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCotizadorCotizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCotizadorCotizarActionPerformed

    private void BtnCotizadorComparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCotizadorComparacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCotizadorComparacionActionPerformed

    private void BtnCotizadorSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCotizadorSalirMenuActionPerformed

        Login mLogin = new Login();
        this.dispose();
        mLogin.setVisible(true);
    }//GEN-LAST:event_BtnCotizadorSalirMenuActionPerformed

    private void BtnAdminFacturas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdminFacturas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAdminFacturas1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cotizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdminFacturas;
    private javax.swing.JButton BtnAdminFacturas1;
    private javax.swing.JButton BtnCotizadorComparacion;
    private javax.swing.JButton BtnCotizadorCotizar;
    private javax.swing.JButton BtnCotizadorSalirMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Usuarios;

import BaseDeDatos.BD_1;
import Clases.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author manuelvaquera
 */
public class AddUser extends javax.swing.JFrame {

    BD_1 mBD = new BD_1();

    /**
     * Creates new form AddUser
     */
    public AddUser() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        this.jLabel8.setText("");
        this.jLabel9.setText("");
        this.jLabel10.setText("");
        this.jLabel11.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnAddUser = new javax.swing.JButton();
        Puesto = new javax.swing.JComboBox<>();
        TxtUsuario = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JTextField();
        TxtNomCompleto = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/agregar-usuario (2).png"))); // NOI18N
        jLabel1.setText("Datos de Nuevo Usuario");

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel2.setText("Nombre Completo");

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel3.setText("Nombre de Usuario");

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel6.setText("Puesto");

        BtnAddUser.setBackground(new java.awt.Color(0, 221, 79));
        BtnAddUser.setFont(new java.awt.Font("Sukhumvit Set", 1, 20)); // NOI18N
        BtnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        BtnAddUser.setText("   Agregar ");
        BtnAddUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddUserMouseClicked(evt);
            }
        });
        BtnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddUserActionPerformed(evt);
            }
        });

        Puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Opción", "Administrador", "Cotizador de Ventas", "Encargado de Ventas" }));
        Puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuestoActionPerformed(evt);
            }
        });

        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyTyped(evt);
            }
        });

        TxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordActionPerformed(evt);
            }
        });
        TxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPasswordKeyTyped(evt);
            }
        });

        TxtNomCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomCompletoActionPerformed(evt);
            }
        });
        TxtNomCompleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomCompletoKeyTyped(evt);
            }
        });

        TxtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCorreoKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(127, 127, 127)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Puesto, 0, 246, Short.MAX_VALUE)
                                    .addComponent(BtnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(TxtNomCompleto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtUsuario)
                                    .addComponent(TxtCorreo)
                                    .addComponent(TxtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(TxtNomCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(TxtUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddUserActionPerformed


    }//GEN-LAST:event_BtnAddUserActionPerformed

    private void PuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuestoActionPerformed

    private void BtnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddUserMouseClicked

        if (!this.TxtNomCompleto.getText().isEmpty()
                || this.TxtUsuario.getText().isEmpty()
                || this.TxtPassword.getText().isEmpty()
                || this.TxtCorreo.getText().isEmpty()
                || this.Puesto.getSelectedIndex() == 0);
        {
            //Copiar en el frame de ramiro
            if (this.TxtNomCompleto.getText().length() < 8
                    || this.TxtUsuario.getText().length() < 8
                    || this.TxtCorreo.getText().length() < 8
                    || this.TxtPassword.getText().length() < 8) {
                    JOptionPane.showMessageDialog(null, "Uno o mas campos invalidos");    
            } else { //Hasta aqui
                Usuario Usuario = new Usuario();
                Usuario.setNomCompleto(TxtNomCompleto.getText());
                Usuario.setUsuario(TxtUsuario.getText());
                Usuario.setPassword(TxtPassword.getText());
                Usuario.setCorreo(TxtCorreo.getText());
                Usuario.setTipo(Integer.toString(Puesto.getSelectedIndex()));

                mBD.Agregar_Usuario(Usuario);

                TxtNomCompleto.setText("");
                TxtUsuario.setText("");
                TxtPassword.setText("");
                TxtCorreo.setText("");
                Puesto.setSelectedIndex(0);
            }
            
        }

    }//GEN-LAST:event_BtnAddUserMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Usuarios mUsuarios = new Usuarios();
        this.dispose();
        mUsuarios.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordActionPerformed

    private void TxtNomCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomCompletoActionPerformed

    private void TxtNomCompletoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomCompletoKeyTyped
        // TODO add your handling code here:

        if (this.TxtNomCompleto.getText().isEmpty()) {
            this.jLabel8.setText("");
        } else if (this.TxtNomCompleto.getText().length() == 45) {
            evt.consume();
        } else if (this.TxtNomCompleto.getText().length() < 8) {
            this.jLabel8.setText("Nombre Invalido");
        } else if (this.TxtNomCompleto.getText().length() >= 8) {
            this.jLabel8.setText("");
        }
    }//GEN-LAST:event_TxtNomCompletoKeyTyped

    private void TxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyTyped
        // TODO add your handling code here:
        if (this.TxtUsuario.getText().isEmpty()) {
            this.jLabel9.setText("");
        } else if ((this.TxtUsuario.getText().length() == 45)) {
            evt.consume();

        } else if (this.TxtUsuario.getText().length() < 8) {
            this.jLabel9.setText("Usuario Invalida");
        } else if (this.TxtUsuario.getText().length() >= 8) {
            this.jLabel9.setText("");
        }
    }//GEN-LAST:event_TxtUsuarioKeyTyped

    private void TxtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPasswordKeyTyped
        // TODO add your handling code here:
        if (this.TxtPassword.getText().isEmpty()) {
            this.jLabel10.setText("");
        } else if ((this.TxtPassword.getText().length() == 45)) {
            evt.consume();

        } else if (this.TxtPassword.getText().length() < 8) {
            this.jLabel10.setText("Contraseña Demasiado Corta");
        } else if (this.TxtPassword.getText().length() > 8) {
            this.jLabel10.setText("");
        }
    }//GEN-LAST:event_TxtPasswordKeyTyped

    private void TxtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCorreoKeyTyped
        // TODO add your handling code here:
        if (this.TxtCorreo.getText().isEmpty()) {
            this.jLabel11.setText("");
        } else if ((this.TxtCorreo.getText().length() == 45)) {
            evt.consume();

        } else if (this.TxtCorreo.getText().length() < 10) {
            this.jLabel11.setText("Correo Invalido");
        } else if (this.TxtCorreo.getText().length() > 10) {
            this.jLabel11.setText("");
        }
    }//GEN-LAST:event_TxtCorreoKeyTyped

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddUser;
    private javax.swing.JComboBox<String> Puesto;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNomCompleto;
    private javax.swing.JTextField TxtPassword;
    private javax.swing.JTextField TxtUsuario;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

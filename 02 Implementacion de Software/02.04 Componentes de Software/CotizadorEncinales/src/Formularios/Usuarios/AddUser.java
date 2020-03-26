/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Usuarios;

import BaseDeDatos.BD_1;
import Clases.Usuario;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

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

        evitarPegar(this.TxtCorreo);
        evitarPegar(this.TxtNomCompleto);
        evitarPegar(this.TxtPassword);
        evitarPegar(this.TxtUsuario);

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
        jPanel3 = new javax.swing.JPanel();
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/agregar-usuario (2).png"))); // NOI18N
        jLabel1.setText("Datos de Nuevo Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel2.setText("Nombre Completo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel3.setText("Nombre de Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 35));

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, 35));

        jLabel5.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel5.setText("Correo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel6.setText("Puesto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        BtnAddUser.setFont(new java.awt.Font("Sukhumvit Set", 0, 20)); // NOI18N
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
        jPanel1.add(BtnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 230, 60));

        Puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cotizador de Ventas", "Encargado de Ventas" }));
        Puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuestoActionPerformed(evt);
            }
        });
        jPanel1.add(Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 230, 29));

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
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 230, -1));

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
        jPanel1.add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 230, 30));

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
        jPanel1.add(TxtNomCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 230, -1));

        TxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoActionPerformed(evt);
            }
        });
        TxtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 230, 30));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 170, -1));

        jLabel9.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
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
            if (this.TxtNomCompleto.getText().length() < 6
                    || this.TxtUsuario.getText().length() < 6
                    || this.TxtCorreo.getText().length() < 6
                    || this.TxtPassword.getText().length() < 6) {
                JOptionPane.showMessageDialog(null, "Uno o mas campos invalidos");
            } else { //Hasta aqui
                if (ValidacionCorreo(TxtCorreo.getText())) {
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
                } else {
                    JOptionPane.showMessageDialog(null, "Correo invalido");
                }
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
        } else if (this.TxtNomCompleto.getText().length() < 6) {
            this.jLabel8.setText("Nombre Invalido");
        } else if (this.TxtNomCompleto.getText().length() >= 6) {
            this.jLabel8.setText("");
        }
    }//GEN-LAST:event_TxtNomCompletoKeyTyped

    private void TxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyTyped
        // TODO add your handling code here:
        if (this.TxtUsuario.getText().isEmpty()) {
            this.jLabel9.setText("");
        } else if ((this.TxtUsuario.getText().length() == 45)) {
            evt.consume();

        } else if (this.TxtUsuario.getText().length() < 6) {
            this.jLabel9.setText("Usuario Invalido");
        } else if (this.TxtUsuario.getText().length() >= 6) {
            this.jLabel9.setText("");
        }
    }//GEN-LAST:event_TxtUsuarioKeyTyped

    private void TxtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPasswordKeyTyped
        // TODO add your handling code here:
        if (this.TxtPassword.getText().isEmpty()) {
            this.jLabel10.setText("");
        } else if ((this.TxtPassword.getText().length() == 45)) {
            evt.consume();

        } else if (this.TxtPassword.getText().length() < 6) {
            this.jLabel10.setText("Contraseña Demasiado Corta");
        } else if (this.TxtPassword.getText().length() > 6) {
            this.jLabel10.setText("");
        }
    }//GEN-LAST:event_TxtPasswordKeyTyped

    private void TxtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCorreoKeyTyped
        // TODO add your handling code here:
        if (this.TxtCorreo.getText().isEmpty()) {
            this.jLabel11.setText("");
        } else if ((this.TxtCorreo.getText().length() == 45)) {
            evt.consume();

        } else if (this.TxtCorreo.getText().length() < 6) {
            this.jLabel11.setText("Correo Invalido");
        } else if (this.TxtCorreo.getText().length() > 6) {
            this.jLabel11.setText("");
        }

        if (evt.getKeyChar() == '@' && TxtCorreo.getText().contains("@")) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == ' ') {
            evt.consume();
            
        }
    }//GEN-LAST:event_TxtCorreoKeyTyped

    private void TxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreoActionPerformed

    public static void evitarPegar(JTextField campo) {

        InputMap map2 = campo.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

    }

    public boolean ValidacionCorreo(String Correo) {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(Correo);

        if (mather.find() == true) {
            return true;
        } else {
            return false;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

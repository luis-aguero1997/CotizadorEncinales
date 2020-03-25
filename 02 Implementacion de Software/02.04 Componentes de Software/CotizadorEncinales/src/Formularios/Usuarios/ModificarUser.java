/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Usuarios;

import Formularios.Usuarios.Usuarios;
import BaseDeDatos.BD_1;
import Clases.Productos;
import Clases.Usuario;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
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
public class ModificarUser extends javax.swing.JFrame {

    BD_1 mBD = new BD_1();

    /**
     * Creates new form ModificarUser
     */
    public ModificarUser() {
        initComponents();

        llenado();

        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        this.jLabel7.setText("");
        this.jLabel8.setText("");
        this.jLabel9.setText("");
        this.jLabel10.setText("");
        this.ModPuesto.setSelectedIndex(1);

        evitarPegar(this.TxtModCorreo);
        evitarPegar(this.TxtModNombre);
        evitarPegar(this.TxtModPassword);
        evitarPegar(this.TxtModUsuario);
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
        TxtModNombre = new javax.swing.JTextField();
        TxtModUsuario = new javax.swing.JTextField();
        TxtModPassword = new javax.swing.JTextField();
        TxtModCorreo = new javax.swing.JTextField();
        ModPuesto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Modificar.png"))); // NOI18N
        jLabel1.setText("Modificar Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel2.setText("Nombre Completo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel3.setText("Nombre de Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel5.setText("Correo Electronico");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel6.setText("Puesto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        TxtModNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModNombreActionPerformed(evt);
            }
        });
        TxtModNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtModNombreKeyTyped(evt);
            }
        });
        jPanel1.add(TxtModNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 200, -1));

        TxtModUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModUsuarioActionPerformed(evt);
            }
        });
        TxtModUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtModUsuarioKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtModUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(TxtModUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 200, -1));

        TxtModPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtModPasswordKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtModPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(TxtModPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 200, -1));

        TxtModCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModCorreoActionPerformed(evt);
            }
        });
        TxtModCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtModCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(TxtModCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 200, -1));

        ModPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "!!! Seleccionar Opción !!!", "Administrador", "Cotizador de Ventas", "Encargado de Ventas" }));
        jPanel1.add(ModPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 200, -1));

        jButton1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/disco-flexible.png"))); // NOI18N
        jButton1.setText("Guardar ");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/disco-flexible (1).png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/disco-flexible (1).png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 220, 50));

        jLabel7.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sukhumvit Set", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 488));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Usuarios User = new Usuarios();
        User.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        if (!this.TxtModNombre.getText().isEmpty()
                || !this.TxtModUsuario.getText().isEmpty()
                || !this.TxtModCorreo.getText().isEmpty()
                || this.ModPuesto.getSelectedIndex() != 0);
        {
            if (!this.TxtModPassword.getText().isEmpty()) {

                if (this.TxtModNombre.getText().length() < 6
                        || this.TxtModUsuario.getText().length() < 6
                        || this.TxtModCorreo.getText().length() < 6
                        || this.TxtModPassword.getText().length() < 6) {

                    JOptionPane.showMessageDialog(null, "Entrada de Datos invalida");
                } else {
                    Usuario Usuario = new Usuario();

                    Usuario.setNomCompleto(TxtModNombre.getText());
                    Usuario.setUsuario(TxtModUsuario.getText());
                    Usuario.setPassword(TxtModPassword.getText());
                    Usuario.setCorreo(TxtModCorreo.getText());
                    Usuario.setTipo(Integer.toString(ModPuesto.getSelectedIndex()));
                    Usuario.setId_Usuario(Usuarios.Seleccion);

                    mBD.Modificar(Usuario);

                    TxtModNombre.setText("");
                    TxtModUsuario.setText("");
                    TxtModPassword.setText("");
                    TxtModCorreo.setText("");
                    ModPuesto.setSelectedIndex(0);

                    this.dispose();
                    Usuarios User = new Usuarios();
                    User.setVisible(true);
                }
            } else {

                if (this.TxtModNombre.getText().length() < 6
                        || this.TxtModUsuario.getText().length() < 6
                        || this.TxtModCorreo.getText().length() < 6) {

                    JOptionPane.showMessageDialog(null, "Entrada de Datos invalida");
                } else {
                    if (this.ValidacionCorreo(TxtModCorreo.getText())) {
                        Usuario Usuario = new Usuario();
                        Usuario.setNomCompleto(TxtModNombre.getText());
                        Usuario.setUsuario(TxtModUsuario.getText());
                        Usuario.setCorreo(TxtModCorreo.getText());
                        Usuario.setTipo(Integer.toString(ModPuesto.getSelectedIndex()));
                        Usuario.setId_Usuario(Usuarios.Seleccion);

                        mBD.Modificar2(Usuario);

                        TxtModNombre.setText("");
                        TxtModUsuario.setText("");
                        TxtModPassword.setText("");
                        TxtModCorreo.setText("");
                        ModPuesto.setSelectedIndex(0);
                        Usuarios User = new Usuarios();
                        User.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Correo Invalido");
                    }
                }
            }

        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void TxtModCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtModCorreoKeyTyped
        // TODO add your handling code here:
        if (this.TxtModCorreo.getText().isEmpty()) {
            this.jLabel8.setText("");
        } else if ((this.TxtModCorreo.getText().length() == 45)) {
            evt.consume();

        } else if (this.TxtModCorreo.getText().length() < 6) {
            this.jLabel8.setText("Correo Invalido");
        } else if (this.TxtModCorreo.getText().length() > 6) {
            this.jLabel8.setText("");
        }
        if (evt.getKeyChar() == '@' && TxtModCorreo.getText().contains("@")) {
            evt.consume();
        }

    }//GEN-LAST:event_TxtModCorreoKeyTyped

    private void TxtModCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModCorreoActionPerformed

    private void TxtModPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtModPasswordKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtModPasswordKeyPressed

    private void TxtModPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtModPasswordKeyTyped
        // TODO add your handling code here:
        if (this.TxtModPassword.getText().isEmpty()) {
            this.jLabel7.setText("");
        } else if ((this.TxtModPassword.getText().length() == 45)) {
            evt.consume();

        } else if (this.TxtModPassword.getText().length() < 6) {
            this.jLabel7.setText("Contraseña Demasiado Corta");
        } else if (this.TxtModPassword.getText().length() >= 6) {
            this.jLabel7.setText("");
        }

    }//GEN-LAST:event_TxtModPasswordKeyTyped

    private void TxtModUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtModUsuarioKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtModUsuarioKeyPressed

    private void TxtModUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtModUsuarioKeyTyped
        // TODO add your handling code here:
        if (this.TxtModUsuario.getText().isEmpty()) {
            this.jLabel9.setText("");
        } else if (this.TxtModUsuario.getText().length() == 45) {
            evt.consume();
        } else if (this.TxtModUsuario.getText().length() < 6) {
            this.jLabel9.setText("Invalido, Demasiado corto");
        } else if (this.TxtModUsuario.getText().length() > 6) {
            this.jLabel9.setText("");
        }
    }//GEN-LAST:event_TxtModUsuarioKeyTyped

    private void TxtModUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModUsuarioActionPerformed

    private void TxtModNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtModNombreKeyTyped
        // TODO add your handling code here:
        if (this.TxtModNombre.getText().isEmpty()) {
            this.jLabel10.setText("");
        } else if (this.TxtModNombre.getText().length() == 45) {
            evt.consume();
        } else if (this.TxtModNombre.getText().length() < 6) {
            this.jLabel10.setText("Invalido, Demasiado corto");
        } else if (this.TxtModNombre.getText().length() >= 6) {
            this.jLabel10.setText("");
        }
    }//GEN-LAST:event_TxtModNombreKeyTyped

    private void TxtModNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModNombreActionPerformed

    public static void evitarPegar(JTextField campo) {

        InputMap map2 = campo.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

    }

    public void llenado() {
        mBD = new BD_1();

        Usuario vo = new Usuario();
        ArrayList<Usuario> list = mBD.Listar_UsuarioFiltro(Usuarios.Id2);

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {

                vo = list.get(i);

                this.TxtModNombre.setText(vo.getNomCompleto());
                this.TxtModUsuario.setText(vo.getUsuario());
                this.TxtModCorreo.setText(vo.getCorreo());

                switch (vo.getTipo()) {
                    case "1":
                        this.ModPuesto.setSelectedIndex(1);
                        break;

                    case "2":
                        this.ModPuesto.setSelectedIndex(2);
                        break;
                    case "3":
                        this.ModPuesto.setSelectedIndex(3);
                        break;
                }

            }
        }
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
            java.util.logging.Logger.getLogger(ModificarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ModPuesto;
    private javax.swing.JTextField TxtModCorreo;
    private javax.swing.JTextField TxtModNombre;
    private javax.swing.JTextField TxtModPassword;
    private javax.swing.JTextField TxtModUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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

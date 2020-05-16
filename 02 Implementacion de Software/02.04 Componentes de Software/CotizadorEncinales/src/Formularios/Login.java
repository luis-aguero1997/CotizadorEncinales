/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import BaseDeDatos.BD_1;
import Clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardogarciadelgado
 */
public class Login extends javax.swing.JFrame {

    BD_1 mBD = new BD_1();
    Usuario mUsuario;
    public static String Tipousuario;
    public static String NombreUsuario;

    public Login() {
        initComponents();
        //this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        this.setSize(852, 640);
        //rsscalelabel.RSScaleLabel.setScaleLabel(a1, "src/Icons/Login-Recuperado.jpg");
        //rsscalelabel.RSScaleLabel.setScaleLabel(a2, "/Users/manuelvaquera/Downloads/Logo Nuevo.png");
        Tipousuario = "";
        mUsuario = new Usuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jSpinner1 = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JLabel();
        Lbl_Psw = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Lbl_Usuario = new javax.swing.JLabel();
        Lbl_Usuario1 = new javax.swing.JLabel();
        Txt_Psw = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("AppleGothic", 0, 24)); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        Lbl_Psw.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        Lbl_Psw.setForeground(new java.awt.Color(0, 102, 204));
        Lbl_Psw.setText("Contraseña");
        getContentPane().add(Lbl_Psw);
        Lbl_Psw.setBounds(280, 440, 110, 29);

        Txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_Nombre);
        Txt_Nombre.setBounds(390, 400, 170, 30);

        Lbl_Usuario.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        Lbl_Usuario.setForeground(new java.awt.Color(0, 102, 204));
        Lbl_Usuario.setText("Cotizador de Ventas");
        getContentPane().add(Lbl_Usuario);
        Lbl_Usuario.setBounds(320, 350, 210, 39);

        Lbl_Usuario1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        Lbl_Usuario1.setForeground(new java.awt.Color(0, 102, 204));
        Lbl_Usuario1.setText("Usuario");
        getContentPane().add(Lbl_Usuario1);
        Lbl_Usuario1.setBounds(280, 400, 80, 29);

        Txt_Psw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PswActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_Psw);
        Txt_Psw.setBounds(390, 440, 170, 30);

        jButton1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login.png"))); // NOI18N
        jButton1.setText("Entrar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login (1).png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login (1).png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 480, 190, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(820, 0, 32, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Login-Recuperado.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        if (Txt_Nombre.getText().isEmpty() || Txt_Psw.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre de usuario y contraseña");
        } else {
            if (mBD.Conectar()) {
                String Nombre, Psw, Tipo;

                Nombre = Txt_Nombre.getText();
                Psw = Txt_Psw.getText();

                ArrayList mListaUsuario = mBD.ConsultaUsuario(Nombre, Psw);
                if (mListaUsuario.size() != 0) {
                    String[] datos = null;

                    for (Object mListaUsuario2 : mListaUsuario) {
                        datos = new String[6];
                        mUsuario = (Usuario) mListaUsuario2;

                        datos[0] = String.valueOf(mUsuario.getId_Usuario());
                        datos[1] = mUsuario.getUsuario();
                        datos[2] = mUsuario.getNomCompleto();
                        datos[3] = mUsuario.getPassword();
                        datos[4] = mUsuario.getCorreo();
                        datos[5] = mUsuario.getTipo();
                    }

                    switch (datos[5]) {
                        case "1":
                            Tipousuario = datos[5];
                            NombreUsuario = datos[1];
                            Admin mAdmin = new Admin();
                            mAdmin.setVisible(true);
                            this.dispose();
                            break;
                        case "2":
                            Tipousuario = datos[5];
                            NombreUsuario = datos[1];
                            Cotizador mCotizador = new Cotizador();
                            mCotizador.setVisible(true);
                            this.dispose();
                            break;
                        case "3":
                            Tipousuario = datos[5];
                            NombreUsuario = datos[1];
                            Ventas mVentas = new Ventas();
                            mVentas.setVisible(true);
                            this.dispose();
                            break;
                        case "4":
                            Tipousuario = datos[5];
                            NombreUsuario = datos[1];
                            Compras mCompras = new Compras();
                            mCompras.setVisible(true);
                            this.dispose();
                            break;
                        case "5":
                            Tipousuario = datos[5];
                            NombreUsuario = datos[1];
                            Contabilidad mContabilidad = new Contabilidad();
                            mContabilidad.setVisible(true);
                            this.dispose();
                            break;
                    }
                    
                    String Descripcion = "El usuario " + Login.NombreUsuario + " entró al sistema";
                    mBD.AgregarRegistro(Descripcion);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña inválidos","AVISO", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            mBD.Desconectar();
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void Txt_PswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_PswActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Psw;
    private javax.swing.JLabel Lbl_Usuario;
    private javax.swing.JLabel Lbl_Usuario1;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JPasswordField Txt_Psw;
    private javax.swing.JLabel a1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}

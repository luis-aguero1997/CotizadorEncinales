/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Usuarios;

import BaseDeDatos.BD_1;
import Clases.*;
import Clases.imgTabla;
import Formularios.Admin;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manuelvaquera
 */
public class Usuarios extends javax.swing.JFrame {

    public static int Seleccion;
    int SeleccionY;
    int IdUsuarios;
    public static int Id2;
    BD_1 mBD = new BD_1();

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        this.visualizar_Productos(TableUsuarios);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        BackMenuUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TableUsuarios.setBackground(new java.awt.Color(131, 178, 225));
        TableUsuarios.setFont(new java.awt.Font("Sukhumvit Set", 0, 12)); // NOI18N
        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdUsuario", "Nombre Completo", "Nombre de Usuario", "Contraseña", "Correo", "Puesto", "Eliminar", "Modificar"
            }
        ));
        TableUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableUsuarios);

        BackMenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        BackMenuUsuario.setBorderPainted(false);
        BackMenuUsuario.setContentAreaFilled(false);
        BackMenuUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BackMenuUsuario.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BackMenuUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BackMenuUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMenuUsuarioMouseClicked(evt);
            }
        });
        BackMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenuUsuarioActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/agregar-usuario (8).png"))); // NOI18N
        jButton1.setText("   Registrar Nuevo Usuario");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
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

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plan-de-estudios (1).png"))); // NOI18N
        jLabel1.setText("Usuarios");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackMenuUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(351, 351, 351))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(BackMenuUsuario))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddUser mAddUser = new AddUser();
        this.dispose();
        mAddUser.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AddUser mAddUser = new AddUser();
        this.dispose();
        mAddUser.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void TableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableUsuariosMouseClicked

        Icon icono = null;
        int filaseleccionada = 0;
        filaseleccionada = TableUsuarios.getSelectedRow();
        SeleccionY = TableUsuarios.getSelectedColumn();
        Seleccion = (int) TableUsuarios.getValueAt(filaseleccionada, 0);

        switch (SeleccionY) {
            case 6:
                if (JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Usuario?") == 0) {
                    mBD.Eliminar(Seleccion);
                    Borrar();
                    this.visualizar_Productos(TableUsuarios);
                }

                break;
            case 7:
                if (JOptionPane.showConfirmDialog(null, "¿Desea Modificar la informacionn el Usuario?") == 0) {
                    Id2 = Seleccion;
                    ModificarUser ModUser = new ModificarUser();
                    this.dispose();
                    ModUser.setVisible(true);
                }
                break;
            default:
        }


    }//GEN-LAST:event_TableUsuariosMouseClicked

    private void BackMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenuUsuarioActionPerformed

        Admin mAdmin = new Admin();
        this.dispose();
        mAdmin.setVisible(true);
    }//GEN-LAST:event_BackMenuUsuarioActionPerformed

    private void BackMenuUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMenuUsuarioMouseClicked

        this.dispose();

    }//GEN-LAST:event_BackMenuUsuarioMouseClicked

    public void visualizar_Productos(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Id");
        dt.addColumn("Nombre Completo");
        dt.addColumn("Nombre de Usuario");
        dt.addColumn("Contraseña");
        dt.addColumn("Correo");
        dt.addColumn("Puesto");
        dt.addColumn("Eliminar");
        dt.addColumn("Modificar");

        BD_1 mBD = new BD_1();
        Usuario vo = new Usuario();
        ArrayList<Usuario> list = mBD.Listar_Usuario();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[9];

                vo = list.get(i);
                fila[0] = vo.getId_Usuario();
                fila[1] = vo.getNomCompleto();
                fila[2] = vo.getUsuario();
                fila[3] = vo.getPassword();
                fila[4] = vo.getCorreo();
                if (vo.getTipo().equals("1")) {
                    fila[5] = "Administrador";
                } else if (vo.getTipo().equals("2")) {
                    fila[5] = "Cotizador de Ventas";
                } else if (vo.getTipo().equals("3")) {
                    fila[5] = "Encargado de Ventas";
                }

                ImageIcon icono = new ImageIcon(get_Image("trash.jpg"));
                if (get_Image("trash.jpg") != null) {
                    icono = new ImageIcon(get_Image("trash.jpg").getScaledInstance(20, 20, 20));
                    fila[6] = new JButton(icono);
                }

                if (icono == null) {
                    fila[6] = new JButton("Eliminar");
                }

                ImageIcon icono2 = new ImageIcon(get_Image("file.jpg"));
                if (get_Image("file.jpg") != null) {
                    icono2 = new ImageIcon(get_Image("file.jpg").getScaledInstance(20, 20, 20));
                    fila[7] = new JButton(icono2);
                }

                if (icono2 == null) {
                    fila[7] = new JButton("Eliminar");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }

        this.TableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(30);//Id
        this.TableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(200);//Nombre Completo
        this.TableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(130);//Nombre de Usuario
        this.TableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(100);//Password
        this.TableUsuarios.getColumnModel().getColumn(4).setPreferredWidth(170);//Correo
        this.TableUsuarios.getColumnModel().getColumn(5).setPreferredWidth(120);//Puesto
        this.TableUsuarios.getColumnModel().getColumn(6).setPreferredWidth(70);//Del
        this.TableUsuarios.getColumnModel().getColumn(7).setPreferredWidth(70);//Mod

    }

    void Borrar() {
        DefaultTableModel LimpiadoTabla = (DefaultTableModel) TableUsuarios.getModel();
        //Borramosla tabla...
        int a = TableUsuarios.getRowCount() - 1;

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackMenuUsuario;
    private javax.swing.JTable TableUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

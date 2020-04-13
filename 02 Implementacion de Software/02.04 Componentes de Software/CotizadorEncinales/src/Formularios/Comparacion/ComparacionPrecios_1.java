/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Comparacion;

import BaseDeDatos.*;
import Clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardogarciadelgado
 */
public class ComparacionPrecios_1 extends javax.swing.JFrame {

    /**
     * Creates new form ComparacionPrecios_1
     */
    public static String NombreEmpresa;
    public static String NombreProducto;
    public static String Descripcion;
    public static double PrecioUnitario;
    public static String ClaveProductoComparado;
    public static int IdCompetencia;
    int Opcion;

    BD_1 mBD;
    ComparacionPrecios mCP;
    Competencia mC;

    public ComparacionPrecios_1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");

        mBD = null;
        mCP = null;
        mC = null;

        LlenarCombo();

        TXT_NombreEmpresa1.setText(NombreEmpresa);
        TXT_NombreProducto1.setText(NombreProducto);
        TXT_Descripcion1.setText(Descripcion);
        TXT_PrecioUnitario1.setText(String.valueOf(PrecioUnitario));
        for (int i = 0; i <= CB_Producto.getItemListeners().length; i++) {
            if (CB_Producto.getItemAt(i).substring(0, 6).equals(ClaveProductoComparado)) {
                CB_Producto.setSelectedIndex(i);
            }
        }

        Opcion = 0;

        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
        jLabel6.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_ConsultarCompetencia = new javax.swing.JPanel();
        TXT_NombreEmpresa1 = new javax.swing.JTextField();
        TXT_Descripcion1 = new javax.swing.JTextField();
        TXT_PrecioUnitario1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CB_Producto = new javax.swing.JComboBox<>();
        BTN_Modificar = new javax.swing.JButton();
        BTN_Eliminar = new javax.swing.JButton();
        BTN_Atras = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_NombreProducto1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JP_ConsultarCompetencia.setBackground(new java.awt.Color(255, 255, 255));
        JP_ConsultarCompetencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_NombreEmpresa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_NombreEmpresa1KeyTyped(evt);
            }
        });
        JP_ConsultarCompetencia.add(TXT_NombreEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 200, -1));

        TXT_Descripcion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_Descripcion1KeyTyped(evt);
            }
        });
        JP_ConsultarCompetencia.add(TXT_Descripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 200, -1));

        TXT_PrecioUnitario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PrecioUnitario1KeyTyped(evt);
            }
        });
        JP_ConsultarCompetencia.add(TXT_PrecioUnitario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 200, -1));

        jLabel7.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel7.setText("Nombre de la empresa");
        JP_ConsultarCompetencia.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel1.setText("Comparado con");
        JP_ConsultarCompetencia.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        JP_ConsultarCompetencia.add(CB_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 200, -1));

        BTN_Modificar.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BTN_Modificar.setText("Modificar");
        BTN_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModificarActionPerformed(evt);
            }
        });
        JP_ConsultarCompetencia.add(BTN_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 160, 50));

        BTN_Eliminar.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BTN_Eliminar.setText("Eliminar");
        BTN_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EliminarActionPerformed(evt);
            }
        });
        JP_ConsultarCompetencia.add(BTN_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 160, 50));

        BTN_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        BTN_Atras.setBorderPainted(false);
        BTN_Atras.setContentAreaFilled(false);
        BTN_Atras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BTN_Atras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BTN_Atras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });
        JP_ConsultarCompetencia.add(BTN_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N
        JP_ConsultarCompetencia.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("jLabel3");
        JP_ConsultarCompetencia.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("jLabel3");
        JP_ConsultarCompetencia.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("jLabel3");
        JP_ConsultarCompetencia.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("jLabel3");
        JP_ConsultarCompetencia.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel8.setText("Producto");
        JP_ConsultarCompetencia.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 20)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar (2).png"))); // NOI18N
        jLabel2.setText(" Producto Competencia");
        JP_ConsultarCompetencia.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        TXT_NombreProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NombreProducto1ActionPerformed(evt);
            }
        });
        TXT_NombreProducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_NombreProducto1KeyTyped(evt);
            }
        });
        JP_ConsultarCompetencia.add(TXT_NombreProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 200, -1));

        jLabel10.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel10.setText("Precio Unitario");
        JP_ConsultarCompetencia.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel9.setText("Descripción");
        JP_ConsultarCompetencia.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_ConsultarCompetencia, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_ConsultarCompetencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModificarActionPerformed
        // TODO add your handling code here:
        ActualizarCompetencia();
    }//GEN-LAST:event_BTN_ModificarActionPerformed

    private void BTN_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EliminarActionPerformed
        // TODO add your handling code here:
        Opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este precio? \n (los precios eliminados no se pueden recuperar)");

        if (JOptionPane.OK_OPTION == Opcion) {
            EliminarCompetencia();
        } else {

        }
    }//GEN-LAST:event_BTN_EliminarActionPerformed

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        // TODO add your handling code here:
        mCP = new ComparacionPrecios();
        mCP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void TXT_NombreEmpresa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_NombreEmpresa1KeyTyped
        // TODO add your handling code here:
        if (this.TXT_NombreEmpresa1.getText().isEmpty()) {
            this.jLabel3.setText("");
        } else if (this.TXT_NombreEmpresa1.getText().length() == 45) {
            evt.consume();
        } else if (this.TXT_NombreEmpresa1.getText().length() < 5) {
            this.jLabel3.setText("Nombre Invalido");
        } else if (this.TXT_NombreEmpresa1.getText().length() >= 5) {
            this.jLabel3.setText("");
        }
    }//GEN-LAST:event_TXT_NombreEmpresa1KeyTyped

    private void TXT_PrecioUnitario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PrecioUnitario1KeyTyped
        // TODO add your handling code here:
        
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (this.TXT_PrecioUnitario1.getText().isEmpty()) {
            this.jLabel6.setText("");
        } else if (this.TXT_PrecioUnitario1.getText().length() == 10) {
            evt.consume();
        } else if (this.TXT_PrecioUnitario1.getText().length() < 2) {
            this.jLabel6.setText("Precio Invalido");
        } else if (this.TXT_PrecioUnitario1.getText().length() >= 2) {
            this.jLabel6.setText("");
        }

        if (evt.getKeyChar() == '.' && TXT_PrecioUnitario1.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_PrecioUnitario1KeyTyped

    private void TXT_NombreProducto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_NombreProducto1KeyTyped
        // TODO add your handling code here:
        if (this.TXT_NombreProducto1.getText().isEmpty()) {
            this.jLabel4.setText("");
        } else if (this.TXT_NombreProducto1.getText().length() == 45) {
            evt.consume();
        } else if (this.TXT_NombreProducto1.getText().length() < 5) {
            this.jLabel4.setText("Nombre Invalido");
        } else if (this.TXT_NombreProducto1.getText().length() >= 5) {
            this.jLabel4.setText("");
        }
    }//GEN-LAST:event_TXT_NombreProducto1KeyTyped

    private void TXT_Descripcion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_Descripcion1KeyTyped
        // TODO add your handling code here:
        if (this.TXT_Descripcion1.getText().isEmpty()) {
            this.jLabel5.setText("");
        } else if (this.TXT_Descripcion1.getText().length() == 45) {
            evt.consume();
        } else if (this.TXT_Descripcion1.getText().length() < 5) {
            this.jLabel5.setText("Descripcion Invalida");
        } else if (this.TXT_Descripcion1.getText().length() >= 5) {
            this.jLabel5.setText("");
        }
    }//GEN-LAST:event_TXT_Descripcion1KeyTyped

    private void TXT_NombreProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NombreProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NombreProducto1ActionPerformed

    public void LlenarCombo() {
        CB_Producto.addItem("Ninguno");
        mBD = new BD_1();
        ArrayList mArrayList = new ArrayList();
        mArrayList = mBD.ConsultaNombresProducto();
        //LDBLPrueba.setText(mArrayList.get(0).toString());
        if (mArrayList != null) {

            for (int i = 0; i < mArrayList.size(); i++) {
                CB_Producto.addItem(mArrayList.get(i).toString());
            }

        } else {
            JOptionPane.showMessageDialog(null, "No tiene productos en el sistema");
        }
    }

    public void ActualizarCompetencia() {
        mC = new Competencia();
        mBD = new BD_1();

        if (("".equals(TXT_NombreEmpresa1.getText())) || ("".equals(TXT_NombreProducto1.getText()))
                || ("".equals(TXT_Descripcion1.getText())) || ("".equals(TXT_PrecioUnitario1.getText()))
                || ("Ninguno".equals(CB_Producto.getSelectedItem()))) {
            JOptionPane.showMessageDialog(null, "Llena bien los campos");
        } else {
            String Cadena = (String) CB_Producto.getSelectedItem();
            String[] CadenaPartes = Cadena.split("_");

            mC.setEmpresa(TXT_NombreEmpresa1.getText());
            mC.setNombreProducto(TXT_NombreProducto1.getText());
            mC.setDescripcion(TXT_Descripcion1.getText());
            mC.setPrecioUnitario(Double.parseDouble(TXT_PrecioUnitario1.getText()));
            mC.setProducto_idProducto(mBD.ConsultarIdProductoClave(CadenaPartes[0]));

            if (mBD.ModificarProductoCompetencia(mC, IdCompetencia)) {

                mBD.Desconectar();
                JOptionPane.showMessageDialog(null, "Producto Modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Existe una falla en la Base de Datos");
            }
        }
    }

    public void EliminarCompetencia() {
        mBD = new BD_1();
        if (mBD.EliminarCompetencia(IdCompetencia)) {
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
            mCP = new ComparacionPrecios();
            mCP.setVisible(true);
            this.setVisible(false);
        } else {

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
            java.util.logging.Logger.getLogger(ComparacionPrecios_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComparacionPrecios_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComparacionPrecios_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComparacionPrecios_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComparacionPrecios_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_Modificar;
    private javax.swing.JComboBox<String> CB_Producto;
    private javax.swing.JPanel JP_ConsultarCompetencia;
    private javax.swing.JTextField TXT_Descripcion1;
    private javax.swing.JTextField TXT_NombreEmpresa1;
    private javax.swing.JTextField TXT_NombreProducto1;
    private javax.swing.JTextField TXT_PrecioUnitario1;
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
    // End of variables declaration//GEN-END:variables
}

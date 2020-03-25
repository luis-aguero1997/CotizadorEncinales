/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios.Cotizacion;

import BaseDeDatos.*;
import Clases.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardogarciadelgado
 */
public class ConsumoElectrico_1 extends javax.swing.JFrame {

    ConsumoElectrico mCE;
    ClaseConsumoElectrico mCCE;
    BD_1 mBD;
    DecimalFormat mDF;
    
    public static boolean Bandera;    
    public static int idConsumoElectrico;
    public static String NombreEquipo;
    public static double ConsumoKwEq;
    public static int NumeroEquipos;
    public static double HorasConsumo;
    int Opcion;
    
    /** Creates new form ConsumoElectrico_1 */
    public ConsumoElectrico_1() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        mCE = null;
        mCCE = null;
        mBD = null;
        mDF = new DecimalFormat("#.#####");
        
        if (!Bandera)
        {
            BTN_Modificar.setEnabled(false);
            BTN_Eliminar.setEnabled(false);
            BTN_Agregar.setEnabled(true);
        }
        else
        {
            BTN_Modificar.setEnabled(true);
            BTN_Eliminar.setEnabled(true);
            BTN_Agregar.setEnabled(false);
            
            TXT_NombreEquipo.setText(NombreEquipo);
            TXT_ConsumoKwEq.setText(String.valueOf(ConsumoKwEq));
            CB_NumeroEquipos.setSelectedIndex(NumeroEquipos-1);
            TXT_HorasConsumo.setText(String.valueOf(HorasConsumo));
        }
        
        Opcion = 0;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        BTN_Atras2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TXT_ConsumoKwEq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXT_NombreEquipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CB_NumeroEquipos = new javax.swing.JComboBox<>();
        BTN_Modificar = new javax.swing.JButton();
        BTN_Agregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TXT_HorasConsumo = new javax.swing.JTextField();
        BTN_Eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BTN_Atras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        BTN_Atras2.setBorderPainted(false);
        BTN_Atras2.setContentAreaFilled(false);
        BTN_Atras2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (3).png"))); // NOI18N
        BTN_Atras2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (3).png"))); // NOI18N
        BTN_Atras2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (3).png"))); // NOI18N
        BTN_Atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Atras2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del equipo");

        TXT_ConsumoKwEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_ConsumoKwEqActionPerformed(evt);
            }
        });
        TXT_ConsumoKwEq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_ConsumoKwEqKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel2.setText("Consumo KW/Equipo");

        TXT_NombreEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_NombreEquipoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel5.setText("Número de equipos");

        CB_NumeroEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        CB_NumeroEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_NumeroEquiposActionPerformed(evt);
            }
        });

        BTN_Modificar.setText("Modificar");
        BTN_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModificarActionPerformed(evt);
            }
        });

        BTN_Agregar.setText("Agregar");
        BTN_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgregarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel6.setText("Horas de consumo");

        TXT_HorasConsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_HorasConsumoKeyTyped(evt);
            }
        });

        BTN_Eliminar.setText("Eliminar");
        BTN_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EliminarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/gestion-energetica.png"))); // NOI18N
        jLabel4.setText("Equipo Eléctrico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TXT_NombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(110, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_HorasConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_NumeroEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_ConsumoKwEq, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_Atras2)
                .addGap(172, 172, 172)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(BTN_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(BTN_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Atras2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TXT_ConsumoKwEq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TXT_NombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CB_NumeroEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TXT_HorasConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 187, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_Atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Atras2ActionPerformed
        // TODO add your handling code here:
        mCE = new ConsumoElectrico();
        mCE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_Atras2ActionPerformed

    private void BTN_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModificarActionPerformed
        // TODO add your handling code here:
        ActualizarConsumoElectrico();
        mCE = new ConsumoElectrico();
        mCE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_ModificarActionPerformed

    private void BTN_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarActionPerformed
        NuevosConsumos();
        mCE = new ConsumoElectrico();
        mCE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_AgregarActionPerformed

    private void BTN_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EliminarActionPerformed
        // TODO add your handling code here:
        Opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este precio de consumo eléctrico? \n (los precios eliminados no se pueden recuperar)");
        
        if (JOptionPane.OK_OPTION == Opcion)
        {
            EliminarPreciosConsumo();
        }
        else
        {
            
        }
    }//GEN-LAST:event_BTN_EliminarActionPerformed

    private void CB_NumeroEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_NumeroEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_NumeroEquiposActionPerformed

    private void TXT_NombreEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_NombreEquipoKeyTyped
            
     
    }//GEN-LAST:event_TXT_NombreEquipoKeyTyped

    private void TXT_ConsumoKwEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_ConsumoKwEqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_ConsumoKwEqActionPerformed

    private void TXT_ConsumoKwEqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_ConsumoKwEqKeyTyped
                
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TXT_ConsumoKwEq.getText().length() == 10) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '.' && TXT_ConsumoKwEq.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_ConsumoKwEqKeyTyped

    private void TXT_HorasConsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_HorasConsumoKeyTyped
         
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TXT_HorasConsumo.getText().length() == 10) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '.' && TXT_HorasConsumo.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_HorasConsumoKeyTyped

    public void NuevosConsumos()
    {
        mCCE = new ClaseConsumoElectrico();
        mBD = new BD_1();
        
        mCCE.setNombreEquipos(TXT_NombreEquipo.getText());
        mCCE.setConsumoKW_Eq(Double.parseDouble(TXT_ConsumoKwEq.getText()));
        mCCE.setNumeroEquipo(Integer.parseInt(CB_NumeroEquipos.getSelectedItem().toString()));
        mCCE.setHorasEquipo(Double.parseDouble(TXT_HorasConsumo.getText()));
        mCCE.setKW_Hora((mCCE.getHorasEquipo() * mCCE.getConsumoKW_Eq()) / 1000);
        mCCE.setWatts_Dia(mCCE.getHorasEquipo() * mCCE.getConsumoKW_Eq());
        mCCE.setKW_Dia(mCCE.getWatts_Dia() / 1000);
        mCCE.setDiasPorMes(60);
        mCCE.setKW_Mes(mCCE.getKW_Dia() * mCCE.getDiasPorMes());
        mCCE.setProducto_idProducto(mBD.ConsultarIdProductoClave(MenuCotizacion.Clave));
        
        if (mBD.AgregarConsumoElectrico(mCCE))
        {
            JOptionPane.showMessageDialog(null, "Consumo añadido");
            this.setVisible(false);
        }
    }
    
    public void ActualizarConsumoElectrico()
    {
        mCCE = new ClaseConsumoElectrico();
        mBD = new BD_1();
        
        mCCE.setNombreEquipos(TXT_NombreEquipo.getText());
        mCCE.setConsumoKW_Eq(Double.parseDouble(TXT_ConsumoKwEq.getText()));
        mCCE.setNumeroEquipo(Integer.parseInt(CB_NumeroEquipos.getSelectedItem().toString()));
        mCCE.setHorasEquipo(Double.parseDouble(TXT_HorasConsumo.getText()));
        mCCE.setKW_Hora((mCCE.getHorasEquipo() * mCCE.getConsumoKW_Eq()) / 1000);
        mCCE.setWatts_Dia(mCCE.getHorasEquipo() * mCCE.getConsumoKW_Eq());
        mCCE.setKW_Dia(mCCE.getWatts_Dia() / 1000);
        mCCE.setDiasPorMes(60);
        mCCE.setKW_Mes(mCCE.getKW_Dia() * mCCE.getDiasPorMes());
        mCCE.setProducto_idProducto(mBD.ConsultarIdProductoClave(MenuCotizacion.Clave));
        
        //JOptionPane.showMessageDialog(null, mCCE.getKW_Hora());
        if (mBD.ActualizarConsumosElectricos(mCCE, idConsumoElectrico))
        {
            JOptionPane.showMessageDialog(null, "Producto modificado");          
            this.setVisible(false);
        }
    }
    
    public void EliminarPreciosConsumo()
    {
        mBD = new BD_1();
        if (mBD.EliminarConsumoElectrico(idConsumoElectrico))
        {
            JOptionPane.showMessageDialog(null, "Consumo Eliminado");
            mCE = new ConsumoElectrico();
            mCE.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            
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
            java.util.logging.Logger.getLogger(ConsumoElectrico_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsumoElectrico_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsumoElectrico_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsumoElectrico_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsumoElectrico_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Agregar;
    private javax.swing.JButton BTN_Atras2;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_Modificar;
    private javax.swing.JComboBox<String> CB_NumeroEquipos;
    private javax.swing.JTextField TXT_ConsumoKwEq;
    private javax.swing.JTextField TXT_HorasConsumo;
    private javax.swing.JTextField TXT_NombreEquipo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}

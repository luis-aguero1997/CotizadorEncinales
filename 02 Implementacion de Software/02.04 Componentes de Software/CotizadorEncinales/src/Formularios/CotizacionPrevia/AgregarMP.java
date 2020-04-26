/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.CotizacionPrevia;

import BaseDeDatos.*;
import Clases.*;
import Formularios.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardogarciadelgado
 */
public class AgregarMP extends javax.swing.JFrame {

    /**
     * Creates new form AgregarMP
     */
    public static boolean Bandera;
    
    public static String Clave;
    public static String Descripcion;
    public static double PrecioCorte;
    public static double PrecioDobles;
    public static double PrecioRoscado;
    public static double PrecioSoldadura;
    public static double PrecioUnitario;

    BD_1 mBD;
    MateriaCotizable mMC;
    
    int Aleatorio;
    int Opcion;
    Boolean Restriccion;
    
    public AgregarMP() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        mBD = null;
        mMC = null;
        
        Aleatorio = 0;
        Opcion = 0;
        
        if ("1".equals(Login.Tipousuario))
        {
            Restriccion = true;
        }
        else
        {
            if ("2".equals(Login.Tipousuario))
            {
                Restriccion = true;
            }
            else
            {
                Restriccion = false;
            }
        }
        
        if (Restriccion == true)
        {
            if (Bandera == true)
            {
                BTN_Modificar.setEnabled(false);
                BTN_Eliminar.setEnabled(false);
                BTN_Guardar.setEnabled(true);
            }
            else
            {
                BTN_Modificar.setEnabled(true);
                BTN_Eliminar.setEnabled(true);
                BTN_Guardar.setEnabled(false);

                TXT_Descripcion.setText(Descripcion);
                TXT_PrecioCorte.setText(String.valueOf(PrecioCorte));
                TXT_PrecioDobles.setText(String.valueOf(PrecioDobles));
                TXT_PrecioRoscado.setText(String.valueOf(PrecioRoscado));
                TXT_PrecioSoldadura.setText(String.valueOf(PrecioSoldadura));
                TXT_PrecioUnitario.setText(String.valueOf(PrecioUnitario));
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Usuario no autorizado para modificar precios");
            BTN_Modificar.setEnabled(false);
            BTN_Eliminar.setEnabled(false);
            BTN_Guardar.setEnabled(false);
        }
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
        BTN_Atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TXT_Descripcion = new javax.swing.JTextField();
        TXT_PrecioDobles = new javax.swing.JTextField();
        TXT_PrecioCorte = new javax.swing.JTextField();
        TXT_PrecioSoldadura = new javax.swing.JTextField();
        TXT_PrecioRoscado = new javax.swing.JTextField();
        TXT_PrecioUnitario = new javax.swing.JTextField();
        BTN_Guardar = new javax.swing.JButton();
        BTN_Modificar = new javax.swing.JButton();
        BTN_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel2.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel3.setText("Precio de Corte:");

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel4.setText("Precio de Dobles:");

        jLabel5.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel5.setText("Precio de Roscado:");

        jLabel6.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel6.setText("Precio de Soldadura:");

        jLabel7.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel7.setText("Precio Unitario:");

        TXT_Descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_DescripcionKeyTyped(evt);
            }
        });

        TXT_PrecioDobles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PrecioDoblesKeyTyped(evt);
            }
        });

        TXT_PrecioCorte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PrecioCorteKeyTyped(evt);
            }
        });

        TXT_PrecioSoldadura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PrecioSoldaduraKeyTyped(evt);
            }
        });

        TXT_PrecioRoscado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PrecioRoscadoKeyTyped(evt);
            }
        });

        TXT_PrecioUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PrecioUnitarioKeyTyped(evt);
            }
        });

        BTN_Guardar.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BTN_Guardar.setText("Guardar");
        BTN_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActionPerformed(evt);
            }
        });

        BTN_Modificar.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BTN_Modificar.setText("Modificar");
        BTN_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModificarActionPerformed(evt);
            }
        });

        BTN_Eliminar.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BTN_Eliminar.setText("Eliminar");
        BTN_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/haz.png"))); // NOI18N
        jLabel1.setText(" Gestión de Materia Prima");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_Atras)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_PrecioUnitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_PrecioSoldadura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_PrecioRoscado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_PrecioDobles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_PrecioCorte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_Descripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTN_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(BTN_Atras)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXT_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXT_PrecioCorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXT_PrecioDobles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXT_PrecioRoscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TXT_PrecioSoldadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TXT_PrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        // TODO add your handling code here:
        CotizacionPrevia mC = new CotizacionPrevia();
        mC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void BTN_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActionPerformed
        // TODO add your handling code here:
        String DescripcionN = "El usuario " + Login.NombreUsuario + " agregó un registro de materia prima cotizable";
        mBD.AgregarRegistro(DescripcionN);
        mBD.Desconectar();
        GuardarMateriaPrima();
    }//GEN-LAST:event_BTN_GuardarActionPerformed

    private void BTN_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModificarActionPerformed
        // TODO add your handling code here:
        String DescripcionN = "El usuario " + Login.NombreUsuario + " modificó datos de un registro de materia prima cotizable";
        mBD.AgregarRegistro(DescripcionN);
        mBD.Desconectar();
        ModificarMateriaPrima();
    }//GEN-LAST:event_BTN_ModificarActionPerformed

    private void BTN_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EliminarActionPerformed
        // TODO add your handling code here:
        EliminarMateriaPrima();
        String DescripcionN = "El usuario " + Login.NombreUsuario + " eliminó un registro de materia prima cotizable";
        mBD.AgregarRegistro(DescripcionN);
        mBD.Desconectar();
        CotizacionPrevia mC = new CotizacionPrevia();
        mC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_EliminarActionPerformed

    private void TXT_PrecioCorteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PrecioCorteKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TXT_PrecioCorte.getText().length() == 10) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '@' && TXT_PrecioCorte.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_PrecioCorteKeyTyped

    private void TXT_PrecioDoblesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PrecioDoblesKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TXT_PrecioDobles.getText().length() == 10) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '@' && TXT_PrecioDobles.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_PrecioDoblesKeyTyped

    private void TXT_PrecioRoscadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PrecioRoscadoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TXT_PrecioDobles.getText().length() == 10) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '@' && TXT_PrecioDobles.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_PrecioRoscadoKeyTyped

    private void TXT_PrecioSoldaduraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PrecioSoldaduraKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) 
        {
            evt.consume();
        }

        if (TXT_PrecioDobles.getText().length() == 10) 
        {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '@' && TXT_PrecioDobles.getText().contains(".")) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_PrecioSoldaduraKeyTyped

    private void TXT_PrecioUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PrecioUnitarioKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) 
        {
            evt.consume();
        }

        if (TXT_PrecioDobles.getText().length() == 10) 
        {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '@' && TXT_PrecioDobles.getText().contains(".")) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_PrecioUnitarioKeyTyped

    private void TXT_DescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_DescripcionKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();

        if (TXT_PrecioDobles.getText().length() == 45) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_DescripcionKeyTyped

    public boolean ValidarCajas()
    {
        if (
            (!"".equals(TXT_PrecioUnitario.getText())) && (!"".equals(TXT_Descripcion.getText())) && (TXT_Descripcion.getText().length() > 5) && (!"".equals(TXT_PrecioCorte.getText()))
             && (!"".equals(TXT_PrecioDobles.getText())) && (!"".equals(TXT_PrecioRoscado.getText())) && (!"".equals(TXT_PrecioSoldadura.getText()))
           )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void GuardarMateriaPrima()
    {
        if (ValidarCajas())
        {
            mBD = new BD_1();
            mMC = new MateriaCotizable();
            
            Aleatorio = (int) (Math.random()*9999 + 1);
            
            mMC.setClave("MC-" + TXT_Descripcion.getText().substring(0,3) + "-" + Aleatorio);
            mMC.setDescripcion(TXT_Descripcion.getText());
            mMC.setPrecioCorte(Double.parseDouble(TXT_PrecioCorte.getText()));
            mMC.setPrecioDobles(Double.parseDouble(TXT_PrecioDobles.getText()));
            mMC.setPrecioRoscado(Double.parseDouble(TXT_PrecioRoscado.getText()));
            mMC.setPrecioSoldadura(Double.parseDouble(TXT_PrecioSoldadura.getText()));
            mMC.setPrecioUnitario(Double.parseDouble(TXT_PrecioUnitario.getText()));
            
            if (mBD.AgregarMateriaPrimaCotizable(mMC))
            {
                JOptionPane.showMessageDialog(null, "Materia prima añadida");
                CotizacionPrevia mC = new CotizacionPrevia();
                mC.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error en la base de datos, no se \npuede agregar la materia prima");
            }
        }
    }
    
    public void ModificarMateriaPrima()
    {
        if (ValidarCajas())
        {
            mBD = new BD_1();
            mMC = new MateriaCotizable();
            
            mMC.setDescripcion(TXT_Descripcion.getText());
            mMC.setPrecioCorte(Double.parseDouble(TXT_PrecioCorte.getText()));
            mMC.setPrecioDobles(Double.parseDouble(TXT_PrecioDobles.getText()));
            mMC.setPrecioRoscado(Double.parseDouble(TXT_PrecioRoscado.getText()));
            mMC.setPrecioSoldadura(Double.parseDouble(TXT_PrecioSoldadura.getText()));
            mMC.setPrecioUnitario(Double.parseDouble(TXT_PrecioUnitario.getText()));
            
            if (mBD.ModificarMateriaCotizable(mMC, Clave))
            {
                JOptionPane.showMessageDialog(null, "Producto modificado");
                CotizacionPrevia mC = new CotizacionPrevia();
                mC.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error en la BD");
            }
        }
    }
    
    public void EliminarMateriaPrima()
    {
        mBD = new BD_1();
        
        Opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar esta materia prima? \n (las materias primas eliminadas no se pueden recuperar)");

        if (JOptionPane.OK_OPTION == Opcion) 
        {
            mBD.EliminarMateriaCotizable(Clave);
        } else 
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
            java.util.logging.Logger.getLogger(AgregarMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_Guardar;
    private javax.swing.JButton BTN_Modificar;
    private javax.swing.JTextField TXT_Descripcion;
    private javax.swing.JTextField TXT_PrecioCorte;
    private javax.swing.JTextField TXT_PrecioDobles;
    private javax.swing.JTextField TXT_PrecioRoscado;
    private javax.swing.JTextField TXT_PrecioSoldadura;
    private javax.swing.JTextField TXT_PrecioUnitario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
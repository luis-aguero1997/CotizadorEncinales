/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Cotizacion;

import BaseDeDatos.*;
import Clases.*;
import Formularios.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardogarciadelgado
 */
public final class ElegirProducto extends javax.swing.JFrame {
    
    DefaultTableModel Tabla = new DefaultTableModel()
    {
        @Override
        public boolean isCellEditable(int row, int column) 
        {
            return false;
        }
    };
    BD_1 mBD;
    Producto mProducto;
    MenuCotizacion mMC;
    int Seleccion;
    public static String Clave;
    public static String NombreProducto;

    /**
     * Creates new form ElegirProducto
     */
    public ElegirProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        Tabla.addColumn("Clave");
        Tabla.addColumn("Nombre");
        Tabla.addColumn("Descripcion");
        Tabla.addColumn("Precio");
        mBD = null;
        mProducto = null;
        mMC = null;
        LlenarTabla();
        Seleccion = 0;
        LBL_Clave.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Productos = new javax.swing.JTable();
        TXT_Search = new javax.swing.JTextField();
        BTN_Atras2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LBL_Clave = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contrato (2).png"))); // NOI18N
        jLabel1.setText(" Cotización ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        TBL_Productos.setModel(Tabla);
        TBL_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBL_Productos);

        TXT_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_SearchKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_SearchKeyReleased(evt);
            }
        });

        BTN_Atras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        BTN_Atras2.setToolTipText("");
        BTN_Atras2.setBorderPainted(false);
        BTN_Atras2.setContentAreaFilled(false);
        BTN_Atras2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BTN_Atras2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BTN_Atras2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BTN_Atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Atras2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lupa.png"))); // NOI18N
        jLabel2.setText("Buscar Producto");

        LBL_Clave.setText("Clave");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(LBL_Clave))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BTN_Atras2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(171, 171, 171)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_Atras2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TXT_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LBL_Clave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_SearchKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TXT_SearchKeyTyped

    private void TXT_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_SearchKeyReleased
        // TODO add your handling code here:
        LlenarTablaFiltro();
    }//GEN-LAST:event_TXT_SearchKeyReleased

    private void TBL_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_ProductosMouseClicked
        // TODO add your handling code here:
        Seleccion = TBL_Productos.rowAtPoint(evt.getPoint());
        Clave = TBL_Productos.getModel().getValueAt(Seleccion, 0).toString();
        NombreProducto = TBL_Productos.getModel().getValueAt(Seleccion, 1).toString();
        mMC = new MenuCotizacion();
        mMC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TBL_ProductosMouseClicked

    private void BTN_Atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Atras2ActionPerformed
        // TODO add your handling code here:
        if ("1".equals(Login.Tipousuario))
        {
            Admin mA = new Admin();
            mA.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            if ("2".equals(Login.Tipousuario))
            {
                Cotizador mC = new Cotizador();
                mC.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                if ("3".equals(Login.Tipousuario))
                {
                    Ventas mV = new Ventas();
                    mV.setVisible(true);
                    this.setVisible(false);
                }
                else
                {                   
                }
            }
        }        
    }//GEN-LAST:event_BTN_Atras2ActionPerformed
    
    public void LlenarTabla()
    {
        mBD = new BD_1();
        mProducto = new Producto();
        
        ArrayList mListaProducto = mBD.ConsultaProductos();
        String [] datos=null;

        for (Object mListaProducto2 : mListaProducto)
        {
            datos = new String[4];
            mProducto = (Producto) mListaProducto2;

            //datos[0] = String.valueOf(mProducto.getIdProducto());
            datos[0] = mProducto.getClave();
            datos[1] = mProducto.getNombreProducto();
            datos[2] = mProducto.getDescripcion();
            datos[3] = String.valueOf(mProducto.getPrecioUnitaro());
            Tabla.addRow(datos);
        }
        this.TBL_Productos = new javax.swing.JTable();
        this.TBL_Productos.setModel(Tabla);
        this.TBL_Productos.getColumnModel().getColumn(0).setPreferredWidth(10);
        this.TBL_Productos.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.TBL_Productos.getColumnModel().getColumn(1).setPreferredWidth(50);
        this.TBL_Productos.getColumnModel().getColumn(2).setPreferredWidth(50);
        if (this.TBL_Productos.getRowCount() > 0) 
        {
            this.TBL_Productos.setRowSelectionInterval(0, 0);
        }
    }
    
    public void LlenarTablaFiltro()
    {
        LimpiarTabla();
        mBD = new BD_1();
        mProducto = new Producto();
        
        ArrayList mListaProducto = mBD.ConsultaProductosFiltro(TXT_Search.getText());
        String [] datos=null;

        for (Object mListaProducto2 : mListaProducto)
        {
            datos = new String[4];
            mProducto = (Producto) mListaProducto2;

            //datos[0] = String.valueOf(mProducto.getIdProducto());
            datos[0] = mProducto.getClave();
            datos[1] = mProducto.getNombreProducto();
            datos[2] = mProducto.getDescripcion();
            datos[3] = String.valueOf(mProducto.getPrecioUnitaro());
            Tabla.addRow(datos);
        }
        this.TBL_Productos = new javax.swing.JTable();
        this.TBL_Productos.setModel(Tabla);
        this.TBL_Productos.getColumnModel().getColumn(0).setPreferredWidth(10);
        this.TBL_Productos.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.TBL_Productos.getColumnModel().getColumn(1).setPreferredWidth(50);
        this.TBL_Productos.getColumnModel().getColumn(2).setPreferredWidth(50);
        if (this.TBL_Productos.getRowCount() > 0) 
        {
            this.TBL_Productos.setRowSelectionInterval(0, 0);
        }
    }
    
    public void LimpiarTabla()
    {
        Tabla = (DefaultTableModel) TBL_Productos.getModel();
        int a = Tabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            Tabla.removeRow(Tabla.getRowCount() - 1);
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
            java.util.logging.Logger.getLogger(ElegirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElegirProducto().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Atras2;
    private javax.swing.JLabel LBL_Clave;
    private javax.swing.JTable TBL_Productos;
    private javax.swing.JTextField TXT_Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}

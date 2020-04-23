package Formularios.Facturas;

import Clases.Archivo;
import Clases.Compras;
import Clases.Tabla_PdfVO;
import Clases.imgTabla;
import Formularios.BD;
import com.toedter.calendar.JDateChooser;
import java.awt.Desktop;
import java.awt.Event;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class AddCompra extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    String Ruta = "";
    BD mBD = new BD();
    BD dao = null;
    Tabla_PdfVO tpdf = new Tabla_PdfVO();
    int Seleccion;
    int SeleccionY;

    public AddCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        tpdf.visualizar_PdfVO(Table);

        LblProceso.setText("");
        jLabel15.setText("");
        jLabel16.setText("");
        jLabel19.setText("");
        jLabel20.setText("");
        evitarPegar(this.TxtCant);
        evitarPegar(this.TxtClave);
        evitarPegar(this.TxtDes);
        evitarPegar(this.TxtMedida);
        evitarPegar(this.TxtPrecio);
        evitarPegar(this.Fecha1);
        evitarPegar(this.Fecha2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        Fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        BtnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtClave = new javax.swing.JTextField();
        TxtDes = new javax.swing.JTextField();
        TxtCant = new javax.swing.JTextField();
        TxtMedida = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        BtnCon = new javax.swing.JButton();
        LblProceso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel5.setText("jLabel5");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 28)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cuenta (1).png"))); // NOI18N
        jLabel2.setText("Añadir Compra");

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/archivo.png"))); // NOI18N
        jLabel3.setText("Seleccionar Factura");

        Fecha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fecha2MouseClicked(evt);
            }
        });
        Fecha2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Fecha2PropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        jLabel4.setText("De: ");

        jLabel7.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        jLabel7.setText("Hasta: ");

        Table.setBackground(new java.awt.Color(203, 211, 247));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Fecha", "Archivo"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        BtnSave.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        BtnSave.setText("Agregar a Compras");
        BtnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSaveMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel8.setText("Clave");

        jLabel9.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel9.setText("Descripcion ");

        jLabel10.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel10.setText("Cantidad");

        jLabel11.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel11.setText("Unidad de Medida");

        jLabel12.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel12.setText("Precio Total ");

        TxtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtClaveKeyTyped(evt);
            }
        });

        TxtDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDesKeyTyped(evt);
            }
        });

        TxtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCantKeyTyped(evt);
            }
        });

        TxtMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMedidaActionPerformed(evt);
            }
        });
        TxtMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtMedidaKeyTyped(evt);
            }
        });

        TxtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrecioKeyTyped(evt);
            }
        });

        BtnCon.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        BtnCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        BtnCon.setText("Buscar");
        BtnCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnConMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel13.setText("Añadir Datos");

        jButton2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/anadir (2).png"))); // NOI18N
        jButton2.setText("Agregar Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel14.setText("Factura Seleccionada");

        jLabel15.setFont(new java.awt.Font("Sukhumvit Set", 1, 12)); // NOI18N
        jLabel15.setText("jLabel15");
        jLabel15.setName(""); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("jLabel16");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("jLabel19");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton3)
                        .addGap(256, 256, 256)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel13)
                        .addGap(197, 197, 197)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(BtnCon, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(69, 69, 69)
                                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(79, 79, 79)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TxtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel19)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(34, 34, 34)
                                                    .addComponent(TxtMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(35, 35, 35)
                                                    .addComponent(jLabel20)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(TxtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(BtnCon)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(TxtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(TxtMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6))
                            .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    private void Fecha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fecha2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_Fecha2MouseClicked

    private void Fecha2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Fecha2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha2PropertyChange

    private void BtnConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConMouseClicked
        // TODO add your handling code here:
        /*
        if (!Fecha1.equals(null) && !Fecha2.equals(null)) {
            this.visualizar_ArchivoEspecificos(Table);
        } else {
            JOptionPane.showMessageDialog(null, "Llene los campos necesarios");
        }
        */
        
        try {
            this.visualizar_ArchivoEspecificos(Table);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Llene los campos necesarios");
        }
    }//GEN-LAST:event_BtnConMouseClicked

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        String Nombre = "";
        int filaseleccionada = 0;
        filaseleccionada = Table.getSelectedRow();
        SeleccionY = Table.getSelectedColumn();
        //String bastidor = (String)Table.getValueAt(filaseleccionada, 0);
        Seleccion = (int) Table.getValueAt(filaseleccionada, 0);
        Nombre = (String) Table.getValueAt(filaseleccionada, 1);
        jLabel15.setText(Nombre);
        

        if (SeleccionY == 2) {
            LblProceso.setText("Procesando.....");

            Object value = Table.getValueAt(filaseleccionada, SeleccionY);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo");
                } else {
                    BD pd = new BD();
                    System.out.println("Bien");
                    pd.Ejecutar_ArchivoPDF(this.Seleccion);

                    //System.out.println("Bien");
                    try {
                        System.out.println("Bien");
                        Desktop.getDesktop().open(new File("new.pdf"));
                        System.out.println("Bien");
                        LblProceso.setText("Listo");
                        LblProceso.setText("");
                    } catch (Exception ex) {
                    }
                }

            } else {
                //String name = "" + tabla.getValueAt(row, 1);
                //txtname.setText(name);
            }
        }
//        }


    }//GEN-LAST:event_TableMouseClicked

    private void BtnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSaveMouseClicked
        // TODO add your handling code here:
        if (!this.TxtCant.getText().isEmpty()
                || !this.TxtDes.getText().isEmpty()
                || !this.TxtClave.getText().isEmpty()
                || !this.TxtMedida.getText().isEmpty()
                || !this.TxtPrecio.getText().isEmpty()) {
            //Copiar en el frame de ramiro
            if (TxtCant.getText().length() < 1
                    || TxtClave.getText().length() <= 3
                    || TxtDes.getText().length() <= 6
                    || this.TxtMedida.getText().length() <= 3
                    || TxtPrecio.getText().length() < 1) {
                JOptionPane.showMessageDialog(this, "Uno o más campos inválidos");

            } else {
                int Cant = 0;
                String Des = "";
                String Clave = "";
                String UMedida = "";
                float Precio = 0;
                Date Fecha = null;

                Cant = Integer.parseInt(TxtCant.getText());
                Des = TxtDes.getText();
                Clave = this.TxtClave.getText();
                UMedida = TxtMedida.getText();
                Precio = Float.parseFloat(TxtPrecio.getText());
                //Fecha = 
                if (Seleccion == 0) {
                    JOptionPane.showMessageDialog(null, "Seleccione una de las facturas de la tabla");
                } else {
                    BD BDT = new BD();
                    Compras Com = new Compras();
                    Com.setCantidad(Cant);
                    Com.setClave(Clave);
                    Com.setDescripcion(Des);
                    Com.setPrecio(Precio);
                    Com.setUMedida(UMedida);
                    Com.setIdFactura(Seleccion);

                    Fecha = BDT.FechaFactura(this.Seleccion);
                    
                    Com.setFecha(Fecha);
                    if (BDT.Agregar_Compra(Com)) {
                        TxtCant.setText("");
                        TxtDes.setText("");
                        TxtClave.setText("");
                        TxtMedida.setText("");
                        TxtPrecio.setText("");
                        JOptionPane.showMessageDialog(null, "Compra agregada con éxito");
                    }

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No a llenado todos los elementos");
        }
    }//GEN-LAST:event_BtnSaveMouseClicked

    private void TxtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtClaveKeyTyped
        // TODO add your handling code here:
        if ((this.TxtClave.getText().length() == 45)) {
            evt.consume();

        } else if (this.TxtClave.getText().length() < 3) {
            jLabel16.setText("Demasiado pequeña");
        } else if (this.TxtClave.getText().length() >= 3) {
            this.jLabel16.setText("");
        }

    }//GEN-LAST:event_TxtClaveKeyTyped

    private void TxtDesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDesKeyTyped
        // TODO add your handling code here:

        if (TxtDes.getText().length() == 45) {
            evt.consume();
        } else if (TxtDes.getText().length() < 5) {
            jLabel19.setText("Demasiado pequeña");
        } else if (TxtDes.getText().length() >= 5) {
            this.jLabel19.setText("");
        }
    }//GEN-LAST:event_TxtDesKeyTyped

    private void TxtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrecioKeyTyped
        // TODO add your handling code here:
       char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TxtPrecio.getText().length() == 10) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '.' && TxtPrecio.getText().contains(".")) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == ' ') {
            
        }
    }//GEN-LAST:event_TxtPrecioKeyTyped

    private void TxtCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCantKeyTyped

      char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TxtCant.getText().length() == 10) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == '.' && TxtCant.getText().contains(".")) {
            evt.consume();
        }
       
        if (evt.getKeyChar() == ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCantKeyTyped

    private void TxtMedidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMedidaKeyTyped
        // TODO add your handling code here:
        if (TxtMedida.getText().length() == 45) {
            evt.consume();
        }  else if (TxtMedida.getText().length() < 2) {
            jLabel20.setText("Demasiado pequeña");
        } else if (TxtMedida.getText().length() >= 2) {
            this.jLabel20.setText("");
        }
    }//GEN-LAST:event_TxtMedidaKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        MainFactura MF = new MainFactura();
        this.dispose();
        MF.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AddFactura AF = new AddFactura();
        this.dispose();
        AF.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMedidaActionPerformed

    public void visualizar_ArchivoEspecificos(JTable Tabla) {
        Tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dao = new BD();
        Archivo vo = new Archivo();
        dt.addColumn("Codigo");
        dt.addColumn("Nombre");
        dt.addColumn("Fecha");
        dt.addColumn("Archivo");

        Date Date1 = convert(Fecha1.getDate());
        Date Date2 = convert(Fecha2.getDate());

        ArrayList<Archivo> list = dao.Listar_PdfVO(Date1, Date2);

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getID();
                fila[1] = vo.getNombre();
                fila[2] = vo.getFecha();
                fila[3] = new JButton("Abrir");

                dt.addRow(fila);
            }
            Table.setModel(dt);
            Table.setRowHeight(32);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron facturas durante ese periodo");
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {

        }
        return null;
    }

    private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }

    public static void evitarPegar(JTextField campo) {

        InputMap map2 = campo.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

    }

    public static void evitarPegar(JDateChooser campo) {

        InputMap map2 = campo.getInputMap(JDateChooser.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

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
            java.util.logging.Logger.getLogger(AddCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCon;
    private javax.swing.JButton BtnSave;
    private com.toedter.calendar.JDateChooser Fecha1;
    private com.toedter.calendar.JDateChooser Fecha2;
    private javax.swing.JLabel LblProceso;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TxtCant;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtDes;
    private javax.swing.JTextField TxtMedida;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

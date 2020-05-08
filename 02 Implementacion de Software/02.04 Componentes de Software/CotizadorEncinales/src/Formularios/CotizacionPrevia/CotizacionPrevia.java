/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.CotizacionPrevia;

import BaseDeDatos.*;
import Clases.*;
import Formularios.*;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

/**
 *
 * @author eduardogarciadelgado
 */
public class CotizacionPrevia extends javax.swing.JFrame {

    /**
     * Creates new form CotizacionPrevia
     */
    DecimalFormat mDF;
    
    DefaultTableModel TablaMateriaPrima;
    DefaultTableModel TablaProductosLinea;
    DefaultTableModel TablaCorte;
    DefaultTableModel TablaTotal;
    
    BD_1 mBD;
    MateriaCotizable mMP;
    ArrayList mListaMP;
    Constantes mC;
    ClaseProductosLinea mCPL;
    
    int Seleccion;
    int SeleccionX;
    int SeleccionY;
    int SeleccionZ;
    boolean MateriaElegida;
    
    JComboBox CB_NumCortes;
    JComboBox CB_Dobleces;
    JComboBox CB_Roscado;
    JComboBox CB_Soldadura;
    JComboBox CB_Cantidad;
    
    public CotizacionPrevia() 
    {
        mDF = new DecimalFormat("#.#####");
        
        this.TablaMateriaPrima = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return column == 0;
            }
            @Override
            public Class getColumnClass(int columna)
            {
              if (columna == 0) return Boolean.class;
              return Object.class;
            }
        };
        this.TablaCorte = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return column > 3;
            }            
        };
        this.TablaTotal = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }           
        };
        this.TablaProductosLinea = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }           
        };
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Cotizador Encinales");
        
        TablaMateriaPrima.addColumn("Seleccionar");
        TablaMateriaPrima.addColumn("Clave");
        TablaMateriaPrima.addColumn("Descripción");
        TablaMateriaPrima.addColumn("Precio Unitario");
              
        TablaCorte.addColumn("Eliminar");
        TablaCorte.addColumn("Clave");
        TablaCorte.addColumn("Descripción");
        TablaCorte.addColumn("Precio Unitario");
        TablaCorte.addColumn("Número de cortes");
        TablaCorte.addColumn("Número de dobleces");
        TablaCorte.addColumn("¿Cuenta con roscado?");
        TablaCorte.addColumn("Puntos de soldadura");
        TablaCorte.addColumn("Cantidad");
        
        TablaTotal.addColumn("Clave");
        TablaTotal.addColumn("Descripción");
        TablaTotal.addColumn("Precio");
        
        TablaProductosLinea.addColumn("Clave");
        TablaProductosLinea.addColumn("Nombre");
        TablaProductosLinea.addColumn("Diámetro");
        TablaProductosLinea.addColumn("Peso Material");
        TablaProductosLinea.addColumn("Unidad (m)");
        TablaProductosLinea.addColumn("Unidad (m2)");
        TablaProductosLinea.addColumn("Unidad (kg)");
        TablaProductosLinea.addColumn("Precio");
        
        mBD = null;
        mMP = null;
        mC = null;
        mCPL = null;
        mListaMP = null;
        
        Seleccion = 0;
        SeleccionX = 0;
        SeleccionY = 0;
        SeleccionZ = 0;
        MateriaElegida = false;
        
        CB_NumCortes = null;
        CB_Dobleces = null;
        CB_Roscado = null;
        CB_Soldadura = null;
        CB_Cantidad = null;
        
        LlenarCombo();          
        LlenarTablaMateriaPrima();
        LlenarTablaProductosPrimeraLinea();
        
        LBL_CostoMateriaPrima.setText("0");
        LBL_CostoAdministrativo.setText("0");
        LBL_CostoFlete.setText("0");
        LBL_CostoUtilidad.setText("0");
        LBL_CostoIVA.setText("0");
        LBL_CostoTotal.setText("0");
        
        if ("1".equals(Login.Tipousuario))
        {
            BTN_Agregar.setEnabled(true);
        }
        else
        {
            if ("2".equals(Login.Tipousuario))
            {
                BTN_Agregar.setEnabled(true);
            }
            else
            {
                BTN_Agregar.setEnabled(false);
            }
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
        TP_CotizacionPrevia = new javax.swing.JTabbedPane();
        JP_MateriaPrima = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_MateriaPrima = new javax.swing.JTable();
        TXT_Search1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JP_Corte = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBL_Corte = new javax.swing.JTable();
        TXT_Search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JP_Total = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBL_Total = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        LBL_CostoMateriaPrima = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LBL_CostoAdministrativo = new javax.swing.JLabel();
        LBL_CostoFlete = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LBL_CostoUtilidad = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LBL_CostoIVA = new javax.swing.JLabel();
        LBL_CostoTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JP_ProdLinea = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBL_ProdLinea = new javax.swing.JTable();
        LBL_TipoVariable = new javax.swing.JLabel();
        LBL_CantidadVariable = new javax.swing.JLabel();
        LBL_PrecioProdLinea = new javax.swing.JLabel();
        LBL_PrecioSugerido = new javax.swing.JLabel();
        LBL_TipoVariableN = new javax.swing.JLabel();
        TXT_Personalizado = new javax.swing.JTextField();
        LBL_PrecioProdLinea1 = new javax.swing.JLabel();
        LBL_PrecioSugeridoPersonalizado = new javax.swing.JLabel();
        BTN_Atras = new javax.swing.JButton();
        BTN_Agregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TP_CotizacionPrevia.setBackground(new java.awt.Color(255, 255, 255));
        TP_CotizacionPrevia.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
        TP_CotizacionPrevia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TP_CotizacionPreviaMouseClicked(evt);
            }
        });

        JP_MateriaPrima.setBackground(new java.awt.Color(255, 255, 255));

        TBL_MateriaPrima.setModel(TablaMateriaPrima);
        TBL_MateriaPrima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_MateriaPrimaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBL_MateriaPrima);

        TXT_Search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_Search1KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_Search1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel2.setText("Buscar");

        javax.swing.GroupLayout JP_MateriaPrimaLayout = new javax.swing.GroupLayout(JP_MateriaPrima);
        JP_MateriaPrima.setLayout(JP_MateriaPrimaLayout);
        JP_MateriaPrimaLayout.setHorizontalGroup(
            JP_MateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MateriaPrimaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_MateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                    .addGroup(JP_MateriaPrimaLayout.createSequentialGroup()
                        .addGroup(JP_MateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JP_MateriaPrimaLayout.setVerticalGroup(
            JP_MateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MateriaPrimaLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_Search1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        TP_CotizacionPrevia.addTab("Materia Prima", JP_MateriaPrima);

        JP_Corte.setBackground(new java.awt.Color(255, 255, 255));

        TBL_Corte.setModel(TablaCorte);
        TBL_Corte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_CorteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBL_Corte);

        TXT_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_SearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        jLabel1.setText("Buscar");

        javax.swing.GroupLayout JP_CorteLayout = new javax.swing.GroupLayout(JP_Corte);
        JP_Corte.setLayout(JP_CorteLayout);
        JP_CorteLayout.setHorizontalGroup(
            JP_CorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_CorteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_CorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(JP_CorteLayout.createSequentialGroup()
                        .addGroup(JP_CorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 537, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JP_CorteLayout.setVerticalGroup(
            JP_CorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_CorteLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        TP_CotizacionPrevia.addTab("Corte | Doblez | Roscado | Soldadura", JP_Corte);

        JP_Total.setBackground(new java.awt.Color(255, 255, 255));
        JP_Total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_TotalMouseClicked(evt);
            }
        });

        TBL_Total.setModel(TablaTotal);
        TBL_Total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_TotalMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TBL_Total);

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        jLabel4.setText("Precio Total De Materia Prima");

        LBL_CostoMateriaPrima.setText("$$$MP");

        jLabel5.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        jLabel5.setText("Costo Administrativo");

        jLabel6.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        jLabel6.setText("Costo Flete - Embarque");

        LBL_CostoAdministrativo.setText("$$$CA");

        LBL_CostoFlete.setText("$$$FE");

        jLabel7.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        jLabel7.setText("Utilidad (30%)");

        LBL_CostoUtilidad.setText("$$$UT");

        jLabel8.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        jLabel8.setText("IVA (16%)");

        LBL_CostoIVA.setText("$$$IVA");

        LBL_CostoTotal.setForeground(new java.awt.Color(255, 0, 0));
        LBL_CostoTotal.setText("$$$CT");

        jLabel9.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("COSTO TOTAL");

        javax.swing.GroupLayout JP_TotalLayout = new javax.swing.GroupLayout(JP_Total);
        JP_Total.setLayout(JP_TotalLayout);
        JP_TotalLayout.setHorizontalGroup(
            JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_TotalLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(51, 51, 51)
                .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_CostoFlete)
                    .addComponent(LBL_CostoAdministrativo)
                    .addComponent(LBL_CostoMateriaPrima))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(50, 50, 50)
                .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_CostoTotal)
                    .addComponent(LBL_CostoIVA)
                    .addComponent(LBL_CostoUtilidad))
                .addGap(110, 110, 110))
            .addGroup(JP_TotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        JP_TotalLayout.setVerticalGroup(
            JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_TotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_TotalLayout.createSequentialGroup()
                        .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LBL_CostoMateriaPrima))
                        .addGap(18, 18, 18)
                        .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LBL_CostoAdministrativo))
                        .addGap(18, 18, 18)
                        .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(LBL_CostoFlete)))
                    .addGroup(JP_TotalLayout.createSequentialGroup()
                        .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(LBL_CostoUtilidad))
                        .addGap(18, 18, 18)
                        .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(LBL_CostoIVA))
                        .addGap(18, 18, 18)
                        .addGroup(JP_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LBL_CostoTotal))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        TP_CotizacionPrevia.addTab("Total Cotización", JP_Total);

        JP_ProdLinea.setBackground(new java.awt.Color(255, 255, 255));

        TBL_ProdLinea.setModel(TablaProductosLinea);
        TBL_ProdLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_ProdLineaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TBL_ProdLinea);

        LBL_TipoVariable.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N

        LBL_CantidadVariable.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N

        LBL_PrecioProdLinea.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        LBL_PrecioProdLinea.setText("Precio sugerido:");

        LBL_PrecioSugerido.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N

        LBL_TipoVariableN.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N

        TXT_Personalizado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PersonalizadoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXT_PersonalizadoKeyPressed(evt);
            }
        });

        LBL_PrecioProdLinea1.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        LBL_PrecioProdLinea1.setText("Precio sugerido:");

        LBL_PrecioSugeridoPersonalizado.setFont(new java.awt.Font("Sukhumvit Set", 0, 15)); // NOI18N
        LBL_PrecioSugeridoPersonalizado.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout JP_ProdLineaLayout = new javax.swing.GroupLayout(JP_ProdLinea);
        JP_ProdLinea.setLayout(JP_ProdLineaLayout);
        JP_ProdLineaLayout.setHorizontalGroup(
            JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_ProdLineaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                    .addGroup(JP_ProdLineaLayout.createSequentialGroup()
                        .addGroup(JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LBL_TipoVariableN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(LBL_TipoVariable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LBL_CantidadVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXT_Personalizado, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP_ProdLineaLayout.createSequentialGroup()
                                .addComponent(LBL_PrecioProdLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LBL_PrecioSugerido, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JP_ProdLineaLayout.createSequentialGroup()
                                .addComponent(LBL_PrecioProdLinea1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LBL_PrecioSugeridoPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        JP_ProdLineaLayout.setVerticalGroup(
            JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_ProdLineaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_TipoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_CantidadVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_PrecioProdLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_PrecioSugerido, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LBL_TipoVariableN, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JP_ProdLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Personalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_PrecioProdLinea1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LBL_PrecioSugeridoPersonalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        TP_CotizacionPrevia.addTab("Productos de Línea", JP_ProdLinea);

        BTN_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-hacia-la-izquierda (3).png"))); // NOI18N
        BTN_Atras.setBorderPainted(false);
        BTN_Atras.setContentAreaFilled(false);
        BTN_Atras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BTN_Atras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BTN_Atras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/espalda (2).png"))); // NOI18N
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });

        BTN_Agregar.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        BTN_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mas.png"))); // NOI18N
        BTN_Agregar.setText("   Agregar Materia Prima");
        BTN_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/analisis-de-datos.png"))); // NOI18N
        jLabel3.setText("Precio Total De La Cotización Previa");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/003.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTN_Atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(TP_CotizacionPrevia, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Atras)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TP_CotizacionPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void TBL_MateriaPrimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_MateriaPrimaMouseClicked
        // TODO add your handling code here:       
        
        SeleccionX = TBL_MateriaPrima.rowAtPoint(evt.getPoint());
        SeleccionZ = TBL_MateriaPrima.columnAtPoint(evt.getPoint());

        switch (SeleccionZ) 
        {
            case 1:
                mListaMP = new ArrayList();                
                Seleccion = TBL_MateriaPrima.rowAtPoint(evt.getPoint());

                try
                {
                    MateriaElegida = (boolean) TBL_MateriaPrima.getModel().getValueAt(Seleccion, 0);
                } 
                catch(Exception e)
                {   
                }

                if (MateriaElegida == true)
                {
                        mMP = new MateriaCotizable();
                        mMP.setClave(TBL_MateriaPrima.getModel().getValueAt(Seleccion, 1).toString());
                        mMP.setDescripcion(TBL_MateriaPrima.getModel().getValueAt(Seleccion, 2).toString());
                        mMP.setPrecioUnitario(Double.parseDouble(TBL_MateriaPrima.getModel().getValueAt(Seleccion, 3).toString()));
                        mListaMP.add(mMP);
                        LlenarTablaCortes();
                        LlenarTablaTotal();  
                }
                else
                {   
                    for (int i = 0; i < TBL_Corte.getRowCount(); i++) 
                    {
                        if (TBL_Corte.getValueAt(i, 1).toString().equals(TBL_MateriaPrima.getModel().getValueAt(Seleccion, 1).toString())) 
                        {
                            TablaCorte.removeRow(i);
                            break;
                        } 
                    }
                    for (int i = 0; i < TBL_Total.getRowCount(); i++) 
                    {
                        if (TBL_Total.getValueAt(i, 0).toString().equals(TBL_MateriaPrima.getModel().getValueAt(Seleccion, 1).toString())) 
                        {
                            TablaTotal.removeRow(i);
                            break;
                        } 
                    }
                }
                break;
            default:
                ArrayList mListaClave = mBD.ConsultaMateriaCotizableClave(TablaMateriaPrima.getValueAt(SeleccionX, 1).toString());

                for (Object mListaClave2 : mListaClave)
                {
                    mMP = (MateriaCotizable) mListaClave2;

                    AgregarMP.Clave = mMP.getClave();
                    AgregarMP.Descripcion = mMP.getDescripcion();
                    AgregarMP.PrecioCorte = mMP.getPrecioCorte();
                    AgregarMP.PrecioDobles = mMP.getPrecioDobles();
                    AgregarMP.PrecioRoscado = mMP.getPrecioRoscado();
                    AgregarMP.PrecioSoldadura = mMP.getPrecioSoldadura();
                    AgregarMP.PrecioUnitario = mMP.getPrecioUnitario();
                }

                AgregarMP.Bandera = false;
                AgregarMP mAMP = new AgregarMP();
                mAMP.setVisible(true);
                this.setVisible(false);
                break;
        }
    }//GEN-LAST:event_TBL_MateriaPrimaMouseClicked

    private void TBL_CorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_CorteMouseClicked
        // TODO add your handling code here:
        SeleccionX = TBL_Corte.rowAtPoint(evt.getPoint());
        SeleccionY = TBL_Corte.columnAtPoint(evt.getPoint());
        
        switch (SeleccionY) 
        {
            case 0:
                //JOptionPane.showMessageDialog(null, " Eliminar ");
                TablaCorte.removeRow(SeleccionX);
                TablaTotal.removeRow(SeleccionX);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_TBL_CorteMouseClicked

    private void TP_CotizacionPreviaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TP_CotizacionPreviaMouseClicked
        // TODO add your handling code here:
        OperarMateriaPrima();
    }//GEN-LAST:event_TP_CotizacionPreviaMouseClicked

    private void TXT_Search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_Search1KeyReleased
        // TODO add your handling code here:
        LlenarMateriaPrimaFiltro();
    }//GEN-LAST:event_TXT_Search1KeyReleased

    private void TXT_Search1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_Search1KeyTyped
        // TODO add your handling code here:
        LlenarMateriaPrimaFiltro();
    }//GEN-LAST:event_TXT_Search1KeyTyped

    private void TBL_TotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_TotalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TBL_TotalMouseClicked

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
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
                if ("3".equals(Login.Tipousuario)) {
                    Ventas mV = new Ventas();
                    mV.setVisible(true);
                    this.setVisible(false);
                } 
                else 
                {
                   if ("4".equals(Login.Tipousuario)) 
                    {
                        Compras mCompras = new Compras();
                        mCompras.setVisible(true);
                        this.setVisible(false);
                    } 
                    else 
                    {
                       if ("5".equals(Login.Tipousuario)) 
                       {
                            Contabilidad mContabilidad = new Contabilidad();
                            mContabilidad.setVisible(true);
                            this.setVisible(false);
                        } 
                        else 
                        {

                        }
                    } 
                }
            }
        }
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void JP_TotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_TotalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JP_TotalMouseClicked

    private void TXT_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_SearchActionPerformed

    private void BTN_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarActionPerformed
        // TODO add your handling code here:
        AgregarMP.Bandera = true;
        AgregarMP mAMP = new AgregarMP();
        mAMP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_AgregarActionPerformed

    private void TBL_ProdLineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_ProdLineaMouseClicked
        // TODO add your handling code here:
        SeleccionX = 0;
        SeleccionY = 0;
        SeleccionX = TBL_ProdLinea.rowAtPoint(evt.getPoint());
        SeleccionY = TBL_ProdLinea.columnAtPoint(evt.getPoint());
        
        LBL_TipoVariable.setText("");
        LBL_TipoVariableN.setText("");
        LBL_CantidadVariable.setText("");
        LBL_PrecioSugerido.setText("");
        
        switch (SeleccionY) 
        {
            case 3:
                LBL_TipoVariable.setText("Diámetro");
                LBL_TipoVariableN.setText("Diámetro personalizado");
                LBL_CantidadVariable.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 2).toString());
                LBL_PrecioSugerido.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 7).toString());
                break;
            case 4:
                LBL_TipoVariable.setText("Peso del material");
                LBL_TipoVariableN.setText("Peso del material personalizado");
                LBL_CantidadVariable.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 3).toString());
                LBL_PrecioSugerido.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 7).toString());
                break;
            case 5:
                LBL_TipoVariable.setText("Unidad de empaque (mts)");
                LBL_TipoVariableN.setText("Unidad de empaque (mts) personalizado");
                LBL_CantidadVariable.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 4).toString());
                LBL_PrecioSugerido.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 7).toString());
                break;
            case 6:
                LBL_TipoVariable.setText("Unidad de utilización (mts^2)");
                LBL_TipoVariableN.setText("Unidad de utilización (mts^2) personalizado");
                LBL_CantidadVariable.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 5).toString());
                LBL_PrecioSugerido.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 7).toString());
                break;
            case 7:
                LBL_TipoVariable.setText("Unidad de utilización (kg)");
                LBL_TipoVariableN.setText("Unidad de utilización (kg) personalizado");
                LBL_CantidadVariable.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 6).toString());
                LBL_PrecioSugerido.setText(TBL_ProdLinea.getModel().getValueAt(SeleccionX, 7).toString());
                break;
            default:
                LBL_TipoVariable.setText("No especificado");
                LBL_CantidadVariable.setText("0.0");
                break;
        }
    }//GEN-LAST:event_TBL_ProdLineaMouseClicked

    private void TXT_PersonalizadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PersonalizadoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car > '.')) {
            evt.consume();
        }

        if (TXT_Personalizado.getText().length() == 10) {
            evt.consume();
        }

        if (evt.getKeyChar() == '.' && TXT_Personalizado.getText().contains(".")) {
            evt.consume();
        }

        if (evt.getKeyChar() == ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_PersonalizadoKeyTyped

    private void TXT_PersonalizadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PersonalizadoKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                ObtenerPrecioProdLineaPersonalizado();
            }
    }//GEN-LAST:event_TXT_PersonalizadoKeyPressed
     
    public void ObtenerPrecioProdLineaPersonalizado()
    {
        try
        {
            double Resultado;
        
            Resultado = ( Double.parseDouble(TXT_Personalizado.getText()) * Double.parseDouble(LBL_PrecioSugerido.getText()) ) / (Double.parseDouble(LBL_CantidadVariable.getText()));
            LBL_PrecioSugeridoPersonalizado.setText("$"+mDF.format(Resultado));
            
            if (!"".equals(LBL_PrecioSugeridoPersonalizado.getText()))
            {
                mBD = new BD_1();
                String DescripcionN = "El usuario " + Login.NombreUsuario + " consultó un precio de un producto de línea personalizado";
                mBD.AgregarRegistro(DescripcionN);
                mBD.Desconectar();
            }
            else
            {
                
            }        
        }
        catch (NumberFormatException e)
        {
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    public void LlenarTablaMateriaPrima()
    {
        mBD = new BD_1();
        mMP = new MateriaCotizable();
        
        ArrayList mListaMateriaPrima = mBD.ConsultaMateriaCotizable();
        String [] datos;       
        
        for (Object mMP_2 : mListaMateriaPrima)
        {
            datos = new String[5];
            
            mMP = (MateriaCotizable) mMP_2;

            datos[1] = mMP.getClave();
            datos[2] = mMP.getDescripcion();
            datos[3] = String.valueOf(mMP.getPrecioUnitario());
            TablaMateriaPrima.addRow(datos);
        } 
        this.TBL_MateriaPrima = new javax.swing.JTable();
        this.TBL_MateriaPrima.setModel(TablaMateriaPrima);
        this.TBL_MateriaPrima.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.TBL_MateriaPrima.getColumnModel().getColumn(1).setPreferredWidth(50);
        this.TBL_MateriaPrima.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.TBL_MateriaPrima.getColumnModel().getColumn(3).setPreferredWidth(50);

        if (this.TBL_MateriaPrima.getRowCount() > 0) 
        {
            this.TBL_MateriaPrima.setRowSelectionInterval(0, 0);
        }
    }    
    public void LimpiarTablaMateriaPrima()
    {
        TablaMateriaPrima = (DefaultTableModel) TBL_MateriaPrima.getModel();
        int a = TablaMateriaPrima.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            TablaMateriaPrima.removeRow(TablaMateriaPrima.getRowCount() - 1);
        }
    } 
    
    public void LlenarMateriaPrimaFiltro()
    {
        LimpiarTablaMateriaPrima();
        mBD = new BD_1();
        mMP = new MateriaCotizable();
        
        ArrayList mListaProducto = mBD.ConsultaMateriaCotizableFiltro(TXT_Search1.getText());
        String [] datos=null;

        for (Object mListaProducto2 : mListaProducto)
        {
            datos = new String[4];
            mMP = (MateriaCotizable) mListaProducto2;

            datos[1] = mMP.getClave();
            datos[2] = mMP.getDescripcion();
            datos[3] = String.valueOf(mMP.getPrecioUnitario());
            TablaMateriaPrima.addRow(datos);
        }
        this.TBL_MateriaPrima = new javax.swing.JTable();
        this.TBL_MateriaPrima.setModel(TablaMateriaPrima);
        this.TBL_MateriaPrima.getColumnModel().getColumn(1).setPreferredWidth(50);
        this.TBL_MateriaPrima.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.TBL_MateriaPrima.getColumnModel().getColumn(3).setPreferredWidth(50);
        if (this.TBL_MateriaPrima.getRowCount() > 0) 
        {
            this.TBL_MateriaPrima.setRowSelectionInterval(0, 0);
        }
    }
    
    public void LlenarTablaCortes()
    {
        mMP = new MateriaCotizable();

        Object [] datos;       

        for (Object mMP_2 : mListaMP)
        {   
            datos = new Object[9];
            mMP = (MateriaCotizable) mMP_2;
            
            //Etiqueta = new JLabel("Hola");
            //Etiqueta = new JLabel((Icon) new ImageIcon(getClass().getResource("trash.jpg")).getImage());

            datos[0] = "    x";
            datos[1] = mMP.getClave();
            datos[2] = mMP.getDescripcion();
            datos[3] = String.valueOf(mMP.getPrecioUnitario()); 
            datos[4] = "0";
            datos[5] = "0";
            datos[6] = "0";
            datos[7] = "0";
            datos[8] = "1";
            TablaCorte.addRow(datos);                             
        } 
        this.TBL_Corte = new javax.swing.JTable();
        this.TBL_Corte.setModel(TablaCorte);
        this.TBL_Corte.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.TBL_Corte.getColumnModel().getColumn(1).setPreferredWidth(50);
        this.TBL_Corte.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.TBL_Corte.getColumnModel().getColumn(3).setPreferredWidth(50);
        this.TBL_Corte.getColumnModel().getColumn(4).setPreferredWidth(50);
        this.TBL_Corte.getColumnModel().getColumn(5).setPreferredWidth(50);
        this.TBL_Corte.getColumnModel().getColumn(6).setPreferredWidth(50);
        this.TBL_Corte.getColumnModel().getColumn(7).setPreferredWidth(50);
        this.TBL_Corte.getColumnModel().getColumn(8).setPreferredWidth(50);

        if (this.TBL_Corte.getRowCount() > 0) 
        {
            this.TBL_Corte.setRowSelectionInterval(0, 0);
        }
    }
    
    public void LlenarTablaTotal()
    {
        mMP = new MateriaCotizable();

        Object [] datos;       

        for (Object mMP_2 : mListaMP)
        {   
            datos = new Object[3];
            mMP = (MateriaCotizable) mMP_2;
            datos[0] = mMP.getClave();
            datos[1] = mMP.getDescripcion();           
            TablaTotal.addRow(datos);                             
        } 
        this.TBL_Total = new javax.swing.JTable();
        this.TBL_Total.setModel(TablaTotal);
        this.TBL_Total.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.TBL_Total.getColumnModel().getColumn(1).setPreferredWidth(50);

        if (this.TBL_Total.getRowCount() > 0) 
        {
            this.TBL_Total.setRowSelectionInterval(0, 0);
        }
    }
    
    public void LlenarCombo()
    {   
        
        TableColumn TC_Corte;
        TableColumn TC_Dobles;
        TableColumn TC_Roscado;
        TableColumn TC_Soldadura;
        TableColumn TC_Cantidad;
        
        TableCellEditor TCE;
        
        CB_NumCortes = new JComboBox();
        CB_Dobleces = new JComboBox();
        CB_Roscado = new JComboBox();
        CB_Soldadura = new JComboBox();
        CB_Cantidad = new JComboBox();
        
        
        for (int i = 0; i < 99; i++)
        {
            CB_NumCortes.addItem(i);
            CB_Dobleces.addItem(i);
            CB_Roscado.addItem(i);
            CB_Soldadura.addItem(i);
            CB_Cantidad.addItem(i);
        }
        
        TC_Corte = TBL_Corte.getColumnModel().getColumn(4);
        TCE = new DefaultCellEditor(CB_NumCortes);
        TC_Corte.setCellEditor(TCE);
        
        TC_Dobles = TBL_Corte.getColumnModel().getColumn(5);
        TCE = new DefaultCellEditor(CB_Dobleces);
        TC_Dobles.setCellEditor(TCE);
        
        TC_Roscado = TBL_Corte.getColumnModel().getColumn(6);
        TCE = new DefaultCellEditor(CB_Roscado);
        TC_Roscado.setCellEditor(TCE);
        
        TC_Soldadura = TBL_Corte.getColumnModel().getColumn(7);
        TCE = new DefaultCellEditor(CB_Soldadura);
        TC_Soldadura.setCellEditor(TCE);
        
        TC_Cantidad = TBL_Corte.getColumnModel().getColumn(8);
        TCE = new DefaultCellEditor(CB_Cantidad);
        TC_Cantidad.setCellEditor(TCE);
    }
    
    public void OperarMateriaPrima()
    {
        int ContadorY = 0;
        double SumatoriaX;
        double SumatoriaY;
        double CostoSinUtilidad;
        double Utilidad;
        double IVA;
        double CostoTotal;
        Object [] datosConstantes;
        
        Utilidad = 0;
        IVA = 0;
        CostoTotal = 0;
        SumatoriaX = 0;
        SumatoriaY = 0;
        datosConstantes = new Object[2];
      
        if (TP_CotizacionPrevia.getSelectedIndex() == 2)
        {
            for (int i = 0; i < TablaCorte.getRowCount(); i++) 
            {
                mBD = new BD_1();
                mMP = new MateriaCotizable();
                mC = new Constantes();
                
                ArrayList mConstantes = mBD.ConsultaConstantes();
                
                for (Object mConstantes2 : mConstantes)
                {
                    mC = (Constantes) mConstantes2;

                    datosConstantes[0] = (mC.getCostoTotalOp()) / 2;
                    datosConstantes[1] = mC.getIVA();
                }

                ArrayList mListaClave = mBD.ConsultaMateriaCotizableClave(TablaCorte.getValueAt(i, 1).toString());
                
                Double [] datos;
                datos = new Double[4];

                for (Object mListaClave2 : mListaClave)
                {
                    mMP = (MateriaCotizable) mListaClave2;

                    datos[0] = mMP.getPrecioCorte();
                    datos[1] = mMP.getPrecioDobles();
                    datos[2] = mMP.getPrecioRoscado();
                    datos[3] = mMP.getPrecioSoldadura();
                }
                
                for (int j = 0; j < TablaCorte.getColumnCount(); j++) 
                {
                    // en j = 3 está el precio unitario | en j = 8 está la cantidad
                    if ((j > 3) && (j < 8))
                    {
                        SumatoriaY = SumatoriaY + (datos[ContadorY] * Integer.parseInt(TablaCorte.getValueAt(i, j).toString()));                                         
                        ContadorY++;                       
                    }
                    else
                    {
                        if (j == 8)
                        {
                            SumatoriaY = (SumatoriaY + Double.parseDouble(TablaCorte.getValueAt(i, 3).toString())) * 
                                    Double.parseDouble(TablaCorte.getValueAt(i, 8).toString());  
                        }
                    }                  
                }
                TablaTotal.setValueAt(SumatoriaY, i, 2);
                SumatoriaX = SumatoriaX + SumatoriaY;
                SumatoriaY = 0;
                ContadorY = 0;  
            }  

            LBL_CostoMateriaPrima.setText("$ " + mDF.format(SumatoriaX));
            LBL_CostoAdministrativo.setText("$ " + datosConstantes[0]);
            LBL_CostoFlete.setText("$ " + datosConstantes[0]);
            
            if (!"$ null".equals(LBL_CostoAdministrativo.getText()))
            {
                CostoSinUtilidad = SumatoriaX + (Double.parseDouble(datosConstantes[0].toString())*2);            
                Utilidad = CostoSinUtilidad * 0.30;
                IVA = (CostoSinUtilidad + Utilidad) * (Double.parseDouble(datosConstantes[1].toString()) / 100);
                CostoTotal = (CostoSinUtilidad + Utilidad) + IVA;
            }

            LBL_CostoUtilidad.setText("$ " + mDF.format(Utilidad));
            LBL_CostoIVA.setText("$ " + mDF.format(IVA));
            LBL_CostoTotal.setText("$ " + mDF.format(CostoTotal));
        }
        else
        {   
        }
    }
    
    public void LlenarTablaProductosPrimeraLinea()
    {
        mBD = new BD_1();
        mCPL = new ClaseProductosLinea();
        
        ArrayList mListaProdLinea = mBD.ConsultaProductosLinea();
        String [] datos;       
        
        for (Object mCPL_2 : mListaProdLinea)
        {
            datos = new String[8];
            
            mCPL = (ClaseProductosLinea) mCPL_2;

            datos[0] = mCPL.getClave();
            datos[1] = mCPL.getNombreProducto();
            datos[2] = String.valueOf(mCPL.getDiametro());
            datos[3] = String.valueOf(mCPL.getPesoMaterial());
            datos[4] = String.valueOf(mCPL.getUnidadEmpaque());
            datos[5] = String.valueOf(mCPL.getUnidadUtilizacionM());
            datos[6] = String.valueOf(mCPL.getUnidadUtilizacionKg());
            datos[7] = String.valueOf(mCPL.getPrecioSugerido());
            TablaProductosLinea.addRow(datos);
        } 
        this.TBL_ProdLinea = new javax.swing.JTable();
        this.TBL_ProdLinea.setModel(TablaProductosLinea);
        this.TBL_ProdLinea.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.TBL_ProdLinea.getColumnModel().getColumn(1).setPreferredWidth(50);
        this.TBL_ProdLinea.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.TBL_ProdLinea.getColumnModel().getColumn(3).setPreferredWidth(50);
        this.TBL_ProdLinea.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.TBL_ProdLinea.getColumnModel().getColumn(1).setPreferredWidth(50);
        this.TBL_ProdLinea.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.TBL_ProdLinea.getColumnModel().getColumn(3).setPreferredWidth(50);

        if (this.TBL_MateriaPrima.getRowCount() > 0) 
        {
            this.TBL_MateriaPrima.setRowSelectionInterval(0, 0);
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
            java.util.logging.Logger.getLogger(CotizacionPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CotizacionPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CotizacionPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CotizacionPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CotizacionPrevia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Agregar;
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JPanel JP_Corte;
    private javax.swing.JPanel JP_MateriaPrima;
    private javax.swing.JPanel JP_ProdLinea;
    private javax.swing.JPanel JP_Total;
    private javax.swing.JLabel LBL_CantidadVariable;
    private javax.swing.JLabel LBL_CostoAdministrativo;
    private javax.swing.JLabel LBL_CostoFlete;
    private javax.swing.JLabel LBL_CostoIVA;
    private javax.swing.JLabel LBL_CostoMateriaPrima;
    private javax.swing.JLabel LBL_CostoTotal;
    private javax.swing.JLabel LBL_CostoUtilidad;
    private javax.swing.JLabel LBL_PrecioProdLinea;
    private javax.swing.JLabel LBL_PrecioProdLinea1;
    private javax.swing.JLabel LBL_PrecioSugerido;
    private javax.swing.JLabel LBL_PrecioSugeridoPersonalizado;
    private javax.swing.JLabel LBL_TipoVariable;
    private javax.swing.JLabel LBL_TipoVariableN;
    private javax.swing.JTable TBL_Corte;
    private javax.swing.JTable TBL_MateriaPrima;
    private javax.swing.JTable TBL_ProdLinea;
    private javax.swing.JTable TBL_Total;
    private javax.swing.JTabbedPane TP_CotizacionPrevia;
    private javax.swing.JTextField TXT_Personalizado;
    private javax.swing.JTextField TXT_Search;
    private javax.swing.JTextField TXT_Search1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}

package Clases;

import Formularios.BD;
import java.awt.Image;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tabla_PdfVO {

    BD dao = null;

    public void visualizar_PdfVO(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Codigo");
        dt.addColumn("Nombre");
        dt.addColumn("Fecha");
        dt.addColumn("Archivo");

        ImageIcon icono = null;
        if (get_Image("32pdf.ico") != null) {
            icono = new ImageIcon(get_Image("32pdf.ico"));
        }

        dao = new BD();
        Archivo vo = new Archivo();
        ArrayList<Archivo> list = dao.Listar_PdfVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getID();
                fila[1] = vo.getNombre();
                fila[2] = vo.getFecha();
                if (vo.getPDF() != null) {
                fila[3] = new JButton("Abrir");
                            //new ImageIcon(get_Image("32pdf.ico"));
                } else {
                    fila[3] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }
    
    public void visualizar_Productos(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Codigo");
        dt.addColumn("Nombre");
        dt.addColumn("Fecha");
        dt.addColumn("Archivo");

        ImageIcon icono = null;
        if (get_Image("32pdf.ico") != null) {
            icono = new ImageIcon(get_Image("32pdf.ico"));
        }

        dao = new BD();
        Archivo vo = new Archivo();
        ArrayList<Archivo> list = dao.Listar_PdfVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getID();
                fila[1] = vo.getNombre();
                if (vo.getPDF() != null) {
                fila[2] = new JButton("Abrir");
                            //new ImageIcon(get_Image("32pdf.ico"));
                } else {
                    fila[2] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
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
}

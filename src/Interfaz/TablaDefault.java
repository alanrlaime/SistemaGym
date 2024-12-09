package Interfaz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC A
 */
import Proyecto.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableCellRenderer;

public class TablaDefault{
    private JTable table;
    private DefaultTableModel tableModel;
    private JScrollPane pane;

    public TablaDefault() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("CI"); 
        tableModel.addColumn("Nombre"); 
        tableModel.addColumn("Edad");
        tableModel.addColumn("Peso:");
        tableModel.addColumn("Estatura:");
        tableModel.addColumn("Objetivo");

        // Crear la tabla
        table = new JTable(tableModel) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // No editable
            }
        };

        // Configurar la tabla
        table.getTableHeader().setReorderingAllowed(false); // No se pueden mover las columnas
        table.getTableHeader().setResizingAllowed(false); // No se pueden cambiar el tamaño de las columnas

        // Establecer el tamaño de las columnas
        table.getColumnModel().getColumn(0).setPreferredWidth(100);  
        table.getColumnModel().getColumn(1).setPreferredWidth(100); 
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(50);
        table.getColumnModel().getColumn(4).setPreferredWidth(50);
        table.getColumnModel().getColumn(5).setPreferredWidth(200);

        // Añadir la tabla a un JScrollPane
        pane = new JScrollPane(table);
        
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem modificarItem = new JMenuItem("Modificar");
        JMenuItem eliminarItem = new JMenuItem("Eliminar");
        popupMenu.add(modificarItem);
        popupMenu.add(eliminarItem);
        
        eliminarItem.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                tableModel.removeRow(selectedRow); // Eliminar la fila seleccionada
            }
        });
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            private void showPopup(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                if (row >= 0 && row < table.getRowCount()) {
                    table.setRowSelectionInterval(row, row);
                } else {
                    table.clearSelection();
                }
                popupMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });
        
        
    }
    
    public JScrollPane devolver(){
        return pane;
    }
    
    public JTable getTabla(){
        return table;
    }
    
    public void mostrarEnLaTabla(MultiColaS h){
        ColaS aux = new ColaS();
        for (int i = 0; i < h.nroelem(); i++) {
            while (!h.esvacia(i)) {
                Sesion a = h.eliminar(i);
                int ci = a.getCliente().getCi();
                String nombre = a.getCliente().getNombre();
                int edad = a.getCliente().getEdad();
                int peso = a.getCliente().getPeso();
                double talla = a.getCliente().getAltura();
                String objetivo = a.getCliente().getObjetivo();
                tableModel.addRow(new Object[]{ci,nombre,edad+" años",peso,talla,objetivo});
                aux.adicionar(a);
            }
            h.vaciar(i, aux);
        }
    }
}

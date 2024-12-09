/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

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

public class TablaReservas{
    private JTable table;
    private DefaultTableModel tableModel;
    private JScrollPane pane;

    public TablaReservas() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID"); 
        tableModel.addColumn("Nombre del Reservante"); 
        tableModel.addColumn("Membresia");
        tableModel.addColumn("Fecha");

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
        table.getColumnModel().getColumn(0).setPreferredWidth(50);  // columna 1
        table.getColumnModel().getColumn(1).setPreferredWidth(100);  
        table.getColumnModel().getColumn(2).setPreferredWidth(100);  
        table.getColumnModel().getColumn(3).setPreferredWidth(200);  

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
    
    public void mostrarEnLaTabla(MulticolaR h){
        ColaR aux = new ColaR();
        for (int i = 0; i < h.nroelem(); i++) {
            while (!h.esvacia(i)) {
                Reserva a = h.eliminar(i);
                int id = a.getIdReserva();
                String nombre = a.getNombre();
                int membresia = a.getMembresia();
                String fecha = a.getFecha();
                tableModel.addRow(new Object[]{id,nombre,membresia,fecha});
                aux.adicionar(a);
            }
            h.vaciar(i, aux);
        }
    }
}

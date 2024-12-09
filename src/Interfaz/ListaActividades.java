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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaActividades {
    private DefaultListModel<String> listModel;
    private JList<String> list;

    public ListaActividades() {
        
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);
        
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Añadir");
        JButton removeButton = new JButton("Eliminar");
        JButton modifyButton = new JButton("Modificar");

        // Añadir acción para el botón "Eliminar"
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                }
            }
        });
    }
    
    public JList devol(){
        return list;
    }
    
    public void vaciarEnLista(LSActividad act){
        NodoA a = act.getP();
        while (a != null) {            
            listModel.addElement(a.getQ().getEspacio());
            a = a.getSig();
        }
    }
    
    public void reiniciarLista(){
        listModel.removeAllElements();
    }
}

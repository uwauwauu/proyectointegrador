/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reserva.entity.Platillo;
import com.reservarp.dao.PlatilloDAO;
import com.reservasrp.vistas.ConfigBeb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class ConfigBebController implements ActionListener{
    
    private PlatilloDAO model;
    private ConfigBeb vista;

    public ConfigBebController(ConfigBeb vista) {
        this.vista = vista;
        this.model = new PlatilloDAO();
        this.vista.BActualizar.addActionListener(this);
        this.vista.BAgregar.addActionListener(this);
        this.vista.BEliminar.addActionListener(this);
        this.vista.jTableBeb.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBebMouseClicked(evt);
            }
        });
        listarBebidas(vista.jTableBeb);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BAgregar) {
            agregarBebida();
            listarBebidas(vista.jTableBeb);
        }
        if (e.getSource() == vista.BActualizar) {
            actualizar();
            listarBebidas(vista.jTableBeb);
        }
        if (e.getSource() == vista.BEliminar) {
            eliminar();
            listarBebidas(vista.jTableBeb);
        }
    }
    
    private void jTableBebMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = vista.jTableBeb.getSelectedRow();
        if (selectedRow != -1) {
            String id_pl = vista.jTableBeb.getValueAt(selectedRow, 0).toString();
            vista.idbtxt.setText(id_pl);
        }
    }
    
    private void agregarBebida() {
        String nombre = vista.nombtxt.getText();
        String abreviatura = vista.abrvtxt.getText();
        double precio = Double.parseDouble(vista.punibtxt1.getText());
        Platillo platillo = new Platillo(nombre, precio, "Bebida", abreviatura);

        // Llamar al DAO para insertar el platillo
        if (model.agregarBebida(platillo)) {
            JOptionPane.showMessageDialog(vista, "Platillo registrado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error en el registro");
        }
    }
    
    public void listarBebidas(javax.swing.JTable tabla){
         javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabla.getModel();
         modelo.setRowCount(0); //resetear
         for (int i = 0; i < model.selectByTipo("Bebida").size(); i++) {
                modelo.addRow(new Object[]{
                    model.selectByTipo("Bebida").get(i).getId_pl(), 
                    model.selectByTipo("Bebida").get(i).getNom_pl(), 
                    model.selectByTipo("Bebida").get(i).getPuni_pl(), 
                    model.selectByTipo("Bebida").get(i).getTipo_pl(), 
                    model.selectByTipo("Bebida").get(i).getAbrv_pl()});
        }
    }
   
    private void actualizar(){
        int id = Integer.parseInt(vista.idbtxt.getText());
        String nombre = vista.nombtxt.getText();
        String abreviatura = vista.abrvtxt.getText();
        double precio = Double.parseDouble(vista.punibtxt1.getText());
        Platillo platillo = new Platillo(id, nombre, precio, "Bebida", abreviatura);
        if (model.update(platillo)) {
            JOptionPane.showMessageDialog(vista, "Platillo registrado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error en el registro");
        }
    }
    
    private void eliminar(){
        int id = Integer.parseInt(vista.idbtxt.getText());
        model.delete(id); 
    }
    
    
}


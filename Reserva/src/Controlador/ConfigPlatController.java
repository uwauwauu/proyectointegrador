/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reserva.entity.Platillo;
import com.reservarp.dao.PlatilloDAO;
import com.reservasrp.vistas.ConfigPlat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class ConfigPlatController implements ActionListener{
    private PlatilloDAO model;
    private ConfigPlat vista;

    public ConfigPlatController(ConfigPlat vista) {
        this.vista = vista;
        this.model = new PlatilloDAO();
        this.vista.BActualizar.addActionListener(this);
        this.vista.BAgregar.addActionListener(this);
        this.vista.BEliminar.addActionListener(this);
        this.vista.jTablePlatoFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePlatoFondoMouseClicked(evt);
            }
        });
        listarPlatos(vista.jTablePlatoFondo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BAgregar) {
            agregarPlato();
            listarPlatos(vista.jTablePlatoFondo);
        }
        if (e.getSource() == vista.BActualizar) {
            actualizar();
            listarPlatos(vista.jTablePlatoFondo);
        }
        if (e.getSource() == vista.BEliminar) {
            eliminar();
            listarPlatos(vista.jTablePlatoFondo);
        }
    }
    
    private void jTablePlatoFondoMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = vista.jTablePlatoFondo.getSelectedRow();
        if (selectedRow != -1) {
            String id_pl = vista.jTablePlatoFondo.getValueAt(selectedRow, 0).toString();
            vista.IDtxt.setText(id_pl);
        }
    }

    private void agregarPlato() {
        String nombre = vista.Nomtxt.getText();
        String abreviatura = vista.Abrvtxt.getText();
        double precio = Double.parseDouble(vista.Punitxt.getText());
        Platillo platillo = new Platillo(nombre, precio, "Plato de fondo", abreviatura);

        // Llamar al DAO para insertar el platillo
        if (model.agregarPlato(platillo)) {
            JOptionPane.showMessageDialog(vista, "Platillo registrado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error en el registro");
        }
    }

    public void listarPlatos(javax.swing.JTable tabla) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); //resetear
        for (int i = 0; i < model.selectByTipo("Plato de fondo").size(); i++) {
            modelo.addRow(new Object[]{
                model.selectByTipo("Plato de fondo").get(i).getId_pl(),
                model.selectByTipo("Plato de fondo").get(i).getNom_pl(),
                model.selectByTipo("Plato de fondo").get(i).getPuni_pl(),
                model.selectByTipo("Plato de fondo").get(i).getTipo_pl(),
                model.selectByTipo("Plato de fondo").get(i).getAbrv_pl()});
        }
    }

    private void actualizar() {
        int id = Integer.parseInt(vista.IDtxt.getText());
        String nombre = vista.Nomtxt.getText();
        String abreviatura = vista.Abrvtxt.getText();
        double precio = Double.parseDouble(vista.Punitxt.getText());
        Platillo platillo = new Platillo(id, nombre, precio, "Plato de fondo", abreviatura);
        if (model.update(platillo)) {
            JOptionPane.showMessageDialog(vista, "Platillo registrado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error en el registro");
        }
    }

    private void eliminar() {
        int id = Integer.parseInt(vista.IDtxt.getText());
        model.delete(id);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reserva.entity.Platillo;
import com.reservarp.dao.PlatilloDAO;
import com.reservasrp.vistas.ConfigEn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class ConfigEnController implements ActionListener {
    private PlatilloDAO model;
    private ConfigEn vista;

    public ConfigEnController(ConfigEn vista) {
        this.vista = vista;
        this.model = new PlatilloDAO();
        this.vista.BActualizar.addActionListener(this);
        this.vista.BAgregar.addActionListener(this);
        this.vista.BEliminar.addActionListener(this);
        this.vista.jTableEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               jTableEntradaMouseClicked(evt);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BAgregar) {
            agregarEntrada();
            listarEntradas(vista.jTableEntrada);
        }
        if (e.getSource() == vista.BActualizar) {
            actualizar();
            listarEntradas(vista.jTableEntrada);
        }
        if (e.getSource() == vista.BEliminar) {
            eliminar();
            listarEntradas(vista.jTableEntrada);
        }
    }
    
    private void jTableEntradaMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = vista.jTableEntrada.getSelectedRow();
        if (selectedRow != -1) {
            String id_pl = vista.jTableEntrada.getValueAt(selectedRow, 0).toString();
            vista.idtxt.setText(id_pl);
        }
    }

    private void agregarEntrada() {
        String nombre = vista.nomtxt.getText();
        String abreviatura = vista.abrvtxt.getText();
        double precio = Double.parseDouble(vista.punitxt.getText());
        Platillo platillo = new Platillo(nombre, precio, "Entrada", abreviatura);

        // Llamar al DAO para insertar el platillo
        if (model.agregarEntrada(platillo)) {
            JOptionPane.showMessageDialog(vista, "Platillo registrado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error en el registro");
        }
    }

    public void listarEntradas(javax.swing.JTable tabla) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); //resetear
        for (int i = 0; i < model.selectByTipo("Entrada").size(); i++) {
            modelo.addRow(new Object[]{
                model.selectByTipo("Entrada").get(i).getId_pl(),
                model.selectByTipo("Entrada").get(i).getNom_pl(),
                model.selectByTipo("Entrada").get(i).getPuni_pl(),
                model.selectByTipo("Entrada").get(i).getTipo_pl(),
                model.selectByTipo("Entrada").get(i).getAbrv_pl()});
        }
    }

    private void actualizar() {
        int id = Integer.parseInt(vista.idtxt.getText());
        String nombre = vista.nomtxt.getText();
        String abreviatura = vista.abrvtxt.getText();
        double precio = Double.parseDouble(vista.punitxt.getText());
        Platillo platillo = new Platillo(id, nombre, precio, "Entrada", abreviatura);
        if (model.update(platillo)) {
            JOptionPane.showMessageDialog(vista, "Platillo registrado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error en el registro");
        }
    }

    private void eliminar() {
        int id = Integer.parseInt(vista.idtxt.getText());
        model.delete(id);
    }
}

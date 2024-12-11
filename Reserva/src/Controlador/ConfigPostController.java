/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reserva.entity.Platillo;
import com.reservarp.dao.PlatilloDAO;
import com.reservasrp.vistas.ConfigPost;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class ConfigPostController implements ActionListener{
    
    private PlatilloDAO model;
    private ConfigPost vista;

    public ConfigPostController(ConfigPost vista) {
        this.vista = vista;
        this.model = new PlatilloDAO();
        this.vista.BActualizar.addActionListener(this);
        this.vista.BAgregar.addActionListener(this);
        this.vista.BEliminar.addActionListener(this);
        this.vista.jTablePostres.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePostresMouseClicked(evt);
            }
        });
        listarPostres(vista.jTablePostres);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BAgregar) {
            agregarPostres();
            listarPostres(vista.jTablePostres);
        }
        if (e.getSource() == vista.BActualizar) {
            actualizar();
            listarPostres(vista.jTablePostres);
        }
        if (e.getSource() == vista.BEliminar) {
            eliminar();
            listarPostres(vista.jTablePostres);
        }
    }
    
    private void jTablePostresMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = vista.jTablePostres.getSelectedRow();
        if (selectedRow != -1) {
            String id_pl = vista.jTablePostres.getValueAt(selectedRow, 0).toString();
            vista.id_pstxt.setText(id_pl);
        }
    }

    private void agregarPostres() {
        String nombre = vista.nompostxt.getText();
        String abreviatura = vista.abrvtxt.getText();
        double precio = Double.parseDouble(vista.punitxt.getText());
        Platillo platillo = new Platillo(nombre, precio, "Postre", abreviatura);

        // Llamar al DAO para insertar el platillo
        if (model.agregarPostre(platillo)) {
            JOptionPane.showMessageDialog(vista, "Platillo registrado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error en el registro");
        }
    }

    public void listarPostres(javax.swing.JTable tabla) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); //resetear
        for (int i = 0; i < model.selectByTipo("Postre").size(); i++) {
            modelo.addRow(new Object[]{
                model.selectByTipo("Postre").get(i).getId_pl(),
                model.selectByTipo("Postre").get(i).getNom_pl(),
                model.selectByTipo("Postre").get(i).getPuni_pl(),
                model.selectByTipo("Postre").get(i).getTipo_pl(),
                model.selectByTipo("Postre").get(i).getAbrv_pl()});
        }
    }

    private void actualizar() {
        int id = Integer.parseInt(vista.id_pstxt.getText());
        String nombre = vista.nompostxt.getText();
        String abreviatura = vista.abrvtxt.getText();
        double precio = Double.parseDouble(vista.punitxt.getText());
        Platillo platillo = new Platillo(id, nombre, precio, "Postre", abreviatura);
        if (model.update(platillo)) {
            JOptionPane.showMessageDialog(vista, "Platillo registrado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error en el registro");
        }
    }

    private void eliminar() {
        int id = Integer.parseInt(vista.id_pstxt.getText());
        model.delete(id);
    }
}

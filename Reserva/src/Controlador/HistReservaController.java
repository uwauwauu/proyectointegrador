/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reservarp.dao.ReservaDAO;
import com.reservasrp.vistas.HistReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Natalia
 */
public class HistReservaController implements ActionListener{
    private HistReserva vista;
    private ReservaDAO model;

    public HistReservaController(HistReserva vista) {
        this.vista = vista;
        this.model = new ReservaDAO();
        this.vista.BEditar.addActionListener(this);
        this.vista.BEliminar.addActionListener(this);
        this.vista.BActualizar.addActionListener(this);
        this.vista.BRefresh.addActionListener(this);
        this.vista.BVolver.addActionListener(this);
        this.vista.jTableReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReservasMouseClicked(evt);
            }
        });
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.BEditar){
            
        }
        if(e.getSource()== vista.BEliminar){
            Integer ID_res = Integer.valueOf(vista.IDtxt.getText());
            model.eliminar(ID_res);
        }
        if(e.getSource()== vista.BActualizar){
            
        }
        if(e.getSource()== vista.BRefresh){
            listarReserva(vista.jTableReservas);
        }
        if(e.getSource()== vista.BVolver){
            
        }
    }
    
    private void jTableReservasMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = vista.jTableReservas.getSelectedRow();
        if (selectedRow != -1) {
            String id_res = vista.jTableReservas.getValueAt(selectedRow, 0).toString();   
            vista.IDtxt.setText(id_res);
        }
    }
    
    public void listarReserva(javax.swing.JTable tabla){
         javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabla.getModel();
         modelo.setRowCount(0); //resetear
         for (int i = 0; i < model.list().size(); i++) {
                modelo.addRow(new Object[]{
                    model.list().get(i).getId_res(), 
                    model.list().get(i).getFec_res(), 
                    model.list().get(i).getH_inicio(), 
                    model.list().get(i).getH_final(), 
                    model.list().get(i).getNum_personas(),
                    model.list().get(i).getDni_cli(),
                    model.list().get(i).getId_mes()});
        }
    }
}

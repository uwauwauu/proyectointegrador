/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reservarp.dao.PedidoDAO;
import com.reservarp.dao.ReservaDAO;
import com.reservasrp.vistas.InicioEmpleado;
import com.reservasrp.vistas.RegCliente;
import com.reservasrp.vistas.RegReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Natalia
 */
public class ReservaController implements ActionListener{
    private RegReserva vista;
    private ReservaDAO model;
    private PedidoDAO pedido;

    public ReservaController(RegReserva vista) {
        this.vista = vista;
        this.model = new ReservaDAO();
        this.vista.BRegCliente.addActionListener(this);
        this.vista.BAgrBebida.addActionListener(this);
        this.vista.BAgrEntrada.addActionListener(this);
        this.vista.BAgrPlatillo.addActionListener(this);
        this.vista.BAgrPostre.addActionListener(this);
        this.vista.BLimpiar.addActionListener(this);
        this.vista.BReservar.addActionListener(this);
        this.vista.BVolver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BRegCliente) {
            new RegCliente().setVisible(true);
        }
        if (e.getSource() == vista.BAgrBebida) {
           
        }
        if (e.getSource() == vista.BAgrPlatillo) {
            
        }
        if (e.getSource() == vista.BAgrPostre) {
            
        }
        if (e.getSource() == vista.BLimpiar) {
            reset();
        }
        if (e.getSource() == vista.BReservar) {
            
        }
        if (e.getSource() == vista.BVolver) {
            new InicioEmpleado().setVisible(true);
            vista.dispose();
        }   
    }
    
    public void reset() {
        vista.DNIText.setText("");
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) vista.jTableReserva.getModel();
        model.setRowCount(0); //resetear
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reservasrp.vistas.ElegirPedido;
import com.reservasrp.vistas.Inicio;
import com.reservasrp.vistas.RegMesa;
import com.reservasrp.vistas.Reserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Natalia
 */
public class InicioController implements ActionListener{
    private Inicio vista;

    public InicioController(Inicio vista) {
        this.vista = vista;
        this.vista.BRegMesas.addActionListener(this);
        this.vista.Logout.addActionListener(this);
        this.vista.BVisPedidos.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.BRegMesas){
            new RegMesa().setVisible(true);
        }
        if(e.getSource()== vista.Logout){
            new Reserva().setVisible(true);
        }
        if(e.getSource()== vista.BVisPedidos){
            new ElegirPedido().setVisible(true);
        }
    }
    
}

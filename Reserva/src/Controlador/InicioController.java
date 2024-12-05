/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reservasrp.vistas.RegReserva;
import com.reservasrp.vistas.HistReserva;
import com.reservasrp.vistas.Reportes;
import com.reservasrp.vistas.InicioAdmin;
import com.reservasrp.vistas.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class InicioController implements ActionListener{
    private InicioAdmin vista;
    private JFrame frame;

    public InicioController(InicioAdmin vista) {
        this.vista = vista;
        this.vista.BRegReservas.addActionListener(this);
        this.vista.BReportes.addActionListener(this);
        this.vista.BLogout.addActionListener(this);
    }
    
    private void logout(){
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirma si deseas cerrar sesión", "Reservas", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            vista.dispose();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.BRegReservas){
            new RegReserva().setVisible(true);
        }
        if(e.getSource()== vista.BHistReserva){
            new HistReserva().setVisible(true);
        }
        if(e.getSource()== vista.BReportes){
            new Reportes().setVisible(true);
        }
        if(e.getSource()== vista.BLogout){
            logout();
        }
    }
    
}

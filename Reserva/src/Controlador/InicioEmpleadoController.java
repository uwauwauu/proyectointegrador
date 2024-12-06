/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reservasrp.vistas.HistReserva;
import com.reservasrp.vistas.InicioEmpleado;
import com.reservasrp.vistas.Login;
import com.reservasrp.vistas.RegReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class InicioEmpleadoController implements ActionListener{
    private JFrame frame;
    private InicioEmpleado vista;

    public InicioEmpleadoController(InicioEmpleado vista) {
        this.vista = vista;
        this.vista.BHistReserva.addActionListener(this);
        this.vista.BRegReserva.addActionListener(this);
        this.vista.Logout.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.BHistReserva){
            new HistReserva().setVisible(true);
        }
        if(e.getSource()== vista.BRegReserva){
            new RegReserva().setVisible(true);
        }
         if(e.getSource()== vista.Logout){
            logout();
        }
    }
    
    private void logout(){
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirma si deseas cerrar sesión", "Reservas", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            vista.dispose();
        }
    }
}

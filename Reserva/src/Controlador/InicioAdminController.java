 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reservasrp.vistas.Config;
import com.reservasrp.vistas.HistReserva;
import com.reservasrp.vistas.Reportes;
import com.reservasrp.vistas.InicioAdmin;
import com.reservasrp.vistas.Login;
import com.reservasrp.vistas.RegUsr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class InicioAdminController implements ActionListener{
    private InicioAdmin vista;
    private JFrame frame;

    public InicioAdminController(InicioAdmin vista) {
        this.vista = vista;
        this.vista.BRegUser.addActionListener(this);
        this.vista.BLogout.addActionListener(this);
        this.vista.BRepCon.addActionListener(this);
        this.vista.BHistReserva.addActionListener(this);
        agregarEventos();
    }
    
    private void logout(){
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirma si deseas cerrar sesión", "Reservas", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            vista.dispose();
        }
    }
    
    private void agregarEventos() {
        vista.BConfig.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                accionBConfig(evt);
            }
        });
    }
    
    private void accionBConfig(MouseEvent evt) {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirma si deseas entrar al modo de configuración", "Reservas", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            new Config().setVisible(true);
            vista.dispose();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.BHistReserva){
            new HistReserva().setVisible(true);
        }
        if(e.getSource()== vista.BRepCon){
            new Reportes().setVisible(true);
        }
        if(e.getSource()== vista.BRegUser){
            new RegUsr().setVisible(true);
        }
        if(e.getSource()== vista.BLogout){
            logout();
        }
    }
    
}

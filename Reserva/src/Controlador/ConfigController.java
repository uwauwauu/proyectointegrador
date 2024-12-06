/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reservasrp.vistas.Config;
import com.reservasrp.vistas.ConfigBeb;
import com.reservasrp.vistas.ConfigCate;
import com.reservasrp.vistas.ConfigPlat;
import com.reservasrp.vistas.ConfigUsr;
import com.reservasrp.vistas.InicioAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Natalia
 */
public class ConfigController implements ActionListener{
    private Config vista;

    public ConfigController(Config vista) {
        this.vista = vista;
        this.vista.BConfCat.addActionListener(this);
        this.vista.BVisPlatillos.addActionListener(this);
        this.vista.BBebidas.addActionListener(this);
        this.vista.BRegUsuarios.addActionListener(this);
        this.vista.BReturn.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BConfCat) {
            new ConfigCate().setVisible(true);
        }
        if (e.getSource() == vista.BVisPlatillos) {
            new ConfigPlat().setVisible(true);
        }
        if (e.getSource() == vista.BBebidas) {
            new ConfigBeb().setVisible(true);
        }
        if (e.getSource() == vista.BRegUsuarios) {
            new ConfigUsr().setVisible(true);
        }
        if (e.getSource() == vista.BReturn) {
            new InicioAdmin().setVisible(true);
            vista.dispose();
        }
    }
}

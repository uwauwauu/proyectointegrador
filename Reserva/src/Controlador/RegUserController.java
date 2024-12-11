/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reserva.entity.Usuario;
import com.reservarp.dao.UsuarioDAO;
import com.reservasrp.vistas.RegUsr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class RegUserController implements ActionListener{
    private RegUsr vista;
    private UsuarioDAO model;

    public RegUserController(RegUsr vista) {
        this.vista = vista;
        this.model = new UsuarioDAO();
        this.vista.BRegister.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BRegister) {
            registrar();
        }
    }
    
    public void registrar() {
        String dni = vista.DNItxt.getText();
        String nombre = vista.Nombretxt.getText();
        String usuario = vista.jUsuariotxt.getText();
        String contraseña = String.valueOf(vista.jContraseñatxt.getPassword());
        boolean privilegios = vista.BRadioPrivilegios.isSelected();
        Usuario us = new Usuario(dni, nombre, usuario, contraseña, privilegios);
        if(usuario!=null&contraseña!=null){
            if (!model.validarUsuario(us)) {
                model.insert(us);
                JOptionPane.showMessageDialog(vista, "Usuario registrado");
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario ya está registrado");
            }
        }else{
            JOptionPane.showMessageDialog(vista, "Llenar los datos necesarios");
        }
        
    }
}

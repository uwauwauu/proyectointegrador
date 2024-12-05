/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reserva.entity.Usuario;
import com.reservarp.dao.UsuarioDAO;
import com.reservasrp.vistas.Inicio;
import com.reservasrp.vistas.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class LoginController implements ActionListener{
    private Login vista;
    private UsuarioDAO model;

    public LoginController(Login vista) {
        this.vista = vista;
        this.model = new UsuarioDAO();
        this.vista.BLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.BLogin){
            validar();
        }
    }
    
    public void validar(){
        String usuario = vista.jUsuariotxt.getText();
        String contraseña = String.valueOf(vista.jContraseñatxt.getPassword());
        Usuario us = new Usuario(usuario, contraseña);
        if(model.validarUsuario(us)){
            new Inicio().setVisible(true);
            vista.dispose();
        }else{
            JOptionPane.showMessageDialog(vista, "Usuario no registrado");
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reserva.entity.Cliente;
import com.reservarp.dao.ClienteDAO;
import com.reservasrp.vistas.ResCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class ClienteController implements ActionListener{
    private ResCliente vista;
    private ClienteDAO model;

    public ClienteController(ResCliente vista) {
        this.vista = vista;
        this.model = new ClienteDAO();
        this.vista.BRegCli.addActionListener(this);
    }
       
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BRegCli) {
            insertarCliente();
        }
    }
    
    public void insertarCliente(){
        String dni_cli = vista.DNItxt.getText();
        String nom_cli = vista.Nombretxt.getText();
        String telf_cli = vista.Telftxt.getText();
        Cliente cli = new Cliente(dni_cli, nom_cli, telf_cli);
        if(model.insert(cli)){
             JOptionPane.showMessageDialog(vista, "Cliente registrado");
        }else{
            JOptionPane.showMessageDialog(vista, "Cliente no registrado");
        }
    }
    
}

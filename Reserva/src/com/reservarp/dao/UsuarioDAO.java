/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservarp.dao;

import com.reserva.entity.Usuario;
import com.reservasrp.connectionDB.ConexiónBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Natalia
 */
public class UsuarioDAO {
    private static PreparedStatement pstm;
    private static ResultSet res;
    private static ConexiónBD con;
    private static Statement st;

    public UsuarioDAO() {
        con = ConexiónBD.getInstance();
    }
    
     public boolean validarUsuario(Usuario us){
         boolean result = false;
         final String SQL_CONSULTA ="SELECT * FROM usuario WHERE nom_usuario = ? AND contraseña = ?";
        try {
            pstm =con.getConnection().prepareStatement(SQL_CONSULTA);
            pstm.setString(1, us.getUsuario());
            pstm.setString(2, us.getContraseña());
            res = pstm.executeQuery();
            if(res.next()){
                result = true;
            }
        } catch(Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }return result;
     }
}

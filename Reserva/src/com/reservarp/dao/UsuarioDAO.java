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
         final String SQL_CONSULTA ="SELECT * FROM usuarios WHERE user_us = ? AND con_us = ?";
        try {
            pstm =con.getConnection().prepareStatement(SQL_CONSULTA);
            pstm.setString(1, us.getUser_us());
            pstm.setString(2, us.getCon_us());
            res = pstm.executeQuery();
            if(res.next()){
                result = true;
            }
        } catch(Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }return result;
     }
     
     public Boolean verificarPrivilegios(String userId) {
        String sql = "SELECT privilegios_us FROM usuarios WHERE user_us = ?";
        try (PreparedStatement statement = con.getConnection().prepareStatement(sql)) {
            statement.setString(1, userId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getBoolean("privilegios_us");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // En caso de error o no encontrar al usuario
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservarp.dao;

import com.reserva.entity.Platillo;
import com.reservasrp.connectionDB.ConexiónBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Natalia
 */
public class PlatilloDAO {
    private static PreparedStatement pstm;
    private static ResultSet res;
    private static ConexiónBD con;
    private static Statement st;

    public PlatilloDAO() {
        con = ConexiónBD.getInstance();
    }
    
     public boolean insert(Platillo pl) {
        boolean result = false;
        final String SQL_INSERT="insert into platillos (nom_pl, puni_pl, tipo_pl, abrv_pl) values(?,?,?,?)";
        try{
            pstm = con.getConnection().prepareStatement(SQL_INSERT);
            pstm.setString(1, pl.getNom_pl());
            pstm.setDouble(2, pl.getPuni_pl());
            pstm.setString(3, pl.getTipo_pl());
            pstm.setString(4, pl.getAbrv_pl());
            if(pstm.executeUpdate()>0){
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar datos "+e.getMessage());
            e.printStackTrace();
        }return result;
    }
    
}

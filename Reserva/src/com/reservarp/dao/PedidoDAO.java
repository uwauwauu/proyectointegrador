/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservarp.dao;

import com.reserva.entity.Pedido;
import com.reservasrp.connectionDB.ConexiónBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Natalia
 */
public class PedidoDAO {
    private static PreparedStatement pstm;
    private static ResultSet res;
    private static ConexiónBD con;
    private static Statement st;

    public PedidoDAO() {
        con = ConexiónBD.getInstance();
    }
    
    public boolean insert(Pedido pe) {
        boolean result = false;
        final String SQL_INSERT = "insert into pedido (desc_pe, total_pe, id_res) values(?,?,?)";
        try {
            pstm = con.getConnection().prepareStatement(SQL_INSERT);
            pstm.setString(1, pe.getDesc_pe());
            pstm.setDouble(2, pe.getTotal_pe());
            pstm.setInt(3, pe.getId_res());
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar datos " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
}

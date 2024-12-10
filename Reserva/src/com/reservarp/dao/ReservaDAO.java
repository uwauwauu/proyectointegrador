/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservarp.dao;
import com.reserva.entity.Reserva;
import com.reservasrp.connectionDB.ConexiónBD;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReservaDAO {
    private static PreparedStatement pstm;
    private static ResultSet rs;
    private static ConexiónBD con;
    private static Statement st;

    public ReservaDAO() {
        con = ConexiónBD.getInstance();
    }
    
    
    
//    lista por fecha para comprobar disponibilidad
    public List<Reserva> listarFecha(String fec_res) {
        List<Reserva> listarFecha = new ArrayList<>();
        String selectQuery = "SELECT * FROM reservas WHERE fec_res = ?";
        
        try {
            pstm = con.getConnection().prepareStatement(selectQuery);
            pstm.setString(1, fec_res);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Reserva res = new Reserva(
                        rs.getInt("id_res"), 
                        rs.getString("fec_res"), 
                        rs.getString("h_inicio"), 
                        rs.getString("h_final"), 
                        rs.getInt("num_personas"),
                        rs.getString("dni_cli"), 
                        rs.getInt("id_ms")
                );
                listarFecha.add(res);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, "Error al listar reservas por fecha", ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, "Error al cerrar recursos", ex);
            }
        }
        return listarFecha;
    }
    
    public List<Reserva> list() {
        List<Reserva> list = new ArrayList<>();
        String selectQuery = "select * from productos";
        try {
            st = con.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            while (rs.next()) {
                Reserva res = new Reserva(
                        rs.getInt("id_res"),
                        rs.getString("fec_res"),
                        rs.getString("h_inicio"),
                        rs.getString("h_final"),
                        rs.getInt("num_personas"),
                        rs.getString("dni_cli"),
                        rs.getInt("id_ms")
                );
                list.add(res);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public void eliminar(Integer ID_res) {
        final String SQL_DELETE = "delete from reservas where id_res=?";
        try {
            pstm = con.getConnection().prepareStatement(SQL_DELETE);
            pstm.setInt(1, ID_res);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar " + e.getMessage());
            e.printStackTrace();
        }
    }
}


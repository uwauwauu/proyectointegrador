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
import java.util.ArrayList;
import java.util.List;

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
    
     public boolean agregarBebida(Platillo platillo) {
        boolean result = false;
        final String SQL_INSERT = "INSERT INTO platillos (nom_pl, puni_pl, tipo_pl, abrv_pl) VALUES (?, ?, ?, ?)";
        try {
            pstm = con.getConnection().prepareStatement(SQL_INSERT);
            pstm.setString(1, platillo.getNom_pl());
            pstm.setDouble(2, platillo.getPuni_pl());
            pstm.setString(3, "Bebida"); // Establecemos siempre 'Bebida'
            pstm.setString(4, platillo.getAbrv_pl());
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar bebida: " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

     public boolean agregarPlato(Platillo platillo) {
        boolean result = false;
        final String SQL_INSERT = "INSERT INTO platillos (nom_pl, puni_pl, tipo_pl, abrv_pl) VALUES (?, ?, ?, ?)";
        try {
            pstm = con.getConnection().prepareStatement(SQL_INSERT);
            pstm.setString(1, platillo.getNom_pl());
            pstm.setDouble(2, platillo.getPuni_pl());
            pstm.setString(3, "Plato de fondo"); // Establecemos siempre 'Plato de fondo'
            pstm.setString(4, platillo.getAbrv_pl());
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar bebida: " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    public boolean agregarPostre(Platillo platillo) {
        boolean result = false;
        final String SQL_INSERT = "INSERT INTO platillos (nom_pl, puni_pl, tipo_pl, abrv_pl) VALUES (?, ?, ?, ?)";
        try {
            pstm = con.getConnection().prepareStatement(SQL_INSERT);
            pstm.setString(1, platillo.getNom_pl());
            pstm.setDouble(2, platillo.getPuni_pl());
            pstm.setString(3, "Postre"); // Establecemos siempre 'Postre'
            pstm.setString(4, platillo.getAbrv_pl());
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar bebida: " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
    public boolean agregarEntrada(Platillo platillo) {
        boolean result = false;
        final String SQL_INSERT = "INSERT INTO platillos (nom_pl, puni_pl, tipo_pl, abrv_pl) VALUES (?, ?, ?, ?)";
        try {
            pstm = con.getConnection().prepareStatement(SQL_INSERT);
            pstm.setString(1, platillo.getNom_pl());
            pstm.setDouble(2, platillo.getPuni_pl());
            pstm.setString(3, "Entrada"); // Establecemos siempre 'Bebida'
            pstm.setString(4, platillo.getAbrv_pl());
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar bebida: " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
    public List<Platillo> selectByTipo(String tipo) {
        List<Platillo> platillos = new ArrayList<>();
        final String SQL_SELECTBYTIPO = "SELECT * FROM platillos WHERE tipo_pl = ?";

        try {
            pstm = con.getConnection().prepareStatement(SQL_SELECTBYTIPO);
            pstm.setString(1, tipo); // Pasamos el valor del tipo como parámetro

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                // Creamos un objeto Platillo con los datos de la consulta
                Platillo p = new Platillo(
                        rs.getInt("id_pl"),
                        rs.getString("nom_pl"),
                        rs.getDouble("puni_pl"),
                        rs.getString("tipo_pl"),
                        rs.getString("abrv_pl")
                );
                platillos.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al recuperar platillos por tipo: " + e.getMessage());
            e.printStackTrace();
        }
        return platillos;
    }
    
    public boolean update(Platillo platillo) {
        boolean resultado = false;
        final String SQL_UPDATE = "UPDATE platillos SET nom_pl = ?, puni_pl = ?, tipo_pl = ?, abrv_pl = ? WHERE id_pl = ?";
        try {
            pstm = con.getConnection().prepareStatement(SQL_UPDATE);
            pstm.setString(1, platillo.getNom_pl());
            pstm.setDouble(2, platillo.getPuni_pl());
            pstm.setString(3, platillo.getTipo_pl());
            pstm.setString(4, platillo.getAbrv_pl());
            pstm.setInt(5, platillo.getId_pl());
            
            if(pstm.executeUpdate()>0){
                resultado = true;
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar datos "+e.getMessage());
            e.printStackTrace();
        }
       return resultado;
    }
    
    public void delete(Integer id) {
        final String SQL_DELETE = "delete from platillos where id_pl=?";
        try {
            pstm = con.getConnection().prepareStatement(SQL_DELETE);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar " + e.getMessage());
            e.printStackTrace();
        }
    }
}

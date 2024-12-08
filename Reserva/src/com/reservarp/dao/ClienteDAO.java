/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservarp.dao;

import com.reserva.entity.Cliente;
import com.reservasrp.connectionDB.ConexiónBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Natalia
 */
public class ClienteDAO {
    private static PreparedStatement pstm;
    private static ResultSet res;
    private static ConexiónBD con;
    private static Statement st;

    public ClienteDAO() {
        con = ConexiónBD.getInstance();
    }

    public boolean validarCliente(Cliente cli){
        boolean result = false;
        final String SQL_CONSULTA = "SELECT * FROM clientes WHERE dni_cli =?";
        try {
            pstm = con.getConnection().prepareStatement(SQL_CONSULTA);
            pstm.setString(1, cli.getDni_cli());
            res = pstm.executeQuery();
            if (res.next()) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return result;
    }
    
    public boolean insert(Cliente cli) {
        boolean result = false;
        final String SQL_INSERT="insert into cliente (dni_cli, nom_cli, telf_cli) values(?,?,?)";
        try{
            pstm = con.getConnection().prepareStatement(SQL_INSERT);
            pstm.setString(1, cli.getDni_cli());
            pstm.setString(2, cli.getNom_cli());
            pstm.setInt(3, cli.getId_cli());
            if(pstm.executeUpdate()>0){
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar datos "+e.getMessage());
            e.printStackTrace();
        }return result;
    }
}

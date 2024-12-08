/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservasrp.connectionDB;

/**
 *
 * @author Natalia
 */
import java.sql.Connection;
import java.sql.DriverManager;


public class ConexiónBD {
   
    //static xq es único
    private static ConexiónBD instance=null;
    private static Connection con;
    private static final String URL="jdbc:mysql://localhost/reservasbd";
    private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    private static final String USER ="root";
    private static final String PASS="72152350N";
   
    private ConexiónBD(){
        try {
            //carga la clase Driver en memoria del computador
            Class.forName(DRIVER);
            //Establecer la conexión con la base de datos
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            System.out.println("Error al establecer la conexión: "+ex.getMessage());
            ex.printStackTrace();
        }finally{
            System.out.println("Conexión establecida");
        }
    }
    public synchronized static ConexiónBD getInstance(){
        if(instance==null){
            instance = new ConexiónBD();
        }
    return instance;  
    }
    
    public Connection getConnection() {
        return con;
    }

    public void close() {
        instance = null;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.entity;

/**
 *
 * @author Natalia
 */
public class Mesa {
    private int id_mes;
    private String piso_mes;

    public Mesa(int id_mes, String piso_mes) {
        this.id_mes = id_mes;
        this.piso_mes = piso_mes;
    }

    public Mesa(String piso_mes) {
        this.piso_mes = piso_mes;
    }

    public int getId_mes() {
        return id_mes;
    }

    public void setId_mes(int id_mes) {
        this.id_mes = id_mes;
    }

    public String getPiso_mes() {
        return piso_mes;
    }

    public void setPiso_mes(String piso_mes) {
        this.piso_mes = piso_mes;
    }
    
}

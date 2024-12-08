/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.entity;

/**
 *
 * @author Natalia
 */
public class Reserva {
    private int id_res;
    private String fec_res;
    private String h_inicio;
    private String h_final;
    private String dni_cli;
    private int id_mes;

    public Reserva(int id_res, String fec_res, String h_inicio, String h_final, String dni_cli, int id_mes) {
        this.id_res = id_res;
        this.fec_res = fec_res;
        this.h_inicio = h_inicio;
        this.h_final = h_final;
        this.dni_cli = dni_cli;
        this.id_mes = id_mes;
    }

    public Reserva(String fec_res, String h_inicio, String h_final, String dni_cli, int id_mes) {
        this.fec_res = fec_res;
        this.h_inicio = h_inicio;
        this.h_final = h_final;
        this.dni_cli = dni_cli;
        this.id_mes = id_mes;
    }

    public int getId_res() {
        return id_res;
    }

    public void setId_res(int id_res) {
        this.id_res = id_res;
    }

    public String getFec_res() {
        return fec_res;
    }

    public void setFec_res(String fec_res) {
        this.fec_res = fec_res;
    }

    public String getH_inicio() {
        return h_inicio;
    }

    public void setH_inicio(String h_inicio) {
        this.h_inicio = h_inicio;
    }

    public String getH_final() {
        return h_final;
    }

    public void setH_final(String h_final) {
        this.h_final = h_final;
    }

    public String getDni_cli() {
        return dni_cli;
    }

    public void setDni_cli(String dni_cli) {
        this.dni_cli = dni_cli;
    }

    public int getId_mes() {
        return id_mes;
    }

    public void setId_mes(int id_mes) {
        this.id_mes = id_mes;
    }
}

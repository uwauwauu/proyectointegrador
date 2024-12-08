/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.entity;

/**
 *
 * @author Natalia
 */
public class Cliente {
    private int id_cli;
    private String dni_cli;
    private String nom_cli;
    private String telf_cli;

    public Cliente(int id_cli, String dni_cli, String nom_cli, String telf_cli) {
        this.id_cli = id_cli;
        this.dni_cli = dni_cli;
        this.nom_cli = nom_cli;
        this.telf_cli = telf_cli;
    }

    public Cliente(String dni_cli, String nom_cli, String telf_cli) {
        this.dni_cli = dni_cli;
        this.nom_cli = nom_cli;
        this.telf_cli = telf_cli;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getDni_cli() {
        return dni_cli;
    }

    public void setDni_cli(String dni_cli) {
        this.dni_cli = dni_cli;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public String getTelf_cli() {
        return telf_cli;
    }

    public void setTelf_cli(String telf_cli) {
        this.telf_cli = telf_cli;
    }
}

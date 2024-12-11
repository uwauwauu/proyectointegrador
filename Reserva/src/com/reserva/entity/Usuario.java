/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.entity;

/**
 *
 * @author Natalia
 */
public class Usuario {
    private int id_us;
    private String dni_us;
    private String nom_us;
    private String user_us;
    private String con_us;
    private Boolean privilegios_us;

    public Usuario(int id_us, String dni_us, String nom_us, String user_us, String con_us, Boolean privilegios_us) {
        this.id_us = id_us;
        this.dni_us = dni_us;
        this.nom_us = nom_us;
        this.user_us = user_us;
        this.con_us = con_us;
        this.privilegios_us = privilegios_us;
    }

    public Usuario(String dni_us, String nom_us, String user_us, String con_us, Boolean privilegios_us) {
        this.dni_us = dni_us;
        this.nom_us = nom_us;
        this.user_us = user_us;
        this.con_us = con_us;
        this.privilegios_us = privilegios_us;
    }

    public Usuario(String user_us, String con_us) {
        this.user_us = user_us;
        this.con_us = con_us;
    }
    
    public int getId_us() {
        return id_us;
    }

    public void setId_us(int id_us) {
        this.id_us = id_us;
    }

    public String getDni_us() {
        return dni_us;
    }

    public void setDni_us(String dni_us) {
        this.dni_us = dni_us;
    }

    public String getNom_us() {
        return nom_us;
    }

    public void setNom_us(String nom_us) {
        this.nom_us = nom_us;
    }

    public String getUser_us() {
        return user_us;
    }

    public void setUser_us(String user_us) {
        this.user_us = user_us;
    }

    public String getCon_us() {
        return con_us;
    }

    public void setCon_us(String con_us) {
        this.con_us = con_us;
    }

    public Boolean getPrivilegios_us() {
        return privilegios_us;
    }

    public void setPrivilegios_us(Boolean privilegios_us) {
        this.privilegios_us = privilegios_us;
    }
    
}

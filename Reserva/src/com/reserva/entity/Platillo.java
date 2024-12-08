/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.entity;

/**
 *
 * @author Natalia
 */
public class Platillo {
    private int id_pl;
    private String nom_pl;
    private Double puni_pl;
    private String tipo_pl;

    public Platillo(int id_pl, String nom_pl, Double puni_pl, String tipo_pl) {
        this.id_pl = id_pl;
        this.nom_pl = nom_pl;
        this.puni_pl = puni_pl;
        this.tipo_pl = tipo_pl;
    }

    public Platillo(String nom_pl, Double puni_pl, String tipo_pl) {
        this.nom_pl = nom_pl;
        this.puni_pl = puni_pl;
        this.tipo_pl = tipo_pl;
    }

    public int getId_pl() {
        return id_pl;
    }

    public void setId_pl(int id_pl) {
        this.id_pl = id_pl;
    }

    public String getNom_pl() {
        return nom_pl;
    }

    public void setNom_pl(String nom_pl) {
        this.nom_pl = nom_pl;
    }

    public Double getPuni_pl() {
        return puni_pl;
    }

    public void setPuni_pl(Double puni_pl) {
        this.puni_pl = puni_pl;
    }

    public String getTipo_pl() {
        return tipo_pl;
    }

    public void setTipo_pl(String tipo_pl) {
        this.tipo_pl = tipo_pl;
    }
}

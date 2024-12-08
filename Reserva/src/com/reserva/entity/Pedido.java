/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.entity;

/**
 *
 * @author Natalia
 */
public class Pedido {
    private int id_pe;
    private String desc_pe;
    private Double total_pe;
    private int id_res;

    public Pedido(int id_pe, String desc_pe, Double total_pe, int id_res) {
        this.id_pe = id_pe;
        this.desc_pe = desc_pe;
        this.total_pe = total_pe;
        this.id_res = id_res;
    }

    public Pedido(String desc_pe, Double total_pe, int id_res) {
        this.desc_pe = desc_pe;
        this.total_pe = total_pe;
        this.id_res = id_res;
    }

    public int getId_pe() {
        return id_pe;
    }

    public void setId_pe(int id_pe) {
        this.id_pe = id_pe;
    }

    public String getDesc_pe() {
        return desc_pe;
    }

    public void setDesc_pe(String desc_pe) {
        this.desc_pe = desc_pe;
    }

    public Double getTotal_pe() {
        return total_pe;
    }

    public void setTotal_pe(Double total_pe) {
        this.total_pe = total_pe;
    }

    public int getId_res() {
        return id_res;
    }

    public void setId_res(int id_res) {
        this.id_res = id_res;
    }
    
    
}

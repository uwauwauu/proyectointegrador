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
    private String usuario;
    private String contraseña;
    private Empleado empleado;

    public Usuario(int id_us, String usuario, String contraseña, Empleado empleado) {
        this.id_us = id_us;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.empleado = empleado;
    }

    public Usuario(String usuario, String contraseña, Empleado empleado) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.empleado = empleado;
    }

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getId_us() {
        return id_us;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setId_us(int id_us) {
        this.id_us = id_us;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
}

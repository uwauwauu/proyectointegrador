/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.entity;

/**
 *
 * @author Natalia
 */
public class Empleado {
    private String DNI_emp;
    private String nombre_emp;
    private String correo_emp;
    private String puesto_emp;

    public Empleado(String DNI_emp, String nombre_emp, String correo_emp, String puesto_emp) {
        this.DNI_emp = DNI_emp;
        this.nombre_emp = nombre_emp;
        this.correo_emp = correo_emp;
        this.puesto_emp = puesto_emp;
    }

    public String getDNI_emp() {
        return DNI_emp;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public String getCorreo_emp() {
        return correo_emp;
    }

    public String getPuesto_emp() {
        return puesto_emp;
    }

    public void setDNI_emp(String DNI_emp) {
        this.DNI_emp = DNI_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public void setCorreo_emp(String correo_emp) {
        this.correo_emp = correo_emp;
    }

    public void setPuesto_emp(String puesto_emp) {
        this.puesto_emp = puesto_emp;
    }
    
    
}

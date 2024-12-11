/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.reservarp.dao.PlatilloDAO;
import com.reservasrp.vistas.ConfigEn;

/**
 *
 * @author Natalia
 */
public class ConfigEnController {
    private PlatilloDAO model;
    private ConfigEn vista;

    public ConfigEnController(ConfigEn vista) {
        this.vista = vista;
        this.model = new PlatilloDAO();
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.reservasrp.vistas;

import Controlador.ConfigController;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class Config extends javax.swing.JFrame {
    
    private ConfigController controlador;
    
    public Config() {
        initComponents();
        this.setLocationRelativeTo(null); 
        fechas.setText(fecha());
        this.controlador = new ConfigController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BRegUsuarios = new javax.swing.JButton();
        BReturn = new javax.swing.JButton();
        BVisPlatillos = new javax.swing.JButton();
        BBebidas = new javax.swing.JButton();
        fechas = new javax.swing.JLabel();
        BConfCat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Configuracion");

        BRegUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BRegUsuarios.setText("Usuarios registrados");

        BReturn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BReturn.setText("Volver");
        BReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReturnActionPerformed(evt);
            }
        });

        BVisPlatillos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BVisPlatillos.setText("Platillos");

        BBebidas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BBebidas.setText("Bebidas");

        fechas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechas.setText("DD/MM/YYYY");

        BConfCat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BConfCat.setText("Categorias");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reservasrp/vistas/images/configu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(118, 118, 118)
                .addComponent(fechas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BConfCat, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BVisPlatillos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BRegUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fechas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BConfCat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BVisPlatillos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BRegUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BReturnActionPerformed

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
    }
    public static void main(String args[]) {
       Config config = new Config();
       config.setVisible(true);
       config.setLocationRelativeTo(config);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBebidas;
    public javax.swing.JButton BConfCat;
    public javax.swing.JButton BRegUsuarios;
    public javax.swing.JButton BReturn;
    public javax.swing.JButton BVisPlatillos;
    private javax.swing.JLabel fechas;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

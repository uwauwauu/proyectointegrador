/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.reservasrp.vistas;

import Controlador.InicioController;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class InicioAdmin extends javax.swing.JFrame {

    private InicioController controlador;
    
    public InicioAdmin() {
        initComponents();
        fechas.setText(fecha());
        this.setLocationRelativeTo(null); 
        this.controlador = new InicioController(this);
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
        BLogout = new javax.swing.JButton();
        BReportes = new javax.swing.JButton();
        fechas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BReservas1 = new javax.swing.JButton();
        BRegReservas = new javax.swing.JButton();
        BHistReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 191, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Página de inicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        BLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BLogout.setText("Cerrar Sesion");
        BLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(BLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 140, 50));

        BReportes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BReportes.setText("Reportes de consumo");
        BReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReportesActionPerformed(evt);
            }
        });
        jPanel1.add(BReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 230, 60));

        fechas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechas.setText("DD/MM/YYYY");
        jPanel1.add(fechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reservasrp/vistas/images/icon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 330, -1));

        BReservas1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BReservas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reservasrp/vistas/images/cfg.png"))); // NOI18N
        BReservas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BReservas1MouseClicked(evt);
            }
        });
        BReservas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReservas1ActionPerformed(evt);
            }
        });
        jPanel1.add(BReservas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 641, 90, 80));

        BRegReservas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BRegReservas.setText("Registro de Reservas");
        BRegReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegReservasActionPerformed(evt);
            }
        });
        jPanel1.add(BRegReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 230, 60));

        BHistReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BHistReserva.setText("Historial de Reservas");
        jPanel1.add(BHistReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 230, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BLogoutActionPerformed

    private void BReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BReportesActionPerformed

    private void BRegReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRegReservasActionPerformed

    private void BReservas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BReservas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BReservas1MouseClicked

    private void BReservas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReservas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BReservas1ActionPerformed

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BHistReserva;
    public javax.swing.JButton BLogout;
    public javax.swing.JButton BRegReservas;
    public javax.swing.JButton BReportes;
    public javax.swing.JButton BReservas1;
    private javax.swing.JLabel fechas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
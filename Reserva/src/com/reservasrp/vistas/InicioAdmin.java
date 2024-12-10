/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.reservasrp.vistas;

import Controlador.InicioAdminController;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class InicioAdmin extends javax.swing.JFrame {

    private InicioAdminController controlador;
    
    public InicioAdmin() {
        initComponents();
        fechas.setText(fecha());
        this.setLocationRelativeTo(null); 
        this.controlador = new InicioAdminController(this);
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
        fechas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BConfig = new javax.swing.JButton();
        BRegUsr = new javax.swing.JButton();
        BHistReserva1 = new javax.swing.JButton();
        BReportes1 = new javax.swing.JButton();

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

        fechas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechas.setText("DD/MM/YYYY");
        jPanel1.add(fechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reservasrp/vistas/images/icon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 330, -1));

        BConfig.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reservasrp/vistas/images/cfg.png"))); // NOI18N
        BConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BConfigMouseClicked(evt);
            }
        });
        BConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConfigActionPerformed(evt);
            }
        });
        jPanel1.add(BConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, 90, 80));

        BRegUsr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BRegUsr.setText("Registrar Usuario");
        jPanel1.add(BRegUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 230, 60));

        BHistReserva1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BHistReserva1.setText("Historial de Reservas");
        jPanel1.add(BHistReserva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 230, 60));

        BReportes1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BReportes1.setText("Reportes de consumo");
        jPanel1.add(BReportes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 230, 60));

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

    private void BConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BConfigMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BConfigMouseClicked

    private void BConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BConfigActionPerformed

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
    public javax.swing.JButton BConfig;
    public javax.swing.JButton BHistReserva1;
    public javax.swing.JButton BLogout;
    public javax.swing.JButton BRegUsr;
    public javax.swing.JButton BReportes1;
    private javax.swing.JLabel fechas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

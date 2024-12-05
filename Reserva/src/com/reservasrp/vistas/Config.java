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
public class Config extends javax.swing.JFrame {

    private InicioController controlador;
    
    public Config() {
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
        BRegMesas = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        BVisPedidos = new javax.swing.JButton();
        BReportes = new javax.swing.JButton();
        fechas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BReservas2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Configuracion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        BRegMesas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BRegMesas.setText("Usuarios registrados");
        jPanel1.add(BRegMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 230, 60));

        Logout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Logout.setText("Volver");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 50));

        BVisPedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BVisPedidos.setText("Platillos");
        jPanel1.add(BVisPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 230, 60));

        BReportes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BReportes.setText("Bebidas");
        jPanel1.add(BReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 230, 60));

        fechas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechas.setText("DD/MM/YYYY");
        jPanel1.add(fechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reservasrp/vistas/configu.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 260, -1));

        BReservas2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BReservas2.setText("Categorias");
        jPanel1.add(BReservas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 230, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Config().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BRegMesas;
    public javax.swing.JButton BReportes;
    public javax.swing.JButton BReservas2;
    public javax.swing.JButton BVisPedidos;
    public javax.swing.JButton Logout;
    private javax.swing.JLabel fechas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.reservasrp.vistas;

import Controlador.ConfigBebController;

/**
 *
 * @author User
 */
public class ConfigBeb extends javax.swing.JFrame {

    private ConfigBebController controlador;
    
    public ConfigBeb() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = new ConfigBebController(this);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBeb = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        BEliminar = new javax.swing.JButton();
        idbtxt = new javax.swing.JTextField();
        BActualizar = new javax.swing.JButton();
        BAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        abrvtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        punibtxt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 40));

        jTableBeb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "P. Unitario", "Categoria", "Abreviatura"
            }
        ));
        jTableBeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBebMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBeb);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 1070, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Configurar Bebidas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        BEliminar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BEliminar.setText("Eliminar");
        jPanel1.add(BEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        idbtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(idbtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 90, 40));

        BActualizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BActualizar.setText("Actualizar");
        jPanel1.add(BActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        BAgregar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BAgregar.setText("Agregar");
        jPanel1.add(BAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reservasrp/vistas/images/list.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Abreviatura");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 130, 40));

        abrvtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(abrvtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 100, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 90, 40));

        nombtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(nombtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("P.Unidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 100, 40));

        punibtxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(punibtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableBebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBebMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableBebMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ConfigBeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigBeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigBeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigBeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigBeb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BActualizar;
    public javax.swing.JButton BAgregar;
    public javax.swing.JButton BEliminar;
    public javax.swing.JTextField abrvtxt;
    public javax.swing.JTextField idbtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableBeb;
    public javax.swing.JTextField nombtxt;
    public javax.swing.JTextField punibtxt1;
    // End of variables declaration//GEN-END:variables
}

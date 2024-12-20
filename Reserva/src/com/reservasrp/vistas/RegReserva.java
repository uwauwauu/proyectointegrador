/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.reservasrp.vistas;

import Controlador.ReservaController;

/**
 *
 * @author User
 */
public class RegReserva extends javax.swing.JFrame {

    private ReservaController controlador;
    
    public RegReserva() {
        initComponents();
        this.controlador = new ReservaController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalModel1 = new com.jcalendar.model.JCalModel();
        jCalModel2 = new com.jcalendar.model.JCalModel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BReservar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DNIText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CBMesa = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BVolver = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        CBPlatoFondo = new javax.swing.JComboBox<>();
        numpersonas = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        SEntradas = new javax.swing.JSpinner();
        CBEntrada = new javax.swing.JComboBox<>();
        jSpinner10 = new javax.swing.JSpinner();
        CBBebidas = new javax.swing.JComboBox<>();
        jSpinner16 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        CBPostre = new javax.swing.JComboBox<>();
        jSpinner24 = new javax.swing.JSpinner();
        calendarfec = new com.jcalendar.pane.calendar.CalendarPane();
        CBHoraInicio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CBHoraFinal = new javax.swing.JComboBox<>();
        BRegCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReserva = new javax.swing.JTable();
        BAgrEntrada = new javax.swing.JButton();
        BAgrBebida = new javax.swing.JButton();
        BAgrPostre = new javax.swing.JButton();
        BAgrPlatillo = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Realizar una Reserva");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        BReservar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BReservar.setText("Reservar");
        jPanel1.add(BReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 710, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Mesas disponibles");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 220, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Hora Final:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Fecha de reserva:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 250, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Bebidas disponibles");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 220, 30));
        jPanel1.add(DNIText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 200, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("DNI:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 50, 30));

        CBMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        CBMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBMesaActionPerformed(evt);
            }
        });
        jPanel1.add(CBMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 120, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("N° Personas:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 150, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("Entradas:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 250, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("S/.100.00.000");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 710, 160, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setText("Postres:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 130, 40));

        BVolver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BVolver.setText("Volver");
        jPanel1.add(BVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Plato de fondo:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 250, 40));

        CBPlatoFondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Pollo a la brasa", "Pollo a la plancha", "Pollo a la bbq" }));
        CBPlatoFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPlatoFondoActionPerformed(evt);
            }
        });
        jPanel1.add(CBPlatoFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 230, 30));

        numpersonas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(numpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 60, 40));

        jSpinner5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 310, 40, 30));

        SEntradas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(SEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 60, 30));

        CBEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Causa", "Papa a la Huancaina", "Ocopa", "Ensalada" }));
        CBEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(CBEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 190, 30));

        jSpinner10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 60, 30));

        CBBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Inka Cola", "Coca Cola", "Chicha", "Limonada", "Maracuyá" }));
        CBBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(CBBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 190, 30));

        jSpinner16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jSpinner16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 60, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setText("Total en soles:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 710, 160, 40));

        CBPostre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Tartaleta de fresa", "Tiramisú", "Brownie", "Porción red velvet", "Porción cheesecake" }));
        CBPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPostreActionPerformed(evt);
            }
        });
        jPanel1.add(CBPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 230, 30));

        jSpinner24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jSpinner24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 60, 30));
        jPanel1.add(calendarfec, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 250, 170));

        CBHoraInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        CBHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBHoraInicioActionPerformed(evt);
            }
        });
        jPanel1.add(CBHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Hora de Inicio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 170, 30));

        CBHoraFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        jPanel1.add(CBHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 112, 140, 30));

        BRegCliente.setBackground(new java.awt.Color(255, 153, 51));
        BRegCliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        BRegCliente.setForeground(new java.awt.Color(255, 255, 255));
        BRegCliente.setText("¿Registrar cliente?");
        BRegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegClienteActionPerformed(evt);
            }
        });
        jPanel1.add(BRegCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 170, 40));

        jTableReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Platillo", "Abreviado", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTableReserva);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 920, 160));

        BAgrEntrada.setBackground(new java.awt.Color(255, 153, 51));
        BAgrEntrada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BAgrEntrada.setForeground(new java.awt.Color(255, 255, 255));
        BAgrEntrada.setText("Agregar entrada al pedido");
        BAgrEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgrEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(BAgrEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 180, 30));

        BAgrBebida.setBackground(new java.awt.Color(255, 153, 51));
        BAgrBebida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BAgrBebida.setForeground(new java.awt.Color(255, 255, 255));
        BAgrBebida.setText("Agregar bebida al pedido");
        BAgrBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgrBebidaActionPerformed(evt);
            }
        });
        jPanel1.add(BAgrBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 180, 30));

        BAgrPostre.setBackground(new java.awt.Color(255, 153, 51));
        BAgrPostre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BAgrPostre.setForeground(new java.awt.Color(255, 255, 255));
        BAgrPostre.setText("Agregar postre al pedido");
        BAgrPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgrPostreActionPerformed(evt);
            }
        });
        jPanel1.add(BAgrPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 180, 30));

        BAgrPlatillo.setBackground(new java.awt.Color(255, 153, 51));
        BAgrPlatillo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BAgrPlatillo.setForeground(new java.awt.Color(255, 255, 255));
        BAgrPlatillo.setText("Agregar plato al pedido");
        BAgrPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgrPlatilloActionPerformed(evt);
            }
        });
        jPanel1.add(BAgrPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 180, 30));

        BLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BLimpiar.setText("Eliminar");
        jPanel1.add(BLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 710, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBPlatoFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPlatoFondoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPlatoFondoActionPerformed

    private void CBMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBMesaActionPerformed

    private void CBEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBEntradaActionPerformed

    private void CBBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBBebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBBebidasActionPerformed

    private void CBPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPostreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPostreActionPerformed

    private void CBHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBHoraInicioActionPerformed

    private void BRegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRegClienteActionPerformed

    private void BAgrEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgrEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAgrEntradaActionPerformed

    private void BAgrBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgrBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAgrBebidaActionPerformed

    private void BAgrPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgrPostreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAgrPostreActionPerformed

    private void BAgrPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgrPlatilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAgrPlatilloActionPerformed

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
            java.util.logging.Logger.getLogger(RegReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAgrBebida;
    public javax.swing.JButton BAgrEntrada;
    public javax.swing.JButton BAgrPlatillo;
    public javax.swing.JButton BAgrPostre;
    public javax.swing.JButton BLimpiar;
    public javax.swing.JButton BRegCliente;
    public javax.swing.JButton BReservar;
    public javax.swing.JButton BVolver;
    public javax.swing.JComboBox<String> CBBebidas;
    public javax.swing.JComboBox<String> CBEntrada;
    public javax.swing.JComboBox<String> CBHoraFinal;
    public javax.swing.JComboBox<String> CBHoraInicio;
    public javax.swing.JComboBox<String> CBMesa;
    public javax.swing.JComboBox<String> CBPlatoFondo;
    public javax.swing.JComboBox<String> CBPostre;
    public javax.swing.JTextField DNIText;
    public javax.swing.JSpinner SEntradas;
    public com.jcalendar.pane.calendar.CalendarPane calendarfec;
    private com.jcalendar.model.JCalModel jCalModel1;
    private com.jcalendar.model.JCalModel jCalModel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSpinner jSpinner10;
    public javax.swing.JSpinner jSpinner16;
    public javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner5;
    public javax.swing.JTable jTableReserva;
    public javax.swing.JSpinner numpersonas;
    // End of variables declaration//GEN-END:variables
}

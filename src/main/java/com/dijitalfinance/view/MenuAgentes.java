/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dijitalfinance.view;

import com.dijitalfinance.controller.ControllerPantallas;
import java.awt.Color;
import javax.swing.*;

public class MenuAgentes extends javax.swing.JFrame {
    ControllerPantallas cp =new ControllerPantallas();
    String agente;
    public MenuAgentes(String agnt) {
        setIconImage(new ImageIcon(getClass().getResource("/iconoVacacionesPNG.png")).getImage());
        initComponents();
        this.agente=agnt;
        txtSolicitarVacaciones.setHorizontalAlignment(SwingConstants.CENTER);
        txtConsultarVacaciones.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelSolicitarVacaciones = new javax.swing.JPanel();
        txtSolicitarVacaciones = new javax.swing.JLabel();
        panelConsultarVacaciones = new javax.swing.JPanel();
        txtConsultarVacaciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSolicitarVacaciones.setBackground(new java.awt.Color(0, 51, 0));
        panelSolicitarVacaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelSolicitarVacaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        txtSolicitarVacaciones.setBackground(new java.awt.Color(0, 109, 56));
        txtSolicitarVacaciones.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txtSolicitarVacaciones.setForeground(new java.awt.Color(255, 255, 255));
        txtSolicitarVacaciones.setText("Solicitar Vacaciones");
        txtSolicitarVacaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSolicitarVacaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSolicitarVacaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSolicitarVacacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSolicitarVacacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSolicitarVacacionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSolicitarVacacionesLayout = new javax.swing.GroupLayout(panelSolicitarVacaciones);
        panelSolicitarVacaciones.setLayout(panelSolicitarVacacionesLayout);
        panelSolicitarVacacionesLayout.setHorizontalGroup(
            panelSolicitarVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSolicitarVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        panelSolicitarVacacionesLayout.setVerticalGroup(
            panelSolicitarVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSolicitarVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(panelSolicitarVacaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 250, 50));

        panelConsultarVacaciones.setBackground(new java.awt.Color(0, 51, 0));
        panelConsultarVacaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelConsultarVacaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        txtConsultarVacaciones.setBackground(new java.awt.Color(0, 109, 56));
        txtConsultarVacaciones.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txtConsultarVacaciones.setForeground(new java.awt.Color(255, 255, 255));
        txtConsultarVacaciones.setText("Consultar Vacaciones");
        txtConsultarVacaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtConsultarVacaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtConsultarVacaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultarVacacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtConsultarVacacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtConsultarVacacionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelConsultarVacacionesLayout = new javax.swing.GroupLayout(panelConsultarVacaciones);
        panelConsultarVacaciones.setLayout(panelConsultarVacacionesLayout);
        panelConsultarVacacionesLayout.setHorizontalGroup(
            panelConsultarVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConsultarVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        panelConsultarVacacionesLayout.setVerticalGroup(
            panelConsultarVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConsultarVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(panelConsultarVacaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 250, 50));

        jLabel1.setBackground(new java.awt.Color(0, 109, 56));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Menú");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 51, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 196, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSolicitarVacacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSolicitarVacacionesMouseClicked
        cp.gestionaVacaciones(agente);
        this.dispose();
    }//GEN-LAST:event_txtSolicitarVacacionesMouseClicked

    private void txtConsultarVacacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultarVacacionesMouseClicked
        cp.consultarVacaciones(agente);
        this.dispose();
    }//GEN-LAST:event_txtConsultarVacacionesMouseClicked
    
    private void txtSolicitarVacacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSolicitarVacacionesMouseEntered
        panelSolicitarVacaciones.setBackground(new Color(163,205,58));
        txtSolicitarVacaciones.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtSolicitarVacacionesMouseEntered

    private void txtSolicitarVacacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSolicitarVacacionesMouseExited
        panelSolicitarVacaciones.setBackground(new Color(0,109,56));
        txtSolicitarVacaciones.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtSolicitarVacacionesMouseExited

    private void txtConsultarVacacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultarVacacionesMouseEntered
        panelConsultarVacaciones.setBackground(new Color(163,205,58));
        txtConsultarVacaciones.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtConsultarVacacionesMouseEntered

    private void txtConsultarVacacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultarVacacionesMouseExited
        panelConsultarVacaciones.setBackground(new Color(0,109,56));
        txtConsultarVacaciones.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtConsultarVacacionesMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelConsultarVacaciones;
    private javax.swing.JPanel panelSolicitarVacaciones;
    private javax.swing.JLabel txtConsultarVacaciones;
    private javax.swing.JLabel txtSolicitarVacaciones;
    // End of variables declaration//GEN-END:variables
}

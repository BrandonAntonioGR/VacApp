/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dijitalfinance.view;

import com.dijitalfinance.controller.ControllerPantallas;
import java.awt.Color;
import javax.swing.*;

public class MenuAdministrador extends javax.swing.JFrame {
    ControllerPantallas cp =new ControllerPantallas();
    String agente;
    String areaAdmin;
    public MenuAdministrador(String agnt,String area) {
        setIconImage(new ImageIcon(getClass().getResource("/iconoVacacionesPNG.png")).getImage());
        initComponents();
        this.agente=agnt;
        this.areaAdmin=area;
        txtGestionaVacaciones.setHorizontalAlignment(SwingConstants.CENTER);
        txtGestionaColaoradores.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelGestionaVacaciones = new javax.swing.JPanel();
        txtGestionaVacaciones = new javax.swing.JLabel();
        panelGestionaColaoradores = new javax.swing.JPanel();
        txtGestionaColaoradores = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGestionaVacaciones.setBackground(new java.awt.Color(0, 51, 0));
        panelGestionaVacaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGestionaVacaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        txtGestionaVacaciones.setBackground(new java.awt.Color(0, 51, 0));
        txtGestionaVacaciones.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txtGestionaVacaciones.setForeground(new java.awt.Color(255, 255, 255));
        txtGestionaVacaciones.setText("Gestionar Vacaciones");
        txtGestionaVacaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGestionaVacaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGestionaVacaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGestionaVacacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtGestionaVacacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtGestionaVacacionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelGestionaVacacionesLayout = new javax.swing.GroupLayout(panelGestionaVacaciones);
        panelGestionaVacaciones.setLayout(panelGestionaVacacionesLayout);
        panelGestionaVacacionesLayout.setHorizontalGroup(
            panelGestionaVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGestionaVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        panelGestionaVacacionesLayout.setVerticalGroup(
            panelGestionaVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGestionaVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(panelGestionaVacaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 250, 50));

        panelGestionaColaoradores.setBackground(new java.awt.Color(0, 51, 0));
        panelGestionaColaoradores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGestionaColaoradores.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        txtGestionaColaoradores.setBackground(new java.awt.Color(0, 51, 0));
        txtGestionaColaoradores.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txtGestionaColaoradores.setForeground(new java.awt.Color(255, 255, 255));
        txtGestionaColaoradores.setText("Gestionar Colaboradores");
        txtGestionaColaoradores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGestionaColaoradores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGestionaColaoradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGestionaColaoradoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtGestionaColaoradoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtGestionaColaoradoresMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelGestionaColaoradoresLayout = new javax.swing.GroupLayout(panelGestionaColaoradores);
        panelGestionaColaoradores.setLayout(panelGestionaColaoradoresLayout);
        panelGestionaColaoradoresLayout.setHorizontalGroup(
            panelGestionaColaoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGestionaColaoradores, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        panelGestionaColaoradoresLayout.setVerticalGroup(
            panelGestionaColaoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGestionaColaoradores, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(panelGestionaColaoradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 250, 50));

        jLabel1.setBackground(new java.awt.Color(0, 51, 0));
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

    private void txtGestionaVacacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGestionaVacacionesMouseClicked
        cp.AprobarVacaciones(agente,areaAdmin);
        this.dispose();
    }//GEN-LAST:event_txtGestionaVacacionesMouseClicked

    private void txtGestionaColaoradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGestionaColaoradoresMouseClicked
        cp.administrarAgentes(agente,areaAdmin);
        this.dispose();
    }//GEN-LAST:event_txtGestionaColaoradoresMouseClicked
    
    private void txtGestionaVacacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGestionaVacacionesMouseEntered
        panelGestionaVacaciones.setBackground(new Color(163,205,58));
        txtGestionaVacaciones.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtGestionaVacacionesMouseEntered

    private void txtGestionaVacacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGestionaVacacionesMouseExited
        panelGestionaVacaciones.setBackground(new Color(0,109,56));
        txtGestionaVacaciones.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtGestionaVacacionesMouseExited

    private void txtGestionaColaoradoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGestionaColaoradoresMouseEntered
        panelGestionaColaoradores.setBackground(new Color(163,205,58));
        txtGestionaColaoradores.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtGestionaColaoradoresMouseEntered

    private void txtGestionaColaoradoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGestionaColaoradoresMouseExited
        panelGestionaColaoradores.setBackground(new Color(0,109,56));
        txtGestionaColaoradores.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtGestionaColaoradoresMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelGestionaColaoradores;
    private javax.swing.JPanel panelGestionaVacaciones;
    private javax.swing.JLabel txtGestionaColaoradores;
    private javax.swing.JLabel txtGestionaVacaciones;
    // End of variables declaration//GEN-END:variables
}

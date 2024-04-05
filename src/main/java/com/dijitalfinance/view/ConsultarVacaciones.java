/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dijitalfinance.view;

import com.dijitalfinance.DAO.entity.SolicitudVacaciones;
import com.dijitalfinance.controller.ControllerPantallas;
import com.dijitalfinance.controller.ControllerSolicitudVacaciones;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultarVacaciones extends javax.swing.JFrame {
    ControllerPantallas cp = new ControllerPantallas();
    ControllerSolicitudVacaciones sv= new ControllerSolicitudVacaciones();
    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    String idAgnt;
    
    public ConsultarVacaciones(String idAgente) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconoVacacionesPNG.png")).getImage());
        this.idAgnt=idAgente;
        limpiarTabla(tblSolicitudes);
        llenarTabla();
        tblSolicitudes.getTableHeader().setReorderingAllowed(false);
        estilosTablaSolicitudes();
    }
    public void estilosTablaSolicitudes() {
        tblSolicitudes.getColumnModel().getColumn(0).setMaxWidth(0);
        tblSolicitudes.getColumnModel().getColumn(0).setMinWidth(0);
        tblSolicitudes.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tblSolicitudes.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tblSolicitudes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblSolicitudes.getTableHeader().setOpaque(false);
        tblSolicitudes.getTableHeader().setBackground(new Color(102, 0, 102));
        tblSolicitudes.getTableHeader().setForeground(new Color(255, 255, 255));
    }
    public void llenarTabla() {
        ArrayList<Object> nombreColumnas = new ArrayList<>();
        nombreColumnas.add("Fecha Solicitud");
        nombreColumnas.add("Fecha Inicio");
        nombreColumnas.add("Fecha Fin");
        nombreColumnas.add("Status");
        nombreColumnas.add("Dias Solicitados");
        for (Object columnas : nombreColumnas) {
            modelo.addColumn(columnas);
        }
        this.tblSolicitudes.setModel(modelo);
        ArrayList<SolicitudVacaciones> pl = sv.consultaSolicitudesVacaciones(idAgnt);
//        System.out.println("idAgente: "+idAgnt);
        modelo = (DefaultTableModel) tblSolicitudes.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < pl.size(); i++) {
            SolicitudVacaciones agente = pl.get(i);
            ob[0] = agente.getFechaSolicitud();
            ob[1]=agente.getFechaInicio();
            ob[2] = agente.getFechaFin();
            ob[3] = agente.getStatus();
            ob[4] = agente.getDiasTomados();
            modelo.addRow(ob);
        }

    }
    public void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setColumnCount(0); // Eliminar todas las columnas
        model.setRowCount(0);    // Eliminar todas las filas
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSolicitudes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jScrollPane1.setViewportView(tblSolicitudes);

        jButton1.setBackground(new java.awt.Color(0, 51, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 230));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mis Vacaciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        cp.menuAgentes(idAgnt);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSolicitudes;
    // End of variables declaration//GEN-END:variables
}

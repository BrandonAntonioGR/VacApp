/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dijitalfinance.view;

import com.dijitalfinance.DAO.entity.SolicitudVacaciones;
import com.dijitalfinance.controller.ControllerAprobarVacaciones;
import com.dijitalfinance.controller.ControllerCargaSolicitudVacaciones;
import com.dijitalfinance.controller.ControllerConsultaAprobarVacaciones;
import com.dijitalfinance.controller.ControllerPantallas;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AprobarVacaciones extends javax.swing.JFrame {

    ControllerConsultaAprobarVacaciones av = new ControllerConsultaAprobarVacaciones();
    ControllerCargaSolicitudVacaciones cargaSolicitud = new ControllerCargaSolicitudVacaciones();
    ControllerAprobarVacaciones aprobarVacaciones = new ControllerAprobarVacaciones();
    ControllerPantallas cp = new ControllerPantallas();
    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    String agnt;
    String adminArea;

    public AprobarVacaciones(String agente, String area) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconoVacacionesPNG.png")).getImage());
        this.agnt = agente;
        this.adminArea = area;
        //modifica estilo de tabla
        limpiarTabla(tblAprobarVacaciones);
        llenarTabla();
        tblAprobarVacaciones.getTableHeader().setReorderingAllowed(false);
        estilosTablaSolicitudes();

    }

    public void llenarTabla() {
        ArrayList<Object> nombreColumnas = new ArrayList<>();
        nombreColumnas.add("Id agente");
        nombreColumnas.add("Agente");
        nombreColumnas.add("Fecha Solicitud");
        nombreColumnas.add("Fecha inicio");
        nombreColumnas.add("Fecha fin");
        nombreColumnas.add("Status");
        nombreColumnas.add("Total dias");
        for (Object columnas : nombreColumnas) {
            modelo.addColumn(columnas);
        }
        this.tblAprobarVacaciones.setModel(modelo);
        ArrayList<SolicitudVacaciones> pl = av.aprobarVacaciones(adminArea);
        modelo = (DefaultTableModel) tblAprobarVacaciones.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < pl.size(); i++) {
            SolicitudVacaciones agente = pl.get(i);
            ob[0] = agente.getIdAgente();
            ob[1] = agente.getAgentefullname();
            ob[2] = agente.getFechaSolicitud();
            ob[3] = agente.getFechaInicio();
            ob[4] = agente.getFechaFin();
            ob[5] = agente.getStatus();
            ob[6] = agente.getDiasTomados();
            modelo.addRow(ob);
        }

    }

    public void estilosTablaSolicitudes() {
        tblAprobarVacaciones.getColumnModel().getColumn(0).setMaxWidth(0);
        tblAprobarVacaciones.getColumnModel().getColumn(0).setMinWidth(0);
        tblAprobarVacaciones.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tblAprobarVacaciones.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tblAprobarVacaciones.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblAprobarVacaciones.getTableHeader().setOpaque(false);
        tblAprobarVacaciones.getTableHeader().setBackground(new Color(102, 0, 102));
        tblAprobarVacaciones.getTableHeader().setForeground(new Color(255, 255, 255));
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
        tblAprobarVacaciones = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiasTomados = new javax.swing.JTextField();
        cmbAprobar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        lblIdAgente = new javax.swing.JLabel();
        btnCargaSolicitud = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tblAprobarVacaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 470, 270));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel1.setText("Nombre: ");

        txtNombre.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel7.setText("Días totales");

        txtDiasTomados.setBorder(null);

        cmbAprobar.setBackground(new java.awt.Color(0, 51, 0));
        cmbAprobar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        cmbAprobar.setForeground(new java.awt.Color(255, 255, 255));
        cmbAprobar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobar", "Denegar" }));
        cmbAprobar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmbAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAprobarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel2.setText("Inicio de vacaciones:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel3.setText("Fin de vacaciones:");

        txtFechaInicio.setBorder(null);

        txtFechaFin.setBorder(null);

        lblIdAgente.setForeground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaInicio)
                    .addComponent(txtFechaFin)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDiasTomados)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(cmbAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiasTomados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblIdAgente, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 360));

        btnCargaSolicitud.setBackground(new java.awt.Color(0, 51, 0));
        btnCargaSolicitud.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnCargaSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        btnCargaSolicitud.setText("Cargar solicitud");
        btnCargaSolicitud.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaSolicitudActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargaSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 720, 360));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Aprobar Vacaciones");

        btnRegresar.setBackground(new java.awt.Color(51, 51, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnRegresar)
                .addGap(153, 153, 153)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnRegresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        cp.menuAdministrador(agnt, adminArea);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCargaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaSolicitudActionPerformed
        int fila = tblAprobarVacaciones.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para cargar");
        } else {
            String idAgente = tblAprobarVacaciones.getValueAt(fila, 0).toString();
            String fechaInicio = tblAprobarVacaciones.getValueAt(fila, 3).toString();
            String fechaFin = tblAprobarVacaciones.getValueAt(fila, 4).toString();
            lblIdAgente.setText(idAgente);
            SolicitudVacaciones cargaSolicitu = cargaSolicitud.aprobarVacaciones(idAgente, fechaInicio, fechaFin);
//            System.out.println("idAgente: " + idAgente);
//            System.out.println("fechaInicio: " + fechaInicio);
//            System.out.println("fechaFin: " + fechaFin);
            txtNombre.setText(cargaSolicitu.getAgentefullname());
            txtDiasTomados.setText(cargaSolicitu.getDiasTomados() + "");
            txtFechaInicio.setText(cargaSolicitu.getFechaInicio() + "");
            txtFechaFin.setText(cargaSolicitu.getFechaFin() + "");

        }
    }//GEN-LAST:event_btnCargaSolicitudActionPerformed

    private void cmbAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAprobarActionPerformed
        int opcAprobar = cmbAprobar.getSelectedIndex();
        String idagente = lblIdAgente.getText();
        String fechaInicio = txtFechaInicio.getText();
        String fechaFin = txtFechaFin.getText();
        if (!lblIdAgente.getText().isEmpty()) {
            switch (opcAprobar) {
                case 0:
                    int respuestaA = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea aprobar la solicitud?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    // VerififechaIniciocar la respuesta
                    if (respuestaA == JOptionPane.YES_OPTION) {
                        aprobarVacaciones.AprobarVacaciones("APROBADO", idagente, fechaInicio, fechaFin);
                        limpiarTabla(tblAprobarVacaciones);
                        llenarTabla();
                        estilosTablaSolicitudes();
                        tblAprobarVacaciones.getTableHeader().setReorderingAllowed(false);
                    }
                    break;
                case 1:
                    int respuestaR = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea rechazar la solicitud?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    // VerififechaIniciocar la respuesta
                    if (respuestaR == JOptionPane.YES_OPTION) {
                        aprobarVacaciones.AprobarVacaciones("RECHAZADA", idagente, fechaInicio, fechaFin);
                        limpiarTabla(tblAprobarVacaciones);
                        llenarTabla();
                        estilosTablaSolicitudes();
                        tblAprobarVacaciones.getTableHeader().setReorderingAllowed(false);
                    }

                    break;
            }
        }

    }//GEN-LAST:event_cmbAprobarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargaSolicitud;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbAprobar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdAgente;
    private javax.swing.JTable tblAprobarVacaciones;
    private javax.swing.JTextField txtDiasTomados;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

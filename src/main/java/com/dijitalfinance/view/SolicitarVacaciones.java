/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dijitalfinance.view;

import com.dijitalfinance.controller.ControllerInsertarSolicitudVacaciones;
import com.dijitalfinance.DAO.entity.SolicitudVacaciones;
import com.dijitalfinance.DAO.entity.VacacionesDisponibles;
import com.dijitalfinance.controller.ControllerConsultarVacacionesPermitidas;
import com.dijitalfinance.controller.ControllerPantallas;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SolicitarVacaciones extends javax.swing.JFrame {

    ControllerInsertarSolicitudVacaciones solicitudVacaciones = new ControllerInsertarSolicitudVacaciones();
    ControllerConsultarVacacionesPermitidas totalVacaciones = new ControllerConsultarVacacionesPermitidas();
    ControllerPantallas cp = new ControllerPantallas();
    String idAgnt;
    Date fechaInicioVacaciones=null;
    Date fechaFinVacaciones=null;
    VacacionesDisponibles objVacacionesDisponibles = null;
    int totalVaca;

    public SolicitarVacaciones(String idAgente) {
        setIconImage(new ImageIcon(getClass().getResource("/iconoVacacionesPNG.png")).getImage());
        initComponents();
        this.idAgnt = idAgente;
        objVacacionesDisponibles = totalVacaciones.consultaVacacionesPermitidas(idAgnt);

        txtNombre.setText(objVacacionesDisponibles.getNombreCompletoAgente());
        txtArea.setText(objVacacionesDisponibles.getArea());
        txtDiasDisponibles.setText(objVacacionesDisponibles.getVacacionesDisponibles() + "");
        totalVaca = objVacacionesDisponibles.getVacacionesDisponibles();
    }

    public int ObtenerDia(Date fecha) {
        // Crear una instancia de Calendar
        Calendar calendar = Calendar.getInstance();
        // Establecer la fecha de la variable fecha en el Calendar
        calendar.setTime(fecha);
        // Obtener el día, mes y año
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        return dia;
    }

    public String ObtenerMes(Date fecha) {
        // Crear una instancia de Calendar
        Calendar calendar = Calendar.getInstance();

        // Establecer la fecha de la variable fecha en el Calendar
        calendar.setTime(fecha);

        // Obtener el  mes 
        int mes = calendar.get(Calendar.MONTH);
        String meses = meses(mes);
        return meses;
    }

    public int ObtenerAño(Date fecha) {
        // Crear una instancia de Calendar
        Calendar calendar = Calendar.getInstance();

        // Establecer la fecha de la variable fecha en el Calendar
        calendar.setTime(fecha);

        // Obtener el año
        int año = calendar.get(Calendar.YEAR);
        return año;
    }

    public String meses(int mes) {
        mes = mes + 1;
        String mestexto = "";
        switch (mes) {
            case 1:
                mestexto = "ENERO";
                break;
            case 2:
                mestexto = "FEBRERO";
                break;
            case 3:
                mestexto = "MARZO";
                break;
            case 4:
                mestexto = "ABRIL";
                break;
            case 5:
                mestexto = "MAYO";
                break;
            case 6:
                mestexto = "JUNIO";
                break;
            case 7:
                mestexto = "JULIO";
                break;
            case 8:
                mestexto = "AGOSTO";
                break;
            case 9:
                mestexto = "SEPTIEMBRE";
                break;
            case 10:
                mestexto = "OCTUBRE";
                break;
            case 11:
                mestexto = "NOVIEMBRE";
                break;
            case 12:
                mestexto = "DICIEMBRE";
                break;
        }
        return mestexto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardarVacaciones = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDiasDisponibles = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnTermino = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblFinMes = new javax.swing.JLabel();
        lblFinDIa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lblInicioMes = new javax.swing.JLabel();
        lblInicioDia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JCalendar();

        jToggleButton1.setText("jToggleButton1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(155, 214, 47));

        btnGuardarVacaciones.setBackground(new java.awt.Color(0, 51, 0));
        btnGuardarVacaciones.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnGuardarVacaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarVacaciones.setText("Guardar Vacaciones");
        btnGuardarVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVacacionesActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(0, 51, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnGuardarVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarVacaciones)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 650, 50));

        jPanel4.setBackground(new java.awt.Color(0, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dias disponibles:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Área:");

        txtDiasDisponibles.setEditable(false);
        txtDiasDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        txtDiasDisponibles.setBorder(null);

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtDiasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 80));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(0, 51, 0));
        btnInicio.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel6.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        btnTermino.setBackground(new java.awt.Color(0, 51, 0));
        btnTermino.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        btnTermino.setForeground(new java.awt.Color(255, 255, 255));
        btnTermino.setText("Termino");
        btnTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminoActionPerformed(evt);
            }
        });
        jPanel6.add(btnTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jPanel9.setBackground(new java.awt.Color(155, 214, 47));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        lblFinMes.setBackground(new java.awt.Color(155, 214, 47));
        lblFinMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFinMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFinMes, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        lblFinDIa.setBackground(new java.awt.Color(155, 214, 47));
        lblFinDIa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFinDIa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFinDIa, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de termino:");

        jPanel11.setBackground(new java.awt.Color(155, 214, 47));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        lblInicioMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicioMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicioMes, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        lblInicioDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblInicioDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInicioDia, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de inicio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 260));

        calendario.setBackground(new java.awt.Color(204, 255, 204));
        calendario.setForeground(new java.awt.Color(0, 51, 0));
        calendario.setDecorationBackgroundColor(new java.awt.Color(204, 255, 204));
        calendario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        calendario.setWeekdayForeground(new java.awt.Color(0, 51, 0));
        jPanel6.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 360, 200));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 650, 270));

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

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Date fechaInicio = calendario.getDate();
        fechaInicioVacaciones = fechaInicio;
//        System.out.println("fechaInicioVacaciones: " + fechaInicioVacaciones);
        int diaInicio = ObtenerDia(fechaInicio);
        String mesInicio = ObtenerMes(fechaInicio);
        int anioInicio = ObtenerAño(fechaInicio);
        lblInicioMes.setText(mesInicio + " " + anioInicio);
        lblInicioDia.setText(diaInicio + "");
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminoActionPerformed
        Date fechaTermino = calendario.getDate();
        fechaFinVacaciones = fechaTermino;
//        System.out.println("fechaFinVacaciones: " + fechaFinVacaciones);
        int diaFin = ObtenerDia(fechaTermino);
        int anioFin = ObtenerAño(fechaTermino);
        String mesFin = ObtenerMes(fechaTermino);
        lblFinMes.setText(mesFin + " " + anioFin);
        lblFinDIa.setText(diaFin + "");
    }//GEN-LAST:event_btnTerminoActionPerformed

    private void btnGuardarVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVacacionesActionPerformed
        if (fechaInicioVacaciones == null || fechaFinVacaciones == null) {
            JOptionPane.showMessageDialog(null, "Es necesario seleccionar una fecha de inicio y una de fin", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (totalVaca <= 0) {
                JOptionPane.showMessageDialog(null, "Ya no tienes vacaciones", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                // Obtener la fecha actual
                LocalDate fechaActual = LocalDate.now();
                // Sumar un día a la fecha actual
                LocalDate fechaActualMasUnDia = fechaActual.plusDays(1);
                // Convertir Date a LocalDate
                LocalDate fechaInicio = fechaInicioVacaciones.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaFin = fechaFinVacaciones.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();//LocalDate.now().plusDays(1); 

                // Calcular la diferencia en días
                long diferenciaEnDias = restarFechasExcluyendoDomingos(fechaInicio, fechaFin);
//            System.out.println("dias :" + diferenciaEnDias);
                int DiasTomados = (int) diferenciaEnDias;
                if ((totalVaca - diferenciaEnDias) < 0) {
                    JOptionPane.showMessageDialog(null, "Estas excediendo la cantidad de dias disponibles, Cuentas con: " + totalVaca, "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    //valida que la fecha de inicio sea menor a la fecha fin
                    if(diferenciaEnDias == 0){
                        JOptionPane.showMessageDialog(null, "La fecha inicio debe ser menor a la de fecha fin o No es posible elegir el dia domingo como unico dia de vacaciones", "Error", JOptionPane.ERROR_MESSAGE);
                    }else if (diferenciaEnDias > 0) {
                        //valida que la fecha de 
                        if (fechaInicio.isBefore(fechaActualMasUnDia)) {
                            JOptionPane.showMessageDialog(null, "No puedes ingresar vacaciones anteriores o iguales a hoy ", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        } else {
                            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
                            // VerififechaIniciocar la respuesta
                            if (respuesta == JOptionPane.YES_OPTION) {
                                // Convertir LocalDate a java.sql.Date
                                java.sql.Date sqlDateInicio = java.sql.Date.valueOf(fechaInicio);
                                java.sql.Date sqlDateFin = java.sql.Date.valueOf(fechaFin);
                                SolicitudVacaciones sv = new SolicitudVacaciones();
                                sv.setCreation_Day(obtenerFechaActual());
                                sv.setIdAgente(idAgnt);
                                sv.setFechaSolicitud(obtenerFechaActual());
                                sv.setFechaInicio(sqlDateInicio);
                                sv.setFechaFin(sqlDateFin);
                                sv.setStatus("ESPERA");
                                sv.setDiasTomados(DiasTomados);
                                solicitudVacaciones.CargarSolicitudVacaciones(sv);
                                limpiarFechas();
                            }
                        }
                    }
                }

            }
        }
    }//GEN-LAST:event_btnGuardarVacacionesActionPerformed
    public String obtenerFechaActual() {
        // Obteniendo la fecha y hora actual utilizando Calendar
        Calendar calendar = Calendar.getInstance();
        java.util.Date currentDate = calendar.getTime();

        // Convirtiendo la fecha y hora actual a un objeto Timestamp
        Timestamp currentTimestamp = new Timestamp(currentDate.getTime());

        // Creando un objeto Date a partir del objeto Timestamp
        java.sql.Date currentDateSQL = new java.sql.Date(currentTimestamp.getTime());

        // Formateando la fecha y hora actual
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateFormat.format(currentDateSQL);

        return formattedDateTime;
    }

    public static long restarFechasExcluyendoDomingos(LocalDate fechaInicio, LocalDate fechaFin) {
        long diasHabiles = 0;
        LocalDate fechaActual = fechaInicio;

        // Iterar día a día
        while (!fechaActual.isAfter(fechaFin)) {
            // Si el día no es domingo, contar como día hábil
            if (fechaActual.getDayOfWeek().getValue() != 7) {
                diasHabiles++;
            }
            fechaActual = fechaActual.plusDays(1); // Avanzar al siguiente día
        }

        return diasHabiles;
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        cp.menuAgentes(idAgnt);
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    public void limpiarFechas(){
        fechaInicioVacaciones=null;
        fechaFinVacaciones=null;
        lblInicioMes.setText("");
        lblInicioDia.setText("");
        lblFinMes.setText("");
        lblFinDIa.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarVacaciones;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTermino;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblFinDIa;
    private javax.swing.JLabel lblFinMes;
    private javax.swing.JLabel lblInicioDia;
    private javax.swing.JLabel lblInicioMes;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtDiasDisponibles;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

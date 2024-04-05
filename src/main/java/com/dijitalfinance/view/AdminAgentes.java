/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dijitalfinance.view;

import com.dijitalfinance.DAO.entity.Agente;
import com.dijitalfinance.controller.ControllerConsultaAgentes;
import com.dijitalfinance.controller.ControllerEliminarAgente;
import com.dijitalfinance.controller.ControllerPantallas;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class AdminAgentes extends javax.swing.JFrame {

    ControllerPantallas cp = new ControllerPantallas();
    ControllerConsultaAgentes ca = new ControllerConsultaAgentes();
    ControllerEliminarAgente ea = new ControllerEliminarAgente();
    ArrayList<Agente> lista = new ArrayList();
    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    String agente;
    String adminArea;

    public AdminAgentes(String agnt, String areaAdmin) {
        setIconImage(new ImageIcon(getClass().getResource("/iconoVacacionesPNG.png")).getImage());
        initComponents();
        this.agente = agnt;
        this.adminArea = areaAdmin;
        //centra el texto de los txtlabel
        txtExaminarPlantilla.setHorizontalAlignment(SwingConstants.CENTER);
        txtAgregarPlantilla.setHorizontalAlignment(SwingConstants.CENTER);
        txtModificarPlantilla.setHorizontalAlignment(SwingConstants.CENTER);
        txtEliminarPlantilla.setHorizontalAlignment(SwingConstants.CENTER);
        txtRegresar.setHorizontalAlignment(SwingConstants.CENTER);
        //Agrega informacion a la tabla y añade estilos
        limpiarTabla(tblAgentes);
        llenarTabla();
        tblAgentes.getTableHeader().setReorderingAllowed(false);
        estilosTablaAgentes();
    }

    public void estilosTablaAgentes() {
        tblAgentes.getColumnModel().getColumn(0).setMaxWidth(0);
        tblAgentes.getColumnModel().getColumn(0).setMinWidth(0);
        tblAgentes.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tblAgentes.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tblAgentes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblAgentes.getTableHeader().setOpaque(false);
        tblAgentes.getTableHeader().setBackground(new Color(102, 0, 102));
        tblAgentes.getTableHeader().setForeground(new Color(255, 255, 255));
    }

    public void llenarTabla() {
        ArrayList<Object> nombreColumnas = new ArrayList<>();
        nombreColumnas.add("ID");
        nombreColumnas.add("Nombre");
        nombreColumnas.add("Area");
        nombreColumnas.add("Fecha ingreso");
        nombreColumnas.add("Dias vacaciones");
        for (Object columnas : nombreColumnas) {
            modelo.addColumn(columnas);
        }
        this.tblAgentes.setModel(modelo);
        ArrayList<Agente> pl = ca.consultaAgentes(adminArea);
        lista = pl;
        modelo = (DefaultTableModel) tblAgentes.getModel();
        Object[] ob = new Object[5];
        lblRegistrosTotales.setText(pl.size() + "");
        for (int i = 0; i < pl.size(); i++) {
            Agente agente = pl.get(i);
            ob[0] = agente.getIdagente();
            ob[1] = agente.getFullNameAgente();
//            ob[1] = agente.getAgente();
            ob[2] = agente.getArea();
            ob[3] = agente.getFechaIngreso();
            ob[4] = agente.getVacacionesDisponibles();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelExaminar = new javax.swing.JPanel();
        txtExaminarPlantilla = new javax.swing.JLabel();
        panelAgregar = new javax.swing.JPanel();
        txtAgregarPlantilla = new javax.swing.JLabel();
        panelModificar = new javax.swing.JPanel();
        txtModificarPlantilla = new javax.swing.JLabel();
        panelEliminar = new javax.swing.JPanel();
        txtEliminarPlantilla = new javax.swing.JLabel();
        panelRegresar = new javax.swing.JPanel();
        txtRegresar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgentes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblRegistrosTotales = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 64, 55));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar colaboradores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 196, 10));

        panelExaminar.setBackground(new java.awt.Color(0, 51, 0));
        panelExaminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelExaminar.setForeground(new java.awt.Color(255, 255, 255));

        txtExaminarPlantilla.setFont(new java.awt.Font("Sylfaen", 0, 17)); // NOI18N
        txtExaminarPlantilla.setForeground(new java.awt.Color(255, 255, 255));
        txtExaminarPlantilla.setText("Examinar");
        txtExaminarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExaminarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExaminarPlantillaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExaminarPlantillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExaminarPlantillaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelExaminarLayout = new javax.swing.GroupLayout(panelExaminar);
        panelExaminar.setLayout(panelExaminarLayout);
        panelExaminarLayout.setHorizontalGroup(
            panelExaminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExaminarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        panelExaminarLayout.setVerticalGroup(
            panelExaminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExaminarPlantilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(panelExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 300, 60));

        panelAgregar.setBackground(new java.awt.Color(0, 51, 0));
        panelAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAgregar.setForeground(new java.awt.Color(255, 255, 255));

        txtAgregarPlantilla.setFont(new java.awt.Font("Sylfaen", 0, 17)); // NOI18N
        txtAgregarPlantilla.setForeground(new java.awt.Color(255, 255, 255));
        txtAgregarPlantilla.setText("Agregar");
        txtAgregarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAgregarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgregarPlantillaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAgregarPlantillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAgregarPlantillaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAgregarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAgregarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(panelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 300, 60));

        panelModificar.setBackground(new java.awt.Color(0, 51, 0));
        panelModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelModificar.setForeground(new java.awt.Color(255, 255, 255));

        txtModificarPlantilla.setFont(new java.awt.Font("Sylfaen", 0, 17)); // NOI18N
        txtModificarPlantilla.setForeground(new java.awt.Color(255, 255, 255));
        txtModificarPlantilla.setText("Modificar");
        txtModificarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtModificarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModificarPlantillaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtModificarPlantillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtModificarPlantillaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelModificarLayout = new javax.swing.GroupLayout(panelModificar);
        panelModificar.setLayout(panelModificarLayout);
        panelModificarLayout.setHorizontalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        panelModificarLayout.setVerticalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(panelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 300, 60));

        panelEliminar.setBackground(new java.awt.Color(0, 51, 0));
        panelEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelEliminar.setForeground(new java.awt.Color(255, 255, 255));

        txtEliminarPlantilla.setFont(new java.awt.Font("Sylfaen", 0, 17)); // NOI18N
        txtEliminarPlantilla.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminarPlantilla.setText("Eliminar");
        txtEliminarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEliminarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEliminarPlantillaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEliminarPlantillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEliminarPlantillaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEliminarPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEliminarPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 300, 60));

        panelRegresar.setBackground(new java.awt.Color(0, 51, 0));
        panelRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRegresar.setForeground(new java.awt.Color(255, 255, 255));

        txtRegresar.setFont(new java.awt.Font("Sylfaen", 0, 17)); // NOI18N
        txtRegresar.setForeground(new java.awt.Color(255, 255, 255));
        txtRegresar.setText("Regresar");
        txtRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRegresarLayout = new javax.swing.GroupLayout(panelRegresar);
        panelRegresar.setLayout(panelRegresarLayout);
        panelRegresarLayout.setHorizontalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRegresarLayout.setVerticalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 300, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 420));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        tblAgentes.setSelectionBackground(new java.awt.Color(155, 214, 47));
        tblAgentes.setSelectionForeground(new java.awt.Color(0, 109, 56));
        jScrollPane1.setViewportView(tblAgentes);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrosTotales.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jPanel3.add(lblRegistrosTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 70, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Registros totales:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 100, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 520, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExaminarPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExaminarPlantillaMouseClicked
        int fila = tblAgentes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para Examinar");
        } else {
            String idAgente = tblAgentes.getValueAt(fila, 0).toString();

            String idArea = tblAgentes.getValueAt(fila, 2).toString();

            Agente agt = new Agente();
            for (int i = 0; i < lista.size(); i++) {
                Agente agente = lista.get(i);
                if (idAgente.equals(agente.getIdagente())) {
                    agt = agente;
                    cp.examinarAgentes(agt, idArea, idAgente, adminArea);
                    this.dispose();
                }

            }

        }
    }//GEN-LAST:event_txtExaminarPlantillaMouseClicked

    private void txtExaminarPlantillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExaminarPlantillaMouseEntered
        panelExaminar.setBackground(new Color(0, 109, 56));
    }//GEN-LAST:event_txtExaminarPlantillaMouseEntered

    private void txtExaminarPlantillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExaminarPlantillaMouseExited
        panelExaminar.setBackground(new Color(0, 51, 0));
    }//GEN-LAST:event_txtExaminarPlantillaMouseExited

    private void txtAgregarPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarPlantillaMouseClicked
        cp.agregarAgentes(agente, adminArea);
        this.dispose();
    }//GEN-LAST:event_txtAgregarPlantillaMouseClicked

    private void txtAgregarPlantillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarPlantillaMouseEntered
        panelAgregar.setBackground(new Color(0, 109, 56));
    }//GEN-LAST:event_txtAgregarPlantillaMouseEntered

    private void txtAgregarPlantillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarPlantillaMouseExited
        panelAgregar.setBackground(new Color(0, 51, 0));
    }//GEN-LAST:event_txtAgregarPlantillaMouseExited

    private void txtModificarPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarPlantillaMouseClicked
        int fila = tblAgentes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para modificar");
        } else {
            String idAgente = tblAgentes.getValueAt(fila, 0).toString();

            String idArea = tblAgentes.getValueAt(fila, 2).toString();

            Agente agt = new Agente();
            for (int i = 0; i < lista.size(); i++) {
                Agente agente = lista.get(i);
                if (idAgente.equals(agente.getIdagente())) {
                    agt = agente;
                    cp.modificarAgentes(agente, idArea, idAgente, adminArea);
                    this.dispose();
                }

            }
        }
    }//GEN-LAST:event_txtModificarPlantillaMouseClicked

    private void txtModificarPlantillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarPlantillaMouseEntered
        panelModificar.setBackground(new Color(0, 109, 56));
    }//GEN-LAST:event_txtModificarPlantillaMouseEntered

    private void txtModificarPlantillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarPlantillaMouseExited
        panelModificar.setBackground(new Color(0, 51, 0));
    }//GEN-LAST:event_txtModificarPlantillaMouseExited

    private void txtRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegresarMouseClicked
        cp.menuAdministrador(agente, adminArea);
        this.dispose();
    }//GEN-LAST:event_txtRegresarMouseClicked

    private void txtRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegresarMouseEntered
        panelRegresar.setBackground(new Color(0, 109, 56));
    }//GEN-LAST:event_txtRegresarMouseEntered

    private void txtRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegresarMouseExited
        panelRegresar.setBackground(new Color(0, 51, 0));
    }//GEN-LAST:event_txtRegresarMouseExited

    private void txtEliminarPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarPlantillaMouseClicked
        int fila = tblAgentes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            // Verificar la respuesta
            if (respuesta == JOptionPane.YES_OPTION) {
                String id = tblAgentes.getValueAt(fila, 0).toString();
                String idAgente = tblAgentes.getValueAt(fila, 0).toString();
                ea.eliminaAgente(idAgente);
                limpiarTabla(tblAgentes);
                llenarTabla();
                tblAgentes.getTableHeader().setReorderingAllowed(false);
                estilosTablaAgentes();
            }
        }
    }//GEN-LAST:event_txtEliminarPlantillaMouseClicked

    private void txtEliminarPlantillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarPlantillaMouseEntered
        panelEliminar.setBackground(new Color(0, 109, 56));
    }//GEN-LAST:event_txtEliminarPlantillaMouseEntered

    private void txtEliminarPlantillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarPlantillaMouseExited
        panelEliminar.setBackground(new Color(0, 51, 0));
    }//GEN-LAST:event_txtEliminarPlantillaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblRegistrosTotales;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelExaminar;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JPanel panelRegresar;
    private javax.swing.JTable tblAgentes;
    private javax.swing.JLabel txtAgregarPlantilla;
    private javax.swing.JLabel txtEliminarPlantilla;
    private javax.swing.JLabel txtExaminarPlantilla;
    private javax.swing.JLabel txtModificarPlantilla;
    private javax.swing.JLabel txtRegresar;
    // End of variables declaration//GEN-END:variables
}

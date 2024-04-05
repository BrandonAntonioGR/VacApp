/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ActualizarAprobarVacaciones {
    public static boolean actualizarAprobarVacaciones(String status,String idAgente,String fechaInicio,String fechaFin) {
        PreparedStatement ps;
        boolean retorno = false;
        Connection con;
        try {
            con = ModelConection.getConnection();
            ps = con.prepareStatement("UPDATE [DC_Historial_Vacaciones]\n" +
                "SET [Status]='"+status+"'\n" +
                "WHERE [idAgente]='"+idAgente+"'\n" +
                "AND  [FechaInicio]='"+fechaInicio+"'\n" +
                "AND  [FechaFin]='"+fechaFin+"'\n" +
                "AND CONVERT(DATE,[FechaInicio])>=CONVERT(DATE,GETDATE())");
            retorno = Boolean.parseBoolean(Integer.toString(ps.executeUpdate()));
            JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
            con.close();
            ps.close();
            return retorno;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en ActualizarAprobarVacaciones: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return retorno;
        }
    }
}

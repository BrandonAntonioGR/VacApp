/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import com.dijitalfinance.DAO.entity.Agente;
import com.dijitalfinance.DAO.entity.SolicitudVacaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class InsertarSolicitudVacaciones {
    public static boolean RegistrarSolicitudVacaciones(SolicitudVacaciones solicitud){
        PreparedStatement ps;
        boolean retorno = false;
        Connection con;
        try {
            con = ModelConection.getConnection();
            ps=con.prepareStatement("INSERT INTO [DC_Historial_Vacaciones] \n" +
                "  ([Creation_Day],[idAgente],[FechaSolicitud],[FechaInicio],[FechaFin],[Status],[DiasTomados]) \n" +
                "  VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, solicitud.getCreation_Day());
            ps.setString(2, solicitud.getIdAgente());
            ps.setString(3, solicitud.getFechaSolicitud());
            ps.setDate(4, solicitud.getFechaInicio());
            ps.setDate(5, solicitud.getFechaFin());
            ps.setString(6, solicitud.getStatus());
            ps.setInt(7, solicitud.getDiasTomados());
            retorno = Boolean.parseBoolean(Integer.toString(ps.executeUpdate()));
            con.close();
            ps.close();
            JOptionPane.showMessageDialog(null, "Solicitud creada exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return retorno;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en InsertarSolicitudVacaciones: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return retorno;
        }
    }   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import com.dijitalfinance.DAO.entity.Agente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon Garduño
 */
public class InsertarAgentes {
    public static boolean RegistrarAgente(Agente agente){
        PreparedStatement ps;
        boolean retorno = false;
        Connection con;
        try {
            con = ModelConection.getConnection();
            ps=con.prepareStatement("INSERT INTO [DC_Vaciones_Disponibles] \n" +
                "  ([idAgente],[NombreCompletoAgente],[Agente],[Area],"
                    + "[FechaIngreso],[VacacionesPorAnio],[VacacionesTomadas],[VacacionesDisponibles]) \n" +
                "  VALUES(?,?,?,?,?,?,?,?)");
      
            ps.setString(1, agente.getIdagente());
            ps.setString(2, agente.getFullNameAgente());
            ps.setString(3, agente.getAgente());
            ps.setString(4, agente.getArea());
            ps.setDate(5, agente.getFechaIngreso());
            ps.setInt(6, agente.getVacacionesPorAnio());
            ps.setInt(7, agente.getVacacionesTomadas());
            ps.setInt(8, agente.getVacacionesDisponibles());
            
            retorno = Boolean.parseBoolean(Integer.toString(ps.executeUpdate()));
            //JOptionPane.showMessageDialog(null, "Mensaje a whats app ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            con.close();
            ps.close();
            return retorno;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error RegistrarAgente: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return retorno;
        }
    }   
    
}

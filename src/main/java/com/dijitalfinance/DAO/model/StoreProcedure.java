/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class StoreProcedure {
    public static boolean ejecutarSP(){
        PreparedStatement ps;
        boolean retorno = false;
        Connection con;
        try {
            con = ModelConection.getConnection();
            ps=con.prepareStatement("EXEC [pr_CalculaVacacionesTotales]");
            retorno = Boolean.parseBoolean(Integer.toString(ps.executeUpdate()));
            //JOptionPane.showMessageDialog(null, "StoreProcedure ejecutado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            con.close();
            ps.close();
            return retorno;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar el StoreProcedure: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return retorno;
        }
    }   
}

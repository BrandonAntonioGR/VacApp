/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EliminarAgente {
    public static boolean eliminarAgente(String idAgente) {
        PreparedStatement ps;
        boolean retorno = false;
        Connection con;
        try {
            con = ModelConection.getConnection();
            ps = con.prepareStatement("DELETE FROM [DC_Vaciones_Disponibles]  WHERE [idAgente]='" + idAgente + "'");
            retorno = Boolean.parseBoolean(Integer.toString(ps.executeUpdate()));
            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
            con.close();
            ps.close();
            return retorno;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en EliminarAgente:"+e, "Error", JOptionPane.ERROR_MESSAGE);
            return retorno;
        }
    }
    
}

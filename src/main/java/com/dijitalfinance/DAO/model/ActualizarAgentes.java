/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import com.dijitalfinance.DAO.entity.Agente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ActualizarAgentes {

    public static boolean actualizarAgente(Agente agente) {
        PreparedStatement ps;
        boolean retorno = false;
        Connection con;
        try {
            con = ModelConection.getConnection();
            ps = con.prepareStatement("UPDATE [DC_Vaciones_Disponibles]\n"
                    + "SET [NombreCompletoAgente] = '"+agente.getFullNameAgente()+"', "
                            + "[Area] = '"+agente.getArea()+"',[FechaIngreso] = '"+agente.getFechaIngreso()+"'\n"
                    + ",[Agente]='"+agente.getAgente()+"' WHERE [idAgente]='"+agente.getIdagente()+"'");
            retorno = Boolean.parseBoolean(Integer.toString(ps.executeUpdate()));
            JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
            con.close();
            ps.close();
            return retorno;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en ActualizarAgentes: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return retorno;
        }
    }
}

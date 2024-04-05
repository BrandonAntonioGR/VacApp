/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import com.dijitalfinance.DAO.entity.SolicitudVacaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon Garduño
 */
public class ConsultaSolicitudVacaciones {
    public static ArrayList<SolicitudVacaciones> consultaSolicitudesVacaciones(String idAgente){
        Connection con; 
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT\n" +
                "[FechaSolicitud]\n" +
                ",[FechaInicio]\n" +
                ",[FechaFin]\n" +
                ",[Status]\n" +
                ",[DiasTomados]\n" +
                "FROM [DC REPORT].[dbo].[DC_Historial_Vacaciones]\n" +
                "WHERE [idAgente]='"+idAgente+"'\n" +
                "AND YEAR(CONVERT(DATE,[FechaInicio]))=YEAR(CONVERT(DATE,GETDATE()))\n" +
                "ORDER BY [FechaInicio] DESC");
            ResultSet rs=ps.executeQuery();
            ArrayList<SolicitudVacaciones> lista=new ArrayList();
            while(rs.next()){
                SolicitudVacaciones solicitudes=new SolicitudVacaciones();
                solicitudes.setFechaSolicitud(rs.getString("FechaSolicitud"));
                solicitudes.setFechaInicio(rs.getDate("FechaInicio"));
                solicitudes.setFechaFin(rs.getDate("FechaFin"));
                solicitudes.setStatus(rs.getString("Status"));
                solicitudes.setDiasTomados(rs.getInt("DiasTomados"));
                lista.add(solicitudes);
            }
            cerrarConexion(con, ps, rs);
            return lista;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error ConsultaSolicitudVacaciones: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException{
        con.close();
        ps.close();
        rs.close();
    }
}

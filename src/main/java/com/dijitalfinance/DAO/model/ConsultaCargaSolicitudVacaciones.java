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
public class ConsultaCargaSolicitudVacaciones {
    public static SolicitudVacaciones consultaSolicitudesVacaciones(String idAgente,String fechaInicio,String fechafin){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT\n" +
                "vd.[NombreCompletoAgente]\n" +
                ",hv.[FechaSolicitud]\n" +
                ",hv.[FechaInicio]\n" +
                ",hv.[FechaFin]\n" +
                ",hv.[Status]\n" +
                ",hv.[DiasTomados]\n" +
                "FROM [DC REPORT].[dbo].[DC_Historial_Vacaciones] AS hv\n" +
                "LEFT JOIN [DC_Vaciones_Disponibles] AS vd\n" +
                "ON hv.[idAgente]=vd.[idAgente]\n" +
                "WHERE hv.[idAgente]='"+idAgente+"'\n" +
                "AND  hv.[FechaInicio]='"+fechaInicio+"'\n" +
                "AND  hv.[FechaFin]='"+fechafin+"'\n" +
//                "--AND CONVERT(DATE,hv.[FechaInicio])>=CONVERT(DATE,GETDATE())");
                "AND YEAR([FechaInicio]) = YEAR(GETDATE())");
            ResultSet rs=ps.executeQuery();
            SolicitudVacaciones solicitudes=new SolicitudVacaciones();
            while(rs.next()){
                solicitudes.setAgentefullname(rs.getString("NombreCompletoAgente"));
                solicitudes.setFechaSolicitud(rs.getString("FechaSolicitud"));
                solicitudes.setFechaInicio(rs.getDate("FechaInicio"));
                solicitudes.setFechaFin(rs.getDate("FechaFin"));
                solicitudes.setStatus(rs.getString("Status"));
                solicitudes.setDiasTomados(rs.getInt("DiasTomados"));
            }
            cerrarConexion(con, ps, rs);
            return solicitudes;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en ConsultaCargaSolicitudVacaciones:"+e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException{
        con.close();
        ps.close();
        rs.close();
    }
}

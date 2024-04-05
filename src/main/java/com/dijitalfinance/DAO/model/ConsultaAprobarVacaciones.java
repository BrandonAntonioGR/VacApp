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


public class ConsultaAprobarVacaciones {
    public static ArrayList<SolicitudVacaciones> consultaSolicitudesVacaciones(String area){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT "+
                "      vd.[NombreCompletoAgente] as NombreCompletoAgente\n" +
                "      ,hv.[idAgente] as idAgente\n" +
                "      ,hv.[FechaSolicitud] as FechaSolicitud\n" +
                "      ,hv.[FechaInicio] as FechaInicio\n" +
                "      ,hv.[FechaFin] as FechaFin\n" +
                "      ,hv.[Status] as Status\n" +
                "      ,hv.[DiasTomados] as DiasTomados\n" +
                "	  ,vd.Area \n" +
                "  FROM [DC REPORT].[dbo].[DC_Historial_Vacaciones] AS hv\n" +
                "  LEFT JOIN [DC_Vaciones_Disponibles] AS vd\n" +
                "  ON hv.[idAgente]=vd.idAgente\n" +
                "  WHERE YEAR([FechaInicio]) = YEAR(GETDATE())\n" +
                "  AND [Status]='ESPERA'\n" +
//                "  WHERE --CONVERT(DATE,[FechaInicio])>=CONVERT(DATE,GETDATE())\n" +
//                "  [Status]='ESPERA'\n" +
                "  AND vd.Area='"+area+"'");
            ResultSet rs=ps.executeQuery();
            ArrayList<SolicitudVacaciones> lista=new ArrayList();
            while(rs.next()){
                SolicitudVacaciones solicitudes=new SolicitudVacaciones();
                solicitudes.setIdAgente(rs.getString("idAgente"));
                solicitudes.setAgentefullname(rs.getString("NombreCompletoAgente"));
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
            JOptionPane.showMessageDialog(null, "Error en ConsultaAprobarVacaciones: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException{
        con.close();
        ps.close();
        rs.close();
    }
}

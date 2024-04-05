/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import com.dijitalfinance.DAO.entity.VacacionesDisponibles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ConsultarVacacionesPermitidas {
    public static VacacionesDisponibles consultarVacacionesPermitidas(String idAgente){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT \n" +
                "vd.[NombreCompletoAgente] AS NombreCompletoAgente\n" +
                ",vd.[VacacionesDisponibles] AS VacacionesDisponibles\n" +
                ",a.[DescArea] AS DescArea\n" +
                "FROM [DC_Vaciones_Disponibles] AS vd\n" +
                "LEFT JOIN [DC_Areas] AS a\n" +
                "ON vd.[Area]=a.[idArea]\n" +
                "WHERE [idAgente]='"+idAgente+"'");
            ResultSet rs=ps.executeQuery();
            VacacionesDisponibles vacadispponible=new VacacionesDisponibles();
            while(rs.next()){
                VacacionesDisponibles vd=new VacacionesDisponibles();
                vd.setNombreCompletoAgente(rs.getString("NombreCompletoAgente"));
                vd.setVacacionesDisponibles(rs.getInt("VacacionesDisponibles"));
                vd.setArea(rs.getString("DescArea"));
                vacadispponible=vd;
            }
            cerrarConexion(con, ps, rs);
            return vacadispponible;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error ConsultarVacacionesPermitidas: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException{
        con.close();
        ps.close();
        rs.close();
    }
}

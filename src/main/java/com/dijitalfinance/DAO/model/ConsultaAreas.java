/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import com.dijitalfinance.DAO.entity.Areas;
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
public class ConsultaAreas {
    public static Areas consultaAreas(String adminArea){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT [DescArea]\n" +
                "  FROM [DC REPORT].[dbo].[DC_Areas]\n" +
                "  WHERE [idArea]='"+adminArea+"'");
            ResultSet rs=ps.executeQuery();
            Areas area=new Areas();
            while(rs.next()){
                area.setDescArea(rs.getString("DescArea"));
            }
            cerrarConexion(con, ps, rs);
            return area;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en consultaAreas: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException{
        con.close();
        ps.close();
        rs.close();
    }
}

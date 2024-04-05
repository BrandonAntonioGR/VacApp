/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import com.dijitalfinance.DAO.entity.Agente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ConsultaAgentes {
    public static ArrayList<Agente> consultaUsuariosVacaciones(String AreaAdmin){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT vd.[idAgente]\n" +
                ",vd.[NombreCompletoAgente]\n" +
                ",vd.[Agente]\n" +
                ",vd.[Area]\n" +
                ",vd.[FechaIngreso]\n" +
                ",vd.[VacacionesDisponibles]\n" +
                "FROM [DC REPORT].[dbo].[DC_Vaciones_Disponibles] AS vd\n" +
                "LEFT JOIN [DC_Users_Vacaciones] AS uv\n" +
                "ON vd.idAgente=uv.[idAgente]\n" +
                "WHERE [Area]='"+AreaAdmin+"'  AND uv.[TipoUsuario] !='ADMIN'"+
                "ORDER BY vd.[NombreCompletoAgente] ASC");
            ResultSet rs=ps.executeQuery();
            ArrayList<Agente> lista=new ArrayList();
            while(rs.next()){
                Agente usuario=new Agente();
                usuario.setIdagente(rs.getString("idAgente"));
                usuario.setFullNameAgente(rs.getString("NombreCompletoAgente"));
                usuario.setAgente(rs.getString("Agente"));
                usuario.setArea(rs.getString("Area"));
                usuario.setFechaIngreso(rs.getDate("FechaIngreso"));
                usuario.setVacacionesDisponibles(rs.getInt("VacacionesDisponibles"));
                lista.add(usuario);
            }
            cerrarConexion(con, ps, rs);
            return lista;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en ConsultaAgentes: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException{
        con.close();
        ps.close();
        rs.close();
    }
}

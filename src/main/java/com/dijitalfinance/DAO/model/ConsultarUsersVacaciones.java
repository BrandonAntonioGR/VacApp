/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import com.dijitalfinance.DAO.entity.UsersVacaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultarUsersVacaciones {
    public static ArrayList<UsersVacaciones> consultaUsuariosVacaciones(){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("use [DC REPORT]\n" +
                "SELECT uv.[idAgente]\n" +
                ",uv.[Usuario]\n" +
                ",uv.[Contrasenia]\n" +
                ",uv.[TipoUsuario]\n" +
                ",vd.Area\n" +
                "FROM [DC REPORT].[dbo].[DC_Users_Vacaciones] AS uv\n" +
                "LEFT JOIN [DC_Vaciones_Disponibles] AS vd\n" +
                "ON uv.[idAgente]=vd.idAgente");
            ResultSet rs=ps.executeQuery();
            ArrayList<UsersVacaciones> lista=new ArrayList();
            while(rs.next()){
                UsersVacaciones usuario=new UsersVacaciones();
                usuario.setIdagente(rs.getString("idAgente"));
                usuario.setUsuario(rs.getString("Usuario"));
                usuario.setContrasenia(rs.getString("Contrasenia"));
                usuario.setTipoUsuario(rs.getString("TipoUsuario"));
                usuario.setArea(rs.getString("Area"));
                lista.add(usuario);
            }
            cerrarConexion(con, ps, rs);
            return lista;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en ConsultarUsersVacaciones: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException{
        con.close();
        ps.close();
        rs.close();
    }
}

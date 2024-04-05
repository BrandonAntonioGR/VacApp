/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon Garduño
 */
public class ModelConection {
    public static Connection getConnection(){
        Connection con;
        try{
            String url2="jdbc:sqlserver://192.168.1.38\\SQLEXPRESS;"
                    + "databaseName=DC REPORT;"
                    + "user=jcruz1;"
                    + "password=Jcruz*23;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;";
            con=DriverManager.getConnection(url2);
            System.out.print("Conectado!");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en ModelConection: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

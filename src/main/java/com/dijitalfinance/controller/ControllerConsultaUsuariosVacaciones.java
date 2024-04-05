/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.UsersVacaciones;
import com.dijitalfinance.DAO.model.ConsultarUsersVacaciones;
import java.util.ArrayList;

/**
 *
 * @author Brandon Garduño
 */
public class ControllerConsultaUsuariosVacaciones {
    public ArrayList<UsersVacaciones> consultaUsersAgentes(){
        return  ConsultarUsersVacaciones.consultaUsuariosVacaciones();
    }
}

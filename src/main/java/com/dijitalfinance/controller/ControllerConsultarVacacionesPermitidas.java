/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.VacacionesDisponibles;
import com.dijitalfinance.DAO.model.ConsultarVacacionesPermitidas;

public class ControllerConsultarVacacionesPermitidas {
    public VacacionesDisponibles consultaVacacionesPermitidas(String idAgente){
        return  ConsultarVacacionesPermitidas.consultarVacacionesPermitidas(idAgente);
    }
}

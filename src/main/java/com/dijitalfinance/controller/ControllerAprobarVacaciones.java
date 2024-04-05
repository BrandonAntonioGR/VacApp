/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.model.ActualizarAprobarVacaciones;

/**
 *
 * @author Brandon Garduño
 */
public class ControllerAprobarVacaciones {
    public static boolean AprobarVacaciones(String status,String idAgente,String fechaInicio,String fechaFin){
        return ActualizarAprobarVacaciones.actualizarAprobarVacaciones(status, idAgente, fechaInicio, fechaFin);
    }
}

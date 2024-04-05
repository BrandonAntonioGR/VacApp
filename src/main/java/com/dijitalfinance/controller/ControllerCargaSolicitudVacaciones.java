/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.SolicitudVacaciones;
import com.dijitalfinance.DAO.model.ConsultaCargaSolicitudVacaciones;
import java.util.ArrayList;

/**
 *
 * @author Brandon Garduño
 */
public class ControllerCargaSolicitudVacaciones {
    public SolicitudVacaciones aprobarVacaciones(String idagente,String fechaInicio,String fechaFin){
        return  ConsultaCargaSolicitudVacaciones.consultaSolicitudesVacaciones(idagente, fechaInicio,fechaFin);
    }
}

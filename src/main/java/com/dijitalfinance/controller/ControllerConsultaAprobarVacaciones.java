/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.SolicitudVacaciones;
import com.dijitalfinance.DAO.model.ConsultaAprobarVacaciones;
import java.util.ArrayList;

/**
 *
 * @author Brandon Garduño
 */
public class ControllerConsultaAprobarVacaciones {
    public ArrayList<SolicitudVacaciones> aprobarVacaciones(String adminArea){
        return  ConsultaAprobarVacaciones.consultaSolicitudesVacaciones(adminArea);
    }
}

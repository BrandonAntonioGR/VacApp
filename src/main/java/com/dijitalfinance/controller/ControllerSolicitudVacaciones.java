/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.SolicitudVacaciones;
import com.dijitalfinance.DAO.model.ConsultaSolicitudVacaciones;
import java.util.ArrayList;


public class ControllerSolicitudVacaciones {
    public ArrayList<SolicitudVacaciones> consultaSolicitudesVacaciones(String idAgente){
        return  ConsultaSolicitudVacaciones.consultaSolicitudesVacaciones(idAgente);
    }
}

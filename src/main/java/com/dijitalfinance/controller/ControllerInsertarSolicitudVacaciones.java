/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.SolicitudVacaciones;
import com.dijitalfinance.DAO.model.InsertarSolicitudVacaciones;


public class ControllerInsertarSolicitudVacaciones {
    public static boolean CargarSolicitudVacaciones(SolicitudVacaciones solicitud){
        return InsertarSolicitudVacaciones.RegistrarSolicitudVacaciones(solicitud);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.Areas;
import com.dijitalfinance.DAO.model.ConsultaAreas;
import java.util.ArrayList;

/**
 *
 * @author Brandon Garduño
 */
public class ControllerConsultaAreas {
    public Areas consultaAreas(String adminArea){
        return  ConsultaAreas.consultaAreas(adminArea);
    }
}

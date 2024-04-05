/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.Agente;
import com.dijitalfinance.DAO.model.ConsultaAgentes;
import java.util.ArrayList;


public class ControllerConsultaAgentes {
    public ArrayList<Agente> consultaAgentes(String AreaAdmin){
        return  ConsultaAgentes.consultaUsuariosVacaciones(AreaAdmin);
    }
}

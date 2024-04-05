/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.Agente;
import com.dijitalfinance.DAO.model.InsertarAgentes;


public class ControllerInsertaAgentes{
    public static boolean CargarAgente(Agente agente){
        return InsertarAgentes.RegistrarAgente(agente);
    }
}

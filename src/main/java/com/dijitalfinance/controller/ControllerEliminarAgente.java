/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.model.EliminarAgente;


public class ControllerEliminarAgente {
    public static boolean eliminaAgente(String idAgente){
        return EliminarAgente.eliminarAgente(idAgente);
    }
}

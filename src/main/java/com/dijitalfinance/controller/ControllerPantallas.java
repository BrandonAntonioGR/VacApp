/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.controller;

import com.dijitalfinance.DAO.entity.Agente;
import com.dijitalfinance.view.AdminAgentes;
import com.dijitalfinance.view.InicioSesion;
import com.dijitalfinance.view.AgregarAgentes;
import com.dijitalfinance.view.MenuAdministrador;
import com.dijitalfinance.view.MenuAgentes;
import com.dijitalfinance.view.ConsultarVacaciones;
import com.dijitalfinance.view.AprobarVacaciones;
import com.dijitalfinance.view.ExaminarAgente;
import com.dijitalfinance.view.ModificarAgentes;
import com.dijitalfinance.view.SolicitarVacaciones;


public class ControllerPantallas {
    public void InicioSesion(){
        InicioSesion login = new InicioSesion();
        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
    }
    
    public void menuAdministrador(String agente,String areaAdmin){
        MenuAdministrador ag= new MenuAdministrador(agente,areaAdmin);
        ag.setVisible(true);
        ag.setResizable(false);
        ag.setLocationRelativeTo(null);
    }
    public void administrarAgentes(String agente,String areaAdmin){
        AdminAgentes ag= new AdminAgentes(agente,areaAdmin);
        ag.setVisible(true);
        ag.setResizable(false);
        ag.setLocationRelativeTo(null);
    }
    public void AprobarVacaciones(String agente,String areaAdmin){
        AprobarVacaciones ag= new AprobarVacaciones(agente,areaAdmin);
        ag.setVisible(true);
        ag.setResizable(false);
        ag.setLocationRelativeTo(null);
    }
    public void examinarAgentes(Agente agente,String idArea,String idAgente,String areaAdmin){
        ExaminarAgente ag= new ExaminarAgente(agente,idArea,idAgente,areaAdmin);
        ag.setVisible(true);
        ag.setResizable(false);
        ag.setLocationRelativeTo(null);
    }
    public void agregarAgentes(String agente,String areaAdmin){
        AgregarAgentes ag= new AgregarAgentes(agente,areaAdmin);
        ag.setVisible(true);
        ag.setResizable(false);
        ag.setLocationRelativeTo(null);
    }
    public void modificarAgentes(Agente colaborador, String idarea,String agente,String areaAdmin){
        ModificarAgentes ag= new ModificarAgentes(colaborador, idarea, agente,areaAdmin);
        ag.setVisible(true);
        ag.setResizable(false);
        ag.setLocationRelativeTo(null);
    }
    public void menuAgentes(String agente){
        MenuAgentes ag= new MenuAgentes(agente);
        ag.setVisible(true);
        ag.setResizable(false);
        ag.setLocationRelativeTo(null);
    }
    public void gestionaVacaciones(String agente){
//        SolicitarVacacionesPasadas gv= new SolicitarVacacionesPasadas(agente);
        SolicitarVacaciones gv= new SolicitarVacaciones(agente);
        gv.setVisible(true);
        gv.setResizable(false);
        gv.setLocationRelativeTo(null);
    }
    public void consultarVacaciones(String agente){
        ConsultarVacaciones gv= new ConsultarVacaciones(agente);
        gv.setVisible(true);
        gv.setResizable(false);
        gv.setLocationRelativeTo(null);
    }
    
}

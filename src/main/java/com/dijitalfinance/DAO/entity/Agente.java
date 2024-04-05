/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.entity;

import java.sql.Date;


public class Agente {
    private String idagente;
    private String fullNameAgente;
    private String agente;
    private String area;
    private Date fechaIngreso;
    private int vacacionesPorAnio;
    private int vacacionesTomadas;
    private int vacacionesDisponibles;

    public Agente() {
    }

    public Agente(String idagente, String fullNameAgente, String agente, String area, Date fechaIngreso, int vacacionesPorAnio, int vacacionesTomadas, int vacacionesDisponibles) {
        this.idagente = idagente;
        this.fullNameAgente = fullNameAgente;
        this.agente = agente;
        this.area = area;
        this.fechaIngreso = fechaIngreso;
        this.vacacionesPorAnio = vacacionesPorAnio;
        this.vacacionesTomadas = vacacionesTomadas;
        this.vacacionesDisponibles = vacacionesDisponibles;
    }

    public String getIdagente() {
        return idagente;
    }

    public void setIdagente(String idagente) {
        this.idagente = idagente;
    }

    public String getFullNameAgente() {
        return fullNameAgente;
    }

    public void setFullNameAgente(String fullNameAgente) {
        this.fullNameAgente = fullNameAgente;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getVacacionesPorAnio() {
        return vacacionesPorAnio;
    }

    public void setVacacionesPorAnio(int vacacionesPorAnio) {
        this.vacacionesPorAnio = vacacionesPorAnio;
    }

    public int getVacacionesTomadas() {
        return vacacionesTomadas;
    }

    public void setVacacionesTomadas(int vacacionesTomadas) {
        this.vacacionesTomadas = vacacionesTomadas;
    }

    public int getVacacionesDisponibles() {
        return vacacionesDisponibles;
    }

    public void setVacacionesDisponibles(int vacacionesDisponibles) {
        this.vacacionesDisponibles = vacacionesDisponibles;
    }

            
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.entity;

/**
 *
 * @author Brandon Garduño
 */
public class VacacionesDisponibles {
    private int VacacionesDisponibles;
    private String NombreCompletoAgente;
    private String Area;

    public VacacionesDisponibles() {
    }

    public VacacionesDisponibles(int VacacionesDisponibles, String NombreCompletoAgente, String Area) {
        this.VacacionesDisponibles = VacacionesDisponibles;
        this.NombreCompletoAgente = NombreCompletoAgente;
        this.Area = Area;
    }

    public int getVacacionesDisponibles() {
        return VacacionesDisponibles;
    }

    public void setVacacionesDisponibles(int VacacionesDisponibles) {
        this.VacacionesDisponibles = VacacionesDisponibles;
    }

    public String getNombreCompletoAgente() {
        return NombreCompletoAgente;
    }

    public void setNombreCompletoAgente(String NombreCompletoAgente) {
        this.NombreCompletoAgente = NombreCompletoAgente;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
    
    
    
}

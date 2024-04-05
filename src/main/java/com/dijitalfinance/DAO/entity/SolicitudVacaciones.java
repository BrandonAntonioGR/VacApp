/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.entity;

import java.sql.Date;


public class SolicitudVacaciones {
    private String Creation_Day;
    private String agentefullname;
    private String idAgente;
    private String FechaSolicitud;
    private Date FechaInicio;
    private Date FechaFin;
    private String Status;
    private int DiasTomados;

    public SolicitudVacaciones() {
    }

    public SolicitudVacaciones(String Creation_Day, String agentefullname, String idAgente, String FechaSolicitud, Date FechaInicio, Date FechaFin, String Status, int DiasTomados) {
        this.Creation_Day = Creation_Day;
        this.agentefullname = agentefullname;
        this.idAgente = idAgente;
        this.FechaSolicitud = FechaSolicitud;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Status = Status;
        this.DiasTomados = DiasTomados;
    }

    public String getCreation_Day() {
        return Creation_Day;
    }

    public void setCreation_Day(String Creation_Day) {
        this.Creation_Day = Creation_Day;
    }

    public String getAgentefullname() {
        return agentefullname;
    }

    public void setAgentefullname(String agentefullname) {
        this.agentefullname = agentefullname;
    }

    public String getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(String idAgente) {
        this.idAgente = idAgente;
    }

    public String getFechaSolicitud() {
        return FechaSolicitud;
    }

    public void setFechaSolicitud(String FechaSolicitud) {
        this.FechaSolicitud = FechaSolicitud;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getDiasTomados() {
        return DiasTomados;
    }

    public void setDiasTomados(int DiasTomados) {
        this.DiasTomados = DiasTomados;
    }
    
    
}

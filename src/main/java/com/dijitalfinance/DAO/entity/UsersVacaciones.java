/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.entity;

import java.sql.Date;


public class UsersVacaciones {
    private String idagente;
    private String usuario;
    private String contrasenia;
    private String tipoUsuario;
    private String area;

    public UsersVacaciones() {
    }

    public UsersVacaciones(String idagente, String usuario, String contrasenia, String tipoUsuario, String area) {
        this.idagente = idagente;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.tipoUsuario = tipoUsuario;
        this.area = area;
    }

    public String getIdagente() {
        return idagente;
    }

    public void setIdagente(String idagente) {
        this.idagente = idagente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}

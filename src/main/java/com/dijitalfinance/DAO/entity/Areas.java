/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dijitalfinance.DAO.entity;


public class Areas {
    private String idArea;
    private String DescArea;

    public Areas() {
    }

    public Areas(String idArea, String DescArea) {
        this.idArea = idArea;
        this.DescArea = DescArea;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getDescArea() {
        return DescArea;
    }

    public void setDescArea(String DescArea) {
        this.DescArea = DescArea;
    }
    
    
}

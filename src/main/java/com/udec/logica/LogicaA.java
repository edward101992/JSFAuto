/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.logica;

import java.util.Date;

/**
 *
 * @author victor
 */
public class LogicaA {
    
   private String nombre;
   private String marca;
   private Date fecha;
  
   
  

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    public Date  getFecha() {
        return fecha;
    }

    public void setFecha(Date  fecha) {
        this.fecha = fecha;
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

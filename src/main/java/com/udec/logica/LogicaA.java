/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.logica;

import java.util.Date;

/**
 * Esta clase es en la que se 
 * guardan las variables que van
 * a almacenar los datos del Vehiculo
 * @author Edward Ramos
 * @author victor Preciado
 */


public class LogicaA {
    /**
    *variable nombre esta variable guarda el nombre
    * del automovil
    *variable marca esta variable guarda la marca del 
    * automovil
    *variable fecha esta variable guarda la fecha del 
    * auto
    * 
     */
   private String nombre;
   private String marca;
   private Date fecha;
  
   
  
    /**
     * get variable marca 
     * @return marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * set variable marca 
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * get variable fecha
     * @return fecha
     */
    public Date  getFecha() {
        return fecha;
    }
    /**
     * set variable fecha
     * @param fecha 
     */
    public void setFecha(Date  fecha) {
        this.fecha = fecha;
    }
   
    /**
     * get variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * set variable nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

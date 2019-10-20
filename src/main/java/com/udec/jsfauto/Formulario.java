/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.jsfauto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author SuperUs
 */
@Named(value = "formulario")
@Dependent
public class Formulario {

    
    private String nombre;
    private Date modelo;
    private List<String> marca = new ArrayList<String>();
    
    @PostConstruct
    public void llenarMarca(){   
        marca.add("BMW");
        marca.add("Toyota");
    }
    
    
    public Formulario(String nombre, Date modelo,List<String> marca) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getModelo() {
        return modelo;
    }

    public void setModelo(Date modelo) {
        this.modelo = modelo;
    }

    public List<String> getMarca() {
        return marca;
    }

    public void setMarca(List<String> marca) {
        this.marca = marca;
    }
    
   
    public Formulario() {
    }
    
}

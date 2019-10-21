/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.jsfauto;

import com.udec.logica.LogicaA;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

/**
 *
 * @author Edward Ramos
 * @author Victor Preciado
 */
@Named(value = "formulario")
@RequestScoped
public class Formulario implements Serializable{
    
    private LogicaA autos = new LogicaA();
    private static List<LogicaA> listaAutos = new ArrayList();
    /**
     * Constructor del formulario
     */
    public Formulario() {
    }
 
 
    /**
     *set variable listaAutos es la encargada de 
     * tres la lista 
     * @return listaAutos
     */
    public List<LogicaA> getListaAutos() {
        return listaAutos;
    }
    /**
     * set variable listaAutos es la encargada de 
     * enviar la lista
     * @param listaAutos 
     */
    public void setListaAutos(List<LogicaA> listaAutos) {
        Formulario.listaAutos = listaAutos;
    }
    /**
     * Metodo encargado de agregar a la lista los 
     * datos del Automovil
     */
    public void agregarAutos(){
       
        Formulario.listaAutos.add(this.autos);
    }
       /**
     * 
     * @return autos
     */
    public LogicaA getLogicaA() {
        return autos;
    }
    /**
     * 
     * @param autos 
     */
    public void setLogicaA(LogicaA autos) {
        this.autos = autos;
    }
    
    /**
     * Metodo que llena la lista marca
     */
  
    /**
     * Metodo que muestra un mensaje con el año que selecciono el usuario
     * @param event variable que activa el mensaje
     */
     public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Modelo seleccionado", format.format(event.getObject())));
    }
     /**
    * Constructor de la clase Formulario
    */
   
   
   
 
    
  
    
   
    
}


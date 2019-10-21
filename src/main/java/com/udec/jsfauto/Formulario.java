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

    public Formulario() {
    }
 

    public LogicaA getLogicaA() {
        return autos;
    }

    public void setLogicaA(LogicaA autos) {
        this.autos = autos;
    }

    public List<LogicaA> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(List<LogicaA> listaAutos) {
        Formulario.listaAutos = listaAutos;
    }
 
    public void agregarAutos(){
       
        Formulario.listaAutos.add(this.autos);
    }
    
    
    /**
     * Metodo que llena la lista marca
     */
  
    /**
     * Metodo que muestra un mensaje con el añño que selecciono el usuario
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


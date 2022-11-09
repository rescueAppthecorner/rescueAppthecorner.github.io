package com.rescueapp.rescue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//POJO = Plain Old Java Object
public class RescueConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idCampo;

    int idUsuario;
    String nombreParam; 
    String contenido;

    public RescueConfig() {}
    
    public RescueConfig(int idUsuario, String nombreParam, String contenido) {
        this.idUsuario = idUsuario;
        this.nombreParam = nombreParam;
        this.contenido = contenido;
        
    }

    //Setters

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreParam(String nombreParam) {
        this.nombreParam = nombreParam;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    //Getters
    
    public int getIdCampo() {
        return idCampo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreParam() {
        return nombreParam;
    }

    public String getContenido() {
        return contenido;
    }

}

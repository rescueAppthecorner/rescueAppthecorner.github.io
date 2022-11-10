package com.rescueapp.rescue;

import java.lang.reflect.Array;
import java.sql.Struct;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import antlr.collections.List;

@Entity
//POJO = Plain Old Java Object
public class RescueConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idCampo;

    int idUsuario;
    String mOculto; 
    String mascMOculto;
    String numEmer;
    String derivarURL;
    <List> picVic = {
        String picVic1;
        String picVic2;
        String picVic3;
        String picVic4; 
        String picVic5;
    };
    <List> picAgr = {
        String picAgr1;
        String picAgr2;
        String picAgr3;
        String picAgr4; 
        String picAgr5;
    };
    }

    public RescueConfig() {}
    
    public RescueConfig(int idUsuario) {
        this.idUsuario = idUsuario;
        
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

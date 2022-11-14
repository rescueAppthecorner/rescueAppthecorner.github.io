package com.rescueapp.rescue;

import java.util.List;

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
    String mOculto; 
    String mascMOculto;
    String numEmer;
    String derivarURL;
    List<String> picVic;
    List<String> picAgr;

    
    public RescueConfig() {}
    
    public RescueConfig(int idUsuario, String mOculto, String mascMOculto, String numEmer, String derivarURL, List<String> picVic, List<String> picAgr) {
        this.idUsuario = idUsuario;
        this.mOculto = mOculto; 
        this.mascMOculto = mascMOculto;
        this.derivarURL = derivarURL;
        this.numEmer = numEmer;
        this.picAgr = picAgr;
        this.picVic = picVic;
        
    }

    //Setters

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setmOculto(String mOculto) {
        this.mOculto = mOculto;
    }

    public void setMascMOculto(String mascMOculto) {
        this.mascMOculto = mascMOculto;
    }

    public void setNumEmer(String numEmer) {
        this.numEmer = numEmer;
    }

    public void setDerivarURL(String derivarURL) {
        this.derivarURL = derivarURL;
    }

    public void setPicVic(List<String> picVic) {
        this.picVic = picVic;
    }

    public void setPicAgr(List<String> picAgr) {
        this.picAgr = picAgr;
    }


    //Getters
    
    public int getIdCampo() {
        return idCampo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getmOculto() {
        return mOculto;
    }

    public String getMascMOculto() {
        return mascMOculto;
    }

    public String getNumEmer() {
        return numEmer;
    }

    public String getDerivarURL() {
        return derivarURL;
    }

    public List<String> getPicVic() {
        return picVic;
    }

    public List<String> getPicAgr() {
        return picAgr;
    }

}

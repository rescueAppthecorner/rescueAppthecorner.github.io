package com.rescueapp.rescue;


import java.util.List;

import javax.persistence.ElementCollection;
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
    @ElementCollection(targetClass=Integer.class)
    List<pic> picVic;
    @ElementCollection(targetClass=Integer.class)
    List<pic> picAgr;

    


    public RescueConfig() {}
    
    public RescueConfig(int idUsuario, String mOculto, String mascMOculto, String numEmer, String derivarURL, List<pic> picVic, List<pic> picAgr) {
        this.idUsuario = idUsuario;
        this.mOculto = mOculto; 
        this.mascMOculto = mascMOculto;
        this.derivarURL = derivarURL;
        this.numEmer = numEmer;
        this.picAgr = picAgr;
        this.picVic = picVic;
        
    }
    public int getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getmOculto() {
        return mOculto;
    }

    public void setmOculto(String mOculto) {
        this.mOculto = mOculto;
    }

    public String getMascMOculto() {
        return mascMOculto;
    }

    public void setMascMOculto(String mascMOculto) {
        this.mascMOculto = mascMOculto;
    }

    public String getNumEmer() {
        return numEmer;
    }

    public void setNumEmer(String numEmer) {
        this.numEmer = numEmer;
    }

    public String getDerivarURL() {
        return derivarURL;
    }

    public void setDerivarURL(String derivarURL) {
        this.derivarURL = derivarURL;
    }

    public List<pic> getPicVic() {
        return picVic;
    }

    public void setPicVic(List<pic> picVic) {
        this.picVic = picVic;
    }

    public List<pic> getPicAgr() {
        return picAgr;
    }

    public void setPicAgr(List<pic> picAgr) {
        this.picAgr = picAgr;
    }

    //Setters

}

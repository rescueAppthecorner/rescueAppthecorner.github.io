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
    String passw; 
    String name;
    String surname1;
    String surname2;
    String email;
    String numTel;

    public RescueConfig() {}
    
    public RescueConfig(String passw, String name, String surname1, String surname2, String email, String numTel) {
        this.passw = passw;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.email = email;
        this.numTel = numTel;
        
    }

    //Setters

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    //Getters

    public int getIdCampo() {
        return idCampo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getPassw() {
        return passw;
    }

    public String getName() {
        return name;
    }

    public String getSurname1() {
        return surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public String getEmail() {
        return email;
    }

    public String getNumTel() {
        return numTel;
    }
    
}

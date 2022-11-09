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

    int id;
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

    public void setId(int id) {
        this.id = id;
    }

    //Getters

    public int getId() {
        return id;
    }
}

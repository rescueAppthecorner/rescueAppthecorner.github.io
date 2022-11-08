package com.rescueapp.rescue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//POJO = Plain Old Java Object
public class RescueProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    
    String name;
    String surname1;
    String surname2;
    String email;
    String numTel;

    public RescueProfile() {}
    
    public RescueProfile(String name, String surname1, String surname2, String email, String numTel) {
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.email = email;
        this.numTel = numTel;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
}

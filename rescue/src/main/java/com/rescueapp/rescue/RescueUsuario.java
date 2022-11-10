package com.rescueapp.rescue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class RescueUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String email;  
    String passw;



    public RescueUsuario() {}
    public RescueUsuario(String email, String passw) {
        this.email = email; 
        this.passw = passw; 
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassw() {
        return passw;
    }
    public void setPassw(String passw) {
        this.passw = passw;
    }
  
}

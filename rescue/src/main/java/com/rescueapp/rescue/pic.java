package com.rescueapp.rescue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class pic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idCampo;

    String imagen;
    public pic(String imagen) {
        this.imagen = imagen;
    }

    public pic() {
    }


    public int getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


}

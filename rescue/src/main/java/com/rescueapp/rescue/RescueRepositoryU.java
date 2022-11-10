package com.rescueapp.rescue;



import org.springframework.data.jpa.repository.JpaRepository;

public interface RescueRepositoryU extends JpaRepository <RescueProfile, String> {

    RescueUsuario findByEmail(String email);
    
}

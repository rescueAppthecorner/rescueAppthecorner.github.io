package com.rescueapp.rescue;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RescueRepositoryU extends JpaRepository <RescueUsuario, String> {

    RescueUsuario findByEmail(String email);
    List<RescueUsuario> findAll();
    
}

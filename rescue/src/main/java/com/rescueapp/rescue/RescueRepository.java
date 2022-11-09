package com.rescueapp.rescue;



import org.springframework.data.jpa.repository.JpaRepository;

public interface RescueRepository extends JpaRepository <RescueProfile, Integer> {

    RescueProfile findByEmail(String email);
    
}

package com.rescueapp.rescue;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RescueRepository extends JpaRepository <RescueProfile, Integer> {

    List<RescueProfile> findByName(String name);
    
}

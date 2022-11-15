package com.rescueapp.rescue;




import org.springframework.data.jpa.repository.JpaRepository;

public interface RescueRepositoryConfig extends JpaRepository <RescueConfig, Integer> {

    RescueConfig findByidCampo(Integer id);
}

package com.rescueapp.rescue;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin

public class RescueController {
    
    @Autowired
    RescueRepository cs;
	@Autowired
	RescueRepositoryU cu;	
	

	@GetMapping(value = "/cursos/thecorner") // URN = /curso/sistemas
	List<RescueProfile>getCursos() {
		return cs.findAll();
	}

	@DeleteMapping(value = "/cursos/thecorner/{in_id}") // URN = /curso/sistemas
	String delete(@PathVariable int in_id) {
		cs.deleteById(in_id);
		return "El curso con Id: " + in_id + " se ha eliminado";
	}

	//Chequeo de credenciales de usuario de login
	@PostMapping(value = "/login") 
	String loginProfile(@RequestBody RescueUsuario datos) {
		System.out.println("datos.pass :"+  datos.email);
		System.out.println("datos.pass :"+  datos.passw);
		

		List<RescueUsuario> perfiles = cu.findAll();
		//RescueUsuario perfiles = cu.findByEmail(datos.email.trim());
		System.out.println(perfiles.size());
		for (int i = 0; i < perfiles.size(); i++){
			System.out.println(perfiles.get(i).email);
			System.out.println(perfiles.get(i).passw);
			if(perfiles.get(i).passw.equalsIgnoreCase(datos.passw)){
				return "concedido";
			}
		}
			return "denegado";
		}
	}


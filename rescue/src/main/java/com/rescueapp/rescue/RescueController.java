package com.rescueapp.rescue;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin

public class RescueController {
    
    @Autowired
    RescueRepository cs;	

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
	String loginProfile(@RequestParam RescueProfile datos) {
		System.out.println(datos.email);
		System.out.println(datos.passw);
		RescueProfile perfiles = cs.findByEmail(datos.email);
			if (perfiles != null){
				if(perfiles.passw == datos.passw){
					return "concedido";
				}
			}
			return "denegado";
		}
	}


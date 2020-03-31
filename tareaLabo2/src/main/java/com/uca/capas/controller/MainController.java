package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "Login";
	}
	
	/* Usuario: DaGa11
	  Contrasenia: hi123 */
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		if(usuario.getUsuario().equals("DaGa11") && usuario.getContrasenia().equals("hi123")) {
			return "MostrarMensajeV";
		}
		return "MostrarMensajeF";
	}
}
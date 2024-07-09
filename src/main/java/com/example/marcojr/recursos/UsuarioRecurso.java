package com.example.marcojr.recursos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.marcojr.dominios.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecurso {
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		Usuario u1 = new Usuario("1", "Marco Junior", "marco@gmail.com");
		Usuario u2 = new Usuario("2", "Samira Furlaneto", "samira@gmail.com");
		List<Usuario> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(u1, u2));
		return ResponseEntity.ok().body(lista);
	}
	

}

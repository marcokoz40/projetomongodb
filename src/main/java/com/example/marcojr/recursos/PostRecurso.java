package com.example.marcojr.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.marcojr.dominios.Post;
import com.example.marcojr.recursos.util.URL;
import com.example.marcojr.servicos.PostServico;

@RestController
@RequestMapping(value = "/noticias")
public class PostRecurso {

	@Autowired
	private PostServico servico;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = servico.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/titlesearch")
	public ResponseEntity<List<Post>> findByTitulo(@RequestParam(value = "text", defaultValue = "") String texto) {
		texto = URL.decodeParam(texto);
		List<Post> lista = servico.findByTitulo(texto);
		return ResponseEntity.ok().body(lista);
	}

}

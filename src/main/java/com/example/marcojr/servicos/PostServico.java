package com.example.marcojr.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marcojr.dominios.Post;
import com.example.marcojr.repositorios.PostRepositorio;
import com.example.marcojr.servicos.excecoes.ObjectNotFoundException;

@Service
public class PostServico {

	@Autowired
	private PostRepositorio repositorio;

	public Post findById(String id) {
		Optional<Post> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitulo(String texto) {
		return repositorio.searchTitulo(texto);
	}

}

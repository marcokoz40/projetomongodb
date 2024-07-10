package com.example.marcojr.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marcojr.dominios.Usuario;
import com.example.marcojr.repositorios.UsuarioRepositorio;
import com.example.marcojr.servicos.excecoes.ObjectNotFoundException;

@Service
public class UsuarioServico {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	public List<Usuario> findAll() {
		return repositorio.findAll();
	}
	
	public Usuario findById(String id) {
		Optional<Usuario> usuario = repositorio.findById(id);
		return usuario.orElseThrow(() -> new ObjectNotFoundException(id)); 
	}

}

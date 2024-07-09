package com.example.marcojr.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marcojr.dominios.Usuario;
import com.example.marcojr.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServico {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	public List<Usuario> findAll() {
		return repositorio.findAll();
	}

}

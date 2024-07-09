package com.example.marcojr.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.marcojr.dominios.Usuario;
import com.example.marcojr.repositorios.UsuarioRepositorio;

@Configuration
public class UsuarioConfig implements CommandLineRunner{

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
		
	@Override
	public void run(String... args) throws Exception {
		
		usuarioRepositorio.deleteAll();
		
		Usuario u1 = new Usuario(null, "Marco Antonio", "marco@gmail.com");
		Usuario u2 = new Usuario(null, "Samira Furlaneto", "samira@gmail.com");
		Usuario u3 = new Usuario(null, "Patricia Maciel", "patricia@gmail.com");
		
		usuarioRepositorio.saveAll(Arrays.asList(u1, u2, u3));
	}

}

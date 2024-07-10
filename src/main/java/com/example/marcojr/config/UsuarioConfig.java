package com.example.marcojr.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.marcojr.dominios.Post;
import com.example.marcojr.dominios.Usuario;
import com.example.marcojr.repositorios.PostRepositorio;
import com.example.marcojr.repositorios.UsuarioRepositorio;

@Configuration
public class UsuarioConfig implements CommandLineRunner{

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@Autowired
	private PostRepositorio postRepositorio;
		
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		usuarioRepositorio.deleteAll();
		postRepositorio.deleteAll();
		
		Usuario u1 = new Usuario(null, "Marco Antonio", "marco@gmail.com");
		Usuario u2 = new Usuario(null, "Samira Furlaneto", "samira@gmail.com");
		Usuario u3 = new Usuario(null, "Patricia Maciel", "patricia@gmail.com");
		
		Post p1 = new Post(null, sdf.parse("01/01/2024"), "Partiu viagem", "Vou viajar", u1);
		Post p2 = new Post(null, sdf.parse("04/07/2024"), "Bom dia", "Estou feliz hoje", u1);
		
		usuarioRepositorio.saveAll(Arrays.asList(u1, u2, u3));
		postRepositorio.saveAll(Arrays.asList(p1, p2));
	}

}

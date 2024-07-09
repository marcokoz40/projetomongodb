package com.example.marcojr.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.marcojr.dominios.Usuario;

@Repository
public interface UsuarioRepositorio extends MongoRepository<Usuario, String>{

}

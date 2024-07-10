package com.example.marcojr.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marcojr.dominios.Usuario;
import com.example.marcojr.dto.UsuarioDTO;
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
		return usuario.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Usuario insert(Usuario obj) {
		return repositorio.insert(obj);
	}

	public void delete(String id) {
		findById(id);
		repositorio.deleteById(id);
	}

	public Usuario update(Usuario obj) {
		Usuario newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repositorio.save(newObj);
	}

	private void updateData(Usuario newObj, Usuario obj) {
		newObj.setNome(obj.getNome());
		newObj.setEmail(obj.getEmail());

	}

	public Usuario fromDTO(UsuarioDTO objDto) {
		return new Usuario(objDto.getId(), objDto.getNome(), objDto.getEmail());
	}

}

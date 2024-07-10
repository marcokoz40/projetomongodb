package com.example.marcojr.dominios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.marcojr.dto.AutorDto;
import com.example.marcojr.dto.CommentDto;

@Document
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Date data;
	private String titulo;
	private String corpo;
	private AutorDto usuario;

	private List<CommentDto> lista = new ArrayList<>();

	public Post() {
	}

	public Post(String id, Date data, String titulo, String corpo, AutorDto usuario) {
		this.id = id;
		this.data = data;
		this.titulo = titulo;
		this.corpo = corpo;
		this.usuario = usuario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public AutorDto getAutorDto() {
		return usuario;
	}

	public void setUsuario(AutorDto usuario) {
		this.usuario = usuario;
	}

	public List<CommentDto> getLista() {
		return lista;
	}

	public void setLista(List<CommentDto> lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}

}

package com.example.marcojr.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String texto;
	private Date data;
	private AutorDto autor;

	public CommentDto() {
	}

	public CommentDto(String texto, Date data, AutorDto autor) {
		this.texto = texto;
		this.data = data;
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public AutorDto getAutor() {
		return autor;
	}

	public void setAutor(AutorDto autor) {
		this.autor = autor;
	}

}

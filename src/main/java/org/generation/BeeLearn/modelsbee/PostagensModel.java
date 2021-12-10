package org.generation.BeeLearn.modelsbee;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tbl_postagens")
public class PostagensModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPostagem;
	
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@Size (max = 200)
	private String titulo;

	@NotNull
	@Size (max = 200)
	private String postagem;
	

	public void setIdPostagem(Long idPostagem) {
		this.idPostagem = idPostagem;
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

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}


	
	
	
}

	
package br.blog.forms;

import java.util.Date;

public class Post {
	private int idAdm;
	private String titulo;
	private String conteudo;
	private Date dataCriacao;
	private int id;
	
	public Post() {
		super();
	}
	
	public Post(int idAdm, String titulo, String conteudo, Date dataCriacao, int id) {
		super();
		this.idAdm = idAdm;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.dataCriacao = dataCriacao;
		this.id = id;
	}

	public int getIdAdm() {
		return idAdm;
	}

	public void setIdAdm(int idAdm) {
		this.idAdm = idAdm;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
